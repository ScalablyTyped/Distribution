package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformParameters extends js.Object {
  /**
    * The parameters for the find matches algorithm.
    */
  var FindMatchesParameters: js.UndefOr[typings.awsDashSdk.clientsGlueMod.FindMatchesParameters] = js.undefined
  /**
    * The type of machine learning transform. For information about the types of machine learning transforms, see Creating Machine Learning Transforms.
    */
  var TransformType: typings.awsDashSdk.clientsGlueMod.TransformType
}

object TransformParameters {
  @scala.inline
  def apply(TransformType: TransformType, FindMatchesParameters: FindMatchesParameters = null): TransformParameters = {
    val __obj = js.Dynamic.literal(TransformType = TransformType.asInstanceOf[js.Any])
    if (FindMatchesParameters != null) __obj.updateDynamic("FindMatchesParameters")(FindMatchesParameters)
    __obj.asInstanceOf[TransformParameters]
  }
}

