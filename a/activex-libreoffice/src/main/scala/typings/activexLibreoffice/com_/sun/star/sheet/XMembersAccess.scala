package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to access named members in a data pilot source level collection.
  * @see com.sun.star.sheet.DataPilotSourceMember
  */
@js.native
trait XMembersAccess extends XNameAccess {
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
  val LocaleIndependentElementNames: SafeArray[String] = js.native
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
  def getLocaleIndependentElementNames(): SafeArray[String] = js.native
}

object XMembersAccess {
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    LocaleIndependentElementNames: SafeArray[String],
    acquire: () => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    getLocaleIndependentElementNames: () => SafeArray[String],
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMembersAccess = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], LocaleIndependentElementNames = LocaleIndependentElementNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), getLocaleIndependentElementNames = js.Any.fromFunction0(getLocaleIndependentElementNames), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMembersAccess]
  }
  @scala.inline
  implicit class XMembersAccessOps[Self <: XMembersAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocaleIndependentElementNames(value: SafeArray[String]): Self = this.set("LocaleIndependentElementNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLocaleIndependentElementNames(value: () => SafeArray[String]): Self = this.set("getLocaleIndependentElementNames", js.Any.fromFunction0(value))
  }
  
}

