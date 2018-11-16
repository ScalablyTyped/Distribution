package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOrganizerObject extends js.Object

@JSGlobal("Word.WdOrganizerObject")
@js.native
object WdOrganizerObject extends js.Object {
  @js.native
  sealed trait wdOrganizerObjectAutoText
    extends activexDashWordLib.WordNs.WdOrganizerObject
  
  @js.native
  sealed trait wdOrganizerObjectCommandBars
    extends activexDashWordLib.WordNs.WdOrganizerObject
  
  @js.native
  sealed trait wdOrganizerObjectProjectItems
    extends activexDashWordLib.WordNs.WdOrganizerObject
  
  @js.native
  sealed trait wdOrganizerObjectStyles
    extends activexDashWordLib.WordNs.WdOrganizerObject
  
  /* 1 */ val wdOrganizerObjectAutoText: wdOrganizerObjectAutoText with scala.Double = js.native
  /* 2 */ val wdOrganizerObjectCommandBars: wdOrganizerObjectCommandBars with scala.Double = js.native
  /* 3 */ val wdOrganizerObjectProjectItems: wdOrganizerObjectProjectItems with scala.Double = js.native
  /* 0 */ val wdOrganizerObjectStyles: wdOrganizerObjectStyles with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOrganizerObject with scala.Double] = js.native
}

