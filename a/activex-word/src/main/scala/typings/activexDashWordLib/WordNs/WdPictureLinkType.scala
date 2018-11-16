package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdPictureLinkType extends js.Object

@JSGlobal("Word.WdPictureLinkType")
@js.native
object WdPictureLinkType extends js.Object {
  @js.native
  sealed trait wdLinkDataInDoc
    extends activexDashWordLib.WordNs.WdPictureLinkType
  
  @js.native
  sealed trait wdLinkDataOnDisk
    extends activexDashWordLib.WordNs.WdPictureLinkType
  
  @js.native
  sealed trait wdLinkNone
    extends activexDashWordLib.WordNs.WdPictureLinkType
  
  /* 1 */ val wdLinkDataInDoc: wdLinkDataInDoc with scala.Double = js.native
  /* 2 */ val wdLinkDataOnDisk: wdLinkDataOnDisk with scala.Double = js.native
  /* 0 */ val wdLinkNone: wdLinkNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdPictureLinkType with scala.Double] = js.native
}

