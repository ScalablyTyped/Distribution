package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuildPaths extends js.Object {
  var buildPaths: js.Array[String]
  var testPaths: js.Array[String]
}

object AnonBuildPaths {
  @scala.inline
  def apply(buildPaths: js.Array[String], testPaths: js.Array[String]): AnonBuildPaths = {
    val __obj = js.Dynamic.literal(buildPaths = buildPaths.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuildPaths]
  }
}

