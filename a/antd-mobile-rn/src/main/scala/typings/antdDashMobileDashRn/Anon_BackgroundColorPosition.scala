package typings.antdDashMobileDashRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorPosition extends js.Object {
  var backgroundColor: String
  var position: String
  var top: Double
  var transform: js.Array[Anon_Rotate]
  var width: Double
}

object Anon_BackgroundColorPosition {
  @scala.inline
  def apply(
    backgroundColor: String,
    position: String,
    top: Double,
    transform: js.Array[Anon_Rotate],
    width: Double
  ): Anon_BackgroundColorPosition = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, position = position, top = top, transform = transform, width = width)
  
    __obj.asInstanceOf[Anon_BackgroundColorPosition]
  }
}

