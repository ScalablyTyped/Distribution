package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardImage extends js.Object {
  /**
    * Recommended size (in px): 1200w x 800h
    */
  var largeImageUrl: java.lang.String
  /**
    * Recommended size (in px): 720w x 480h
    */
  var smallImageUrl: java.lang.String
}

object CardImage {
  @scala.inline
  def apply(largeImageUrl: java.lang.String, smallImageUrl: java.lang.String): CardImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("largeImageUrl")(largeImageUrl)
    __obj.updateDynamic("smallImageUrl")(smallImageUrl)
    __obj.asInstanceOf[CardImage]
  }
}

