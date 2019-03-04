package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The accessible view of a table in a text document or in the page preview of a spreadsheet document. See {@link
  * com.sun.star.sheet.AccessibleSpreadsheet} for tables in the edit view of a spreadsheet.
  * @since OOo 1.1.2
  */
trait AccessibleTableView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleTable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleSelection
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventBroadcaster

object AccessibleTableView {
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
    SelectedAccessibleColumns: activexDashInteropLib.SafeArray[scala.Double],
    SelectedAccessibleRows: activexDashInteropLib.SafeArray[scala.Double],
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    acquire: js.Function0[scala.Unit],
    addAccessibleEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener, 
      scala.Unit
    ],
    clearAccessibleSelection: js.Function0[scala.Unit],
    containsPoint: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Boolean],
    deselectAccessibleChild: js.Function1[scala.Double, scala.Unit],
    getAccessibleAtPoint: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
    ],
    getAccessibleCaption: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible],
    getAccessibleCellAt: js.Function2[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
    ],
    getAccessibleChild: js.Function1[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
    ],
    getAccessibleChildCount: js.Function0[scala.Double],
    getAccessibleColumn: js.Function1[scala.Double, scala.Double],
    getAccessibleColumnCount: js.Function0[scala.Double],
    getAccessibleColumnDescription: js.Function1[scala.Double, java.lang.String],
    getAccessibleColumnExtentAt: js.Function2[scala.Double, scala.Double, scala.Double],
    getAccessibleColumnHeaders: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleTable],
    getAccessibleDescription: js.Function0[java.lang.String],
    getAccessibleIndex: js.Function2[scala.Double, scala.Double, scala.Double],
    getAccessibleIndexInParent: js.Function0[scala.Double],
    getAccessibleName: js.Function0[java.lang.String],
    getAccessibleParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible],
    getAccessibleRelationSet: js.Function0[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet
    ],
    getAccessibleRole: js.Function0[scala.Double],
    getAccessibleRow: js.Function1[scala.Double, scala.Double],
    getAccessibleRowCount: js.Function0[scala.Double],
    getAccessibleRowDescription: js.Function1[scala.Double, java.lang.String],
    getAccessibleRowExtentAt: js.Function2[scala.Double, scala.Double, scala.Double],
    getAccessibleRowHeaders: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleTable],
    getAccessibleStateSet: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet],
    getAccessibleSummary: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible],
    getBackground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getBounds: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getForeground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getLocation: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getLocationOnScreen: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getSelectedAccessibleChild: js.Function1[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
    ],
    getSelectedAccessibleChildCount: js.Function0[scala.Double],
    getSelectedAccessibleColumns: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getSelectedAccessibleRows: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    grabFocus: js.Function0[scala.Unit],
    isAccessibleChildSelected: js.Function1[scala.Double, scala.Boolean],
    isAccessibleColumnSelected: js.Function1[scala.Double, scala.Boolean],
    isAccessibleRowSelected: js.Function1[scala.Double, scala.Boolean],
    isAccessibleSelected: js.Function2[scala.Double, scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAccessibleEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener, 
      scala.Unit
    ],
    selectAccessibleChild: js.Function1[scala.Double, scala.Unit],
    selectAllAccessibleChildren: js.Function0[scala.Unit]
  ): AccessibleTableView = {
    val __obj = js.Dynamic.literal(AccessibleCaption = AccessibleCaption, AccessibleChildCount = AccessibleChildCount, AccessibleColumnCount = AccessibleColumnCount, AccessibleColumnHeaders = AccessibleColumnHeaders, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleRowCount = AccessibleRowCount, AccessibleRowHeaders = AccessibleRowHeaders, AccessibleStateSet = AccessibleStateSet, AccessibleSummary = AccessibleSummary, Background = Background, Bounds = Bounds, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, SelectedAccessibleChildCount = SelectedAccessibleChildCount, SelectedAccessibleColumns = SelectedAccessibleColumns, SelectedAccessibleRows = SelectedAccessibleRows, Size = Size, acquire = acquire, addAccessibleEventListener = addAccessibleEventListener, clearAccessibleSelection = clearAccessibleSelection, containsPoint = containsPoint, deselectAccessibleChild = deselectAccessibleChild, getAccessibleAtPoint = getAccessibleAtPoint, getAccessibleCaption = getAccessibleCaption, getAccessibleCellAt = getAccessibleCellAt, getAccessibleChild = getAccessibleChild, getAccessibleChildCount = getAccessibleChildCount, getAccessibleColumn = getAccessibleColumn, getAccessibleColumnCount = getAccessibleColumnCount, getAccessibleColumnDescription = getAccessibleColumnDescription, getAccessibleColumnExtentAt = getAccessibleColumnExtentAt, getAccessibleColumnHeaders = getAccessibleColumnHeaders, getAccessibleDescription = getAccessibleDescription, getAccessibleIndex = getAccessibleIndex, getAccessibleIndexInParent = getAccessibleIndexInParent, getAccessibleName = getAccessibleName, getAccessibleParent = getAccessibleParent, getAccessibleRelationSet = getAccessibleRelationSet, getAccessibleRole = getAccessibleRole, getAccessibleRow = getAccessibleRow, getAccessibleRowCount = getAccessibleRowCount, getAccessibleRowDescription = getAccessibleRowDescription, getAccessibleRowExtentAt = getAccessibleRowExtentAt, getAccessibleRowHeaders = getAccessibleRowHeaders, getAccessibleStateSet = getAccessibleStateSet, getAccessibleSummary = getAccessibleSummary, getBackground = getBackground, getBounds = getBounds, getForeground = getForeground, getLocale = getLocale, getLocation = getLocation, getLocationOnScreen = getLocationOnScreen, getSelectedAccessibleChild = getSelectedAccessibleChild, getSelectedAccessibleChildCount = getSelectedAccessibleChildCount, getSelectedAccessibleColumns = getSelectedAccessibleColumns, getSelectedAccessibleRows = getSelectedAccessibleRows, getSize = getSize, grabFocus = grabFocus, isAccessibleChildSelected = isAccessibleChildSelected, isAccessibleColumnSelected = isAccessibleColumnSelected, isAccessibleRowSelected = isAccessibleRowSelected, isAccessibleSelected = isAccessibleSelected, queryInterface = queryInterface, release = release, removeAccessibleEventListener = removeAccessibleEventListener, selectAccessibleChild = selectAccessibleChild, selectAllAccessibleChildren = selectAllAccessibleChildren)
  
    __obj.asInstanceOf[AccessibleTableView]
  }
}

