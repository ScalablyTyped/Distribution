package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "createPlatformFactory")
@js.native
object createPlatformFactory extends js.Object {
  
  def apply(
    parentPlatformFactory: js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef],
    name: String
  ): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
  def apply(
    parentPlatformFactory: js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef],
    name: String,
    providers: js.Array[StaticProvider]
  ): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
  def apply(parentPlatformFactory: Null, name: String): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
  def apply(parentPlatformFactory: Null, name: String, providers: js.Array[StaticProvider]): js.Function1[/* extraProviders */ js.UndefOr[js.Array[StaticProvider]], PlatformRef] = js.native
}
