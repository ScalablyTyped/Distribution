package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Central service of the Accessibility API that gives access to various facets of an object's content.
  *
  * This service has to be implemented by every class that represents the actual accessibility information of another UNO service. It exposes two kinds of
  * information: A tree structure in which all accessible objects are organized can be navigated in freely. It typically represents spatial relationship
  * of one object containing a set of children like a dialog box contains a set of buttons. Additionally the {@link XAccessibleContext} interface of this
  * service exposes methods that provide access to the actual object's content. This can be the object's role, name, description, and so on.
  * @see XAccessibleContext
  * @since OOo 1.1.2
  */
trait AccessibleContext
  extends XAccessibleContext
     with XAccessibleEventBroadcaster

object AccessibleContext {
  @scala.inline
  def apply(
    AccessibleChildCount: scala.Double,
    AccessibleDescription: java.lang.String,
    AccessibleIndexInParent: scala.Double,
    AccessibleName: java.lang.String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: scala.Double,
    AccessibleStateSet: XAccessibleStateSet,
    Locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    acquire: js.Function0[scala.Unit],
    addAccessibleEventListener: js.Function1[XAccessibleEventListener, scala.Unit],
    getAccessibleChild: js.Function1[scala.Double, XAccessible],
    getAccessibleChildCount: js.Function0[scala.Double],
    getAccessibleDescription: js.Function0[java.lang.String],
    getAccessibleIndexInParent: js.Function0[scala.Double],
    getAccessibleName: js.Function0[java.lang.String],
    getAccessibleParent: js.Function0[XAccessible],
    getAccessibleRelationSet: js.Function0[XAccessibleRelationSet],
    getAccessibleRole: js.Function0[scala.Double],
    getAccessibleStateSet: js.Function0[XAccessibleStateSet],
    getLocale: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAccessibleEventListener: js.Function1[XAccessibleEventListener, scala.Unit]
  ): AccessibleContext = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount, AccessibleDescription = AccessibleDescription, AccessibleIndexInParent = AccessibleIndexInParent, AccessibleName = AccessibleName, AccessibleParent = AccessibleParent, AccessibleRelationSet = AccessibleRelationSet, AccessibleRole = AccessibleRole, AccessibleStateSet = AccessibleStateSet, Locale = Locale, acquire = acquire, addAccessibleEventListener = addAccessibleEventListener, getAccessibleChild = getAccessibleChild, getAccessibleChildCount = getAccessibleChildCount, getAccessibleDescription = getAccessibleDescription, getAccessibleIndexInParent = getAccessibleIndexInParent, getAccessibleName = getAccessibleName, getAccessibleParent = getAccessibleParent, getAccessibleRelationSet = getAccessibleRelationSet, getAccessibleRole = getAccessibleRole, getAccessibleStateSet = getAccessibleStateSet, getLocale = getLocale, queryInterface = queryInterface, release = release, removeAccessibleEventListener = removeAccessibleEventListener)
  
    __obj.asInstanceOf[AccessibleContext]
  }
}

