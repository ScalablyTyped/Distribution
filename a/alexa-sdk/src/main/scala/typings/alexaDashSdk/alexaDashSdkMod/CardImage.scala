package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardImage extends js.Object {
  /**
    * Recommended size (in px): 1200w x 800h
    */
  var largeImageUrl: String
  /**
    * Recommended size (in px): 720w x 480h
    */
  var smallImageUrl: String
}

object CardImage {
  @scala.inline
  def apply(largeImageUrl: String, smallImageUrl: String): CardImage = {
    val __obj = js.Dynamic.literal(largeImageUrl = largeImageUrl.asInstanceOf[js.Any], smallImageUrl = smallImageUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CardImage]
  }
}

