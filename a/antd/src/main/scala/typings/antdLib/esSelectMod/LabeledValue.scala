package typings
package antdLib.esSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledValue extends js.Object {
  var key: java.lang.String
  var label: reactLib.reactMod.ReactNode
}

object LabeledValue {
  @scala.inline
  def apply(key: java.lang.String, label: reactLib.reactMod.ReactNode): LabeledValue = {
    val __obj = js.Dynamic.literal(key = key, label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LabeledValue]
  }
}

