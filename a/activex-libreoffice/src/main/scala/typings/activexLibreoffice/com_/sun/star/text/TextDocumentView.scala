package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.view.OfficeDocumentView
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the view of a {@link TextDocument} . */
trait TextDocumentView
  extends StObject
     with OfficeDocumentView
     with XTextViewCursorSupplier
     with XPropertySet {
  
  /**
    * specifies if spell checking should be done while typing.
    * @since OOo 2.0
    */
  var IsConstantSpellcheck: Boolean
  
  /**
    * specifies if the marks for misspelled text should be displayed.
    * @since OOo 2.0
    */
  var IsHideSpellMarks: Boolean
  
  /**
    * returns the number of lines in the document
    *
    * Since the document needs to be formatted to get the result obtaining this value may take some time.
    *
    * Empty paragraphs are not counted.
    * @since OOo 2.0
    */
  var LineCount: Double
  
  /**
    * returns the number of pages in the document
    *
    * Since the document needs to be formatted to get the result obtaining this value may take some time.
    * @since OOo 2.0
    */
  var PageCount: Double
}
object TextDocumentView {
  
  inline def apply(
    IsConstantSpellcheck: Boolean,
    IsHideSpellMarks: Boolean,
    LineCount: Double,
    PageCount: Double,
    PropertySetInfo: XPropertySetInfo,
    Selection: Any,
    ViewCursor: XTextViewCursor,
    ViewSettings: XPropertySet,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getControl: XControlModel => XControl,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    getSelection: () => Any,
    getViewCursor: () => XTextViewCursor,
    getViewSettings: () => XPropertySet,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    select: Any => Boolean,
    setPropertyValue: (String, Any) => Unit
  ): TextDocumentView = {
    val __obj = js.Dynamic.literal(IsConstantSpellcheck = IsConstantSpellcheck.asInstanceOf[js.Any], IsHideSpellMarks = IsHideSpellMarks.asInstanceOf[js.Any], LineCount = LineCount.asInstanceOf[js.Any], PageCount = PageCount.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], ViewCursor = ViewCursor.asInstanceOf[js.Any], ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getControl = js.Any.fromFunction1(getControl), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSelection = js.Any.fromFunction0(getSelection), getViewCursor = js.Any.fromFunction0(getViewCursor), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), select = js.Any.fromFunction1(select), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TextDocumentView]
  }
  
  extension [Self <: TextDocumentView](x: Self) {
    
    inline def setIsConstantSpellcheck(value: Boolean): Self = StObject.set(x, "IsConstantSpellcheck", value.asInstanceOf[js.Any])
    
    inline def setIsHideSpellMarks(value: Boolean): Self = StObject.set(x, "IsHideSpellMarks", value.asInstanceOf[js.Any])
    
    inline def setLineCount(value: Double): Self = StObject.set(x, "LineCount", value.asInstanceOf[js.Any])
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "PageCount", value.asInstanceOf[js.Any])
  }
}
