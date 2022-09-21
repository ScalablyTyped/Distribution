package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleComponent
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventBroadcaster
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleEventListener
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleRelationSet
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleSelection
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleStateSet
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleTable
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The accessible view of a table in a text document or in the page preview of a spreadsheet document. See {@link
  * com.sun.star.sheet.AccessibleSpreadsheet} for tables in the edit view of a spreadsheet.
  * @since OOo 1.1.2
  */
trait AccessibleTableView
  extends StObject
     with XAccessibleContext
     with XAccessibleComponent
     with XAccessibleTable
     with XAccessibleSelection
     with XAccessibleEventBroadcaster
object AccessibleTableView {
  
  inline def apply(
    AccessibleCaption: XAccessible,
    AccessibleChildCount: Double,
    AccessibleColumnCount: Double,
    AccessibleColumnHeaders: XAccessibleTable,
    AccessibleDescription: String,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleRowCount: Double,
    AccessibleRowHeaders: XAccessibleTable,
    AccessibleStateSet: XAccessibleStateSet,
    AccessibleSummary: XAccessible,
    Background: Color,
    Bounds: Rectangle,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    SelectedAccessibleChildCount: Double,
    SelectedAccessibleColumns: SafeArray[Double],
    SelectedAccessibleRows: SafeArray[Double],
    Size: Size,
    acquire: () => Unit,
    addAccessibleEventListener: XAccessibleEventListener => Unit,
    clearAccessibleSelection: () => Unit,
    containsPoint: Point => Boolean,
    deselectAccessibleChild: Double => Unit,
    getAccessibleAtPoint: Point => XAccessible,
    getAccessibleCaption: () => XAccessible,
    getAccessibleCellAt: (Double, Double) => XAccessible,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: () => Double,
    getAccessibleColumn: Double => Double,
    getAccessibleColumnCount: () => Double,
    getAccessibleColumnDescription: Double => String,
    getAccessibleColumnExtentAt: (Double, Double) => Double,
    getAccessibleColumnHeaders: () => XAccessibleTable,
    getAccessibleDescription: () => String,
    getAccessibleIndex: (Double, Double) => Double,
    getAccessibleIndexInParent: () => Double,
    getAccessibleName: () => String,
    getAccessibleParent: () => XAccessible,
    getAccessibleRelationSet: () => XAccessibleRelationSet,
    getAccessibleRole: () => Double,
    getAccessibleRow: Double => Double,
    getAccessibleRowCount: () => Double,
    getAccessibleRowDescription: Double => String,
    getAccessibleRowExtentAt: (Double, Double) => Double,
    getAccessibleRowHeaders: () => XAccessibleTable,
    getAccessibleStateSet: () => XAccessibleStateSet,
    getAccessibleSummary: () => XAccessible,
    getBackground: () => Color,
    getBounds: () => Rectangle,
    getForeground: () => Color,
    getLocale: () => Locale,
    getLocation: () => Point,
    getLocationOnScreen: () => Point,
    getSelectedAccessibleChild: Double => XAccessible,
    getSelectedAccessibleChildCount: () => Double,
    getSelectedAccessibleColumns: () => SafeArray[Double],
    getSelectedAccessibleRows: () => SafeArray[Double],
    getSize: () => Size,
    grabFocus: () => Unit,
    isAccessibleChildSelected: Double => Boolean,
    isAccessibleColumnSelected: Double => Boolean,
    isAccessibleRowSelected: Double => Boolean,
    isAccessibleSelected: (Double, Double) => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeAccessibleEventListener: XAccessibleEventListener => Unit,
    selectAccessibleChild: Double => Unit,
    selectAllAccessibleChildren: () => Unit
  ): AccessibleTableView = {
    val __obj = js.Dynamic.literal(AccessibleCaption = AccessibleCaption.asInstanceOf[js.Any], AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleColumnCount = AccessibleColumnCount.asInstanceOf[js.Any], AccessibleColumnHeaders = AccessibleColumnHeaders.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleRowCount = AccessibleRowCount.asInstanceOf[js.Any], AccessibleRowHeaders = AccessibleRowHeaders.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], AccessibleSummary = AccessibleSummary.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], SelectedAccessibleChildCount = SelectedAccessibleChildCount.asInstanceOf[js.Any], SelectedAccessibleColumns = SelectedAccessibleColumns.asInstanceOf[js.Any], SelectedAccessibleRows = SelectedAccessibleRows.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), clearAccessibleSelection = js.Any.fromFunction0(clearAccessibleSelection), containsPoint = js.Any.fromFunction1(containsPoint), deselectAccessibleChild = js.Any.fromFunction1(deselectAccessibleChild), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleCaption = js.Any.fromFunction0(getAccessibleCaption), getAccessibleCellAt = js.Any.fromFunction2(getAccessibleCellAt), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleColumn = js.Any.fromFunction1(getAccessibleColumn), getAccessibleColumnCount = js.Any.fromFunction0(getAccessibleColumnCount), getAccessibleColumnDescription = js.Any.fromFunction1(getAccessibleColumnDescription), getAccessibleColumnExtentAt = js.Any.fromFunction2(getAccessibleColumnExtentAt), getAccessibleColumnHeaders = js.Any.fromFunction0(getAccessibleColumnHeaders), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndex = js.Any.fromFunction2(getAccessibleIndex), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleRow = js.Any.fromFunction1(getAccessibleRow), getAccessibleRowCount = js.Any.fromFunction0(getAccessibleRowCount), getAccessibleRowDescription = js.Any.fromFunction1(getAccessibleRowDescription), getAccessibleRowExtentAt = js.Any.fromFunction2(getAccessibleRowExtentAt), getAccessibleRowHeaders = js.Any.fromFunction0(getAccessibleRowHeaders), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getAccessibleSummary = js.Any.fromFunction0(getAccessibleSummary), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getForeground = js.Any.fromFunction0(getForeground), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getSelectedAccessibleChild = js.Any.fromFunction1(getSelectedAccessibleChild), getSelectedAccessibleChildCount = js.Any.fromFunction0(getSelectedAccessibleChildCount), getSelectedAccessibleColumns = js.Any.fromFunction0(getSelectedAccessibleColumns), getSelectedAccessibleRows = js.Any.fromFunction0(getSelectedAccessibleRows), getSize = js.Any.fromFunction0(getSize), grabFocus = js.Any.fromFunction0(grabFocus), isAccessibleChildSelected = js.Any.fromFunction1(isAccessibleChildSelected), isAccessibleColumnSelected = js.Any.fromFunction1(isAccessibleColumnSelected), isAccessibleRowSelected = js.Any.fromFunction1(isAccessibleRowSelected), isAccessibleSelected = js.Any.fromFunction2(isAccessibleSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener), selectAccessibleChild = js.Any.fromFunction1(selectAccessibleChild), selectAllAccessibleChildren = js.Any.fromFunction0(selectAllAccessibleChildren))
    __obj.asInstanceOf[AccessibleTableView]
  }
}
