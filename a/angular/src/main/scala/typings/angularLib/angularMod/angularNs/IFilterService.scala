package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $filter - $filterProvider - service in module ng
  *
  * Filters are used for formatting data displayed to the user.
  *
  * see https://docs.angularjs.org/api/ng/service/$filter
  */
@js.native
trait IFilterService extends js.Object {
  def apply(name: angularLib.angularLibStrings.currency): IFilterCurrency = js.native
  def apply(name: angularLib.angularLibStrings.date): IFilterDate = js.native
  def apply(name: angularLib.angularLibStrings.filter): IFilterFilter = js.native
  def apply(name: angularLib.angularLibStrings.json): IFilterJson = js.native
  def apply(name: angularLib.angularLibStrings.limitTo): IFilterLimitTo = js.native
  def apply(name: angularLib.angularLibStrings.lowercase): IFilterLowercase = js.native
  def apply(name: angularLib.angularLibStrings.number): IFilterNumber = js.native
  def apply(name: angularLib.angularLibStrings.orderBy): IFilterOrderBy = js.native
  def apply(name: angularLib.angularLibStrings.uppercase): IFilterUppercase = js.native
  /**
    * Usage:
    * $filter(name);
    *
    * @param name Name of the filter function to retrieve
    */
  def apply[T](name: java.lang.String): T = js.native
}

