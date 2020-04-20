package typings.appleMapkitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutomobile extends js.Object {
  /**
    * A constant identifying the mode of transportation as driving.
    */
  val Automobile: String
  /**
    * A constant identifying the mode of transportation as walking.
    */
  val Walking: String
}

object AnonAutomobile {
  @scala.inline
  def apply(Automobile: String, Walking: String): AnonAutomobile = {
    val __obj = js.Dynamic.literal(Automobile = Automobile.asInstanceOf[js.Any], Walking = Walking.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutomobile]
  }
}

