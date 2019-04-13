package typings
package audiospriteLib.audiospriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var autoplay: js.UndefOr[java.lang.String] = js.undefined
  var resources: js.Array[java.lang.String]
  var spritemap: org.scalablytyped.runtime.StringDictionary[audiospriteLib.Anon_End]
}

object Result {
  @scala.inline
  def apply(
    resources: js.Array[java.lang.String],
    spritemap: org.scalablytyped.runtime.StringDictionary[audiospriteLib.Anon_End],
    autoplay: java.lang.String = null
  ): Result = {
    val __obj = js.Dynamic.literal(resources = resources, spritemap = spritemap)
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay)
    __obj.asInstanceOf[Result]
  }
}

