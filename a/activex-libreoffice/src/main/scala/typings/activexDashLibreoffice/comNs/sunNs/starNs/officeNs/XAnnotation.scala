package typings.activexDashLibreoffice.comNs.sunNs.starNs.officeNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealPoint2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.geometryNs.RealSize2D
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XText
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface gives access to an annotation inside a document. */
trait XAnnotation
  extends XPropertySet
     with XComponent {
  /** a reference to the document content this annotation is anchored to. */
  var Anchor: js.Any
  /** stores the full name of the author who created this annotation. */
  var Author: String
  /** stores the date and time this annotation was last edited. */
  var DateTime: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.DateTime
  /** stores the initials of the author who created this annotation. */
  var Initials: String
  /**
    * this is an optional position that gives the user interface a hint where the annotation should be rendered. This could be an offset to the annotations
    * anchor.
    */
  var Position: RealPoint2D
  /** this is an optional size that gives the user interface a hint how large the annotation should be rendered. */
  var Size: RealSize2D
  /** gives access to the annotations text. */
  var TextRange: XText
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
    val __obj = js.Dynamic.literal(Anchor = Anchor, Author = Author, DateTime = DateTime, Initials = Initials, Position = Position, PropertySetInfo = PropertySetInfo, Size = Size, TextRange = TextRange, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[XAnnotation]
  }
}

