package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdLinkType extends js.Object

@JSGlobal("Word.WdLinkType")
@js.native
object WdLinkType extends js.Object {
  @js.native
  sealed trait wdLinkTypeChart
    extends activexDashWordLib.WordNs.WdLinkType
  
  @js.native
  sealed trait wdLinkTypeDDE
    extends activexDashWordLib.WordNs.WdLinkType
  
  @js.native
  sealed trait wdLinkTypeDDEAuto
    extends activexDashWordLib.WordNs.WdLinkType
  
  @js.native
  sealed trait wdLinkTypeImport
    extends activexDashWordLib.WordNs.WdLinkType
  
  @js.native
  sealed trait wdLinkTypeInclude
    extends activexDashWordLib.WordNs.WdLinkType
  
  @js.native
  sealed trait wdLinkTypeOLE
    extends activexDashWordLib.WordNs.WdLinkType
  
  @js.native
  sealed trait wdLinkTypePicture
    extends activexDashWordLib.WordNs.WdLinkType
  
  @js.native
  sealed trait wdLinkTypeReference
    extends activexDashWordLib.WordNs.WdLinkType
  
  @js.native
  sealed trait wdLinkTypeText
    extends activexDashWordLib.WordNs.WdLinkType
  
  /* 8 */ val wdLinkTypeChart: wdLinkTypeChart with scala.Double = js.native
  /* 6 */ val wdLinkTypeDDE: wdLinkTypeDDE with scala.Double = js.native
  /* 7 */ val wdLinkTypeDDEAuto: wdLinkTypeDDEAuto with scala.Double = js.native
  /* 5 */ val wdLinkTypeImport: wdLinkTypeImport with scala.Double = js.native
  /* 4 */ val wdLinkTypeInclude: wdLinkTypeInclude with scala.Double = js.native
  /* 0 */ val wdLinkTypeOLE: wdLinkTypeOLE with scala.Double = js.native
  /* 1 */ val wdLinkTypePicture: wdLinkTypePicture with scala.Double = js.native
  /* 3 */ val wdLinkTypeReference: wdLinkTypeReference with scala.Double = js.native
  /* 2 */ val wdLinkTypeText: wdLinkTypeText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdLinkType with scala.Double] = js.native
}

