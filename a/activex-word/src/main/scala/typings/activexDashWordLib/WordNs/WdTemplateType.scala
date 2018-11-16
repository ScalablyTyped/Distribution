package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTemplateType extends js.Object

@JSGlobal("Word.WdTemplateType")
@js.native
object WdTemplateType extends js.Object {
  @js.native
  sealed trait wdAttachedTemplate
    extends activexDashWordLib.WordNs.WdTemplateType
  
  @js.native
  sealed trait wdGlobalTemplate
    extends activexDashWordLib.WordNs.WdTemplateType
  
  @js.native
  sealed trait wdNormalTemplate
    extends activexDashWordLib.WordNs.WdTemplateType
  
  /* 2 */ val wdAttachedTemplate: wdAttachedTemplate with scala.Double = js.native
  /* 1 */ val wdGlobalTemplate: wdGlobalTemplate with scala.Double = js.native
  /* 0 */ val wdNormalTemplate: wdNormalTemplate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTemplateType with scala.Double] = js.native
}

