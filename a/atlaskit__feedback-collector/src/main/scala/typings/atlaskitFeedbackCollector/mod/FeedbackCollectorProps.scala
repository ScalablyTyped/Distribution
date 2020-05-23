package typings.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedbackCollectorProps extends js.Object {
  /**  Additional fields to send to the widget service */
  var additionalFields: js.UndefOr[js.Array[FieldType]] = js.undefined
  /**  Override the default value for the "can be contacted" custom field in your widget service */
  var canBeContactedDefaultValue: js.UndefOr[FieldValueType] = js.undefined
  /**  Override the default id for the "can be contacted" custom field in your widget service */
  var canBeContactedFieldId: js.UndefOr[String] = js.undefined
  /**  Override the default value for the "customer name" custom field in your widget service */
  var customerNameDefaultValue: js.UndefOr[FieldValueType] = js.undefined
  /**  Override the default id for the "customer name" custom field in your widget service */
  var customerNameFieldId: js.UndefOr[String] = js.undefined
  /**  Override the default value for the "description" custom field in your widget service */
  var descriptionDefaultValue: js.UndefOr[FieldValueType] = js.undefined
  /**  Override the default id for the "description" custom field in your widget service */
  var descriptionFieldId: js.UndefOr[String] = js.undefined
  /** The customer email */
  var email: String
  /**  Override the default value for the "email" custom field in your widget service */
  var emailDefaultValue: js.UndefOr[FieldValueType] = js.undefined
  /**  Override the default id for the "email" custom field in your widget service */
  var emailFieldId: js.UndefOr[String] = js.undefined
  /** The embeddable key to access the widget service */
  var embeddableKey: String
  /**  Override the default value for the "enroll in research" custom field in your widget service */
  var enrollInResearchDefaultValue: js.UndefOr[FieldValueType] = js.undefined
  /**  Override the default id for the "enroll in research" custom field in your widget service */
  var enrollInResearchFieldId: js.UndefOr[String] = js.undefined
  /** The customer name */
  var name: String
  /** Function that will be called to initiate the exit transition. */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Function that will be called optimistically after a delay when the feedback is submitted. */
  var onSubmit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** The request id to access the widget service */
  var requestTypeId: String
  /**  Override the default value for the "summary" custom field in your widget service */
  var summaryDefaultValue: js.UndefOr[FieldValueType] = js.undefined
  /**  Override the default id for the "summary" custom field in your widget service */
  var summaryFieldId: js.UndefOr[String] = js.undefined
  /**  Number of characters that the "summary" field accepts, the rest will be truncated */
  var summaryTruncateLength: js.UndefOr[Double] = js.undefined
  /** After this delay the onSubmit callback will be triggered optimistically */
  var timeoutOnSubmit: js.UndefOr[Double] = js.undefined
  /**  Override the default value for the "Bug" type of response in your widget service */
  var typeBugDefaultValue: js.UndefOr[FieldValueType] = js.undefined
  /**  Override the default value for the "Comment" type of response in your widget service */
  var typeCommentDefaultValue: js.UndefOr[FieldValueType] = js.undefined
  /**  Override the default value for the "Empty" type of response in your widget service */
  var typeEmptyDefaultValue: js.UndefOr[FieldValueType] = js.undefined
  /**  Override the default id for the "type" custom field in your widget service */
  var typeFieldId: js.UndefOr[String] = js.undefined
  /**  Override the default value for the "Question" type of response in your widget service */
  var typeQuestionDefaultValue: js.UndefOr[FieldValueType] = js.undefined
  /**  Override the default value for the "Suggestion" type of response in your widget service */
  var typeSuggestionDefaultValue: js.UndefOr[FieldValueType] = js.undefined
}

