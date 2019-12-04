package typings.atAngularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuildPaths extends js.Object {
  var buildPaths: js.Array[String]
  var testPaths: js.Array[String]
}

object Anon_BuildPaths {
  @scala.inline
  def apply(buildPaths: js.Array[String], testPaths: js.Array[String]): Anon_BuildPaths = {
    val __obj = js.Dynamic.literal(buildPaths = buildPaths.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BuildPaths]
  }
}

