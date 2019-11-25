package typings.atAngularRouter.atAngularRouterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMatchResult extends js.Object {
  var consumed: js.Array[UrlSegment]
  var posParams: js.UndefOr[StringDictionary[UrlSegment]] = js.undefined
}

object UrlMatchResult {
  @scala.inline
  def apply(consumed: js.Array[UrlSegment], posParams: StringDictionary[UrlSegment] = null): UrlMatchResult = {
    val __obj = js.Dynamic.literal(consumed = consumed.asInstanceOf[js.Any])
    if (posParams != null) __obj.updateDynamic("posParams")(posParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlMatchResult]
  }
}

