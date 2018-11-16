package typings
package atAngularCoreLib.srcDiReflectiveUnderscoreInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/reflective_injector", "ReflectiveInjector_")
@js.native
class `ReflectiveInjector_` protected () extends ReflectiveInjector {
  /**
       * Private
       */
  def this(_providers: js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider]) = this()
  /**
       * Private
       */
  def this(_providers: js.Array[atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider], _parent: atAngularCoreLib.srcDiInjectorMod.Injector) = this()
  var _getByKey: js.Any = js.native
  var _getByReflectiveDependency: js.Any = js.native
  var _getMaxNumberOfObjects: js.Any = js.native
  var _getObjByKeyId: js.Any = js.native
  var _instantiate: js.Any = js.native
  var _instantiateProvider: js.Any = js.native
  val displayName: java.lang.String = js.native
  var keyIds: js.Array[scala.Double] = js.native
  var objs: js.Array[_] = js.native
  def getProviderAtIndex(index: scala.Double): atAngularCoreLib.srcDiReflectiveUnderscoreProviderMod.ResolvedReflectiveProvider = js.native
}

@JSImport("@angular/core/src/di/reflective_injector", "ReflectiveInjector_")
@js.native
object `ReflectiveInjector_` extends js.Object {
  var INJECTOR_KEY: js.Any = js.native
}

