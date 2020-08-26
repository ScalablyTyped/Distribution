package typings.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedbackCollectorProps extends js.Object {
  /**  Additional fields to send to the widget service */
  var additionalFields: js.UndefOr[js.Array[FieldType]] = js.native
  /**  Override the default value for the "can be contacted" custom field in your widget service */
  var canBeContactedDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "can be contacted" custom field in your widget service */
  var canBeContactedFieldId: js.UndefOr[String] = js.native
  /**  Override the default value for the "customer name" custom field in your widget service */
  var customerNameDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "customer name" custom field in your widget service */
  var customerNameFieldId: js.UndefOr[String] = js.native
  /**  Override the default value for the "description" custom field in your widget service */
  var descriptionDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "description" custom field in your widget service */
  var descriptionFieldId: js.UndefOr[String] = js.native
  /** The customer email */
  var email: String = js.native
  /**  Override the default value for the "email" custom field in your widget service */
  var emailDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "email" custom field in your widget service */
  var emailFieldId: js.UndefOr[String] = js.native
  /** The embeddable key to access the widget service */
  var embeddableKey: String = js.native
  /**  Override the default value for the "enroll in research" custom field in your widget service */
  var enrollInResearchDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "enroll in research" custom field in your widget service */
  var enrollInResearchFieldId: js.UndefOr[String] = js.native
  /** The customer name */
  var name: String = js.native
  /** Function that will be called to initiate the exit transition. */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  /** Function that will be called optimistically after a delay when the feedback is submitted. */
  var onSubmit: js.UndefOr[js.Function0[Unit]] = js.native
  /** The request id to access the widget service */
  var requestTypeId: String = js.native
  /**  Override the default value for the "summary" custom field in your widget service */
  var summaryDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "summary" custom field in your widget service */
  var summaryFieldId: js.UndefOr[String] = js.native
  /**  Number of characters that the "summary" field accepts, the rest will be truncated */
  var summaryTruncateLength: js.UndefOr[Double] = js.native
  /** After this delay the onSubmit callback will be triggered optimistically */
  var timeoutOnSubmit: js.UndefOr[Double] = js.native
  /**  Override the default value for the "Bug" type of response in your widget service */
  var typeBugDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default value for the "Comment" type of response in your widget service */
  var typeCommentDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default value for the "Empty" type of response in your widget service */
  var typeEmptyDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default id for the "type" custom field in your widget service */
  var typeFieldId: js.UndefOr[String] = js.native
  /**  Override the default value for the "Question" type of response in your widget service */
  var typeQuestionDefaultValue: js.UndefOr[FieldValueType] = js.native
  /**  Override the default value for the "Suggestion" type of response in your widget service */
  var typeSuggestionDefaultValue: js.UndefOr[FieldValueType] = js.native
}

