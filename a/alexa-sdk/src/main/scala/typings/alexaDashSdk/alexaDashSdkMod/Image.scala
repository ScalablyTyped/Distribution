package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var contentDescription: String
  var sources: js.Array[ImageSource]
}

object Image {
  @scala.inline
  def apply(contentDescription: String, sources: js.Array[ImageSource]): Image = {
    val __obj = js.Dynamic.literal(contentDescription = contentDescription.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Image]
  }
}

