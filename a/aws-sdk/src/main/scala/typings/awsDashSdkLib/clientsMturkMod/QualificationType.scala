package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QualificationType extends js.Object {
  /**
    * The answers to the Qualification test specified in the Test parameter.
    */
  var AnswerKey: js.UndefOr[String] = js.undefined
  /**
    * Specifies that requests for the Qualification type are granted immediately, without prompting the Worker with a Qualification test. Valid values are True | False.
    */
  var AutoGranted: js.UndefOr[Boolean] = js.undefined
  /**
    *  The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true. This is 1 by default. 
    */
  var AutoGrantedValue: js.UndefOr[Integer] = js.undefined
  /**
    *  The date and time the Qualification type was created. 
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    *  A long description for the Qualification type. 
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    *  Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk web site, such as by taking a Qualification test. This value is False for Qualifications assigned automatically by the system. Valid values are True | False. 
    */
  var IsRequestable: js.UndefOr[Boolean] = js.undefined
  /**
    *  One or more words or phrases that describe theQualification type, separated by commas. The Keywords make the type easier to find using a search. 
    */
  var Keywords: js.UndefOr[String] = js.undefined
  /**
    *  The name of the Qualification type. The type name is used to identify the type, and to find the type using a Qualification type search. 
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    *  A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID when you call the CreateQualificationType operation. 
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.undefined
  /**
    *  The status of the Qualification type. A Qualification type's status determines if users can apply to receive a Qualification of this type, and if HITs can be created with requirements based on this type. Valid values are Active | Inactive. 
    */
  var QualificationTypeStatus: js.UndefOr[QualificationTypeStatus] = js.undefined
  /**
    *  The amount of time, in seconds, Workers must wait after taking the Qualification test before they can take it again. Workers can take a Qualification test multiple times if they were not granted the Qualification from a previous attempt, or if the test offers a gradient score and they want a better score. If not specified, retries are disabled and Workers can request a Qualification only once. 
    */
  var RetryDelayInSeconds: js.UndefOr[Long] = js.undefined
  /**
    *  The questions for a Qualification test associated with this Qualification type that a user can take to obtain a Qualification of this type. This parameter must be specified if AnswerKey is present. A Qualification type cannot have both a specified Test parameter and an AutoGranted value of true. 
    */
  var Test: js.UndefOr[String] = js.undefined
  /**
    *  The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the time the Worker requests the Qualification. 
    */
  var TestDurationInSeconds: js.UndefOr[Long] = js.undefined
}

object QualificationType {
  @scala.inline
  def apply(
    AnswerKey: String = null,
    AutoGranted: js.UndefOr[Boolean] = js.undefined,
    AutoGrantedValue: js.UndefOr[Integer] = js.undefined,
    CreationTime: Timestamp = null,
    Description: String = null,
    IsRequestable: js.UndefOr[Boolean] = js.undefined,
    Keywords: String = null,
    Name: String = null,
    QualificationTypeId: EntityId = null,
    QualificationTypeStatus: QualificationTypeStatus = null,
    RetryDelayInSeconds: js.UndefOr[Long] = js.undefined,
    Test: String = null,
    TestDurationInSeconds: js.UndefOr[Long] = js.undefined
  ): QualificationType = {
    val __obj = js.Dynamic.literal()
    if (AnswerKey != null) __obj.updateDynamic("AnswerKey")(AnswerKey)
    if (!js.isUndefined(AutoGranted)) __obj.updateDynamic("AutoGranted")(AutoGranted)
    if (!js.isUndefined(AutoGrantedValue)) __obj.updateDynamic("AutoGrantedValue")(AutoGrantedValue)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(IsRequestable)) __obj.updateDynamic("IsRequestable")(IsRequestable)
    if (Keywords != null) __obj.updateDynamic("Keywords")(Keywords)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (QualificationTypeId != null) __obj.updateDynamic("QualificationTypeId")(QualificationTypeId)
    if (QualificationTypeStatus != null) __obj.updateDynamic("QualificationTypeStatus")(QualificationTypeStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(RetryDelayInSeconds)) __obj.updateDynamic("RetryDelayInSeconds")(RetryDelayInSeconds)
    if (Test != null) __obj.updateDynamic("Test")(Test)
    if (!js.isUndefined(TestDurationInSeconds)) __obj.updateDynamic("TestDurationInSeconds")(TestDurationInSeconds)
    __obj.asInstanceOf[QualificationType]
  }
}

