package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatIntelIndicator extends js.Object {
  /**
    * The category of a threat intel indicator.
    */
  var Category: js.UndefOr[ThreatIntelIndicatorCategory] = js.undefined
  /**
    * The date and time when the most recent instance of a threat intel indicator was observed.
    */
  var LastObservedAt: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The source of the threat intel indicator.
    */
  var Source: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The URL to the page or site where you can get more information about the threat intel indicator.
    */
  var SourceUrl: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The type of a threat intel indicator.
    */
  var Type: js.UndefOr[ThreatIntelIndicatorType] = js.undefined
  /**
    * The value of a threat intel indicator.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}

object ThreatIntelIndicator {
  @scala.inline
  def apply(
    Category: ThreatIntelIndicatorCategory = null,
    LastObservedAt: NonEmptyString = null,
    Source: NonEmptyString = null,
    SourceUrl: NonEmptyString = null,
    Type: ThreatIntelIndicatorType = null,
    Value: NonEmptyString = null
  ): ThreatIntelIndicator = {
    val __obj = js.Dynamic.literal()
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (LastObservedAt != null) __obj.updateDynamic("LastObservedAt")(LastObservedAt)
    if (Source != null) __obj.updateDynamic("Source")(Source)
    if (SourceUrl != null) __obj.updateDynamic("SourceUrl")(SourceUrl)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ThreatIntelIndicator]
  }
}

