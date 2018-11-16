package typings
package atAngularCoreLib.srcRender3I18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait I18nInstructions extends js.Object

@JSImport("@angular/core/src/render3/i18n", "I18nInstructions")
@js.native
object I18nInstructions extends js.Object {
  @js.native
  sealed trait Any
    extends atAngularCoreLib.srcRender3I18nMod.I18nInstructions
  
  @js.native
  sealed trait CloseNode
    extends atAngularCoreLib.srcRender3I18nMod.I18nInstructions
  
  @js.native
  sealed trait Element
    extends atAngularCoreLib.srcRender3I18nMod.I18nInstructions
  
  @js.native
  sealed trait Expression
    extends atAngularCoreLib.srcRender3I18nMod.I18nInstructions
  
  /** Used to decode the number encoded with the instruction. */
  @js.native
  sealed trait IndexMask
    extends atAngularCoreLib.srcRender3I18nMod.I18nInstructions
  
  /** Used to test the type of instruction. */
  @js.native
  sealed trait InstructionMask
    extends atAngularCoreLib.srcRender3I18nMod.I18nInstructions
  
  @js.native
  sealed trait RemoveNode
    extends atAngularCoreLib.srcRender3I18nMod.I18nInstructions
  
  @js.native
  sealed trait TemplateRoot
    extends atAngularCoreLib.srcRender3I18nMod.I18nInstructions
  
  @js.native
  sealed trait Text
    extends atAngularCoreLib.srcRender3I18nMod.I18nInstructions
  
  /* -1610612736 */ val Any: Any with scala.Double = js.native
  /* -1073741824 */ val CloseNode: CloseNode with scala.Double = js.native
  /* 1073741824 */ val Element: Element with scala.Double = js.native
  /* 1610612736 */ val Expression: Expression with scala.Double = js.native
  /* 536870911 */ val IndexMask: IndexMask with scala.Double = js.native
  /* -536870912 */ val InstructionMask: InstructionMask with scala.Double = js.native
  /* -536870912 */ val RemoveNode: RemoveNode with scala.Double = js.native
  /* -2147483648 */ val TemplateRoot: TemplateRoot with scala.Double = js.native
  /* 536870912 */ val Text: Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3I18nMod.I18nInstructions with scala.Double] = js.native
}

