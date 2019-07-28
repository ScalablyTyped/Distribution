package typings.audiosprite.audiospriteMod

import org.scalablytyped.runtime.StringDictionary
import typings.audiosprite.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var autoplay: js.UndefOr[String] = js.undefined
  var resources: js.Array[String]
  var spritemap: StringDictionary[Anon_End]
}

object Result {
  @scala.inline
  def apply(resources: js.Array[String], spritemap: StringDictionary[Anon_End], autoplay: String = null): Result = {
    val __obj = js.Dynamic.literal(resources = resources, spritemap = spritemap)
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay)
    __obj.asInstanceOf[Result]
  }
}

