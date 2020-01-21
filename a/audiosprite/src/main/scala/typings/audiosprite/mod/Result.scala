package typings.audiosprite.mod

import org.scalablytyped.runtime.StringDictionary
import typings.audiosprite.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var autoplay: js.UndefOr[String] = js.undefined
  var resources: js.Array[String]
  var spritemap: StringDictionary[AnonEnd]
}

object Result {
  @scala.inline
  def apply(resources: js.Array[String], spritemap: StringDictionary[AnonEnd], autoplay: String = null): Result = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], spritemap = spritemap.asInstanceOf[js.Any])
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

