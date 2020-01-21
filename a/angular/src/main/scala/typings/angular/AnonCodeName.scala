package typings.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeName extends js.Object {
  var codeName: String
  var dot: Double
  var full: String
  var major: Double
  var minor: Double
}

object AnonCodeName {
  @scala.inline
  def apply(codeName: String, dot: Double, full: String, major: Double, minor: Double): AnonCodeName = {
    val __obj = js.Dynamic.literal(codeName = codeName.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCodeName]
  }
}

