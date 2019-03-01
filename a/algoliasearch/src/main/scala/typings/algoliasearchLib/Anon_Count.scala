package typings
package algoliasearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: scala.Double
  var highlighted: java.lang.String
  var value: java.lang.String
}

object Anon_Count {
  @scala.inline
  def apply(count: scala.Double, highlighted: java.lang.String, value: java.lang.String): Anon_Count = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("highlighted")(highlighted)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Count]
  }
}

