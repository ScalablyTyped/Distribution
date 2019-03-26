package typings
package agDashGridLib.distLibComponentsFrameworkComponentProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RegisteredComponentSource extends js.Object

@JSImport("ag-grid/dist/lib/components/framework/componentProvider", "RegisteredComponentSource")
@js.native
object RegisteredComponentSource extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends agDashGridLib.distLibComponentsFrameworkComponentProviderMod.RegisteredComponentSource
  
  @js.native
  sealed trait REGISTERED
    extends agDashGridLib.distLibComponentsFrameworkComponentProviderMod.RegisteredComponentSource
  
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 1 */ val REGISTERED: REGISTERED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    agDashGridLib.distLibComponentsFrameworkComponentProviderMod.RegisteredComponentSource with scala.Double
  ] = js.native
}

