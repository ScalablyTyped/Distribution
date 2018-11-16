package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdStyleSheetLinkType extends js.Object

@JSGlobal("Word.WdStyleSheetLinkType")
@js.native
object WdStyleSheetLinkType extends js.Object {
  @js.native
  sealed trait wdStyleSheetLinkTypeImported
    extends activexDashWordLib.WordNs.WdStyleSheetLinkType
  
  @js.native
  sealed trait wdStyleSheetLinkTypeLinked
    extends activexDashWordLib.WordNs.WdStyleSheetLinkType
  
  /* 1 */ val wdStyleSheetLinkTypeImported: wdStyleSheetLinkTypeImported with scala.Double = js.native
  /* 0 */ val wdStyleSheetLinkTypeLinked: wdStyleSheetLinkTypeLinked with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdStyleSheetLinkType with scala.Double] = js.native
}

