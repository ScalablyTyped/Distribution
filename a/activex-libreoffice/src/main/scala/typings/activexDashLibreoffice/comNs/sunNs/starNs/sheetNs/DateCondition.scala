package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateCondition extends XConditionEntry {
  /** See {@link com.sun.star.sheet.DateType} for possible values */
  var DateType: Double
  var StyleName: String
}

object DateCondition {
  @scala.inline
  def apply(
    DateType: Double,
    StyleName: String,
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): DateCondition = {
    val __obj = js.Dynamic.literal(DateType = DateType, StyleName = StyleName, Type = Type, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[DateCondition]
  }
}

