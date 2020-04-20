package typings.angularAgility.aa

import typings.angular.mod.IAugmentedJQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidIconStrategy extends js.Object {
  var invalidIcon: String
  var validIcon: String
  def getContainer(element: IAugmentedJQueryStatic): Unit
}

object IValidIconStrategy {
  @scala.inline
  def apply(getContainer: IAugmentedJQueryStatic => Unit, invalidIcon: String, validIcon: String): IValidIconStrategy = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction1(getContainer), invalidIcon = invalidIcon.asInstanceOf[js.Any], validIcon = validIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidIconStrategy]
  }
}

