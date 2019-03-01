package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The accessible object of the data table in the CSV import dialog.
  * @see com.sun.star.sheet.AccessibleCsvRuler
  * @see com.sun.star.sheet.AccessibleCsvCell
  * @since OOo 1.1.2
  */
trait AccessibleCsvTable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleTable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleSelection

object AccessibleCsvTable {
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
    selectAccessibleChild: js.Function1[scala.Double, scala.Unit],
    selectAllAccessibleChildren: js.Function0[scala.Unit]
  ): AccessibleCsvTable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleCaption")(AccessibleCaption)
    __obj.updateDynamic("AccessibleChildCount")(AccessibleChildCount)
    __obj.updateDynamic("AccessibleColumnCount")(AccessibleColumnCount)
    __obj.updateDynamic("AccessibleColumnHeaders")(AccessibleColumnHeaders)
    __obj.updateDynamic("AccessibleDescription")(AccessibleDescription)
    __obj.updateDynamic("AccessibleIndexInParent")(AccessibleIndexInParent)
    __obj.updateDynamic("AccessibleName")(AccessibleName)
    __obj.updateDynamic("AccessibleParent")(AccessibleParent)
    __obj.updateDynamic("AccessibleRelationSet")(AccessibleRelationSet)
    __obj.updateDynamic("AccessibleRole")(AccessibleRole)
    __obj.updateDynamic("AccessibleRowCount")(AccessibleRowCount)
    __obj.updateDynamic("AccessibleRowHeaders")(AccessibleRowHeaders)
    __obj.updateDynamic("AccessibleStateSet")(AccessibleStateSet)
    __obj.updateDynamic("AccessibleSummary")(AccessibleSummary)
    __obj.updateDynamic("Background")(Background)
    __obj.updateDynamic("Bounds")(Bounds)
    __obj.updateDynamic("Foreground")(Foreground)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("Location")(Location)
    __obj.updateDynamic("LocationOnScreen")(LocationOnScreen)
    __obj.updateDynamic("SelectedAccessibleChildCount")(SelectedAccessibleChildCount)
    __obj.updateDynamic("SelectedAccessibleColumns")(SelectedAccessibleColumns)
    __obj.updateDynamic("SelectedAccessibleRows")(SelectedAccessibleRows)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("clearAccessibleSelection")(clearAccessibleSelection)
    __obj.updateDynamic("containsPoint")(containsPoint)
    __obj.updateDynamic("deselectAccessibleChild")(deselectAccessibleChild)
    __obj.updateDynamic("getAccessibleAtPoint")(getAccessibleAtPoint)
    __obj.updateDynamic("getAccessibleCaption")(getAccessibleCaption)
    __obj.updateDynamic("getAccessibleCellAt")(getAccessibleCellAt)
    __obj.updateDynamic("getAccessibleChild")(getAccessibleChild)
    __obj.updateDynamic("getAccessibleChildCount")(getAccessibleChildCount)
    __obj.updateDynamic("getAccessibleColumn")(getAccessibleColumn)
    __obj.updateDynamic("getAccessibleColumnCount")(getAccessibleColumnCount)
    __obj.updateDynamic("getAccessibleColumnDescription")(getAccessibleColumnDescription)
    __obj.updateDynamic("getAccessibleColumnExtentAt")(getAccessibleColumnExtentAt)
    __obj.updateDynamic("getAccessibleColumnHeaders")(getAccessibleColumnHeaders)
    __obj.updateDynamic("getAccessibleDescription")(getAccessibleDescription)
    __obj.updateDynamic("getAccessibleIndex")(getAccessibleIndex)
    __obj.updateDynamic("getAccessibleIndexInParent")(getAccessibleIndexInParent)
    __obj.updateDynamic("getAccessibleName")(getAccessibleName)
    __obj.updateDynamic("getAccessibleParent")(getAccessibleParent)
    __obj.updateDynamic("getAccessibleRelationSet")(getAccessibleRelationSet)
    __obj.updateDynamic("getAccessibleRole")(getAccessibleRole)
    __obj.updateDynamic("getAccessibleRow")(getAccessibleRow)
    __obj.updateDynamic("getAccessibleRowCount")(getAccessibleRowCount)
    __obj.updateDynamic("getAccessibleRowDescription")(getAccessibleRowDescription)
    __obj.updateDynamic("getAccessibleRowExtentAt")(getAccessibleRowExtentAt)
    __obj.updateDynamic("getAccessibleRowHeaders")(getAccessibleRowHeaders)
    __obj.updateDynamic("getAccessibleStateSet")(getAccessibleStateSet)
    __obj.updateDynamic("getAccessibleSummary")(getAccessibleSummary)
    __obj.updateDynamic("getBackground")(getBackground)
    __obj.updateDynamic("getBounds")(getBounds)
    __obj.updateDynamic("getForeground")(getForeground)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("getLocation")(getLocation)
    __obj.updateDynamic("getLocationOnScreen")(getLocationOnScreen)
    __obj.updateDynamic("getSelectedAccessibleChild")(getSelectedAccessibleChild)
    __obj.updateDynamic("getSelectedAccessibleChildCount")(getSelectedAccessibleChildCount)
    __obj.updateDynamic("getSelectedAccessibleColumns")(getSelectedAccessibleColumns)
    __obj.updateDynamic("getSelectedAccessibleRows")(getSelectedAccessibleRows)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("grabFocus")(grabFocus)
    __obj.updateDynamic("isAccessibleChildSelected")(isAccessibleChildSelected)
    __obj.updateDynamic("isAccessibleColumnSelected")(isAccessibleColumnSelected)
    __obj.updateDynamic("isAccessibleRowSelected")(isAccessibleRowSelected)
    __obj.updateDynamic("isAccessibleSelected")(isAccessibleSelected)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("selectAccessibleChild")(selectAccessibleChild)
    __obj.updateDynamic("selectAllAccessibleChildren")(selectAllAccessibleChildren)
    __obj.asInstanceOf[AccessibleCsvTable]
  }
}

