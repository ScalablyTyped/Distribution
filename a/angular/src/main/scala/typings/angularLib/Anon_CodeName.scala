package typings
package angularLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeName extends js.Object {
  var codeName: java.lang.String
  var dot: scala.Double
  var full: java.lang.String
  var major: scala.Double
  var minor: scala.Double
}

object Anon_CodeName {
  @scala.inline
  def apply(
    codeName: java.lang.String,
    dot: scala.Double,
    full: java.lang.String,
    major: scala.Double,
    minor: scala.Double
  ): Anon_CodeName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codeName")(codeName)
    __obj.updateDynamic("dot")(dot)
    __obj.updateDynamic("full")(full)
    __obj.updateDynamic("major")(major)
    __obj.updateDynamic("minor")(minor)
    __obj.asInstanceOf[Anon_CodeName]
  }
}

