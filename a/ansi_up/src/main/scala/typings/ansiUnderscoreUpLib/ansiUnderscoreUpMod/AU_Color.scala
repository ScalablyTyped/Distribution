package typings
package ansiUnderscoreUpLib.ansiUnderscoreUpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AU_Color extends js.Object {
  var class_name: java.lang.String
  var rgb: js.Array[scala.Double]
}

object AU_Color {
  @scala.inline
  def apply(class_name: java.lang.String, rgb: js.Array[scala.Double]): AU_Color = {
    val __obj = js.Dynamic.literal(class_name = class_name, rgb = rgb)
  
    __obj.asInstanceOf[AU_Color]
  }
}

