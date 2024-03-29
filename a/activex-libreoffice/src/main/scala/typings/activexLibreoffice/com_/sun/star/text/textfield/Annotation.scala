package typings.activexLibreoffice.com_.sun.star.text.textfield

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.text.TextContentAnchorType
import typings.activexLibreoffice.com_.sun.star.text.TextField_
import typings.activexLibreoffice.com_.sun.star.text.WrapTextMode
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import typings.activexLibreoffice.com_.sun.star.util.Date
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of an annotation text field.
  * @see com.sun.star.text.TextField
  */
trait Annotation
  extends StObject
     with TextField_ {
  
  /** contains the name of the author of the annotation. */
  var Author: String
  
  /** contains the annotation's content */
  var Content: String
  
  /** contains the creation date. */
  var Date: typings.activexLibreoffice.com_.sun.star.util.Date
  
  /** contains the creation date. */
  var DateTimeValue: typings.activexLibreoffice.com_.sun.star.util.DateTime
  
  /**
    * contains the initials of the author of the annotation.
    * @since LibreOffice 4.0
    */
  var Initials: String
  
  /**
    * contains the name of the annotation.
    * @since LibreOffice 4.0
    */
  var Name: String
}
object Annotation {
  
  inline def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    Author: String,
    Content: String,
    Date: Date,
    DateTimeValue: typings.activexLibreoffice.com_.sun.star.util.DateTime,
    Initials: String,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    TextWrap: WrapTextMode,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getPresentation: Boolean => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): Annotation = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], DateTimeValue = DateTimeValue.asInstanceOf[js.Any], Initials = Initials.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Annotation] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDateTimeValue(value: typings.activexLibreoffice.com_.sun.star.util.DateTime): Self = StObject.set(x, "DateTimeValue", value.asInstanceOf[js.Any])
    
    inline def setInitials(value: String): Self = StObject.set(x, "Initials", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
