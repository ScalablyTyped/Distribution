package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recommendation extends js.Object {
  /**
    * Describes the recommended steps to take to remediate an issue identified in a finding.
    */
  var Text: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A URL to a page or site that contains information about how to remediate a finding.
    */
  var Url: js.UndefOr[NonEmptyString] = js.undefined
}

object Recommendation {
  @scala.inline
  def apply(Text: NonEmptyString = null, Url: NonEmptyString = null): Recommendation = {
    val __obj = js.Dynamic.literal()
    if (Text != null) __obj.updateDynamic("Text")(Text)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[Recommendation]
  }
}

