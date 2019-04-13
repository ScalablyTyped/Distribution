package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateQualificationTypeRequest extends js.Object {
  /**
    * The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data structure.
    */
  var AnswerKey: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether requests for the Qualification type are granted immediately, without prompting the Worker with a Qualification test. Constraints: If the Test parameter is specified, this parameter cannot be true.
    */
  var AutoGranted: js.UndefOr[Boolean] = js.undefined
  /**
    * The Qualification value to use for automatically granted Qualifications. This parameter is used only if the AutoGranted parameter is true.
    */
  var AutoGrantedValue: js.UndefOr[Integer] = js.undefined
  /**
    * The new description of the Qualification type.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Qualification type to update.
    */
  var QualificationTypeId: EntityId
  /**
    * The new status of the Qualification type - Active | Inactive
    */
  var QualificationTypeStatus: js.UndefOr[QualificationTypeStatus] = js.undefined
  /**
    * The amount of time, in seconds, that Workers must wait after requesting a Qualification of the specified Qualification type before they can retry the Qualification request. It is not possible to disable retries for a Qualification type after it has been created with retries enabled. If you want to disable retries, you must dispose of the existing retry-enabled Qualification type using DisposeQualificationType and then create a new Qualification type with retries disabled using CreateQualificationType.
    */
  var RetryDelayInSeconds: js.UndefOr[Long] = js.undefined
  /**
    * The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this type. If this parameter is specified, TestDurationInSeconds must also be specified. Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter cannot be specified if AutoGranted is true. Constraints: None. If not specified, the Worker may request the Qualification without answering any questions.
    */
  var Test: js.UndefOr[String] = js.undefined
  /**
    * The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker requests the Qualification.
    */
  var TestDurationInSeconds: js.UndefOr[Long] = js.undefined
}

object UpdateQualificationTypeRequest {
  @scala.inline
  def apply(
    QualificationTypeId: EntityId,
    AnswerKey: String = null,
    AutoGranted: js.UndefOr[Boolean] = js.undefined,
    AutoGrantedValue: js.UndefOr[Integer] = js.undefined,
    Description: String = null,
    QualificationTypeStatus: QualificationTypeStatus = null,
    RetryDelayInSeconds: js.UndefOr[Long] = js.undefined,
    Test: String = null,
    TestDurationInSeconds: js.UndefOr[Long] = js.undefined
  ): UpdateQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId)
    if (AnswerKey != null) __obj.updateDynamic("AnswerKey")(AnswerKey)
    if (!js.isUndefined(AutoGranted)) __obj.updateDynamic("AutoGranted")(AutoGranted)
    if (!js.isUndefined(AutoGrantedValue)) __obj.updateDynamic("AutoGrantedValue")(AutoGrantedValue)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (QualificationTypeStatus != null) __obj.updateDynamic("QualificationTypeStatus")(QualificationTypeStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(RetryDelayInSeconds)) __obj.updateDynamic("RetryDelayInSeconds")(RetryDelayInSeconds)
    if (Test != null) __obj.updateDynamic("Test")(Test)
    if (!js.isUndefined(TestDurationInSeconds)) __obj.updateDynamic("TestDurationInSeconds")(TestDurationInSeconds)
    __obj.asInstanceOf[UpdateQualificationTypeRequest]
  }
}

