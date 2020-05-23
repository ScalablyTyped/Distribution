package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColorFontSize extends js.Object {
  var backgroundColor: String
  var fontSize: Double
  var lineHeight: Double
  var paddingHorizontal: Double
  var textAlignVertical: String
}

object BackgroundColorFontSize {
  @scala.inline
  def apply(
    backgroundColor: String,
    fontSize: Double,
    lineHeight: Double,
    paddingHorizontal: Double,
    textAlignVertical: String
  ): BackgroundColorFontSize = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], textAlignVertical = textAlignVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorFontSize]
  }
}

