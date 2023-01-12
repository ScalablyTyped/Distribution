package typings.atvlegacycontentkit.atv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A screen that displays a PIN, and/or allows a user to enter one.
  */
trait PINEntry extends StObject {
  
  /**
    * Whether the digits should be hidden as the user enters them.
    */
  var hideDigits: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The initial PIN code for the screen. This defaults to all zeros.
    */
  var initialPINCode: js.UndefOr[String] = js.undefined
  
  /**
    * The length of the PIN. This defaults to four.
    */
  var numDigits: js.UndefOr[Double] = js.undefined
  
  /**
    * If the user decides to go back, then this method is called.
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * If the PIN is submitted, then this method is called, with the PIN as the value parameters.
    */
  var onSubmit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  
  /**
    * A subtitle/prompt for the PIN entry screen.
    */
  var prompt: js.UndefOr[String] = js.undefined
  
  /**
    * Show the PIN entry screen.
    */
  def show(): Unit
  
  /**
    * The title of the PIN entry screen.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the user should be able to edit the PIN or not.
    */
  var userEditable: js.UndefOr[Boolean] = js.undefined
}
object PINEntry {
  
  inline def apply(show: () => Unit): PINEntry = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PINEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PINEntry] (val x: Self) extends AnyVal {
    
    inline def setHideDigits(value: Boolean): Self = StObject.set(x, "hideDigits", value.asInstanceOf[js.Any])
    
    inline def setHideDigitsUndefined: Self = StObject.set(x, "hideDigits", js.undefined)
    
    inline def setInitialPINCode(value: String): Self = StObject.set(x, "initialPINCode", value.asInstanceOf[js.Any])
    
    inline def setInitialPINCodeUndefined: Self = StObject.set(x, "initialPINCode", js.undefined)
    
    inline def setNumDigits(value: Double): Self = StObject.set(x, "numDigits", value.asInstanceOf[js.Any])
    
    inline def setNumDigitsUndefined: Self = StObject.set(x, "numDigits", js.undefined)
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnSubmit(value: /* value */ String => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUserEditable(value: Boolean): Self = StObject.set(x, "userEditable", value.asInstanceOf[js.Any])
    
    inline def setUserEditableUndefined: Self = StObject.set(x, "userEditable", js.undefined)
  }
}
