package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewEngineHooks extends js.Object {
  /**
    * Invoked after a template is compiled.
    * @param viewFactory The view factory that was produced from the compilation process.
    */
  var afterCompile: js.UndefOr[js.Function1[/* viewFactory */ ViewFactory, scala.Unit]] = js.undefined
  /**
    * Invoked after a view is created.
    * @param view The view that was created by the factory.
    */
  var afterCreate: js.UndefOr[js.Function1[/* view */ View, scala.Unit]] = js.undefined
  /**
    * Invoked after the bindingContext and overrideContext are configured on the view but before the view is bound.
    * @param view The view that was created by the factory.
    */
  var beforeBind: js.UndefOr[js.Function1[/* view */ View, scala.Unit]] = js.undefined
  /**
    * Invoked before a template is compiled.
    * @param content The DocumentFragment to compile.
    * @param resources The resources to compile the view against.
    * @param instruction The compilation instruction associated with the compilation process.
    */
  var beforeCompile: js.UndefOr[
    js.Function3[
      /* content */ stdLib.DocumentFragment, 
      /* resources */ ViewResources, 
      /* instruction */ ViewCompileInstruction, 
      scala.Unit
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
      /* container */ aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container, 
      /* content */ stdLib.DocumentFragment, 
      /* instruction */ ViewCreateInstruction, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Invoked before the view is unbind. The bindingContext and overrideContext are still available on the view.
    * @param view The view that was created by the factory.
    */
  var beforeUnbind: js.UndefOr[js.Function1[/* view */ View, scala.Unit]] = js.undefined
}

object ViewEngineHooks {
  @scala.inline
  def apply(
    afterCompile: js.Function1[/* viewFactory */ ViewFactory, scala.Unit] = null,
    afterCreate: js.Function1[/* view */ View, scala.Unit] = null,
    beforeBind: js.Function1[/* view */ View, scala.Unit] = null,
    beforeCompile: js.Function3[
      /* content */ stdLib.DocumentFragment, 
      /* resources */ ViewResources, 
      /* instruction */ ViewCompileInstruction, 
      scala.Unit
    ] = null,
    beforeCreate: js.Function4[
      /* viewFactory */ ViewFactory, 
      /* container */ aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod.Container, 
      /* content */ stdLib.DocumentFragment, 
      /* instruction */ ViewCreateInstruction, 
      scala.Unit
    ] = null,
    beforeUnbind: js.Function1[/* view */ View, scala.Unit] = null
  ): ViewEngineHooks = {
    val __obj = js.Dynamic.literal()
    if (afterCompile != null) __obj.updateDynamic("afterCompile")(afterCompile)
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(afterCreate)
    if (beforeBind != null) __obj.updateDynamic("beforeBind")(beforeBind)
    if (beforeCompile != null) __obj.updateDynamic("beforeCompile")(beforeCompile)
    if (beforeCreate != null) __obj.updateDynamic("beforeCreate")(beforeCreate)
    if (beforeUnbind != null) __obj.updateDynamic("beforeUnbind")(beforeUnbind)
    __obj.asInstanceOf[ViewEngineHooks]
  }
}

