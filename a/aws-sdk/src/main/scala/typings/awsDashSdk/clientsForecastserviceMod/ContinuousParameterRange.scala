package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousParameterRange extends js.Object {
  /**
    * The maximum tunable value of the hyperparameter.
    */
  var MaxValue: Double
  /**
    * The minimum tunable value of the hyperparameter.
    */
  var MinValue: Double
  /**
    * The name of the hyperparameter to tune.
    */
  var Name: typings.awsDashSdk.clientsForecastserviceMod.Name
  /**
    * The scale that hyperparameter tuning uses to search the hyperparameter range. For information about choosing a hyperparameter scale, see Hyperparameter Scaling. One of the following values:  Auto  Amazon Forecast hyperparameter tuning chooses the best scale for the hyperparameter.  Linear  Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.  Logarithmic  Hyperparameter tuning searches the values in the hyperparameter range by using a logarithmic scale. Logarithmic scaling works only for ranges that have only values greater than 0.  ReverseLogarithmic  Hyperparemeter tuning searches the values in the hyperparameter range by using a reverse logarithmic scale. Reverse logarithmic scaling works only for ranges that are entirely within the range 0 &lt;= x &lt; 1.0.  
    */
  var ScalingType: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.ScalingType] = js.undefined
}

object ContinuousParameterRange {
  @scala.inline
  def apply(MaxValue: Double, MinValue: Double, Name: Name, ScalingType: ScalingType = null): ContinuousParameterRange = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue, MinValue = MinValue, Name = Name)
    if (ScalingType != null) __obj.updateDynamic("ScalingType")(ScalingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousParameterRange]
  }
}

