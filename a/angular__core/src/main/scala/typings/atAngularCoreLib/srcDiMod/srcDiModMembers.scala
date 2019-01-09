package typings
package atAngularCoreLib.srcDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di", JSImport.Namespace)
@js.native
object srcDiModMembers extends js.Object {
  val Host: atAngularCoreLib.srcDiMetadataMod.HostDecorator = js.native
  val INJECTOR: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[atAngularCoreLib.srcDiInjectorMod.Injector] = js.native
  val Inject: atAngularCoreLib.srcDiMetadataMod.InjectDecorator = js.native
  val Injectable: atAngularCoreLib.srcDiInjectableMod.InjectableDecorator = js.native
  val Optional: atAngularCoreLib.srcDiMetadataMod.OptionalDecorator = js.native
  val Self: atAngularCoreLib.srcDiMetadataMod.SelfDecorator = js.native
  val SkipSelf: atAngularCoreLib.srcDiMetadataMod.SkipSelfDecorator = js.native
  def createInjector(defType: js.Any): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def createInjector(defType: js.Any, parent: atAngularCoreLib.srcDiInjectorMod.Injector): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def createInjector(
    defType: js.Any,
    parent: atAngularCoreLib.srcDiInjectorMod.Injector,
    additionalProviders: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]
  ): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def createInjector(
    defType: js.Any,
    parent: scala.Null,
    additionalProviders: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]
  ): atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  def defineInjectable[T](opts: atAngularCoreLib.Anon_Any[T]): scala.Nothing = js.native
  def defineInjector(options: atAngularCoreLib.Anon_Factory): scala.Nothing = js.native
  def forwardRef(forwardRefFn: atAngularCoreLib.srcDiForwardUnderscoreRefMod.ForwardRefFn): atAngularCoreLib.srcTypeMod.Type[_] = js.native
  def inject[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T | scala.Null = js.native
  def inject[T](
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T | scala.Null = js.native
  def inject[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T | scala.Null = js.native
  def inject[T](
    token: atAngularCoreLib.srcTypeMod.Type[T],
    flags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): T | scala.Null = js.native
  @JSName("inject")
  def inject_TT[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T = js.native
  @JSName("inject")
  def inject_TT[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def resolveForwardRef[T](`type`: T): T = js.native
}

