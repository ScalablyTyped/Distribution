package typings
package antdLib.libCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilledFieldNamesType extends js.Object {
  var children: java.lang.String
  var label: java.lang.String
  var value: java.lang.String
}

object FilledFieldNamesType {
  @scala.inline
  def apply(children: java.lang.String, label: java.lang.String, value: java.lang.String): FilledFieldNamesType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FilledFieldNamesType]
  }
}

