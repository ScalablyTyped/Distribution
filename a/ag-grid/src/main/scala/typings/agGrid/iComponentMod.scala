package typings.agGrid

import typings.agGrid.utilsMod.Promise
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iComponentMod {
  
  trait IAfterGuiAttachedParams extends StObject {
    
    def hidePopup(): Unit
  }
  object IAfterGuiAttachedParams {
    
    inline def apply(hidePopup: () => Unit): IAfterGuiAttachedParams = {
      val __obj = js.Dynamic.literal(hidePopup = js.Any.fromFunction0(hidePopup))
      __obj.asInstanceOf[IAfterGuiAttachedParams]
    }
    
    extension [Self <: IAfterGuiAttachedParams](x: Self) {
      
      inline def setHidePopup(value: () => Unit): Self = StObject.set(x, "hidePopup", js.Any.fromFunction0(value))
    }
  }
  
  trait IComponent[T] extends StObject {
    
    /** A hook to perform any necessary operation just after the gui for this component has been renderer
      in the screen.
      If the filter popup is closed and reopened, this method is called each time the filter is shown.
      This is useful for any
      logic that requires attachment before executing, such as putting focus on a particular DOM
      element. The params has one callback method 'hidePopup', which you can call at any later
      point to hide the popup - good if you have an 'Apply' button and you want to hide the popup
      after it is pressed. */
    var afterGuiAttached: js.UndefOr[js.Function1[/* params */ js.UndefOr[IAfterGuiAttachedParams], Unit]] = js.undefined
    
    /** Gets called once by grid after editing is finished - if your editor needs to do any cleanup, do it here */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Return the DOM element of your editor, this is what the grid puts into the DOM */
    def getGui(): HTMLElement
    
    /** The init(params) method is called on the filter once. See below for details on the parameters. */
    var init: js.UndefOr[js.Function1[/* params */ T, Promise[Unit] | Unit]] = js.undefined
  }
  object IComponent {
    
    inline def apply[T](getGui: () => HTMLElement): IComponent[T] = {
      val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui))
      __obj.asInstanceOf[IComponent[T]]
    }
    
    extension [Self <: IComponent[?], T](x: Self & IComponent[T]) {
      
      inline def setAfterGuiAttached(value: /* params */ js.UndefOr[IAfterGuiAttachedParams] => Unit): Self = StObject.set(x, "afterGuiAttached", js.Any.fromFunction1(value))
      
      inline def setAfterGuiAttachedUndefined: Self = StObject.set(x, "afterGuiAttached", js.undefined)
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setGetGui(value: () => HTMLElement): Self = StObject.set(x, "getGui", js.Any.fromFunction0(value))
      
      inline def setInit(value: /* params */ T => Promise[Unit] | Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    }
  }
}
