package typings
package angularDashAgilityLib.aaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidIconStrategy extends js.Object {
  var invalidIcon: java.lang.String
  var validIcon: java.lang.String
  def getContainer(element: angularLib.angularMod.angularNs.IAugmentedJQueryStatic): scala.Unit
}

object IValidIconStrategy {
  @scala.inline
  def apply(
    getContainer: angularLib.angularMod.angularNs.IAugmentedJQueryStatic => scala.Unit,
    invalidIcon: java.lang.String,
    validIcon: java.lang.String
  ): IValidIconStrategy = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction1(getContainer), invalidIcon = invalidIcon, validIcon = validIcon)
  
    __obj.asInstanceOf[IValidIconStrategy]
  }
}

