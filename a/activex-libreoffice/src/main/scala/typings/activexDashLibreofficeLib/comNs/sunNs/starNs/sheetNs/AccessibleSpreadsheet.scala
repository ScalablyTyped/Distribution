package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The accessible view of a spreadsheet document
  * @since OOo 1.1.2
  */
trait AccessibleSpreadsheet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleTable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleSelection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventBroadcaster

object AccessibleSpreadsheet {
  @scala.inline
  def apply(
    AccessibleCaption: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    AccessibleChildCount: scala.Double,
    AccessibleColumnCount: scala.Double,
    AccessibleColumnHeaders: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleTable,
    AccessibleDescription: java.lang.String,
    AccessibleIndexInParent: scala.Double,
    AccessibleName: java.lang.String,
    AccessibleParent: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    AccessibleRelationSet: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet,
    AccessibleRole: scala.Double,
    AccessibleRowCount: scala.Double,
    AccessibleRowHeaders: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleTable,
    AccessibleStateSet: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet,
    AccessibleSummary: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    Background: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Bounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Location: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    LocationOnScreen: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    SelectedAccessibleChildCount: scala.Double,
    SelectedAccessibleColumns: stdLib.SafeArray[scala.Double],
    SelectedAccessibleRows: stdLib.SafeArray[scala.Double],
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    acquire: () => scala.Unit,
    addAccessibleEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener => scala.Unit,
    clearAccessibleSelection: () => scala.Unit,
    containsPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Boolean,
    deselectAccessibleChild: scala.Double => scala.Unit,
    getAccessibleAtPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getAccessibleCaption: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getAccessibleCellAt: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getAccessibleChild: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getAccessibleChildCount: () => scala.Double,
    getAccessibleColumn: scala.Double => scala.Double,
    getAccessibleColumnCount: () => scala.Double,
    getAccessibleColumnDescription: scala.Double => java.lang.String,
    getAccessibleColumnExtentAt: (scala.Double, scala.Double) => scala.Double,
    getAccessibleColumnHeaders: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleTable,
    getAccessibleDescription: () => java.lang.String,
    getAccessibleIndex: (scala.Double, scala.Double) => scala.Double,
    getAccessibleIndexInParent: () => scala.Double,
    getAccessibleName: () => java.lang.String,
    getAccessibleParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getAccessibleRelationSet: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet,
    getAccessibleRole: () => scala.Double,
    getAccessibleRow: scala.Double => scala.Double,
    getAccessibleRowCount: () => scala.Double,
    getAccessibleRowDescription: scala.Double => java.lang.String,
    getAccessibleRowExtentAt: (scala.Double, scala.Double) => scala.Double,
    getAccessibleRowHeaders: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleTable,
    getAccessibleStateSet: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet,
    getAccessibleSummary: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getBackground: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    getBounds: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getForeground: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getLocation: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getLocationOnScreen: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getSelectedAccessibleChild: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getSelectedAccessibleChildCount: () => scala.Double,
    getSelectedAccessibleColumns: () => stdLib.SafeArray[scala.Double],
    getSelectedAccessibleRows: () => stdLib.SafeArray[scala.Double],
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    grabFocus: () => scala.Unit,
    isAccessibleChildSelected: scala.Double => scala.Boolean,
    isAccessibleColumnSelected: scala.Double => scala.Boolean,
    isAccessibleRowSelected: scala.Double => scala.Boolean,
    isAccessibleSelected: (scala.Double, scala.Double) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeAccessibleEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener => scala.Unit,
    selectAccessibleChild: scala.Double => scala.Unit,
    selectAllAccessibleChildren: () => scala.Unit
  ): AccessibleSpreadsheet = {
    val __obj = js.Dynamic.literal(AccessibleCaption = AccessibleCaption, AccessibleChildCount = AccessibleChildCount, AccessibleColumnCount = AccessibleColumnCount, AccessibleColumnHeaders = AccessibleColumnHeaders, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleRowCount = AccessibleRowCount, AccessibleRowHeaders = AccessibleRowHeaders, AccessibleStateSet = AccessibleStateSet, AccessibleSummary = AccessibleSummary, Background = Background, Bounds = Bounds, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, SelectedAccessibleChildCount = SelectedAccessibleChildCount, SelectedAccessibleColumns = SelectedAccessibleColumns, SelectedAccessibleRows = SelectedAccessibleRows, Size = Size, acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), clearAccessibleSelection = js.Any.fromFunction0(clearAccessibleSelection), containsPoint = js.Any.fromFunction1(containsPoint), deselectAccessibleChild = js.Any.fromFunction1(deselectAccessibleChild), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleCaption = js.Any.fromFunction0(getAccessibleCaption), getAccessibleCellAt = js.Any.fromFunction2(getAccessibleCellAt), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleColumn = js.Any.fromFunction1(getAccessibleColumn), getAccessibleColumnCount = js.Any.fromFunction0(getAccessibleColumnCount), getAccessibleColumnDescription = js.Any.fromFunction1(getAccessibleColumnDescription), getAccessibleColumnExtentAt = js.Any.fromFunction2(getAccessibleColumnExtentAt), getAccessibleColumnHeaders = js.Any.fromFunction0(getAccessibleColumnHeaders), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndex = js.Any.fromFunction2(getAccessibleIndex), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleRow = js.Any.fromFunction1(getAccessibleRow), getAccessibleRowCount = js.Any.fromFunction0(getAccessibleRowCount), getAccessibleRowDescription = js.Any.fromFunction1(getAccessibleRowDescription), getAccessibleRowExtentAt = js.Any.fromFunction2(getAccessibleRowExtentAt), getAccessibleRowHeaders = js.Any.fromFunction0(getAccessibleRowHeaders), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getAccessibleSummary = js.Any.fromFunction0(getAccessibleSummary), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getForeground = js.Any.fromFunction0(getForeground), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getSelectedAccessibleChild = js.Any.fromFunction1(getSelectedAccessibleChild), getSelectedAccessibleChildCount = js.Any.fromFunction0(getSelectedAccessibleChildCount), getSelectedAccessibleColumns = js.Any.fromFunction0(getSelectedAccessibleColumns), getSelectedAccessibleRows = js.Any.fromFunction0(getSelectedAccessibleRows), getSize = js.Any.fromFunction0(getSize), grabFocus = js.Any.fromFunction0(grabFocus), isAccessibleChildSelected = js.Any.fromFunction1(isAccessibleChildSelected), isAccessibleColumnSelected = js.Any.fromFunction1(isAccessibleColumnSelected), isAccessibleRowSelected = js.Any.fromFunction1(isAccessibleRowSelected), isAccessibleSelected = js.Any.fromFunction2(isAccessibleSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener), selectAccessibleChild = js.Any.fromFunction1(selectAccessibleChild), selectAllAccessibleChildren = js.Any.fromFunction0(selectAllAccessibleChildren))
  
    __obj.asInstanceOf[AccessibleSpreadsheet]
  }
}

