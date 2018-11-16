package typings
package atAngularCoreLib.srcDiInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/injector", JSImport.Namespace)
@js.native
object srcDiInjectorModMembers extends js.Object {
  val INJECTOR: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[Injector] = js.native
  val SOURCE: /* __source */ java.lang.String = js.native
  val THROW_IF_NOT_FOUND: js.Object = js.native
  val USE_VALUE: java.lang.String = js.native
  def inject[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T | scala.Null = js.native
  def inject[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T], flags: InjectFlags): T | scala.Null = js.native
  def inject[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T | scala.Null = js.native
  def inject[T](token: atAngularCoreLib.srcTypeMod.Type[T], flags: InjectFlags): T | scala.Null = js.native
  def injectArgs(
    types: js.Array[
      atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[_] | js.Array[_]
    ]
  ): js.Array[_] = js.native
  @JSName("inject")
  def inject_TT[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T = js.native
  @JSName("inject")
  def inject_TT[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def setCurrentInjector(): js.UndefOr[Injector | scala.Null] = js.native
  def setCurrentInjector(injector: Injector): js.UndefOr[Injector | scala.Null] = js.native
}

