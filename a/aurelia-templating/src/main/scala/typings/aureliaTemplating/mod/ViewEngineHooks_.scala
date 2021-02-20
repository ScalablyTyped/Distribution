package typings.aureliaTemplating.mod

import typings.aureliaDependencyInjection.mod.Container
import typings.std.DocumentFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewEngineHooks_ extends StObject {
  
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
  implicit class ViewEngineHooks_MutableBuilder[Self <: ViewEngineHooks_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterCompile(value: /* viewFactory */ ViewFactory => Unit): Self = StObject.set(x, "afterCompile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterCompileUndefined: Self = StObject.set(x, "afterCompile", js.undefined)
    
    @scala.inline
    def setAfterCreate(value: /* view */ View_ => Unit): Self = StObject.set(x, "afterCreate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterCreateUndefined: Self = StObject.set(x, "afterCreate", js.undefined)
    
    @scala.inline
    def setBeforeBind(value: /* view */ View_ => Unit): Self = StObject.set(x, "beforeBind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeBindUndefined: Self = StObject.set(x, "beforeBind", js.undefined)
    
    @scala.inline
    def setBeforeCompile(
      value: (/* content */ DocumentFragment, /* resources */ ViewResources_, /* instruction */ ViewCompileInstruction) => Unit
    ): Self = StObject.set(x, "beforeCompile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeCompileUndefined: Self = StObject.set(x, "beforeCompile", js.undefined)
    
    @scala.inline
    def setBeforeCreate(
      value: (/* viewFactory */ ViewFactory, /* container */ Container, /* content */ DocumentFragment, /* instruction */ ViewCreateInstruction) => Unit
    ): Self = StObject.set(x, "beforeCreate", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
    
    @scala.inline
    def setBeforeUnbind(value: /* view */ View_ => Unit): Self = StObject.set(x, "beforeUnbind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeUnbindUndefined: Self = StObject.set(x, "beforeUnbind", js.undefined)
  }
}
