package typings.aureliaDashTemplating.aureliaDashTemplatingMod

import typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod.Container
import typings.std.DocumentFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewEngineHooks extends js.Object {
  /**
    * Invoked after a template is compiled.
    * @param viewFactory The view factory that was produced from the compilation process.
    */
  var afterCompile: js.UndefOr[js.Function1[/* viewFactory */ ViewFactory, Unit]] = js.undefined
  /**
    * Invoked after a view is created.
    * @param view The view that was created by the factory.
    */
  var afterCreate: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.undefined
  /**
    * Invoked after the bindingContext and overrideContext are configured on the view but before the view is bound.
    * @param view The view that was created by the factory.
    */
  var beforeBind: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.undefined
  /**
    * Invoked before a template is compiled.
    * @param content The DocumentFragment to compile.
    * @param resources The resources to compile the view against.
    * @param instruction The compilation instruction associated with the compilation process.
    */
  var beforeCompile: js.UndefOr[
    js.Function3[
      /* content */ DocumentFragment, 
      /* resources */ ViewResources, 
      /* instruction */ ViewCompileInstruction, 
      Unit
    ]
  ] = js.undefined
  /**
    * Invoked before a view is created.
    * @param viewFactory The view factory that will be used to create the view.
    * @param container The DI container used during view creation.
    * @param content The cloned document fragment representing the view.
    * @param instruction The view creation instruction associated with this creation process.
    */
  var beforeCreate: js.UndefOr[
    js.Function4[
      /* viewFactory */ ViewFactory, 
      /* container */ Container, 
      /* content */ DocumentFragment, 
      /* instruction */ ViewCreateInstruction, 
      Unit
    ]
  ] = js.undefined
  /**
    * Invoked before the view is unbind. The bindingContext and overrideContext are still available on the view.
    * @param view The view that was created by the factory.
    */
  var beforeUnbind: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.undefined
}

object ViewEngineHooks {
  @scala.inline
  def apply(
    afterCompile: /* viewFactory */ ViewFactory => Unit = null,
    afterCreate: /* view */ View => Unit = null,
    beforeBind: /* view */ View => Unit = null,
    beforeCompile: (/* content */ DocumentFragment, /* resources */ ViewResources, /* instruction */ ViewCompileInstruction) => Unit = null,
    beforeCreate: (/* viewFactory */ ViewFactory, /* container */ Container, /* content */ DocumentFragment, /* instruction */ ViewCreateInstruction) => Unit = null,
    beforeUnbind: /* view */ View => Unit = null
  ): ViewEngineHooks = {
    val __obj = js.Dynamic.literal()
    if (afterCompile != null) __obj.updateDynamic("afterCompile")(js.Any.fromFunction1(afterCompile))
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(js.Any.fromFunction1(afterCreate))
    if (beforeBind != null) __obj.updateDynamic("beforeBind")(js.Any.fromFunction1(beforeBind))
    if (beforeCompile != null) __obj.updateDynamic("beforeCompile")(js.Any.fromFunction3(beforeCompile))
    if (beforeCreate != null) __obj.updateDynamic("beforeCreate")(js.Any.fromFunction4(beforeCreate))
    if (beforeUnbind != null) __obj.updateDynamic("beforeUnbind")(js.Any.fromFunction1(beforeUnbind))
    __obj.asInstanceOf[ViewEngineHooks]
  }
}

@JSImport("aurelia-templating", "viewEngineHooks")
@js.native
object viewEngineHooks extends js.Object {
  def apply(): js.Any = js.native
  def apply(target: js.Any): js.Any = js.native
}

