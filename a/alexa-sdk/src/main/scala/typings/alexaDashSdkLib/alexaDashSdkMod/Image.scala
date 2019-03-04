package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var contentDescription: java.lang.String
  var sources: js.Array[ImageSource]
}

object Image {
  @scala.inline
  def apply(contentDescription: java.lang.String, sources: js.Array[ImageSource]): Image = {
    val __obj = js.Dynamic.literal(contentDescription = contentDescription, sources = sources)
  
    __obj.asInstanceOf[Image]
  }
}

