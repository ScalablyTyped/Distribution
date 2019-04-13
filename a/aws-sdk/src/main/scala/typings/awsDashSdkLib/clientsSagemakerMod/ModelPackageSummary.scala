package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelPackageSummary extends js.Object {
  /**
    * A timestamp that shows when the model package was created.
    */
  var CreationTime: awsDashSdkLib.clientsSagemakerMod.CreationTime
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: awsDashSdkLib.clientsSagemakerMod.ModelPackageArn
  /**
    * A brief description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
  /**
    * The name of the model package.
    */
  var ModelPackageName: EntityName
  /**
    * The overall status of the model package.
    */
  var ModelPackageStatus: awsDashSdkLib.clientsSagemakerMod.ModelPackageStatus
}

object ModelPackageSummary {
  @scala.inline
  def apply(
    CreationTime: CreationTime,
    ModelPackageArn: ModelPackageArn,
    ModelPackageName: EntityName,
    ModelPackageStatus: ModelPackageStatus,
    ModelPackageDescription: EntityDescription = null
  ): ModelPackageSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, ModelPackageArn = ModelPackageArn, ModelPackageName = ModelPackageName, ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any])
    if (ModelPackageDescription != null) __obj.updateDynamic("ModelPackageDescription")(ModelPackageDescription)
    __obj.asInstanceOf[ModelPackageSummary]
  }
}

