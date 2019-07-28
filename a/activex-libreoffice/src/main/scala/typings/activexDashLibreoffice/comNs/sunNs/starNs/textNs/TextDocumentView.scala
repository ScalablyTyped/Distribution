package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControl
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.OfficeDocumentView
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the view of a {@link TextDocument} . */
trait TextDocumentView
  extends OfficeDocumentView
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
  @scala.inline
  def apply(
    IsConstantSpellcheck: Boolean,
    IsHideSpellMarks: Boolean,
    LineCount: Double,
    PageCount: Double,
    PropertySetInfo: XPropertySetInfo,
    Selection: js.Any,
    ViewCursor: XTextViewCursor,
    ViewSettings: XPropertySet,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getControl: XControlModel => XControl,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSelection: () => js.Any,
    getViewCursor: () => XTextViewCursor,
    getViewSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    select: js.Any => Boolean,
    setPropertyValue: (String, js.Any) => Unit
  ): TextDocumentView = {
    val __obj = js.Dynamic.literal(IsConstantSpellcheck = IsConstantSpellcheck, IsHideSpellMarks = IsHideSpellMarks, LineCount = LineCount, PageCount = PageCount, PropertySetInfo = PropertySetInfo, Selection = Selection, ViewCursor = ViewCursor, ViewSettings = ViewSettings, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getControl = js.Any.fromFunction1(getControl), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSelection = js.Any.fromFunction0(getSelection), getViewCursor = js.Any.fromFunction0(getViewCursor), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), select = js.Any.fromFunction1(select), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[TextDocumentView]
  }
}

