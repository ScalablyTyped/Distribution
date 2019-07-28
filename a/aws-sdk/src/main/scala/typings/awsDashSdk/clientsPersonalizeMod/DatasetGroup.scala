package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetGroup extends js.Object {
  /**
    * The creation date and time (in Unix time) of the dataset group.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * If creating a dataset group fails, provides the reason why.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the KMS key used to encrypt the datasets.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  /**
    * The last update date and time (in Unix time) of the dataset group.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the dataset group.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The ARN of the IAM role that has permissions to create the dataset group.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The current status of the dataset group. A dataset group can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object DatasetGroup {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    datasetGroupArn: Arn = null,
    failureReason: FailureReason = null,
    kmsKeyArn: KmsKeyArn = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    roleArn: RoleArn = null,
    status: Status = null
  ): DatasetGroup = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[DatasetGroup]
  }
}

