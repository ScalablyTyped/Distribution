package typings
package atAngularCoreLib.srcDiInjectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/di/injector", "StaticInjector")
@js.native
class StaticInjector protected () extends Injector {
  def this(providers: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider]) = this()
  def this(providers: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider], parent: Injector) = this()
  def this(providers: js.Array[atAngularCoreLib.srcDiProviderMod.StaticProvider], parent: Injector, source: java.lang.String) = this()
  var _records: js.Any = js.native
  val parent: Injector = js.native
  val source: java.lang.String | scala.Null = js.native
}

