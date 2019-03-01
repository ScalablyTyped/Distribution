package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the view of a {@link TextDocument} . */
trait TextDocumentView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.OfficeDocumentView
     with XTextViewCursorSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * specifies if spell checking should be done while typing.
    * @since OOo 2.0
    */
  var IsConstantSpellcheck: scala.Boolean
  /**
    * specifies if the marks for misspelled text should be displayed.
    * @since OOo 2.0
    */
  var IsHideSpellMarks: scala.Boolean
  /**
    * returns the number of lines in the document
    *
    * Since the document needs to be formatted to get the result obtaining this value may take some time.
    *
    * Empty paragraphs are not counted.
    * @since OOo 2.0
    */
  var LineCount: scala.Double
  /**
    * returns the number of pages in the document
    *
    * Since the document needs to be formatted to get the result obtaining this value may take some time.
    * @since OOo 2.0
    */
  var PageCount: scala.Double
}

object TextDocumentView {
  @scala.inline
  def apply(
    IsConstantSpellcheck: scala.Boolean,
    IsHideSpellMarks: scala.Boolean,
    LineCount: scala.Double,
    PageCount: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Selection: js.Any,
    ViewCursor: XTextViewCursor,
    ViewSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getControl: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getSelection: js.Function0[js.Any],
    getViewCursor: js.Function0[XTextViewCursor],
    getViewSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    select: js.Function1[js.Any, scala.Boolean],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): TextDocumentView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("IsConstantSpellcheck")(IsConstantSpellcheck)
    __obj.updateDynamic("IsHideSpellMarks")(IsHideSpellMarks)
    __obj.updateDynamic("LineCount")(LineCount)
    __obj.updateDynamic("PageCount")(PageCount)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Selection")(Selection)
    __obj.updateDynamic("ViewCursor")(ViewCursor)
    __obj.updateDynamic("ViewSettings")(ViewSettings)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addSelectionChangeListener")(addSelectionChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getControl")(getControl)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getSelection")(getSelection)
    __obj.updateDynamic("getViewCursor")(getViewCursor)
    __obj.updateDynamic("getViewSettings")(getViewSettings)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeSelectionChangeListener")(removeSelectionChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[TextDocumentView]
  }
}

