package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegerParameterRange extends js.Object {
  /**
    * The maximum value of the hyperparameter to search.
    */
  var MaxValue: ParameterValue = js.native
  /**
    * The minimum value of the hyperparameter to search.
    */
  var MinValue: ParameterValue = js.native
  /**
    * The name of the hyperparameter to search.
    */
  var Name: ParameterKey = js.native
  /**
    * The scale that hyperparameter tuning uses to search the hyperparameter range. For information about choosing a hyperparameter scale, see Hyperparameter Scaling. One of the following values:  Auto  Amazon SageMaker hyperparameter tuning chooses the best scale for the hyperparameter.  Linear  Hyperparameter tuning searches the values in the hyperparameter range by using a linear scale.  Logarithmic  Hyperparameter tuning searches the values in the hyperparameter range by using a logarithmic scale. Logarithmic scaling works only for ranges that have only values greater than 0.  
    */
  var ScalingType: js.UndefOr[HyperParameterScalingType] = js.native
}

object IntegerParameterRange {
  @scala.inline
  def apply(
    MaxValue: ParameterValue,
    MinValue: ParameterValue,
    Name: ParameterKey,
    ScalingType: HyperParameterScalingType = null
  ): IntegerParameterRange = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (ScalingType != null) __obj.updateDynamic("ScalingType")(ScalingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameterRange]
  }
}

