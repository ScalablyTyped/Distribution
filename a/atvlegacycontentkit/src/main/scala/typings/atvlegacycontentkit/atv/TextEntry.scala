package typings.atvlegacycontentkit.atv

import typings.atvlegacycontentkit.atvlegacycontentkitStrings.emailAddress
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Shows a text input field.
  */
trait TextEntry extends StObject {
  
  /**
    * Whether the user's Apple ID email should be autofilled on the email address type.
    */
  var defaultToAppleID: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default value to set for the input.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * A footnote to show at the bottom of the page.
    */
  var footnote: js.UndefOr[String] = js.undefined
  
  /**
    * An image to display on the page.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * Instructions to display on the page.
    */
  var instructions: js.UndefOr[String] = js.undefined
  
  /**
    * A label to display on the input.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Called when the user cancels the input.
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the user submits the input.
    */
  var onSubmit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  
  /**
    * Shows the text entry.
    */
  def show(): Unit
  
  /**
    * A title to display on the page.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the field. Can either be an email address, or a password.
    */
  var `type`: emailAddress | password
}
object TextEntry {
  
  inline def apply(show: () => Unit, `type`: emailAddress | password): TextEntry = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction0(show))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextEntry] (val x: Self) extends AnyVal {
    
    inline def setDefaultToAppleID(value: Boolean): Self = StObject.set(x, "defaultToAppleID", value.asInstanceOf[js.Any])
    
    inline def setDefaultToAppleIDUndefined: Self = StObject.set(x, "defaultToAppleID", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setFootnote(value: String): Self = StObject.set(x, "footnote", value.asInstanceOf[js.Any])
    
    inline def setFootnoteUndefined: Self = StObject.set(x, "footnote", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    inline def setInstructionsUndefined: Self = StObject.set(x, "instructions", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnSubmit(value: /* value */ String => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    
    inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: emailAddress | password): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
