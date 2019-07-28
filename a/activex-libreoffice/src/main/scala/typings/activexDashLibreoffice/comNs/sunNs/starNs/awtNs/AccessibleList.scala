package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessible
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleExtendedComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleSelection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accessible lists are used by combo boxes as container for the list items.
  * @see com.sun.star.accessibility.AccessibleContext
  * @see com.sun.star.accessibility.XAccessibleComponent
  * @see com.sun.star.accessibility.XAccessibleExtendedComponent
  * @see com.sun.star.accessibility.XAccessibleSelection
  * @since OOo 1.1.2
  */
trait AccessibleList
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.AccessibleContext
     with XAccessibleExtendedComponent
     with XAccessible
     with XAccessibleSelection

object AccessibleList {
  @scala.inline
  def apply(
    AccessibleChildCount: Double,
    AccessibleContext: XAccessibleContext,
    AccessibleDescription: String,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleStateSet: XAccessibleStateSet,
    Background: Color,
    Bounds: Rectangle,
    Font: XFont,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    SelectedAccessibleChildCount: Double,
    Size: Size,
    TitledBorderText: String,
    ToolTipText: String,
    acquire: () => Unit,
    addAccessibleEventListener: XAccessibleEventListener => Unit,
    clearAccessibleSelection: () => Unit,
    containsPoint: Point => Boolean,
    deselectAccessibleChild: Double => Unit,
    getAccessibleAtPoint: Point => XAccessible,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: () => Double,
    getAccessibleContext: () => XAccessibleContext,
    getAccessibleDescription: () => String,
    getAccessibleIndexInParent: () => Double,
    getAccessibleName: () => String,
    getAccessibleParent: () => XAccessible,
    getAccessibleRelationSet: () => XAccessibleRelationSet,
    getAccessibleRole: () => Double,
    getAccessibleStateSet: () => XAccessibleStateSet,
    getBackground: () => Color,
    getBounds: () => Rectangle,
    getFont: () => XFont,
    getForeground: () => Color,
    getLocale: () => Locale,
    getLocation: () => Point,
    getLocationOnScreen: () => Point,
    getSelectedAccessibleChild: Double => XAccessible,
    getSelectedAccessibleChildCount: () => Double,
    getSize: () => Size,
    getTitledBorderText: () => String,
    getToolTipText: () => String,
    grabFocus: () => Unit,
    isAccessibleChildSelected: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAccessibleEventListener: XAccessibleEventListener => Unit,
    selectAccessibleChild: Double => Unit,
    selectAllAccessibleChildren: () => Unit
  ): AccessibleList = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount, AccessibleContext = AccessibleContext, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Background = Background, Bounds = Bounds, Font = Font, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, SelectedAccessibleChildCount = SelectedAccessibleChildCount, Size = Size, TitledBorderText = TitledBorderText, ToolTipText = ToolTipText, acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), clearAccessibleSelection = js.Any.fromFunction0(clearAccessibleSelection), containsPoint = js.Any.fromFunction1(containsPoint), deselectAccessibleChild = js.Any.fromFunction1(deselectAccessibleChild), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getFont = js.Any.fromFunction0(getFont), getForeground = js.Any.fromFunction0(getForeground), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getSelectedAccessibleChild = js.Any.fromFunction1(getSelectedAccessibleChild), getSelectedAccessibleChildCount = js.Any.fromFunction0(getSelectedAccessibleChildCount), getSize = js.Any.fromFunction0(getSize), getTitledBorderText = js.Any.fromFunction0(getTitledBorderText), getToolTipText = js.Any.fromFunction0(getToolTipText), grabFocus = js.Any.fromFunction0(grabFocus), isAccessibleChildSelected = js.Any.fromFunction1(isAccessibleChildSelected), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener), selectAccessibleChild = js.Any.fromFunction1(selectAccessibleChild), selectAllAccessibleChildren = js.Any.fromFunction0(selectAllAccessibleChildren))
  
    __obj.asInstanceOf[AccessibleList]
  }
}

