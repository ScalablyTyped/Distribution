package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValue extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object Anon_KeyValue {
  @scala.inline
  def apply(value: java.lang.String, key: java.lang.String = null): Anon_KeyValue = {
    val __obj = js.Dynamic.literal(value = value)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_KeyValue]
  }
}

