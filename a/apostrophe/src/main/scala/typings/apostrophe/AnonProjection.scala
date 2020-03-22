package typings.apostrophe

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProjection extends js.Object {
  var projection: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object AnonProjection {
  @scala.inline
  def apply(projection: StringDictionary[Double] = null): AnonProjection = {
    val __obj = js.Dynamic.literal()
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProjection]
  }
}

