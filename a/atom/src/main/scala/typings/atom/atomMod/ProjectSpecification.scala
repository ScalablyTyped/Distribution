package typings.atom.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectSpecification extends js.Object {
  var config: js.UndefOr[ConfigValues] = js.undefined
  var originPath: String
  var paths: js.Array[String]
}

object ProjectSpecification {
  @scala.inline
  def apply(originPath: String, paths: js.Array[String], config: ConfigValues = null): ProjectSpecification = {
    val __obj = js.Dynamic.literal(originPath = originPath, paths = paths)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[ProjectSpecification]
  }
}

