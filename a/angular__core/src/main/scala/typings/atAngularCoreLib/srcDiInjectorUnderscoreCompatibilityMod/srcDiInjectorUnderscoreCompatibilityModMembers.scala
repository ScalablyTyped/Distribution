package typings
package atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/injector_compatibility", JSImport.Namespace)
@js.native
object srcDiInjectorUnderscoreCompatibilityModMembers extends js.Object {
  def inject[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T | scala.Null = js.native
  def inject[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T], flags: InjectFlags): T | scala.Null = js.native
  def inject[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T | scala.Null = js.native
  def inject[T](token: atAngularCoreLib.srcTypeMod.Type[T], flags: InjectFlags): T | scala.Null = js.native
  def injectArgs(
    types: js.Array[
      atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[_] | js.Array[_]
    ]
  ): js.Array[_] = js.native
  def injectInjectorOnly[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T | scala.Null = js.native
  def injectInjectorOnly[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T], flags: InjectFlags): T | scala.Null = js.native
  def injectInjectorOnly[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T | scala.Null = js.native
  def injectInjectorOnly[T](token: atAngularCoreLib.srcTypeMod.Type[T], flags: InjectFlags): T | scala.Null = js.native
  @JSName("injectInjectorOnly")
  def injectInjectorOnly_TT[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T = js.native
  @JSName("injectInjectorOnly")
  def injectInjectorOnly_TT[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def injectRootLimpMode[T](
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    notFoundValue: T,
    flags: InjectFlags
  ): T | scala.Null = js.native
  def injectRootLimpMode[T](
    token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T],
    notFoundValue: js.UndefOr[scala.Nothing],
    flags: InjectFlags
  ): T | scala.Null = js.native
  def injectRootLimpMode[T](token: atAngularCoreLib.srcTypeMod.Type[T], notFoundValue: T, flags: InjectFlags): T | scala.Null = js.native
  def injectRootLimpMode[T](
    token: atAngularCoreLib.srcTypeMod.Type[T],
    notFoundValue: js.UndefOr[scala.Nothing],
    flags: InjectFlags
  ): T | scala.Null = js.native
  @JSName("inject")
  def inject_TT[T](token: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[T]): T = js.native
  @JSName("inject")
  def inject_TT[T](token: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
  def setCurrentInjector(): js.UndefOr[atAngularCoreLib.srcDiInjectorMod.Injector | scala.Null] = js.native
  def setCurrentInjector(injector: atAngularCoreLib.srcDiInjectorMod.Injector): js.UndefOr[atAngularCoreLib.srcDiInjectorMod.Injector | scala.Null] = js.native
  def setInjectImplementation(): js.UndefOr[
    js.Function2[
      /* token */ atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[_], 
      /* flags */ js.UndefOr[InjectFlags], 
      _ | scala.Null
    ]
  ] = js.native
  def setInjectImplementation(
    impl: js.Function2[
      /* token */ atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[_], 
      /* flags */ js.UndefOr[InjectFlags], 
      _ | scala.Null
    ]
  ): js.UndefOr[
    js.Function2[
      /* token */ atAngularCoreLib.srcTypeMod.Type[_] | atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[_], 
      /* flags */ js.UndefOr[InjectFlags], 
      _ | scala.Null
    ]
  ] = js.native
}

