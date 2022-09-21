package typings.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "StrategyResolver")
@js.native
open class StrategyResolver[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */, TStrategyKey /* <: /* keyof aurelia-dependency-injection.aurelia-dependency-injection.StrategyState<TBase, TImpl, TArgs> */ String */] protected () extends StObject {
  def this(
    strategy: TStrategyKey,
    state: /* import warning: importer.ImportType#apply Failed type conversion: aurelia-dependency-injection.aurelia-dependency-injection.StrategyState<TBase, TImpl, TArgs>[TStrategyKey] */ js.Any
  ) = this()
  
  def get(container: Container, key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): TImpl = js.native
  
  var state: TImpl = js.native
  
  var strategy: /* keyof aurelia-dependency-injection.aurelia-dependency-injection.StrategyState<TBase, TImpl, TArgs> */ String = js.native
}
