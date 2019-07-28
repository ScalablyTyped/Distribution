package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTransformation extends js.Object {
  /**
    * The creation date and time (in Unix time) of the feature transformation.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * Provides the default parameters for feature transformation.
    */
  var defaultParameters: js.UndefOr[FeaturizationParameters] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the FeatureTransformation object.
    */
  var featureTransformationArn: js.UndefOr[Arn] = js.undefined
  /**
    * The last update date and time (in Unix time) of the feature transformation.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the feature transformation.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The status of the feature transformation. A feature transformation can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object FeatureTransformation {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    defaultParameters: FeaturizationParameters = null,
    featureTransformationArn: Arn = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    status: Status = null
  ): FeatureTransformation = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (defaultParameters != null) __obj.updateDynamic("defaultParameters")(defaultParameters)
    if (featureTransformationArn != null) __obj.updateDynamic("featureTransformationArn")(featureTransformationArn)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[FeatureTransformation]
  }
}

