package typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessible
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleSelection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The accessible view of a cell in a text document or in the page preview of a spreadsheet document. See {@link com.sun.star.sheet.AccessibleCell} for
  * cells in the edit view of a spreadsheet.
  * @since OOo 1.1.2
  */
trait AccessibleCellView
  extends XAccessibleContext
     with XAccessibleComponent
     with XAccessibleValue
     with XAccessibleSelection
     with XAccessibleEventBroadcaster

object AccessibleCellView {
  @scala.inline
  def apply(
    AccessibleChildCount: Double,
    AccessibleDescription: String,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleStateSet: XAccessibleStateSet,
    Background: Color,
    Bounds: Rectangle,
    CurrentValue: js.Any,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    MaximumValue: js.Any,
    MinimumValue: js.Any,
    SelectedAccessibleChildCount: Double,
    Size: Size,
    acquire: () => Unit,
    addAccessibleEventListener: XAccessibleEventListener => Unit,
    clearAccessibleSelection: () => Unit,
    containsPoint: Point => Boolean,
    deselectAccessibleChild: Double => Unit,
    getAccessibleAtPoint: Point => XAccessible,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: () => Double,
    getAccessibleDescription: () => String,
    getAccessibleIndexInParent: () => Double,
    getAccessibleName: () => String,
    getAccessibleParent: () => XAccessible,
    getAccessibleRelationSet: () => XAccessibleRelationSet,
    getAccessibleRole: () => Double,
    getAccessibleStateSet: () => XAccessibleStateSet,
    getBackground: () => Color,
    getBounds: () => Rectangle,
    getCurrentValue: () => js.Any,
    getForeground: () => Color,
    getLocale: () => Locale,
    getLocation: () => Point,
    getLocationOnScreen: () => Point,
    getMaximumValue: () => js.Any,
    getMinimumValue: () => js.Any,
    getSelectedAccessibleChild: Double => XAccessible,
    getSelectedAccessibleChildCount: () => Double,
    getSize: () => Size,
    grabFocus: () => Unit,
    isAccessibleChildSelected: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAccessibleEventListener: XAccessibleEventListener => Unit,
    selectAccessibleChild: Double => Unit,
    selectAllAccessibleChildren: () => Unit,
    setCurrentValue: js.Any => Boolean
  ): AccessibleCellView = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Background = Background, Bounds = Bounds, CurrentValue = CurrentValue, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, MaximumValue = MaximumValue, MinimumValue = MinimumValue, SelectedAccessibleChildCount = SelectedAccessibleChildCount, Size = Size, acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), clearAccessibleSelection = js.Any.fromFunction0(clearAccessibleSelection), containsPoint = js.Any.fromFunction1(containsPoint), deselectAccessibleChild = js.Any.fromFunction1(deselectAccessibleChild), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getCurrentValue = js.Any.fromFunction0(getCurrentValue), getForeground = js.Any.fromFunction0(getForeground), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getMaximumValue = js.Any.fromFunction0(getMaximumValue), getMinimumValue = js.Any.fromFunction0(getMinimumValue), getSelectedAccessibleChild = js.Any.fromFunction1(getSelectedAccessibleChild), getSelectedAccessibleChildCount = js.Any.fromFunction0(getSelectedAccessibleChildCount), getSize = js.Any.fromFunction0(getSize), grabFocus = js.Any.fromFunction0(grabFocus), isAccessibleChildSelected = js.Any.fromFunction1(isAccessibleChildSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener), selectAccessibleChild = js.Any.fromFunction1(selectAccessibleChild), selectAllAccessibleChildren = js.Any.fromFunction0(selectAllAccessibleChildren), setCurrentValue = js.Any.fromFunction1(setCurrentValue))
  
    __obj.asInstanceOf[AccessibleCellView]
  }
}

