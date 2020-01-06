package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recommendation extends js.Object {
  /**
    * Describes the recommended steps to take to remediate an issue identified in a finding.
    */
  var Text: js.UndefOr[NonEmptyString] = js.native
  /**
    * A URL to a page or site that contains information about how to remediate a finding.
    */
  var Url: js.UndefOr[NonEmptyString] = js.native
}

object Recommendation {
  @scala.inline
  def apply(Text: NonEmptyString = null, Url: NonEmptyString = null): Recommendation = {
    val __obj = js.Dynamic.literal()
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recommendation]
  }
}

