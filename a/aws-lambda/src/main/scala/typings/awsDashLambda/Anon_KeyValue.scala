package typings.awsDashLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValue extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var value: String
}

object Anon_KeyValue {
  @scala.inline
  def apply(value: String, key: String = null): Anon_KeyValue = {
    val __obj = js.Dynamic.literal(value = value)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_KeyValue]
  }
}

