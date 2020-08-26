package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import typings.std.DocumentFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewEngineHooks_ extends js.Object {
  /**
    * Invoked after a template is compiled.
    * @param viewFactory The view factory that was produced from the compilation process.
    */
  var afterCompile: js.UndefOr[js.Function1[/* viewFactory */ ViewFactory, Unit]] = js.native
  /**
    * Invoked after a view is created.
    * @param view The view that was created by the factory.
    */
  var afterCreate: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.native
  /**
    * Invoked after the bindingContext and overrideContext are configured on the view but before the view is bound.
    * @param view The view that was created by the factory.
    */
  var beforeBind: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.native
  /**
    * Invoked before a template is compiled.
    * @param content The DocumentFragment to compile.
    * @param resources The resources to compile the view against.
    * @param instruction The compilation instruction associated with the compilation process.
    */
  var beforeCompile: js.UndefOr[
    js.Function3[
      /* content */ DocumentFragment, 
      /* resources */ ViewResources_, 
      /* instruction */ ViewCompileInstruction, 
      Unit
    ]
  ] = js.native
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
  ] = js.native
  /**
    * Invoked before the view is unbind. The bindingContext and overrideContext are still available on the view.
    * @param view The view that was created by the factory.
    */
  var beforeUnbind: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.native
}

object ViewEngineHooks_ {
  @scala.inline
  def apply(): ViewEngineHooks_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewEngineHooks_]
  }
  @scala.inline
  implicit class ViewEngineHooks_Ops[Self <: ViewEngineHooks_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterCompile(value: /* viewFactory */ ViewFactory => Unit): Self = this.set("afterCompile", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterCompile: Self = this.set("afterCompile", js.undefined)
    @scala.inline
    def setAfterCreate(value: /* view */ View_ => Unit): Self = this.set("afterCreate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterCreate: Self = this.set("afterCreate", js.undefined)
    @scala.inline
    def setBeforeBind(value: /* view */ View_ => Unit): Self = this.set("beforeBind", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeBind: Self = this.set("beforeBind", js.undefined)
    @scala.inline
    def setBeforeCompile(
      value: (/* content */ DocumentFragment, /* resources */ ViewResources_, /* instruction */ ViewCompileInstruction) => Unit
    ): Self = this.set("beforeCompile", js.Any.fromFunction3(value))
    @scala.inline
    def deleteBeforeCompile: Self = this.set("beforeCompile", js.undefined)
    @scala.inline
    def setBeforeCreate(
      value: (/* viewFactory */ ViewFactory, /* container */ Container, /* content */ DocumentFragment, /* instruction */ ViewCreateInstruction) => Unit
    ): Self = this.set("beforeCreate", js.Any.fromFunction4(value))
    @scala.inline
    def deleteBeforeCreate: Self = this.set("beforeCreate", js.undefined)
    @scala.inline
    def setBeforeUnbind(value: /* view */ View_ => Unit): Self = this.set("beforeUnbind", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeUnbind: Self = this.set("beforeUnbind", js.undefined)
  }
  
}

