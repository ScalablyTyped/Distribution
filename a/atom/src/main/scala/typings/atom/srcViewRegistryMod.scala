package typings.atom

import typings.atom.anon.Instantiable
import typings.atom.mod.Disposable
import typings.atom.mod.TextEditor
import typings.atom.srcTextEditorElementMod.TextEditorElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewRegistryMod {
  
  trait ViewModel extends StObject {
    
    def getTitle(): String
  }
  object ViewModel {
    
    inline def apply(getTitle: () => String): ViewModel = {
      val __obj = js.Dynamic.literal(getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[ViewModel]
    }
    
    extension [Self <: ViewModel](x: Self) {
      
      inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ViewRegistry extends StObject {
    
    /**
      *  Add a provider that will be used to construct views in the workspace's view
      *  layer based on model objects in its model layer.
      */
    def addViewProvider(createView: js.Function1[/* model */ js.Object, js.UndefOr[HTMLElement]]): Disposable = js.native
    /**
      *  Add a provider that will be used to construct views in the workspace's view
      *  layer based on model objects in its model layer.
      */
    // tslint:disable-next-line:no-any
    def addViewProvider[T](
      modelConstructor: Instantiable[T],
      // tslint:disable-line no-any
    createView: js.Function1[/* instance */ T, js.UndefOr[HTMLElement]]
    ): Disposable = js.native
    
    def getView(obj: js.Object): HTMLElement = js.native
    /** Get the view associated with an object in the workspace. */
    def getView(obj: TextEditor): TextEditorElement = js.native
  }
}
