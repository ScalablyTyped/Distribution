package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerParameterRange extends js.Object {
  /**
    * The maximum value of the hyperparameter to search.
    */
  var MaxValue: ParameterValue
  /**
    * The minimum value of the hyperparameter to search.
    */
  var MinValue: ParameterValue
  /**
    * The name of the hyperparameter to search.
    */
  var Name: ParameterKey
  /**
    * The scale that hyperparameter tuning uses to search the hyperparameter range. For information about choosing a hyperparameter scale, see Hyperparameter Scaling. One of the following values:  Auto  Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.  Linear  Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.  Logarithmic  Hyperparemeter tuning searches the values in the hyperparameter range by using a logarithmic scale. Logarithmic scaling works only for ranges that have only values greater than 0.  
    */
  var ScalingType: js.UndefOr[HyperParameterScalingType] = js.undefined
}

object IntegerParameterRange {
  @scala.inline
  def apply(
    MaxValue: ParameterValue,
    MinValue: ParameterValue,
    Name: ParameterKey,
    ScalingType: HyperParameterScalingType = null
  ): IntegerParameterRange = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue, MinValue = MinValue, Name = Name)
    if (ScalingType != null) __obj.updateDynamic("ScalingType")(ScalingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameterRange]
  }
}

