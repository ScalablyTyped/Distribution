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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleChildCount")(AccessibleChildCount)
    __obj.updateDynamic("AccessibleDescription")(AccessibleDescription)
    __obj.updateDynamic("AccessibleIndexInParent")(AccessibleIndexInParent)
    __obj.updateDynamic("AccessibleName")(AccessibleName)
    __obj.updateDynamic("AccessibleParent")(AccessibleParent)
    __obj.updateDynamic("AccessibleRelationSet")(AccessibleRelationSet)
    __obj.updateDynamic("AccessibleRole")(AccessibleRole)
    __obj.updateDynamic("AccessibleStateSet")(AccessibleStateSet)
    __obj.updateDynamic("Locale")(Locale)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addAccessibleEventListener")(addAccessibleEventListener)
    __obj.updateDynamic("getAccessibleChild")(getAccessibleChild)
    __obj.updateDynamic("getAccessibleChildCount")(getAccessibleChildCount)
    __obj.updateDynamic("getAccessibleDescription")(getAccessibleDescription)
    __obj.updateDynamic("getAccessibleIndexInParent")(getAccessibleIndexInParent)
    __obj.updateDynamic("getAccessibleName")(getAccessibleName)
    __obj.updateDynamic("getAccessibleParent")(getAccessibleParent)
    __obj.updateDynamic("getAccessibleRelationSet")(getAccessibleRelationSet)
    __obj.updateDynamic("getAccessibleRole")(getAccessibleRole)
    __obj.updateDynamic("getAccessibleStateSet")(getAccessibleStateSet)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeAccessibleEventListener")(removeAccessibleEventListener)
    __obj.asInstanceOf[AccessibleContext]
  }
}

