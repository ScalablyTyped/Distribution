package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupplementaryFeature extends js.Object {
  /**
    * The name of the feature. This must be "holiday".
    */
  var Name: typings.awsDashSdk.clientsForecastserviceMod.Name
  /**
    * One of the following 2 letter country codes:   "AU" - AUSTRALIA   "DE" - GERMANY   "JP" - JAPAN   "US" - UNITED_STATES   "UK" - UNITED_KINGDOM  
    */
  var Value: typings.awsDashSdk.clientsForecastserviceMod.Value
}

object SupplementaryFeature {
  @scala.inline
  def apply(Name: Name, Value: Value): SupplementaryFeature = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[SupplementaryFeature]
  }
}

