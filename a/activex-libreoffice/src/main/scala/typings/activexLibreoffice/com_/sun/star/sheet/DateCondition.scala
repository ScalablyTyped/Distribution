package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
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
    val __obj = js.Dynamic.literal(DateType = DateType.asInstanceOf[js.Any], StyleName = StyleName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[DateCondition]
  }
}

