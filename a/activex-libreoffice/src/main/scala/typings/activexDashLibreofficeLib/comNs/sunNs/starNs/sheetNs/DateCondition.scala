package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateCondition extends XConditionEntry {
  /** See {@link com.sun.star.sheet.DateType} for possible values */
  var DateType: scala.Double
  var StyleName: java.lang.String
}

object DateCondition {
  @scala.inline
  def apply(
    DateType: scala.Double,
    StyleName: java.lang.String,
    Type: scala.Double,
    acquire: () => scala.Unit,
    getType: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): DateCondition = {
    val __obj = js.Dynamic.literal(DateType = DateType, StyleName = StyleName, Type = Type, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[DateCondition]
  }
}

