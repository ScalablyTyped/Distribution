package typings
package atAngularCoreLib.srcRender3InterfacesI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait I18nUpdateOpCode extends js.Object

@JSImport("@angular/core/src/render3/interfaces/i18n", "I18nUpdateOpCode")
@js.native
object I18nUpdateOpCode extends js.Object {
  @js.native
  sealed trait Attr
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nUpdateOpCode
  
  @js.native
  sealed trait IcuSwitch
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nUpdateOpCode
  
  @js.native
  sealed trait IcuUpdate
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nUpdateOpCode
  
  @js.native
  sealed trait MASK_OPCODE
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nUpdateOpCode
  
  @js.native
  sealed trait MASK_REF
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nUpdateOpCode
  
  @js.native
  sealed trait SHIFT_ICU
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nUpdateOpCode
  
  @js.native
  sealed trait SHIFT_REF
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nUpdateOpCode
  
  @js.native
  sealed trait Text
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nUpdateOpCode
  
  /* 1 */ val Attr: Attr with scala.Double = js.native
  /* 2 */ val IcuSwitch: IcuSwitch with scala.Double = js.native
  /* 3 */ val IcuUpdate: IcuUpdate with scala.Double = js.native
  /* 3 */ val MASK_OPCODE: MASK_OPCODE with scala.Double = js.native
  /* 68 */ val MASK_REF: MASK_REF with scala.Double = js.native
  /* 17 */ val SHIFT_ICU: SHIFT_ICU with scala.Double = js.native
  /* 2 */ val SHIFT_REF: SHIFT_REF with scala.Double = js.native
  /* 0 */ val Text: Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesI18nMod.I18nUpdateOpCode with scala.Double] = js.native
}

