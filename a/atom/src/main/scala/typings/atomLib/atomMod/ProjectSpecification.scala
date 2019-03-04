package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSpecification extends js.Object {
  var config: js.UndefOr[ConfigValues] = js.undefined
  var originPath: java.lang.String
  var paths: js.Array[java.lang.String]
}

object ProjectSpecification {
  @scala.inline
  def apply(originPath: java.lang.String, paths: js.Array[java.lang.String], config: ConfigValues = null): ProjectSpecification = {
    val __obj = js.Dynamic.literal(originPath = originPath, paths = paths)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[ProjectSpecification]
  }
}

