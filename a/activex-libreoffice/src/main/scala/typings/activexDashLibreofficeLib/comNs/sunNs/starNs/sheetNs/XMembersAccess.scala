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
  val LocaleIndependentElementNames: stdLib.SafeArray[java.lang.String]
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
  def getLocaleIndependentElementNames(): stdLib.SafeArray[java.lang.String]
}

object XMembersAccess {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    LocaleIndependentElementNames: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    getLocaleIndependentElementNames: () => stdLib.SafeArray[java.lang.String],
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMembersAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, LocaleIndependentElementNames = LocaleIndependentElementNames, acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLocaleIndependentElementNames = js.Any.fromFunction0(getLocaleIndependentElementNames), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMembersAccess]
  }
}

