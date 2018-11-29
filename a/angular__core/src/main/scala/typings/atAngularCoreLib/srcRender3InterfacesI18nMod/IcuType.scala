package typings
package atAngularCoreLib.srcRender3InterfacesI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IcuType extends js.Object

@JSImport("@angular/core/src/render3/interfaces/i18n", "IcuType")
@js.native
object IcuType extends js.Object {
  @js.native
  sealed trait plural
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.IcuType
  
  @js.native
  sealed trait select
    extends atAngularCoreLib.srcRender3InterfacesI18nMod.IcuType
  
  /* 1 */ val plural: plural with scala.Double = js.native
  /* 0 */ val select: select with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesI18nMod.IcuType with scala.Double] = js.native
}

