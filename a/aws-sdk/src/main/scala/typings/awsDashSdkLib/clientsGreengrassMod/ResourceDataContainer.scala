package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceDataContainer extends js.Object {
  /**
    * Attributes that define the local device resource.
    */
  var LocalDeviceResourceData: js.UndefOr[LocalDeviceResourceData] = js.undefined
  /**
    * Attributes that define the local volume resource.
    */
  var LocalVolumeResourceData: js.UndefOr[LocalVolumeResourceData] = js.undefined
  /**
    * Attributes that define an Amazon S3 machine learning resource.
    */
  var S3MachineLearningModelResourceData: js.UndefOr[S3MachineLearningModelResourceData] = js.undefined
  /**
    * Attributes that define an Amazon SageMaker machine learning resource.
    */
  var SageMakerMachineLearningModelResourceData: js.UndefOr[SageMakerMachineLearningModelResourceData] = js.undefined
  /**
    * Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
    */
  var SecretsManagerSecretResourceData: js.UndefOr[SecretsManagerSecretResourceData] = js.undefined
}

object ResourceDataContainer {
  @scala.inline
  def apply(
    LocalDeviceResourceData: LocalDeviceResourceData = null,
    LocalVolumeResourceData: LocalVolumeResourceData = null,
    S3MachineLearningModelResourceData: S3MachineLearningModelResourceData = null,
    SageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceData = null,
    SecretsManagerSecretResourceData: SecretsManagerSecretResourceData = null
  ): ResourceDataContainer = {
    val __obj = js.Dynamic.literal()
    if (LocalDeviceResourceData != null) __obj.updateDynamic("LocalDeviceResourceData")(LocalDeviceResourceData)
    if (LocalVolumeResourceData != null) __obj.updateDynamic("LocalVolumeResourceData")(LocalVolumeResourceData)
    if (S3MachineLearningModelResourceData != null) __obj.updateDynamic("S3MachineLearningModelResourceData")(S3MachineLearningModelResourceData)
    if (SageMakerMachineLearningModelResourceData != null) __obj.updateDynamic("SageMakerMachineLearningModelResourceData")(SageMakerMachineLearningModelResourceData)
    if (SecretsManagerSecretResourceData != null) __obj.updateDynamic("SecretsManagerSecretResourceData")(SecretsManagerSecretResourceData)
    __obj.asInstanceOf[ResourceDataContainer]
  }
}

