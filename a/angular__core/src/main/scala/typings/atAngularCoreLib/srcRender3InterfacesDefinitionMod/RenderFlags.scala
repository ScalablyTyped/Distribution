package typings
package atAngularCoreLib.srcRender3InterfacesDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RenderFlags extends js.Object

@JSImport("@angular/core/src/render3/interfaces/definition", "RenderFlags")
@js.native
object RenderFlags extends js.Object {
  @js.native
  sealed trait Create
    extends atAngularCoreLib.srcRender3InterfacesDefinitionMod.RenderFlags
  
  @js.native
  sealed trait Update
    extends atAngularCoreLib.srcRender3InterfacesDefinitionMod.RenderFlags
  
  /* 1 */ val Create: Create with scala.Double = js.native
  /* 2 */ val Update: Update with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atAngularCoreLib.srcRender3InterfacesDefinitionMod.RenderFlags with scala.Double] = js.native
}

