package typings.activexLibreoffice.com_.sun.star.office

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.text.XText
import typings.activexLibreoffice.com_.sun.star.util.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface gives access to an annotation inside a document. */
@js.native
trait XAnnotation
  extends XPropertySet
     with XComponent {
  
  /** a reference to the document content this annotation is anchored to. */
  var Anchor: js.Any = js.native
  
  /** stores the full name of the author who created this annotation. */
  var Author: String = js.native
  
  /** stores the date and time this annotation was last edited. */
  var DateTime: typings.activexLibreoffice.com_.sun.star.util.DateTime = js.native
  
  /** stores the initials of the author who created this annotation. */
  var Initials: String = js.native
  
  /**
    * this is an optional position that gives the user interface a hint where the annotation should be rendered. This could be an offset to the annotations
    * anchor.
    */
  var Position: RealPoint2D = js.native
  
  /** this is an optional size that gives the user interface a hint how large the annotation should be rendered. */
  var Size: RealSize2D = js.native
  
  /** gives access to the annotations text. */
  var TextRange: XText = js.native
}
object XAnnotation {
  
  @scala.inline
  def apply(
    Anchor: js.Any,
    Author: String,
    DateTime: DateTime,
    Initials: String,
    Position: RealPoint2D,
    PropertySetInfo: XPropertySetInfo,
    Size: RealSize2D,
    TextRange: XText,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    dispose: () => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XAnnotation = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], Initials = Initials.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TextRange = TextRange.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XAnnotation]
  }
  
  @scala.inline
  implicit class XAnnotationOps[Self <: XAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchor(value: js.Any): Self = this.set("Anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = this.set("Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: DateTime): Self = this.set("DateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitials(value: String): Self = this.set("Initials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: RealPoint2D): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: RealSize2D): Self = this.set("Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRange(value: XText): Self = this.set("TextRange", value.asInstanceOf[js.Any])
  }
}
