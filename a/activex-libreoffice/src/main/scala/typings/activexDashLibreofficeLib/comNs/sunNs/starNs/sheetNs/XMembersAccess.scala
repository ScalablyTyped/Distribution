package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to access named members in a data pilot source level collection.
  * @see com.sun.star.sheet.DataPilotSourceMember
  */
trait XMembersAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /**
    * returns names of data pilot members in a locale independent notation.
    *
    * Specifically date values are represented in an ISO 8601 YYYY-MM-DD notation and date+time as YYYY-MM-DD HH:MM:SS, whereas the strings returned by
    * {@link com.sun.star.container.XNameAccess.getElementNames()} may represent these in a locale dependent or user formatted notation such as MM/DD/YY or
    * DD.MM.YYYY or other.
    *
    * The names returned by this function can NOT be used in calls to {@link com.sun.star.container.XNameAccess.getByName()} . However, the order returned
    * in two immediately consecutive calls to {@link getElementNames()} and {@link getLocaleIndependentElementNames()} maps to the same elements in order.
    * @returns a sequence of all element names in this container.
    */
  val LocaleIndependentElementNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * returns names of data pilot members in a locale independent notation.
    *
    * Specifically date values are represented in an ISO 8601 YYYY-MM-DD notation and date+time as YYYY-MM-DD HH:MM:SS, whereas the strings returned by
    * {@link com.sun.star.container.XNameAccess.getElementNames()} may represent these in a locale dependent or user formatted notation such as MM/DD/YY or
    * DD.MM.YYYY or other.
    *
    * The names returned by this function can NOT be used in calls to {@link com.sun.star.container.XNameAccess.getByName()} . However, the order returned
    * in two immediately consecutive calls to {@link getElementNames()} and {@link getLocaleIndependentElementNames()} maps to the same elements in order.
    * @returns a sequence of all element names in this container.
    */
  def getLocaleIndependentElementNames(): activexDashInteropLib.SafeArray[java.lang.String]
}

object XMembersAccess {
  @scala.inline
  def apply(
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    LocaleIndependentElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getLocaleIndependentElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMembersAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, LocaleIndependentElementNames = LocaleIndependentElementNames, acquire = acquire, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, getLocaleIndependentElementNames = getLocaleIndependentElementNames, hasByName = hasByName, hasElements = hasElements, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XMembersAccess]
  }
}

