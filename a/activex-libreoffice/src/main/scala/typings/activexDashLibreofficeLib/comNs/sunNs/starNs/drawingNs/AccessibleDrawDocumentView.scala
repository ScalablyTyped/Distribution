package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link AccessibleDrawDocumentView} service is implemented by views of Draw and Impress documents.
  *
  * An object that implements the {@link AccessibleDrawDocumentView} service provides information about the view of a Draw or Impress document in one of
  * the various view modes. With its children it gives access to the current page and the shapes on that page.
  *
  * This service gives a simplified view on the underlying document. It tries both to keep the structure of the accessibility representation tree as
  * simple as possible and provide as much relevant information as possible. This has the following consequences:  1. Only the current draw page and only
  * the visible shapes are accessible. To switch to another page or to access shapes that lie outside the currently visible area, the user has to issue
  * these requests manually or programmatically through the usual channels, e.g. pressing keys or selecting menu entries. 2. The hierarchy exposed through
  * the {@link com.sun.star.accessibility.XAccessibleContext} interface does not necessarily correspond directly to the underlying draw page structure.
  * Internal nodes in this hierarchy are introduced by group shapes, 3D scenes, and OLE objects. 3. The view modes editing view, outline view, slides
  * view, notes view, handout view, and presentation view are not exposed explicitly. However, if there happens to be a view mode change which results in
  * a rearrangement of the visible shapes, the user gets notified of this.
  * @since OOo 1.1.2
  */
trait AccessibleDrawDocumentView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleComponent

object AccessibleDrawDocumentView {
  @scala.inline
  def apply(
    AccessibleChildCount: scala.Double,
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    AccessibleDescription: java.lang.String,
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
    acquire: () => scala.Unit,
    containsPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Boolean,
    getAccessibleAtPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getAccessibleChild: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getAccessibleChildCount: () => scala.Double,
    getAccessibleContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    getAccessibleDescription: () => java.lang.String,
    getAccessibleIndexInParent: () => scala.Double,
    getAccessibleName: () => java.lang.String,
    getAccessibleParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible,
    getAccessibleRelationSet: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleRelationSet,
    getAccessibleRole: () => scala.Double,
    getAccessibleStateSet: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleStateSet,
    getBackground: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    getBounds: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getForeground: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    getLocale: () => activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    getLocation: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getLocationOnScreen: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    grabFocus: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): AccessibleDrawDocumentView = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount, AccessibleContext = AccessibleContext, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Background = Background, Bounds = Bounds, Foreground = Foreground, Locale = Locale, Location = Location, LocationOnScreen = LocationOnScreen, Size = Size, acquire = js.Any.fromFunction0(acquire), containsPoint = js.Any.fromFunction1(containsPoint), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = js.Any.fromFunction0(getAccessibleChildCount), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getAccessibleDescription = js.Any.fromFunction0(getAccessibleDescription), getAccessibleIndexInParent = js.Any.fromFunction0(getAccessibleIndexInParent), getAccessibleName = js.Any.fromFunction0(getAccessibleName), getAccessibleParent = js.Any.fromFunction0(getAccessibleParent), getAccessibleRelationSet = js.Any.fromFunction0(getAccessibleRelationSet), getAccessibleRole = js.Any.fromFunction0(getAccessibleRole), getAccessibleStateSet = js.Any.fromFunction0(getAccessibleStateSet), getBackground = js.Any.fromFunction0(getBackground), getBounds = js.Any.fromFunction0(getBounds), getForeground = js.Any.fromFunction0(getForeground), getLocale = js.Any.fromFunction0(getLocale), getLocation = js.Any.fromFunction0(getLocation), getLocationOnScreen = js.Any.fromFunction0(getLocationOnScreen), getSize = js.Any.fromFunction0(getSize), grabFocus = js.Any.fromFunction0(grabFocus), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[AccessibleDrawDocumentView]
  }
}

