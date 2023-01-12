package typings.alertify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertify {
  
  @js.native
  trait IAlertifyStatic extends StObject {
    
    /**
      * Create an alert dialog box
      * @param message   The message passed from the callee
      * @param fn        Callback function
      * @param cssClass  Class(es) to append to dialog box
      * @return alertify (ie this)
      * @since 0.0.1
      */
    def alert(message: String): IAlertifyStatic = js.native
    def alert(message: String, fn: js.Function): IAlertifyStatic = js.native
    def alert(message: String, fn: js.Function, cssClass: String): IAlertifyStatic = js.native
    def alert(message: String, fn: Unit, cssClass: String): IAlertifyStatic = js.native
    
    /**
      * Create a confirm dialog box
      * @param message   The message passed from the callee
      * @param fn        Callback function
      * @param cssClass  Class(es) to append to dialog box
      * @return alertify (ie this)
      * @since 0.0.1
      */
    def confirm(message: String): IAlertifyStatic = js.native
    def confirm(message: String, fn: js.Function): IAlertifyStatic = js.native
    def confirm(message: String, fn: js.Function, cssClass: String): IAlertifyStatic = js.native
    def confirm(message: String, fn: Unit, cssClass: String): IAlertifyStatic = js.native
    
    /**
      * Attaches alertify.error to window.onerror method
      * @since 0.3.8
      */
    def debug(): Unit = js.native
    
    /**
      * Shorthand for log messages
      * @param message The message passed from the callee
      * @return alertify (ie this)
      * @since 0.0.1
      */
    def error(message: String): IAlertifyStatic = js.native
    
    /**
      * Extend the log method to create custom methods
      * @param type  Custom method name
      * @return function for logging
      * @since 0.0.1
      */
    def extend(`type`: String): js.Function2[/* message */ String, /* wait */ js.UndefOr[Double], this.type] = js.native
    
    /**
      * Initialize Alertify and create the 2 main elements.
      * Initialization will happen automatically on the first
      * use of alert, confirm, prompt or log.
      * @since 0.0.1
      */
    def init(): Unit = js.native
    
    /**
      * The labels used for dialog buttons
      */
    var labels: ILabels = js.native
    
    /**
      * Show a new log message box
      * @param message   The message passed from the callee
      * @param type      Optional type of log message
      * @param wait      Optional time (in ms) to wait before auto-hiding
      * @return alertify (ie this)
      * @since 0.0.1
      */
    def log(message: String): IAlertifyStatic = js.native
    def log(message: String, `type`: String): IAlertifyStatic = js.native
    def log(message: String, `type`: String, wait: Double): IAlertifyStatic = js.native
    def log(message: String, `type`: Unit, wait: Double): IAlertifyStatic = js.native
    
    /**
      * Create a prompt dialog box
      * @param message   The message passed from the callee
      * @param fn        Callback function
      * @param placeholder Default value for prompt input
      * @param cssClass  Class(es) to append to dialog
      * @return alertify (ie this)
      * @since 0.0.1
      */
    def prompt(message: String): IAlertifyStatic = js.native
    def prompt(message: String, fn: js.Function): IAlertifyStatic = js.native
    def prompt(message: String, fn: js.Function, placeholder: String): IAlertifyStatic = js.native
    def prompt(message: String, fn: js.Function, placeholder: String, cssClass: String): IAlertifyStatic = js.native
    def prompt(message: String, fn: js.Function, placeholder: Unit, cssClass: String): IAlertifyStatic = js.native
    def prompt(message: String, fn: Unit, placeholder: String): IAlertifyStatic = js.native
    def prompt(message: String, fn: Unit, placeholder: String, cssClass: String): IAlertifyStatic = js.native
    def prompt(message: String, fn: Unit, placeholder: Unit, cssClass: String): IAlertifyStatic = js.native
    
    /**
      * Used to set alertify properties
      * @param Properties
      * @since 0.2.11
      */
    def set(args: IProperties): Unit = js.native
    
    /**
      * Shorthand for log messages
      * @param message The message passed from the callee
      * @return alertify (ie this)
      * @since 0.0.1
      */
    def success(message: String): IAlertifyStatic = js.native
  }
  
  /** Labels for altertify.set function */
  trait ILabels extends StObject {
    
    var cancel: js.UndefOr[String] = js.undefined
    
    var ok: js.UndefOr[String] = js.undefined
  }
  object ILabels {
    
    inline def apply(): ILabels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILabels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILabels] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
    }
  }
  
  /**
    * Properties for alertify.set function
    */
  trait IProperties extends StObject {
    
    /** Default button for focus */
    var buttonFocus: js.UndefOr[String] = js.undefined
    
    /** Should buttons be displayed in reverse order */
    var buttonReverse: js.UndefOr[Boolean] = js.undefined
    
    /** Default value for milliseconds display of log messages */
    var delay: js.UndefOr[Double] = js.undefined
    
    /** Default values for display of labels */
    var labels: js.UndefOr[ILabels] = js.undefined
  }
  object IProperties {
    
    inline def apply(): IProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProperties] (val x: Self) extends AnyVal {
      
      inline def setButtonFocus(value: String): Self = StObject.set(x, "buttonFocus", value.asInstanceOf[js.Any])
      
      inline def setButtonFocusUndefined: Self = StObject.set(x, "buttonFocus", js.undefined)
      
      inline def setButtonReverse(value: Boolean): Self = StObject.set(x, "buttonReverse", value.asInstanceOf[js.Any])
      
      inline def setButtonReverseUndefined: Self = StObject.set(x, "buttonReverse", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setLabels(value: ILabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    }
  }
}
