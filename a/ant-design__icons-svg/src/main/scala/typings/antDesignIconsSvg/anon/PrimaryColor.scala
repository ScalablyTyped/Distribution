package typings.antDesignIconsSvg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryColor extends js.Object {
  var primaryColor: String
  var secondaryColor: String
}

object PrimaryColor {
  @scala.inline
  def apply(primaryColor: String, secondaryColor: String): PrimaryColor = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any], secondaryColor = secondaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryColor]
  }
}

