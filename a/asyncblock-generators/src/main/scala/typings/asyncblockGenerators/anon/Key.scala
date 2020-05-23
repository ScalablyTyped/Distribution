package typings.asyncblockGenerators.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: js.Any
  var runtime: Double
}

object Key {
  @scala.inline
  def apply(key: js.Any, runtime: Double): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

