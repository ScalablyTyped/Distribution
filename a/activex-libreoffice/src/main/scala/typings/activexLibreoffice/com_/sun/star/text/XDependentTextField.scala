package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to attach this {@link TextField} to a {@link TextFieldMaster} . */
trait XDependentTextField
  extends StObject
     with XTextField {
  
  /** @returns the previously attached {@link TextFieldMaster} */
  val TextFieldMaster: XPropertySet
  
  /**
    * method must be called to attach the {@link TextFieldMaster} to this {@link TextField} .
    *
    * A {@link TextFieldMaster} can only be assigned once.
    *
    * Example: Create and insert a user field (with a `UserField` ):
    *
    * {{program example here, see documentation}}
    */
  def attachTextFieldMaster(xFieldMaster: XPropertySet): Unit
  
  /** @returns the previously attached {@link TextFieldMaster} */
  def getTextFieldMaster(): XPropertySet
}
object XDependentTextField {
  
  inline def apply(
    Anchor: XTextRange,
    TextFieldMaster: XPropertySet,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    attachTextFieldMaster: XPropertySet => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getPresentation: Boolean => String,
    getTextFieldMaster: () => XPropertySet,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XDependentTextField = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], TextFieldMaster = TextFieldMaster.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), attachTextFieldMaster = js.Any.fromFunction1(attachTextFieldMaster), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getTextFieldMaster = js.Any.fromFunction0(getTextFieldMaster), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XDependentTextField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDependentTextField] (val x: Self) extends AnyVal {
    
    inline def setAttachTextFieldMaster(value: XPropertySet => Unit): Self = StObject.set(x, "attachTextFieldMaster", js.Any.fromFunction1(value))
    
    inline def setGetTextFieldMaster(value: () => XPropertySet): Self = StObject.set(x, "getTextFieldMaster", js.Any.fromFunction0(value))
    
    inline def setTextFieldMaster(value: XPropertySet): Self = StObject.set(x, "TextFieldMaster", value.asInstanceOf[js.Any])
  }
}
