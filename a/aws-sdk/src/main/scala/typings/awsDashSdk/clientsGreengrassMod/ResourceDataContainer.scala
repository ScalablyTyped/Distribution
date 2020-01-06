package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataContainer extends js.Object {
  /**
    * Attributes that define the local device resource.
    */
  var LocalDeviceResourceData: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.LocalDeviceResourceData] = js.native
  /**
    * Attributes that define the local volume resource.
    */
  var LocalVolumeResourceData: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.LocalVolumeResourceData] = js.native
  /**
    * Attributes that define an Amazon S3 machine learning resource.
    */
  var S3MachineLearningModelResourceData: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.S3MachineLearningModelResourceData] = js.native
  /**
    * Attributes that define an Amazon SageMaker machine learning resource.
    */
  var SageMakerMachineLearningModelResourceData: js.UndefOr[
    typings.awsDashSdk.clientsGreengrassMod.SageMakerMachineLearningModelResourceData
  ] = js.native
  /**
    * Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
    */
  var SecretsManagerSecretResourceData: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.SecretsManagerSecretResourceData] = js.native
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
    if (LocalDeviceResourceData != null) __obj.updateDynamic("LocalDeviceResourceData")(LocalDeviceResourceData.asInstanceOf[js.Any])
    if (LocalVolumeResourceData != null) __obj.updateDynamic("LocalVolumeResourceData")(LocalVolumeResourceData.asInstanceOf[js.Any])
    if (S3MachineLearningModelResourceData != null) __obj.updateDynamic("S3MachineLearningModelResourceData")(S3MachineLearningModelResourceData.asInstanceOf[js.Any])
    if (SageMakerMachineLearningModelResourceData != null) __obj.updateDynamic("SageMakerMachineLearningModelResourceData")(SageMakerMachineLearningModelResourceData.asInstanceOf[js.Any])
    if (SecretsManagerSecretResourceData != null) __obj.updateDynamic("SecretsManagerSecretResourceData")(SecretsManagerSecretResourceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataContainer]
  }
}

