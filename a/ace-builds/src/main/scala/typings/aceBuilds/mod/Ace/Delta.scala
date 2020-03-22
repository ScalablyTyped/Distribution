package typings.aceBuilds.mod.Ace

import typings.aceBuilds.aceBuildsStrings.insert
import typings.aceBuilds.aceBuildsStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delta extends js.Object {
  var action: insert | remove
  var end: Point
  var lines: js.Array[String]
  var start: Point
}

object Delta {
  @scala.inline
  def apply(action: insert | remove, end: Point, lines: js.Array[String], start: Point): Delta = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delta]
  }
}

