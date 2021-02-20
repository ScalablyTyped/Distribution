package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "FactoryInvoker")
@js.native
class FactoryInvoker[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] () extends Invoker_[TBase, TImpl, TArgs]
/* static members */
object FactoryInvoker {
  
  @JSImport("aurelia-dependency-injection", "FactoryInvoker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aurelia-dependency-injection", "FactoryInvoker.instance")
  @js.native
  def instance: FactoryInvoker[js.Any, Impl[js.Any], Args[js.Any]] = js.native
  @scala.inline
  def instance_=(x: FactoryInvoker[js.Any, Impl[js.Any], Args[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
}
