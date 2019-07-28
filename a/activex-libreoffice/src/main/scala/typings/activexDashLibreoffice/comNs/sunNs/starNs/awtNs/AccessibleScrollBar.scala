package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessible
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleAction
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleExtendedComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleKeyBinding
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs.XAccessibleValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies accessibility support for a scroll bar.
  * @since OOo 1.1.2
  */
trait AccessibleScrollBar
  extends XAccessibleExtendedComponent
     with XAccessibleContext
     with XAccessibleEventBroadcaster
     with XAccessibleAction
     with XAccessibleValue

object AccessibleScrollBar {
  @scala.inline
  def apply(
    AccessibleActionCount: Double,
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
    Font: XFont,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    MaximumValue: js.Any,
    MinimumValue: js.Any,
    Size: Size,
    TitledBorderText: String,
    ToolTipText: String,
    acquire: () => Unit,
    addAccessibleEventListener: XAccessibleEventListener => Unit,
    containsPoint: Point => Boolean,
    doAccessibleAction: Double => Boolean,
    getAccessibleActionCount: () => Double,
    getAccessibleActionDescription: Double => String,
    getAccessibleActionKeyBinding: Double => XAccessibleKeyBinding,
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
    getFont: () => XFont,
    getForeground: () => Color,
    getLocale: () => Locale,
    getLocation: () => Point,
    getLocationOnScreen: () => Point,
    getMaximumValue: () => js.Any,
    getMinimumValue: () => js.Any,
    getSize: () => Size,
    getTitledBorderText: () => String,
    getToolTipText: () => String,
    grabFocus: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAccessibleEventListener: XAccessibleEventListener => Unit,
    setCurrentValue: js.Any => Boolean
  ): AccessibleScrollBar = {
    val __obj = js.Dynamic.literal(AccessibleActionCount = AccessibleActionCount, AccessibleChildCount = AccessibleChildCount, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Background = Background, Bounds = Bounds, CurrentValue = CurrentValue, Font = Font, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, MaximumValue = MaximumValue, MinimumValue = MinimumValue, Size = Size, TitledBorderText = TitledBorderText, ToolTipText = ToolTipText, acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), containsPoint = js.Any.fromFunction1(containsPoint), doAccessibleAction = js.Any.fromFunction1(doAccessibleAction), getAccessibleActionCount = js.Any.fromFunction0(getAccessibleActionCount), getAccessibleActionDescription = js.Any.fromFunction1(getAccessibleActionDescription), getAccessibleActionKeyBinding = js.Any.fromFunction1(getAccessibleActionKeyBinding), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getCurrentValue = js.Any.fromFunction0(getCurrentValue), getFont = js.Any.fromFunction0(getFont), getForeground = js.Any.fromFunction0(getForeground), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getMaximumValue = js.Any.fromFunction0(getMaximumValue), getMinimumValue = js.Any.fromFunction0(getMinimumValue), getSize = js.Any.fromFunction0(getSize), getTitledBorderText = js.Any.fromFunction0(getTitledBorderText), getToolTipText = js.Any.fromFunction0(getToolTipText), grabFocus = js.Any.fromFunction0(grabFocus), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener), setCurrentValue = js.Any.fromFunction1(setCurrentValue))
  
    __obj.asInstanceOf[AccessibleScrollBar]
  }
}

