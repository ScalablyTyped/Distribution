package typings.atlaskitFeedbackCollector

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/feedback-collector", JSImport.Default)
  @js.native
  class default ()
    extends Component[FeedbackCollectorProps, js.Object, js.Any]
  
  @JSImport("@atlaskit/feedback-collector", "FeedbackFlag")
  @js.native
  class FeedbackFlag protected ()
    extends Component[FeedbackFlagProps, js.Object, js.Any] {
    def this(props: FeedbackFlagProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FeedbackFlagProps, context: js.Any) = this()
  }
  
  @JSImport("@atlaskit/feedback-collector", "FeedbackForm")
  @js.native
  class FeedbackForm protected ()
    extends Component[FeedbackFormProps, FormFields, js.Any] {
    def this(props: FeedbackFormProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FeedbackFormProps, context: js.Any) = this()
  }
  
  type FeedbackCollector = Component[FeedbackCollectorProps, js.Object, js.Any]
  
  trait FeedbackCollectorProps extends StObject {
    
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
    
    inline def apply(email: String, embeddableKey: String, name: String, requestTypeId: String): FeedbackCollectorProps = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], embeddableKey = embeddableKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requestTypeId = requestTypeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackCollectorProps]
    }
    
    extension [Self <: FeedbackCollectorProps](x: Self) {
      
      inline def setAdditionalFields(value: js.Array[FieldType]): Self = StObject.set(x, "additionalFields", value.asInstanceOf[js.Any])
      
      inline def setAdditionalFieldsUndefined: Self = StObject.set(x, "additionalFields", js.undefined)
      
      inline def setAdditionalFieldsVarargs(value: FieldType*): Self = StObject.set(x, "additionalFields", js.Array(value :_*))
      
      inline def setCanBeContactedDefaultValue(value: FieldValueType): Self = StObject.set(x, "canBeContactedDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setCanBeContactedDefaultValueUndefined: Self = StObject.set(x, "canBeContactedDefaultValue", js.undefined)
      
      inline def setCanBeContactedDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "canBeContactedDefaultValue", js.Array(value :_*))
      
      inline def setCanBeContactedFieldId(value: String): Self = StObject.set(x, "canBeContactedFieldId", value.asInstanceOf[js.Any])
      
      inline def setCanBeContactedFieldIdUndefined: Self = StObject.set(x, "canBeContactedFieldId", js.undefined)
      
      inline def setCustomerNameDefaultValue(value: FieldValueType): Self = StObject.set(x, "customerNameDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setCustomerNameDefaultValueUndefined: Self = StObject.set(x, "customerNameDefaultValue", js.undefined)
      
      inline def setCustomerNameDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "customerNameDefaultValue", js.Array(value :_*))
      
      inline def setCustomerNameFieldId(value: String): Self = StObject.set(x, "customerNameFieldId", value.asInstanceOf[js.Any])
      
      inline def setCustomerNameFieldIdUndefined: Self = StObject.set(x, "customerNameFieldId", js.undefined)
      
      inline def setDescriptionDefaultValue(value: FieldValueType): Self = StObject.set(x, "descriptionDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setDescriptionDefaultValueUndefined: Self = StObject.set(x, "descriptionDefaultValue", js.undefined)
      
      inline def setDescriptionDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "descriptionDefaultValue", js.Array(value :_*))
      
      inline def setDescriptionFieldId(value: String): Self = StObject.set(x, "descriptionFieldId", value.asInstanceOf[js.Any])
      
      inline def setDescriptionFieldIdUndefined: Self = StObject.set(x, "descriptionFieldId", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailDefaultValue(value: FieldValueType): Self = StObject.set(x, "emailDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setEmailDefaultValueUndefined: Self = StObject.set(x, "emailDefaultValue", js.undefined)
      
      inline def setEmailDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "emailDefaultValue", js.Array(value :_*))
      
      inline def setEmailFieldId(value: String): Self = StObject.set(x, "emailFieldId", value.asInstanceOf[js.Any])
      
      inline def setEmailFieldIdUndefined: Self = StObject.set(x, "emailFieldId", js.undefined)
      
      inline def setEmbeddableKey(value: String): Self = StObject.set(x, "embeddableKey", value.asInstanceOf[js.Any])
      
      inline def setEnrollInResearchDefaultValue(value: FieldValueType): Self = StObject.set(x, "enrollInResearchDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setEnrollInResearchDefaultValueUndefined: Self = StObject.set(x, "enrollInResearchDefaultValue", js.undefined)
      
      inline def setEnrollInResearchDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "enrollInResearchDefaultValue", js.Array(value :_*))
      
      inline def setEnrollInResearchFieldId(value: String): Self = StObject.set(x, "enrollInResearchFieldId", value.asInstanceOf[js.Any])
      
      inline def setEnrollInResearchFieldIdUndefined: Self = StObject.set(x, "enrollInResearchFieldId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnSubmit(value: () => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction0(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setRequestTypeId(value: String): Self = StObject.set(x, "requestTypeId", value.asInstanceOf[js.Any])
      
      inline def setSummaryDefaultValue(value: FieldValueType): Self = StObject.set(x, "summaryDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setSummaryDefaultValueUndefined: Self = StObject.set(x, "summaryDefaultValue", js.undefined)
      
      inline def setSummaryDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "summaryDefaultValue", js.Array(value :_*))
      
      inline def setSummaryFieldId(value: String): Self = StObject.set(x, "summaryFieldId", value.asInstanceOf[js.Any])
      
      inline def setSummaryFieldIdUndefined: Self = StObject.set(x, "summaryFieldId", js.undefined)
      
      inline def setSummaryTruncateLength(value: Double): Self = StObject.set(x, "summaryTruncateLength", value.asInstanceOf[js.Any])
      
      inline def setSummaryTruncateLengthUndefined: Self = StObject.set(x, "summaryTruncateLength", js.undefined)
      
      inline def setTimeoutOnSubmit(value: Double): Self = StObject.set(x, "timeoutOnSubmit", value.asInstanceOf[js.Any])
      
      inline def setTimeoutOnSubmitUndefined: Self = StObject.set(x, "timeoutOnSubmit", js.undefined)
      
      inline def setTypeBugDefaultValue(value: FieldValueType): Self = StObject.set(x, "typeBugDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setTypeBugDefaultValueUndefined: Self = StObject.set(x, "typeBugDefaultValue", js.undefined)
      
      inline def setTypeBugDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "typeBugDefaultValue", js.Array(value :_*))
      
      inline def setTypeCommentDefaultValue(value: FieldValueType): Self = StObject.set(x, "typeCommentDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setTypeCommentDefaultValueUndefined: Self = StObject.set(x, "typeCommentDefaultValue", js.undefined)
      
      inline def setTypeCommentDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "typeCommentDefaultValue", js.Array(value :_*))
      
      inline def setTypeEmptyDefaultValue(value: FieldValueType): Self = StObject.set(x, "typeEmptyDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setTypeEmptyDefaultValueUndefined: Self = StObject.set(x, "typeEmptyDefaultValue", js.undefined)
      
      inline def setTypeEmptyDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "typeEmptyDefaultValue", js.Array(value :_*))
      
      inline def setTypeFieldId(value: String): Self = StObject.set(x, "typeFieldId", value.asInstanceOf[js.Any])
      
      inline def setTypeFieldIdUndefined: Self = StObject.set(x, "typeFieldId", js.undefined)
      
      inline def setTypeQuestionDefaultValue(value: FieldValueType): Self = StObject.set(x, "typeQuestionDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setTypeQuestionDefaultValueUndefined: Self = StObject.set(x, "typeQuestionDefaultValue", js.undefined)
      
      inline def setTypeQuestionDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "typeQuestionDefaultValue", js.Array(value :_*))
      
      inline def setTypeSuggestionDefaultValue(value: FieldValueType): Self = StObject.set(x, "typeSuggestionDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setTypeSuggestionDefaultValueUndefined: Self = StObject.set(x, "typeSuggestionDefaultValue", js.undefined)
      
      inline def setTypeSuggestionDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "typeSuggestionDefaultValue", js.Array(value :_*))
    }
  }
  
  trait FeedbackFlagProps extends StObject {
    
    var isDismissAllowed: js.UndefOr[Boolean] = js.undefined
    
    var onDismissed: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
  }
  object FeedbackFlagProps {
    
    inline def apply(): FeedbackFlagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedbackFlagProps]
    }
    
    extension [Self <: FeedbackFlagProps](x: Self) {
      
      inline def setIsDismissAllowed(value: Boolean): Self = StObject.set(x, "isDismissAllowed", value.asInstanceOf[js.Any])
      
      inline def setIsDismissAllowedUndefined: Self = StObject.set(x, "isDismissAllowed", js.undefined)
      
      inline def setOnDismissed(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onDismissed", js.Any.fromFunction1(value))
      
      inline def setOnDismissedUndefined: Self = StObject.set(x, "onDismissed", js.undefined)
    }
  }
  
  trait FeedbackFormProps extends StObject {
    
    /** Function that will be called to initiate the exit transition. */
    def onClose(): Unit
    
    /** Function that will be called immediately after the submit action  */
    def onSubmit(formValues: FormFields): Unit
  }
  object FeedbackFormProps {
    
    inline def apply(onClose: () => Unit, onSubmit: FormFields => Unit): FeedbackFormProps = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onSubmit = js.Any.fromFunction1(onSubmit))
      __obj.asInstanceOf[FeedbackFormProps]
    }
    
    extension [Self <: FeedbackFormProps](x: Self) {
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnSubmit(value: FormFields => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    }
  }
  
  trait FeedbackType extends StObject {
    
    var fields: js.Array[FieldType]
  }
  object FeedbackType {
    
    inline def apply(fields: js.Array[FieldType]): FeedbackType = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackType]
    }
    
    extension [Self <: FeedbackType](x: Self) {
      
      inline def setFields(value: js.Array[FieldType]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: FieldType*): Self = StObject.set(x, "fields", js.Array(value :_*))
    }
  }
  
  trait FieldType extends StObject {
    
    var id: String
    
    var value: FieldValueType
  }
  object FieldType {
    
    inline def apply(id: String, value: FieldValueType): FieldType = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldType]
    }
    
    extension [Self <: FieldType](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setValue(value: FieldValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: js.Object*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type FieldValueType = String | js.Object | js.Array[js.Object]
  
  trait FormFields extends StObject {
    
    var canBeContacted: Boolean
    
    var description: String
    
    var enrollInResearchGroup: Boolean
    
    var `type`: SelectValue
  }
  object FormFields {
    
    inline def apply(canBeContacted: Boolean, description: String, enrollInResearchGroup: Boolean, `type`: SelectValue): FormFields = {
      val __obj = js.Dynamic.literal(canBeContacted = canBeContacted.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enrollInResearchGroup = enrollInResearchGroup.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormFields]
    }
    
    extension [Self <: FormFields](x: Self) {
      
      inline def setCanBeContacted(value: Boolean): Self = StObject.set(x, "canBeContacted", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEnrollInResearchGroup(value: Boolean): Self = StObject.set(x, "enrollInResearchGroup", value.asInstanceOf[js.Any])
      
      inline def setType(value: SelectValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.bug
    - typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.comment
    - typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.suggestion
    - typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.question
    - typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.empty
  */
  trait SelectValue extends StObject
  object SelectValue {
    
    inline def bug: typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.bug = "bug".asInstanceOf[typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.bug]
    
    inline def comment: typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.comment = "comment".asInstanceOf[typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.comment]
    
    inline def empty: typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.empty = "empty".asInstanceOf[typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.empty]
    
    inline def question: typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.question = "question".asInstanceOf[typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.question]
    
    inline def suggestion: typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.suggestion = "suggestion".asInstanceOf[typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.suggestion]
  }
}
