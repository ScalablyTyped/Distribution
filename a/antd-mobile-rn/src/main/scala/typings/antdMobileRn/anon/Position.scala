package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var backgroundColor: String
  var position: String
  var top: Double
  var transform: js.Array[Rotate]
  var width: Double
}

object Position {
  @scala.inline
  def apply(backgroundColor: String, position: String, top: Double, transform: js.Array[Rotate], width: Double): Position = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

