package typings
package atAngularCoreLib.srcRender3InterfacesI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait I18nMutateOpCode extends js.Object

@JSImport("@angular/core/src/render3/interfaces/i18n", "I18nMutateOpCode")
@js.native
object I18nMutateOpCode extends js.Object {
  @js.native
  sealed trait AppendChild
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode
  
  @js.native
  sealed trait Attr
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode
  
  @js.native
  sealed trait ElementEnd
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode
  
  @js.native
  sealed trait InsertBefore
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode
  
  @js.native
  sealed trait MASK_OPCODE
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode
  
  @js.native
  sealed trait MASK_REF
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode
  
  @js.native
  sealed trait Remove
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode
  
  @js.native
  sealed trait RemoveNestedIcu
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode
  
  @js.native
  sealed trait SHIFT_PARENT
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode
  
  @js.native
  sealed trait SHIFT_REF
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode
  
  @js.native
  sealed trait Select
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode
  
  /* 1 */ val AppendChild: AppendChild with scala.Double = js.native
  /* 4 */ val Attr: Attr with scala.Double = js.native
  /* 5 */ val ElementEnd: ElementEnd with scala.Double = js.native
  /* 2 */ val InsertBefore: InsertBefore with scala.Double = js.native
  /* 7 */ val MASK_OPCODE: MASK_OPCODE with scala.Double = js.native
  /* 136 */ val MASK_REF: MASK_REF with scala.Double = js.native
  /* 3 */ val Remove: Remove with scala.Double = js.native
  /* 6 */ val RemoveNestedIcu: RemoveNestedIcu with scala.Double = js.native
  /* 17 */ val SHIFT_PARENT: SHIFT_PARENT with scala.Double = js.native
  /* 3 */ val SHIFT_REF: SHIFT_REF with scala.Double = js.native
  /* 0 */ val Select: Select with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesI18nMod.I18nMutateOpCode with scala.Double] = js.native
}