object FeedbackCollectorProps {
  @scala.inline
  def apply(
    email: String,
    embeddableKey: String,
    name: String,
    requestTypeId: String,
    additionalFields: js.Array[FieldType] = null,
    canBeContactedDefaultValue: FieldValueType = null,
    canBeContactedFieldId: String = null,
    customerNameDefaultValue: FieldValueType = null,
    customerNameFieldId: String = null,
    descriptionDefaultValue: FieldValueType = null,
    descriptionFieldId: String = null,
    emailDefaultValue: FieldValueType = null,
    emailFieldId: String = null,
    enrollInResearchDefaultValue: FieldValueType = null,
    enrollInResearchFieldId: String = null,
    onClose: () => Unit = null,
    onSubmit: () => Unit = null,
    summaryDefaultValue: FieldValueType = null,
    summaryFieldId: String = null,
    summaryTruncateLength: js.UndefOr[Double] = js.undefined,
    timeoutOnSubmit: js.UndefOr[Double] = js.undefined,
    typeBugDefaultValue: FieldValueType = null,
    typeCommentDefaultValue: FieldValueType = null,
    typeEmptyDefaultValue: FieldValueType = null,
    typeFieldId: String = null,
    typeQuestionDefaultValue: FieldValueType = null,
    typeSuggestionDefaultValue: FieldValueType = null
  ): FeedbackCollectorProps = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], embeddableKey = embeddableKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestTypeId = requestTypeId.asInstanceOf[js.Any])
    if (additionalFields != null) __obj.updateDynamic("additionalFields")(additionalFields.asInstanceOf[js.Any])
    if (canBeContactedDefaultValue != null) __obj.updateDynamic("canBeContactedDefaultValue")(canBeContactedDefaultValue.asInstanceOf[js.Any])
    if (canBeContactedFieldId != null) __obj.updateDynamic("canBeContactedFieldId")(canBeContactedFieldId.asInstanceOf[js.Any])
    if (customerNameDefaultValue != null) __obj.updateDynamic("customerNameDefaultValue")(customerNameDefaultValue.asInstanceOf[js.Any])
    if (customerNameFieldId != null) __obj.updateDynamic("customerNameFieldId")(customerNameFieldId.asInstanceOf[js.Any])
    if (descriptionDefaultValue != null) __obj.updateDynamic("descriptionDefaultValue")(descriptionDefaultValue.asInstanceOf[js.Any])
    if (descriptionFieldId != null) __obj.updateDynamic("descriptionFieldId")(descriptionFieldId.asInstanceOf[js.Any])
    if (emailDefaultValue != null) __obj.updateDynamic("emailDefaultValue")(emailDefaultValue.asInstanceOf[js.Any])
    if (emailFieldId != null) __obj.updateDynamic("emailFieldId")(emailFieldId.asInstanceOf[js.Any])
    if (enrollInResearchDefaultValue != null) __obj.updateDynamic("enrollInResearchDefaultValue")(enrollInResearchDefaultValue.asInstanceOf[js.Any])
    if (enrollInResearchFieldId != null) __obj.updateDynamic("enrollInResearchFieldId")(enrollInResearchFieldId.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction0(onSubmit))
    if (summaryDefaultValue != null) __obj.updateDynamic("summaryDefaultValue")(summaryDefaultValue.asInstanceOf[js.Any])
    if (summaryFieldId != null) __obj.updateDynamic("summaryFieldId")(summaryFieldId.asInstanceOf[js.Any])
    if (!js.isUndefined(summaryTruncateLength)) __obj.updateDynamic("summaryTruncateLength")(summaryTruncateLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutOnSubmit)) __obj.updateDynamic("timeoutOnSubmit")(timeoutOnSubmit.get.asInstanceOf[js.Any])
    if (typeBugDefaultValue != null) __obj.updateDynamic("typeBugDefaultValue")(typeBugDefaultValue.asInstanceOf[js.Any])
    if (typeCommentDefaultValue != null) __obj.updateDynamic("typeCommentDefaultValue")(typeCommentDefaultValue.asInstanceOf[js.Any])
    if (typeEmptyDefaultValue != null) __obj.updateDynamic("typeEmptyDefaultValue")(typeEmptyDefaultValue.asInstanceOf[js.Any])
    if (typeFieldId != null) __obj.updateDynamic("typeFieldId")(typeFieldId.asInstanceOf[js.Any])
    if (typeQuestionDefaultValue != null) __obj.updateDynamic("typeQuestionDefaultValue")(typeQuestionDefaultValue.asInstanceOf[js.Any])
    if (typeSuggestionDefaultValue != null) __obj.updateDynamic("typeSuggestionDefaultValue")(typeSuggestionDefaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackCollectorProps]
  }
}

