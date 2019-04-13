package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/application_tokens", JSImport.Namespace)
@js.native
object srcApplicationUnderscoreTokensMod extends js.Object {
  val APP_BOOTSTRAP_LISTENER: atAngularCoreLib.srcDiMod.InjectionToken[
    js.Array[
      js.Function1[
        /* compRef */ atAngularCoreLib.srcLinkerComponentUnderscoreFactoryMod.ComponentRef[js.Any], 
        scala.Unit
      ]
    ]
  ] = js.native
  val APP_ID: atAngularCoreLib.srcDiMod.InjectionToken[java.lang.String] = js.native
  val PACKAGE_ROOT_URL: atAngularCoreLib.srcDiMod.InjectionToken[java.lang.String] = js.native
  val PLATFORM_ID: atAngularCoreLib.srcDiMod.InjectionToken[js.Object] = js.native
  val PLATFORM_INITIALIZER: atAngularCoreLib.srcDiMod.InjectionToken[js.Array[js.Function0[scala.Unit]]] = js.native
  def _appIdRandomProviderFactory(): java.lang.String = js.native
  @js.native
  object APP_ID_RANDOM_PROVIDER extends js.Object {
    var deps: js.Array[_] = js.native
    var provide: atAngularCoreLib.srcDiMod.InjectionToken[java.lang.String] = js.native
    @JSName("useFactory")
    var useFactory_Original: js.Function0[java.lang.String] = js.native
    def useFactory(): java.lang.String = js.native
  }
  
}

