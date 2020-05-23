package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildPaths extends js.Object {
  var buildPaths: js.Array[String]
  var testPaths: js.Array[String]
}

object BuildPaths {
  @scala.inline
  def apply(buildPaths: js.Array[String], testPaths: js.Array[String]): BuildPaths = {
    val __obj = js.Dynamic.literal(buildPaths = buildPaths.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildPaths]
  }
}

