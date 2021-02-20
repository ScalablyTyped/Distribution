package typings.angularToastr

import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.IPromise
import typings.angular.mod.IRootScopeService
import typings.angularToastr.anon.Error
import typings.angularToastr.anon.Progressbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type IToast = typings.angularToastr.mod.angularAugmentingMod.toastr.IToast
  
  type IToastBaseConfig = typings.angularToastr.mod.angularAugmentingMod.toastr.IToastBaseConfig
  
  type IToastConfig = typings.angularToastr.mod.angularAugmentingMod.toastr.IToastConfig
  
  type IToastContainerConfig = typings.angularToastr.mod.angularAugmentingMod.toastr.IToastContainerConfig
  
  type IToastOptions = typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions
  
  type IToastScope = typings.angularToastr.mod.angularAugmentingMod.toastr.IToastScope
  
  type IToastrConfig = typings.angularToastr.mod.angularAugmentingMod.toastr.IToastrConfig
  
  type IToastrService = typings.angularToastr.mod.angularAugmentingMod.toastr.IToastrService
  
  /* augmented module */
  object angularAugmentingMod {
    
    object toastr {
      
      @js.native
      trait IToast extends StObject {
        
        var el: IAugmentedJQuery = js.native
        
        var iconClass: String = js.native
        
        var isOpened: Boolean = js.native
        
        var open: IPromise[_] = js.native
        
        var scope: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastScope = js.native
        
        var toastId: Double = js.native
      }
      object IToast {
        
        @scala.inline
        def apply(
          el: IAugmentedJQuery,
          iconClass: String,
          isOpened: Boolean,
          open: IPromise[_],
          scope: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastScope,
          toastId: Double
        ): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = {
          val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], isOpened = isOpened.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.angularToastr.mod.angularAugmentingMod.toastr.IToast]
        }
        
        @scala.inline
        implicit class IToastMutableBuilder[Self <: typings.angularToastr.mod.angularAugmentingMod.toastr.IToast] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEl(value: IAugmentedJQuery): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsOpened(value: Boolean): Self = StObject.set(x, "isOpened", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOpen(value: IPromise[_]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setScope(value: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setToastId(value: Double): Self = StObject.set(x, "toastId", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait IToastBaseConfig extends StObject {
        
        var allowHtml: js.UndefOr[Boolean] = js.native
        
        var closeButton: js.UndefOr[Boolean] = js.native
        
        var closeHtml: js.UndefOr[String] = js.native
        
        var extendedTimeOut: js.UndefOr[Double] = js.native
        
        var extraData: js.UndefOr[js.Any] = js.native
        
        var messageClass: js.UndefOr[String] = js.native
        
        var onHidden: js.UndefOr[
                js.Function2[
                  /* wasClicked */ Boolean, 
                  /* toast */ typings.angularToastr.mod.angularAugmentingMod.toastr.IToast, 
                  Unit
                ]
              ] = js.native
        
        var onShown: js.UndefOr[
                js.Function1[/* toast */ typings.angularToastr.mod.angularAugmentingMod.toastr.IToast, Unit]
              ] = js.native
        
        var onTap: js.UndefOr[
                js.Function1[/* toast */ typings.angularToastr.mod.angularAugmentingMod.toastr.IToast, Unit]
              ] = js.native
        
        var progressBar: js.UndefOr[Boolean] = js.native
        
        var tapToDismiss: js.UndefOr[Boolean] = js.native
        
        var templates: js.UndefOr[Progressbar] = js.native
        
        var timeOut: js.UndefOr[Double] = js.native
        
        var titleClass: js.UndefOr[String] = js.native
        
        var toastClass: js.UndefOr[String] = js.native
      }
      object IToastBaseConfig {
        
        @scala.inline
        def apply(): typings.angularToastr.mod.angularAugmentingMod.toastr.IToastBaseConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.angularToastr.mod.angularAugmentingMod.toastr.IToastBaseConfig]
        }
        
        @scala.inline
        implicit class IToastBaseConfigMutableBuilder[Self <: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastBaseConfig] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAllowHtml(value: Boolean): Self = StObject.set(x, "allowHtml", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllowHtmlUndefined: Self = StObject.set(x, "allowHtml", js.undefined)
          
          @scala.inline
          def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
          
          @scala.inline
          def setCloseHtml(value: String): Self = StObject.set(x, "closeHtml", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCloseHtmlUndefined: Self = StObject.set(x, "closeHtml", js.undefined)
          
          @scala.inline
          def setExtendedTimeOut(value: Double): Self = StObject.set(x, "extendedTimeOut", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExtendedTimeOutUndefined: Self = StObject.set(x, "extendedTimeOut", js.undefined)
          
          @scala.inline
          def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
          
          @scala.inline
          def setMessageClass(value: String): Self = StObject.set(x, "messageClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMessageClassUndefined: Self = StObject.set(x, "messageClass", js.undefined)
          
          @scala.inline
          def setOnHidden(
            value: (/* wasClicked */ Boolean, /* toast */ typings.angularToastr.mod.angularAugmentingMod.toastr.IToast) => Unit
          ): Self = StObject.set(x, "onHidden", js.Any.fromFunction2(value))
          
          @scala.inline
          def setOnHiddenUndefined: Self = StObject.set(x, "onHidden", js.undefined)
          
          @scala.inline
          def setOnShown(value: /* toast */ typings.angularToastr.mod.angularAugmentingMod.toastr.IToast => Unit): Self = StObject.set(x, "onShown", js.Any.fromFunction1(value))
          
          @scala.inline
          def setOnShownUndefined: Self = StObject.set(x, "onShown", js.undefined)
          
          @scala.inline
          def setOnTap(value: /* toast */ typings.angularToastr.mod.angularAugmentingMod.toastr.IToast => Unit): Self = StObject.set(x, "onTap", js.Any.fromFunction1(value))
          
          @scala.inline
          def setOnTapUndefined: Self = StObject.set(x, "onTap", js.undefined)
          
          @scala.inline
          def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
          
          @scala.inline
          def setTapToDismiss(value: Boolean): Self = StObject.set(x, "tapToDismiss", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTapToDismissUndefined: Self = StObject.set(x, "tapToDismiss", js.undefined)
          
          @scala.inline
          def setTemplates(value: Progressbar): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
          
          @scala.inline
          def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
          
          @scala.inline
          def setTitleClass(value: String): Self = StObject.set(x, "titleClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleClassUndefined: Self = StObject.set(x, "titleClass", js.undefined)
          
          @scala.inline
          def setToastClass(value: String): Self = StObject.set(x, "toastClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setToastClassUndefined: Self = StObject.set(x, "toastClass", js.undefined)
        }
      }
      
      @js.native
      trait IToastConfig
        extends typings.angularToastr.mod.angularAugmentingMod.toastr.IToastBaseConfig {
        
        var iconClasses: js.UndefOr[Error] = js.native
      }
      object IToastConfig {
        
        @scala.inline
        def apply(): typings.angularToastr.mod.angularAugmentingMod.toastr.IToastConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.angularToastr.mod.angularAugmentingMod.toastr.IToastConfig]
        }
        
        @scala.inline
        implicit class IToastConfigMutableBuilder[Self <: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastConfig] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setIconClasses(value: Error): Self = StObject.set(x, "iconClasses", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIconClassesUndefined: Self = StObject.set(x, "iconClasses", js.undefined)
        }
      }
      
      @js.native
      trait IToastContainerConfig extends StObject {
        
        var autoDismiss: js.UndefOr[Boolean] = js.native
        
        var containerId: js.UndefOr[String] = js.native
        
        var maxOpened: js.UndefOr[Double] = js.native
        
        var newestOnTop: js.UndefOr[Boolean] = js.native
        
        var positionClass: js.UndefOr[String] = js.native
        
        var preventDuplicates: js.UndefOr[Boolean] = js.native
        
        var preventOpenDuplicates: js.UndefOr[Boolean] = js.native
        
        var target: js.UndefOr[String] = js.native
      }
      object IToastContainerConfig {
        
        @scala.inline
        def apply(): typings.angularToastr.mod.angularAugmentingMod.toastr.IToastContainerConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.angularToastr.mod.angularAugmentingMod.toastr.IToastContainerConfig]
        }
        
        @scala.inline
        implicit class IToastContainerConfigMutableBuilder[Self <: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastContainerConfig] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAutoDismiss(value: Boolean): Self = StObject.set(x, "autoDismiss", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAutoDismissUndefined: Self = StObject.set(x, "autoDismiss", js.undefined)
          
          @scala.inline
          def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
          
          @scala.inline
          def setMaxOpened(value: Double): Self = StObject.set(x, "maxOpened", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxOpenedUndefined: Self = StObject.set(x, "maxOpened", js.undefined)
          
          @scala.inline
          def setNewestOnTop(value: Boolean): Self = StObject.set(x, "newestOnTop", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setNewestOnTopUndefined: Self = StObject.set(x, "newestOnTop", js.undefined)
          
          @scala.inline
          def setPositionClass(value: String): Self = StObject.set(x, "positionClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPositionClassUndefined: Self = StObject.set(x, "positionClass", js.undefined)
          
          @scala.inline
          def setPreventDuplicates(value: Boolean): Self = StObject.set(x, "preventDuplicates", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPreventDuplicatesUndefined: Self = StObject.set(x, "preventDuplicates", js.undefined)
          
          @scala.inline
          def setPreventOpenDuplicates(value: Boolean): Self = StObject.set(x, "preventOpenDuplicates", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPreventOpenDuplicatesUndefined: Self = StObject.set(x, "preventOpenDuplicates", js.undefined)
          
          @scala.inline
          def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        }
      }
      
      @js.native
      trait IToastOptions
        extends typings.angularToastr.mod.angularAugmentingMod.toastr.IToastBaseConfig {
        
        var iconClass: js.UndefOr[String] = js.native
        
        var target: js.UndefOr[String] = js.native
      }
      object IToastOptions {
        
        @scala.inline
        def apply(): typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions]
        }
        
        @scala.inline
        implicit class IToastOptionsMutableBuilder[Self <: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
          
          @scala.inline
          def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        }
      }
      
      @js.native
      trait IToastScope extends IRootScopeService {
        
        var message: String = js.native
        
        var options: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastConfig = js.native
        
        var title: String = js.native
        
        var toastId: Double = js.native
        
        var toastType: String = js.native
      }
      
      @js.native
      trait IToastrConfig
        extends typings.angularToastr.mod.angularAugmentingMod.toastr.IToastConfig
           with typings.angularToastr.mod.angularAugmentingMod.toastr.IToastContainerConfig
      object IToastrConfig {
        
        @scala.inline
        def apply(): typings.angularToastr.mod.angularAugmentingMod.toastr.IToastrConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.angularToastr.mod.angularAugmentingMod.toastr.IToastrConfig]
        }
      }
      
      @js.native
      trait IToastrService extends StObject {
        
        /**
          * Return the number of active toasts in screen.
          */
        def active(): Double = js.native
        
        /**
          * Remove toast from screen. If no toast is passed in, all toasts will be closed.
          *
          * @param {IToast} toast Optional toast object to delete
          */
        def clear(): Unit = js.native
        def clear(toast: typings.angularToastr.mod.angularAugmentingMod.toastr.IToast): Unit = js.native
        
        /**
          * Create error toast notification message.
          *
          * @param {String} message Message to show on toast
          * @param {String} title Title to show on toast
          * @param {IToastOptions} options Override default toast options
          */
        def error(message: String): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def error(
          message: String,
          title: js.UndefOr[scala.Nothing],
          options: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions
        ): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def error(message: String, title: String): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def error(
          message: String,
          title: String,
          options: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions
        ): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        
        /**
          * Create info toast notification message.
          *
          * @param {String} message Message to show on toast
          * @param {String} title Title to show on toast
          * @param {IToastOptions} options Override default toast options
          */
        def info(message: String): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def info(
          message: String,
          title: js.UndefOr[scala.Nothing],
          options: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions
        ): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def info(message: String, title: String): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def info(
          message: String,
          title: String,
          options: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions
        ): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        
        /**
          * Create success toast notification message.
          *
          * @param {String} message Message to show on toast
          * @param {String} title Title to show on toast
          * @param {IToastOptions} options Override default toast options
          */
        def success(message: String): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def success(
          message: String,
          title: js.UndefOr[scala.Nothing],
          options: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions
        ): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def success(message: String, title: String): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def success(
          message: String,
          title: String,
          options: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions
        ): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        
        /**
          * Create warning toast notification message.
          *
          * @param {String} message Message to show on toast
          * @param {String} title Title to show on toast
          * @param {IToastOptions} options Override default toast options
          */
        def warning(message: String): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def warning(
          message: String,
          title: js.UndefOr[scala.Nothing],
          options: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions
        ): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def warning(message: String, title: String): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
        def warning(
          message: String,
          title: String,
          options: typings.angularToastr.mod.angularAugmentingMod.toastr.IToastOptions
        ): typings.angularToastr.mod.angularAugmentingMod.toastr.IToast = js.native
      }
    }
  }
}
