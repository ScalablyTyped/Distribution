package typings
package atAngularCoreLib.srcApplicationUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/application_ref", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ALLOW_MULTIPLE_PLATFORMS: atAngularCoreLib.srcDiMod.InjectionToken[scala.Boolean] = js.native
  def assertPlatform(requiredToken: js.Any): PlatformRef = js.native
  def compileNgModuleFactory__POST_R3__[M](
    injector: atAngularCoreLib.srcDiMod.Injector,
    options: atAngularCoreLib.srcLinkerCompilerMod.CompilerOptions,
    moduleType: atAngularCoreLib.srcTypeMod.Type[M]
  ): js.Promise[
    atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleFactory[M]
  ] = js.native
  def createPlatform(injector: atAngularCoreLib.srcDiMod.Injector): PlatformRef = js.native
  def createPlatformFactory(
    parentPlatformFactory: js.Function1[
      /* extraProviders */ js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]], 
      PlatformRef
    ],
    name: java.lang.String
  ): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]], 
    PlatformRef
  ] = js.native
  def createPlatformFactory(
    parentPlatformFactory: js.Function1[
      /* extraProviders */ js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]], 
      PlatformRef
    ],
    name: java.lang.String,
    providers: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]
  ): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]], 
    PlatformRef
  ] = js.native
  def createPlatformFactory(parentPlatformFactory: scala.Null, name: java.lang.String): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]], 
    PlatformRef
  ] = js.native
  def createPlatformFactory(
    parentPlatformFactory: scala.Null,
    name: java.lang.String,
    providers: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]
  ): js.Function1[
    /* extraProviders */ js.UndefOr[js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]], 
    PlatformRef
  ] = js.native
  def destroyPlatform(): scala.Unit = js.native
  def getPlatform(): PlatformRef | scala.Null = js.native
}

