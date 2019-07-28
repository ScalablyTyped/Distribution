package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ɵDirectiveDef[T] extends ɵɵBaseDef[T] {
  var afterContentChecked: js.Function0[Unit] | Null = js.native
  var afterContentInit: js.Function0[Unit] | Null = js.native
  var afterViewChecked: js.Function0[Unit] | Null = js.native
  var afterViewInit: js.Function0[Unit] | Null = js.native
  var doCheck: js.Function0[Unit] | Null = js.native
  /**
    * Name under which the directive is exported (for use with local references in template)
    */
  val exportAs: js.Array[String] | Null = js.native
  /**
    * Factory function used to create a new directive instance.
    */
  @JSName("factory")
  var factory_Original: FactoryFn[T] = js.native
  /**
    * The features applied to this directive
    */
  val features: js.Array[DirectiveDefFeature] | Null = js.native
  var onChanges: js.Function0[Unit] | Null = js.native
  var onDestroy: js.Function0[Unit] | Null = js.native
  var onInit: js.Function0[Unit] | Null = js.native
  /** Function that resolves providers and publishes them into the DI system. */
  var providersResolver: (js.Function2[
    /* def */ ɵDirectiveDef[T], 
    /* processProvidersFn */ js.UndefOr[ProcessProvidersFunction], 
    Unit
  ]) | Null = js.native
  /** The selectors that will be used to match nodes to this directive. */
  val selectors: ɵCssSelectorList = js.native
  var setInput: (js.ThisFunction4[
    /* this */ ɵDirectiveDef[T], 
    /* instance */ T, 
    /* value */ js.Any, 
    /* publicName */ String, 
    /* privateName */ String, 
    Unit
  ]) | Null = js.native
  /** Token representing the directive. Used by DI. */
  var `type`: Type[T] = js.native
  /**
    * If no constructor to instantiate is provided, an instance of type T itself is created.
    */
  /**
    * Factory function used to create a new directive instance.
    */
  def factory(): T = js.native
  /**
    * Subclasses without an explicit constructor call through to the factory of their base
    * definition, providing it with their own constructor to instantiate.
    */
  /**
    * Factory function used to create a new directive instance.
    */
  def factory[U /* <: T */](t: Type[U]): U = js.native
}

