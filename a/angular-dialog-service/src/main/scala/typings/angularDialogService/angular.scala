package typings.angularDialogService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object dialogservice {
    
    trait IDialogOptions extends StObject {
      
      /**
        * Set to false to disable animations on new modal/backdrop. Does not toggle animations for modals/backdrops that are already displayed.
        *
        * @default false
        */
      var animation: js.UndefOr[Boolean] = js.undefined
      
      /**
        * controls the presence of a backdrop
        * Allowed values:
        *   - true (default)
        *   - false (no backdrop)
        *   - 'static' backdrop is present but modal window is not closed when clicking outside of the modal window
        *
        * @default true
        */
      var backdrop: js.UndefOr[Boolean | String] = js.undefined
      
      /**
        * additional CSS class(es) to be added to a modal backdrop template
        *
        * @default 'dialogs-backdrop-default'
        */
      var backdropClass: js.UndefOr[String] = js.undefined
      
      /**
        * indicates whether the dialog should be closable by hitting the ESC key
        *
        * @default true
        */
      var keyboard: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Optional suffix of modal window class. The value used is appended to the `modal-` class, i.e. a value of `sm` gives `modal-sm`.
        *
        * @default 'lg'
        */
      var size: js.UndefOr[String] = js.undefined
      
      /**
        * additional CSS class(es) to be added to a modal window template
        *
        * @default 'dialogs-default'
        */
      var windowClass: js.UndefOr[String] = js.undefined
    }
    object IDialogOptions {
      
      inline def apply(): IDialogOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IDialogOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IDialogOptions] (val x: Self) extends AnyVal {
        
        inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
        
        inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
        
        inline def setBackdrop(value: Boolean | String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
        
        inline def setBackdropClass(value: String): Self = StObject.set(x, "backdropClass", value.asInstanceOf[js.Any])
        
        inline def setBackdropClassUndefined: Self = StObject.set(x, "backdropClass", js.undefined)
        
        inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
        
        inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
        
        inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
        
        inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setWindowClass(value: String): Self = StObject.set(x, "windowClass", value.asInstanceOf[js.Any])
        
        inline def setWindowClassUndefined: Self = StObject.set(x, "windowClass", js.undefined)
      }
    }
    
    @js.native
    trait IDialogService extends StObject {
      
      /**
        * Opens a new confirm modal instance.
        */
      def confirm(header: String, msg: String): Any = js.native
      def confirm(header: String, msg: String, opts: IDialogOptions): Any = js.native
      
      /**
        * Opens a new custom modal instance.
        */
      def create(url: String, ctrlr: String, data: Any): Any = js.native
      def create(url: String, ctrlr: String, data: Any, opts: IDialogOptions): Any = js.native
      
      /**
        * Opens a new error modal instance.
        */
      def error(header: String, msg: String): Any = js.native
      def error(header: String, msg: String, opts: IDialogOptions): Any = js.native
      
      /**
        * Opens a new notify modal instance.
        */
      def notify(header: String, msg: String): Any = js.native
      def notify(header: String, msg: String, opts: IDialogOptions): Any = js.native
      
      /**
        * Opens a new wait modal instance.
        */
      def wait(header: String, msg: String, progress: Double): Any = js.native
      def wait(header: String, msg: String, progress: Double, opts: IDialogOptions): Any = js.native
    }
  }
}
