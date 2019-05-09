package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousParameterRange extends js.Object {
  /**
    * The maximum value for the hyperparameter. The tuning job uses floating-point values between MinValue value and this value for tuning.
    */
  var MaxValue: ParameterValue
  /**
    * The minimum value for the hyperparameter. The tuning job uses floating-point values between this value and MaxValuefor tuning.
    */
  var MinValue: ParameterValue
  /**
    * The name of the continuous hyperparameter to tune.
    */
  var Name: ParameterKey
  /**
    * The scale that hyperparameter tuning uses to search the hyperparameter range. For information about choosing a hyperparameter scale, see Hyperparameter Scaling. One of the following values:  Auto  Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.  Linear  Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.  Logarithmic  Hyperparemeter tuning searches the values in the hyperparameter range by using a logarithmic scale. Logarithmic scaling works only for ranges that have only values greater than 0.  ReverseLogarithmic  Hyperparemeter tuning searches the values in the hyperparameter range by using a reverse logarithmic scale. Reverse logarithmic scaling works only for ranges that are entirely within the range 0&lt;=x&lt;1.0.  
    */
  var ScalingType: js.UndefOr[HyperParameterScalingType] = js.undefined
}

object ContinuousParameterRange {
  @scala.inline
  def apply(
    MaxValue: ParameterValue,
    MinValue: ParameterValue,
    Name: ParameterKey,
    ScalingType: HyperParameterScalingType = null
  ): ContinuousParameterRange = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue, MinValue = MinValue, Name = Name)
    if (ScalingType != null) __obj.updateDynamic("ScalingType")(ScalingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousParameterRange]
  }
}