object FeedbackCollectorProps {
  @scala.inline
  def apply(email: String, embeddableKey: String, name: String, requestTypeId: String): FeedbackCollectorProps = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], embeddableKey = embeddableKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestTypeId = requestTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackCollectorProps]
  }
  @scala.inline
  implicit class FeedbackCollectorPropsOps[Self <: FeedbackCollectorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbeddableKey(value: String): Self = this.set("embeddableKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestTypeId(value: String): Self = this.set("requestTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalFieldsVarargs(value: FieldType*): Self = this.set("additionalFields", js.Array(value :_*))
    @scala.inline
    def setAdditionalFields(value: js.Array[FieldType]): Self = this.set("additionalFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalFields: Self = this.set("additionalFields", js.undefined)
    @scala.inline
    def setCanBeContactedDefaultValueVarargs(value: js.Object*): Self = this.set("canBeContactedDefaultValue", js.Array(value :_*))
    @scala.inline
    def setCanBeContactedDefaultValue(value: FieldValueType): Self = this.set("canBeContactedDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanBeContactedDefaultValue: Self = this.set("canBeContactedDefaultValue", js.undefined)
    @scala.inline
    def setCanBeContactedFieldId(value: String): Self = this.set("canBeContactedFieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanBeContactedFieldId: Self = this.set("canBeContactedFieldId", js.undefined)
    @scala.inline
    def setCustomerNameDefaultValueVarargs(value: js.Object*): Self = this.set("customerNameDefaultValue", js.Array(value :_*))
    @scala.inline
    def setCustomerNameDefaultValue(value: FieldValueType): Self = this.set("customerNameDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerNameDefaultValue: Self = this.set("customerNameDefaultValue", js.undefined)
    @scala.inline
    def setCustomerNameFieldId(value: String): Self = this.set("customerNameFieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerNameFieldId: Self = this.set("customerNameFieldId", js.undefined)
    @scala.inline
    def setDescriptionDefaultValueVarargs(value: js.Object*): Self = this.set("descriptionDefaultValue", js.Array(value :_*))
    @scala.inline
    def setDescriptionDefaultValue(value: FieldValueType): Self = this.set("descriptionDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionDefaultValue: Self = this.set("descriptionDefaultValue", js.undefined)
    @scala.inline
    def setDescriptionFieldId(value: String): Self = this.set("descriptionFieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionFieldId: Self = this.set("descriptionFieldId", js.undefined)
    @scala.inline
    def setEmailDefaultValueVarargs(value: js.Object*): Self = this.set("emailDefaultValue", js.Array(value :_*))
    @scala.inline
    def setEmailDefaultValue(value: FieldValueType): Self = this.set("emailDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailDefaultValue: Self = this.set("emailDefaultValue", js.undefined)
    @scala.inline
    def setEmailFieldId(value: String): Self = this.set("emailFieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailFieldId: Self = this.set("emailFieldId", js.undefined)
    @scala.inline
    def setEnrollInResearchDefaultValueVarargs(value: js.Object*): Self = this.set("enrollInResearchDefaultValue", js.Array(value :_*))
    @scala.inline
    def setEnrollInResearchDefaultValue(value: FieldValueType): Self = this.set("enrollInResearchDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrollInResearchDefaultValue: Self = this.set("enrollInResearchDefaultValue", js.undefined)
    @scala.inline
    def setEnrollInResearchFieldId(value: String): Self = this.set("enrollInResearchFieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrollInResearchFieldId: Self = this.set("enrollInResearchFieldId", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnSubmit(value: () => Unit): Self = this.set("onSubmit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setSummaryDefaultValueVarargs(value: js.Object*): Self = this.set("summaryDefaultValue", js.Array(value :_*))
    @scala.inline
    def setSummaryDefaultValue(value: FieldValueType): Self = this.set("summaryDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryDefaultValue: Self = this.set("summaryDefaultValue", js.undefined)
    @scala.inline
    def setSummaryFieldId(value: String): Self = this.set("summaryFieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryFieldId: Self = this.set("summaryFieldId", js.undefined)
    @scala.inline
    def setSummaryTruncateLength(value: Double): Self = this.set("summaryTruncateLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryTruncateLength: Self = this.set("summaryTruncateLength", js.undefined)
    @scala.inline
    def setTimeoutOnSubmit(value: Double): Self = this.set("timeoutOnSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutOnSubmit: Self = this.set("timeoutOnSubmit", js.undefined)
    @scala.inline
    def setTypeBugDefaultValueVarargs(value: js.Object*): Self = this.set("typeBugDefaultValue", js.Array(value :_*))
    @scala.inline
    def setTypeBugDefaultValue(value: FieldValueType): Self = this.set("typeBugDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeBugDefaultValue: Self = this.set("typeBugDefaultValue", js.undefined)
    @scala.inline
    def setTypeCommentDefaultValueVarargs(value: js.Object*): Self = this.set("typeCommentDefaultValue", js.Array(value :_*))
    @scala.inline
    def setTypeCommentDefaultValue(value: FieldValueType): Self = this.set("typeCommentDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeCommentDefaultValue: Self = this.set("typeCommentDefaultValue", js.undefined)
    @scala.inline
    def setTypeEmptyDefaultValueVarargs(value: js.Object*): Self = this.set("typeEmptyDefaultValue", js.Array(value :_*))
    @scala.inline
    def setTypeEmptyDefaultValue(value: FieldValueType): Self = this.set("typeEmptyDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeEmptyDefaultValue: Self = this.set("typeEmptyDefaultValue", js.undefined)
    @scala.inline
    def setTypeFieldId(value: String): Self = this.set("typeFieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeFieldId: Self = this.set("typeFieldId", js.undefined)
    @scala.inline
    def setTypeQuestionDefaultValueVarargs(value: js.Object*): Self = this.set("typeQuestionDefaultValue", js.Array(value :_*))
    @scala.inline
    def setTypeQuestionDefaultValue(value: FieldValueType): Self = this.set("typeQuestionDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeQuestionDefaultValue: Self = this.set("typeQuestionDefaultValue", js.undefined)
    @scala.inline
    def setTypeSuggestionDefaultValueVarargs(value: js.Object*): Self = this.set("typeSuggestionDefaultValue", js.Array(value :_*))
    @scala.inline
    def setTypeSuggestionDefaultValue(value: FieldValueType): Self = this.set("typeSuggestionDefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeSuggestionDefaultValue: Self = this.set("typeSuggestionDefaultValue", js.undefined)
  }
  
}

