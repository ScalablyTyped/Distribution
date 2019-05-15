package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentClassifierProperties extends js.Object {
  /**
    * Information about the document classifier, including the number of documents used for training the classifier, the number of documents used for test the classifier, and an accuracy rating.
    */
  var ClassifierMetadata: js.UndefOr[ClassifierMetadata] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier.
    */
  var DocumentClassifierArn: js.UndefOr[DocumentClassifierArn] = js.undefined
  /**
    * The time that training the document classifier completed.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The input data configuration that you supplied when you created the document classifier for training.
    */
  var InputDataConfig: js.UndefOr[DocumentClassifierInputDataConfig] = js.undefined
  /**
    * The language code for the language of the documents that the classifier was trained on.
    */
  var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
  /**
    * Additional information about the status of the classifier.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  /**
    *  Provides output results configuration parameters for custom classifier jobs.
    */
  var OutputDataConfig: js.UndefOr[DocumentClassifierOutputDataConfig] = js.undefined
  /**
    * The status of the document classifier. If the status is TRAINED the classifier is ready to use. If the status is FAILED you can see additional information about why the classifier wasn't trained in the Message field.
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
  /**
    * The time that the document classifier was submitted for training.
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The time that training of the document classifier was completed. Indicates the time when the training completes on documentation classifiers. You are billed for the time interval between this time and the value of TrainingStartTime.
    */
  var TrainingEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Indicates the time when the training starts on documentation classifiers. You are billed for the time interval between this time and the value of TrainingEndTime. 
    */
  var TrainingStartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    *  Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your custom classifier. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
}

object DocumentClassifierProperties {
  @scala.inline
  def apply(
    ClassifierMetadata: ClassifierMetadata = null,
    DataAccessRoleArn: IamRoleArn = null,
    DocumentClassifierArn: DocumentClassifierArn = null,
    EndTime: Timestamp = null,
    InputDataConfig: DocumentClassifierInputDataConfig = null,
    LanguageCode: LanguageCode = null,
    Message: AnyLengthString = null,
    OutputDataConfig: DocumentClassifierOutputDataConfig = null,
    Status: ModelStatus = null,
    SubmitTime: Timestamp = null,
    TrainingEndTime: Timestamp = null,
    TrainingStartTime: Timestamp = null,
    VolumeKmsKeyId: KmsKeyId = null,
    VpcConfig: VpcConfig = null
  ): DocumentClassifierProperties = {
    val __obj = js.Dynamic.literal()
    if (ClassifierMetadata != null) __obj.updateDynamic("ClassifierMetadata")(ClassifierMetadata)
    if (DataAccessRoleArn != null) __obj.updateDynamic("DataAccessRoleArn")(DataAccessRoleArn)
    if (DocumentClassifierArn != null) __obj.updateDynamic("DocumentClassifierArn")(DocumentClassifierArn)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (OutputDataConfig != null) __obj.updateDynamic("OutputDataConfig")(OutputDataConfig)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubmitTime != null) __obj.updateDynamic("SubmitTime")(SubmitTime)
    if (TrainingEndTime != null) __obj.updateDynamic("TrainingEndTime")(TrainingEndTime)
    if (TrainingStartTime != null) __obj.updateDynamic("TrainingStartTime")(TrainingStartTime)
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[DocumentClassifierProperties]
  }
}

