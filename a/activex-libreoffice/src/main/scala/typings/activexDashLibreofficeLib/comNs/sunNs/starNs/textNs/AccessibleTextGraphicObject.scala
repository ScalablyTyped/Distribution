package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The accessible view of graphics.
  * @since OOo 1.1.2
  */
trait AccessibleTextGraphicObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleImage
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventBroadcaster

object AccessibleTextGraphicObject {
  @scala.inline
  def apply(
    AccessibleChildCount: scala.Double,
    AccessibleDescription: java.lang.String,
    AccessibleImageDescription: java.lang.String,
    AccessibleImageHeight: scala.Double,
    AccessibleImageWidth: scala.Double,
    AccessibleIndexInParent: scala.Double,
    AccessibleName: java.lang.String,
    AccessibleParent: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    AccessibleRelationSet: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet,
    AccessibleRole: scala.Double,
    AccessibleStateSet: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet,
    Background: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Bounds: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Foreground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    Location: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    LocationOnScreen: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    acquire: js.Function0[scala.Unit],
    addAccessibleEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener, 
      scala.Unit
    ],
    containsPoint: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Boolean],
    getAccessibleAtPoint: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
    ],
    getAccessibleChild: js.Function1[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
    ],
    getAccessibleChildCount: js.Function0[scala.Double],
    getAccessibleDescription: js.Function0[java.lang.String],
    getAccessibleImageDescription: js.Function0[java.lang.String],
    getAccessibleImageHeight: js.Function0[scala.Double],
    getAccessibleImageWidth: js.Function0[scala.Double],
    getAccessibleIndexInParent: js.Function0[scala.Double],
    getAccessibleName: js.Function0[java.lang.String],
    getAccessibleParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible],
    getAccessibleRelationSet: js.Function0[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet
    ],
    getAccessibleRole: js.Function0[scala.Double],
    getAccessibleStateSet: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet],
    getBackground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getBounds: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getForeground: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    getLocation: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getLocationOnScreen: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    grabFocus: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAccessibleEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleEventListener, 
      scala.Unit
    ]
  ): AccessibleTextGraphicObject = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount, AccessibleDescription = AccessibleDescription, AccessibleImageDescription = AccessibleImageDescription, AccessibleImageHeight = AccessibleImageHeight, AccessibleImageWidth = AccessibleImageWidth, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Background = Background, Bounds = Bounds, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, Size = Size, acquire = acquire, addAccessibleEventListener = addAccessibleEventListener, containsPoint = containsPoint, getAccessibleAtPoint = getAccessibleAtPoint, getAccessibleChild = getAccessibleChild, getAccessibleChildCount = getAccessibleChildCount, getAccessibleDescription = getAccessibleDescription, getAccessibleImageDescription = getAccessibleImageDescription, getAccessibleImageHeight = getAccessibleImageHeight, getAccessibleImageWidth = getAccessibleImageWidth, getAccessibleIndexInParent = getAccessibleIndexInParent, getAccessibleName = getAccessibleName, getAccessibleParent = getAccessibleParent, getAccessibleRelationSet = getAccessibleRelationSet, getAccessibleRole = getAccessibleRole, getAccessibleStateSet = getAccessibleStateSet, getBackground = getBackground, getBounds = getBounds, getForeground = getForeground, getLocale = getLocale, getLocation = getLocation, getLocationOnScreen = getLocationOnScreen, getSize = getSize, grabFocus = grabFocus, queryInterface = queryInterface, release = release, removeAccessibleEventListener = removeAccessibleEventListener)
  
    __obj.asInstanceOf[AccessibleTextGraphicObject]
  }
}

