package typings.awesomeNotifications

import typings.awesomeNotifications.anon.Async
import typings.awesomeNotifications.anon.Asyncblock
import typings.awesomeNotifications.awesomeNotificationsBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("awesome-notifications", JSImport.Default)
  @js.native
  /**
    * Awesome Notifications
    * Lightweight JavaScript library with enhanced asynchronous events support.
    * @param  opts AwnOptions object
    */
  open class default ()
    extends StObject
       with AWN {
    def this(opts: AwnOptions) = this()
  }
  
  @js.native
  trait AWN extends StObject {
    
    /**
      * Shows new alert toast
      * @param  message Defines message of the toast. Can be any valid HTML or text string. Will be set from defaults if omitted.
      * @param  options Instance of `AwnOptions`, which will override globals for this call
      * @return         A new HTMLElement instance
      */
    def alert(message: String): HTMLElement = js.native
    def alert(message: String, options: AwnOptions): HTMLElement = js.native
    
    /**
      * Shows new async toast.
      * @param promise   Any JavaScript Promise
      * @param onResolve Can be Function or String. Processing of this parameter start after Promise resolve.
      *
      *                  If omitted, uses default behavior - `AWN.success(resp)` method will be called.
      *
      *                  If String, `AWN.success(onResolve)` method will be called;
      *
      *                  If Function, it will be called, can take resp as optional parameter.
      *
      *                  If null, disables default behavior.
      * @param onReject  Can be Function or String. Processing of this parameter start after Promise reject.
      *
      *                  If omitted, uses default behavior - `AWN.alert(err)` method will be called.
      *
      *                  If String, `AWN.alert(onReject)` method will be called;
      *
      *                  If Function, it will be called, can take err as optional parameter.
      *
      *                  If null, disables default behavior.
      * @param message   A message of async toast. Can be any valid HTML or text string. Will be set from defaults if omitted.
      * @param options   Instance of `AwnOptions`, which will override globals for this call
      */
    def async[T](promise: js.Promise[T]): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: String): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: String, onReject: String): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: String, onReject: String, message: String): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: String, onReject: String, message: String, options: AwnOptions): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: String, onReject: String, message: Unit, options: AwnOptions): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: String, onReject: js.Function1[/* resp */ js.UndefOr[T], Unit]): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: String,
      onReject: js.Function1[/* resp */ js.UndefOr[T], Unit],
      message: String
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: String,
      onReject: js.Function1[/* resp */ js.UndefOr[T], Unit],
      message: String,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: String,
      onReject: js.Function1[/* resp */ js.UndefOr[T], Unit],
      message: Unit,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: String, onReject: Unit, message: String): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: String, onReject: Unit, message: String, options: AwnOptions): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: String, onReject: Unit, message: Unit, options: AwnOptions): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit]): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: js.Function1[/* error */ js.Error, Unit | String]
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: js.Function1[/* error */ js.Error, Unit | String],
      message: String
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: js.Function1[/* error */ js.Error, Unit | String],
      message: String,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: js.Function1[/* error */ js.Error, Unit | String],
      message: Unit,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: Unit,
      message: String
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: Unit,
      message: String,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: Unit,
      message: Unit,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: Unit,
      onReject: js.Function1[js.UndefOr[(/* error */ js.Error) | T], String | Unit]
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: Unit,
      onReject: js.Function1[js.UndefOr[(/* error */ js.Error) | T], String | Unit],
      message: String
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: Unit,
      onReject: js.Function1[js.UndefOr[(/* error */ js.Error) | T], String | Unit],
      message: String,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def async[T](
      promise: js.Promise[T],
      onResolve: Unit,
      onReject: js.Function1[js.UndefOr[(/* error */ js.Error) | T], String | Unit],
      message: Unit,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: Unit, onReject: Unit, message: String): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: Unit, onReject: Unit, message: String, options: AwnOptions): js.Promise[T] = js.native
    def async[T](promise: js.Promise[T], onResolve: Unit, onReject: Unit, message: Unit, options: AwnOptions): js.Promise[T] = js.native
    
    /**
      * Shows new blocking sync toast.
      *
      * @param promise   Any JavaScript Promise
      * @param onResolve Can be Function or String. Processing of this parameter start after Promise resolve.
      *                  If omitted, uses default behavior - `AWN.success(resp)` method will be called.
      *
      *                  If String, `AWN.success(onResolve)` method will be called;
      *
      *                  If Function, it will be called, can take resp as optional parameter.
      *
      *                  If null, disables default behavior.
      * @param onReject  Can be Function or String. Processing of this parameter start after Promise reject.
      *
      *                  If omitted, uses default behavior - `AWN.alert(err)` method will be called.
      *
      *                  If String, `AWN.alert(onReject)` method will be called;
      *
      *                  If Function, it will be called, can take err as optional parameter.
      *
      *                  If null, disables default behavior.
      * @param message   A message of async toast. Can be any valid HTML or text string. Will be set from defaults if omitted.
      * @param options   Instance of `AwnOptions`, which will override globals for this call
      */
    def asyncBlock[T](promise: js.Promise[T]): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: String): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: String, onReject: String): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: String, onReject: String, message: String): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: String, onReject: String, message: String, options: AwnOptions): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: String, onReject: String, message: Unit, options: AwnOptions): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: String, onReject: js.Function1[/* resp */ js.UndefOr[T], Unit]): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: String,
      onReject: js.Function1[/* resp */ js.UndefOr[T], Unit],
      message: String
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: String,
      onReject: js.Function1[/* resp */ js.UndefOr[T], Unit],
      message: String,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: String,
      onReject: js.Function1[/* resp */ js.UndefOr[T], Unit],
      message: Unit,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: String, onReject: Unit, message: String): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: String, onReject: Unit, message: String, options: AwnOptions): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: String, onReject: Unit, message: Unit, options: AwnOptions): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit]): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: js.Function1[/* error */ js.Error, Unit | String]
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: js.Function1[/* error */ js.Error, Unit | String],
      message: String
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: js.Function1[/* error */ js.Error, Unit | String],
      message: String,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: js.Function1[/* error */ js.Error, Unit | String],
      message: Unit,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: Unit,
      message: String
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: Unit,
      message: String,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: js.Function1[/* resp */ js.UndefOr[T], Unit],
      onReject: Unit,
      message: Unit,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: Unit,
      onReject: js.Function1[js.UndefOr[(/* error */ js.Error) | T], String | Unit]
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: Unit,
      onReject: js.Function1[js.UndefOr[(/* error */ js.Error) | T], String | Unit],
      message: String
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: Unit,
      onReject: js.Function1[js.UndefOr[(/* error */ js.Error) | T], String | Unit],
      message: String,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def asyncBlock[T](
      promise: js.Promise[T],
      onResolve: Unit,
      onReject: js.Function1[js.UndefOr[(/* error */ js.Error) | T], String | Unit],
      message: Unit,
      options: AwnOptions
    ): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: Unit, onReject: Unit, message: String): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: Unit, onReject: Unit, message: String, options: AwnOptions): js.Promise[T] = js.native
    def asyncBlock[T](promise: js.Promise[T], onResolve: Unit, onReject: Unit, message: Unit, options: AwnOptions): js.Promise[T] = js.native
    
    /**
      * Closes all visible toasts. Do nothing if there’re no visible toasts.
      */
    def closeToasts(): Unit = js.native
    
    /**
      * Shows new confirmation window.
      *
      * Confirmation window can be closed by clicking on one of two buttons.
      *
      * Also you can use Esc key to close it. Focus will be set on OK button on opening by default.
      *
      * Focus will be trapped inside window, so user can use Tab (Shift+Tab) key only to switch between one of two buttons
      *
      * @param  message  Defines message of the confirmation window. Can be any valid HTML or text string.
      * @param  onOk     Defines Function, which will be executed on click to ‘OK’ button.
      * @param  onCancel Defines Function, which will be executed on click to ‘Cancel’ button.
      *                  If false was passed, ‘Cancel’ button will be hidden.
      * @param  options  Instance of `AwnOptions`, which will override globals for this call
      * @return          A new `HTMLElement` instance
      */
    def confirm(message: String): HTMLElement = js.native
    def confirm(message: String, onOk: js.Function0[Unit]): HTMLElement = js.native
    def confirm(message: String, onOk: js.Function0[Unit], onCancel: Unit, options: AwnOptions): HTMLElement = js.native
    def confirm(message: String, onOk: Unit, onCancel: Unit, options: AwnOptions): HTMLElement = js.native
    @JSName("confirm")
    def confirm_false(message: String, onOk: js.Function0[Unit], onCancel: js.Function0[Unit | `false`]): HTMLElement = js.native
    @JSName("confirm")
    def confirm_false(
      message: String,
      onOk: js.Function0[Unit],
      onCancel: js.Function0[Unit | `false`],
      options: AwnOptions
    ): HTMLElement = js.native
    @JSName("confirm")
    def confirm_false(message: String, onOk: Unit, onCancel: js.Function0[Unit | `false`]): HTMLElement = js.native
    @JSName("confirm")
    def confirm_false(message: String, onOk: Unit, onCancel: js.Function0[Unit | `false`], options: AwnOptions): HTMLElement = js.native
    
    /**
      * Shows new info toast
      * @param  message Defines message of the toast. Can be any valid HTML or text string. Will be set from defaults if omitted.
      * @param  options Instance of `AwnOptions`, which will override globals for this call
      * @return         A new HTMLElement instance
      */
    def info(message: String): HTMLElement = js.native
    def info(message: String, options: AwnOptions): HTMLElement = js.native
    
    /**
      *
      *
      * @param  message   Defines message of the modal window. Can be any valid HTML or text string.
      * @param  className Defines modal window DOM element class name, it will be concatenated with default prefix ‘awn-popup-‘
      * @param  options   Instance of `AwnOptions`, which will override globals for this call
      */
    def modal(message: String): Unit = js.native
    def modal(message: String, className: String): Unit = js.native
    def modal(message: String, className: String, options: AwnOptions): Unit = js.native
    def modal(message: String, className: Unit, options: AwnOptions): Unit = js.native
    
    /**
      * Shows new success toast
      * @param  message Defines message of the toast. Can be any valid HTML or text string. Will be set from defaults if omitted.
      * @param  options Instance of `AwnOptions`, which will override globals for this call
      * @return         A new HTMLElement instance
      */
    def success(message: String): HTMLElement = js.native
    def success(message: String, options: AwnOptions): HTMLElement = js.native
    
    /**
      * Shows new tip toast
      * @param  message Defines message of the toast. Can be any valid HTML or text string. Will be set from defaults if omitted.
      * @param  options Instance of `AwnOptions`, which will override globals for this call
      * @return         A new HTMLElement instance
      */
    def tip(message: String): HTMLElement = js.native
    def tip(message: String, options: AwnOptions): HTMLElement = js.native
    
    /**
      * Shows new warning toast
      * @param  message Defines message of the toast. Can be any valid HTML or text string. Will be set from defaults if omitted.
      * @param  options Instance of `AwnOptions`, which will override globals for this call
      * @return         A new HTMLElement instance
      */
    def warning(message: String): HTMLElement = js.native
    def warning(message: String, options: AwnOptions): HTMLElement = js.native
  }
  
  trait AwnDurations extends StObject {
    
    var alert: js.UndefOr[Double] = js.undefined
    
    var global: js.UndefOr[Double] = js.undefined
    
    var info: js.UndefOr[Double] = js.undefined
    
    var success: js.UndefOr[Double] = js.undefined
    
    var tip: js.UndefOr[Double] = js.undefined
    
    var warning: js.UndefOr[Double] = js.undefined
  }
  object AwnDurations {
    
    inline def apply(): AwnDurations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AwnDurations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AwnDurations] (val x: Self) extends AnyVal {
      
      inline def setAlert(value: Double): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setGlobal(value: Double): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setSuccess(value: Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setTip(value: Double): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setWarning(value: Double): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait AwnIcons extends StObject {
    
    var alert: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var global: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var tip: js.UndefOr[String] = js.undefined
    
    var warning: js.UndefOr[String] = js.undefined
  }
  object AwnIcons {
    
    inline def apply(): AwnIcons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AwnIcons]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AwnIcons] (val x: Self) extends AnyVal {
      
      inline def setAlert(value: String): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait AwnLabels extends StObject {
    
    var alert: js.UndefOr[String] = js.undefined
    
    var async: js.UndefOr[String] = js.undefined
    
    var confirm: js.UndefOr[String] = js.undefined
    
    var confirmCancel: js.UndefOr[String] = js.undefined
    
    var confirmOk: js.UndefOr[String] = js.undefined
    
    var global: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[String] = js.undefined
    
    var tip: js.UndefOr[String] = js.undefined
    
    var warning: js.UndefOr[String] = js.undefined
  }
  object AwnLabels {
    
    inline def apply(): AwnLabels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AwnLabels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AwnLabels] (val x: Self) extends AnyVal {
      
      inline def setAlert(value: String): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setAsync(value: String): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setConfirm(value: String): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      inline def setConfirmCancel(value: String): Self = StObject.set(x, "confirmCancel", value.asInstanceOf[js.Any])
      
      inline def setConfirmCancelUndefined: Self = StObject.set(x, "confirmCancel", js.undefined)
      
      inline def setConfirmOk(value: String): Self = StObject.set(x, "confirmOk", value.asInstanceOf[js.Any])
      
      inline def setConfirmOkUndefined: Self = StObject.set(x, "confirmOk", js.undefined)
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setTip(value: String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait AwnOptions extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var durations: js.UndefOr[AwnDurations] = js.undefined
    
    var formatError: js.UndefOr[js.Function1[/* error */ js.Error, String | js.Error]] = js.undefined
    
    var labels: js.UndefOr[AwnLabels] = js.undefined
    
    var maxNotifications: js.UndefOr[Double] = js.undefined
    
    var messages: js.UndefOr[Asyncblock] = js.undefined
    
    var minDurations: js.UndefOr[Async] = js.undefined
    
    var position: js.UndefOr[AwnPosition] = js.undefined
  }
  object AwnOptions {
    
    inline def apply(): AwnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AwnOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AwnOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setDurations(value: AwnDurations): Self = StObject.set(x, "durations", value.asInstanceOf[js.Any])
      
      inline def setDurationsUndefined: Self = StObject.set(x, "durations", js.undefined)
      
      inline def setFormatError(value: /* error */ js.Error => String | js.Error): Self = StObject.set(x, "formatError", js.Any.fromFunction1(value))
      
      inline def setFormatErrorUndefined: Self = StObject.set(x, "formatError", js.undefined)
      
      inline def setLabels(value: AwnLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMaxNotifications(value: Double): Self = StObject.set(x, "maxNotifications", value.asInstanceOf[js.Any])
      
      inline def setMaxNotificationsUndefined: Self = StObject.set(x, "maxNotifications", js.undefined)
      
      inline def setMessages(value: Asyncblock): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMinDurations(value: Async): Self = StObject.set(x, "minDurations", value.asInstanceOf[js.Any])
      
      inline def setMinDurationsUndefined: Self = StObject.set(x, "minDurations", js.undefined)
      
      inline def setPosition(value: AwnPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awesomeNotifications.awesomeNotificationsStrings.`bottom-right`
    - typings.awesomeNotifications.awesomeNotificationsStrings.`bottom-left`
    - typings.awesomeNotifications.awesomeNotificationsStrings.`top-left`
    - typings.awesomeNotifications.awesomeNotificationsStrings.`top-right`
  */
  trait AwnPosition extends StObject
  object AwnPosition {
    
    inline def `bottom-left`: typings.awesomeNotifications.awesomeNotificationsStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.awesomeNotifications.awesomeNotificationsStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.awesomeNotifications.awesomeNotificationsStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.awesomeNotifications.awesomeNotificationsStrings.`bottom-right`]
    
    inline def `top-left`: typings.awesomeNotifications.awesomeNotificationsStrings.`top-left` = "top-left".asInstanceOf[typings.awesomeNotifications.awesomeNotificationsStrings.`top-left`]
    
    inline def `top-right`: typings.awesomeNotifications.awesomeNotificationsStrings.`top-right` = "top-right".asInstanceOf[typings.awesomeNotifications.awesomeNotificationsStrings.`top-right`]
  }
}
