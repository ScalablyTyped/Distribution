package typings
package agDashGridLib.distLibComponentsFrameworkComponentResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComponentSource extends js.Object

@JSImport("ag-grid/dist/lib/components/framework/componentResolver", "ComponentSource")
@js.native
object ComponentSource extends js.Object {
  @js.native
  sealed trait DEFAULT
    extends agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentSource
  
  @js.native
  sealed trait HARDCODED
    extends agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentSource
  
  @js.native
  sealed trait REGISTERED_BY_NAME
    extends agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentSource
  
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 2 */ val HARDCODED: HARDCODED with scala.Double = js.native
  /* 1 */ val REGISTERED_BY_NAME: REGISTERED_BY_NAME with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    agDashGridLib.distLibComponentsFrameworkComponentResolverMod.ComponentSource with scala.Double
  ] = js.native
}

