package typings.atlaskitFeedbackCollector

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait FeedbackCollectorProps extends StObject {
    
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
    implicit class FeedbackCollectorPropsMutableBuilder[Self <: FeedbackCollectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalFields(value: js.Array[FieldType]): Self = StObject.set(x, "additionalFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalFieldsUndefined: Self = StObject.set(x, "additionalFields", js.undefined)
      
      @scala.inline
      def setAdditionalFieldsVarargs(value: FieldType*): Self = StObject.set(x, "additionalFields", js.Array(value :_*))
      
      @scala.inline
      def setCanBeContactedDefaultValue(value: FieldValueType): Self = StObject.set(x, "canBeContactedDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanBeContactedDefaultValueUndefined: Self = StObject.set(x, "canBeContactedDefaultValue", js.undefined)
      
      @scala.inline
      def setCanBeContactedDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "canBeContactedDefaultValue", js.Array(value :_*))
      
      @scala.inline
      def setCanBeContactedFieldId(value: String): Self = StObject.set(x, "canBeContactedFieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanBeContactedFieldIdUndefined: Self = StObject.set(x, "canBeContactedFieldId", js.undefined)
      
      @scala.inline
      def setCustomerNameDefaultValue(value: FieldValueType): Self = StObject.set(x, "customerNameDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerNameDefaultValueUndefined: Self = StObject.set(x, "customerNameDefaultValue", js.undefined)
      
      @scala.inline
      def setCustomerNameDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "customerNameDefaultValue", js.Array(value :_*))
      
      @scala.inline
      def setCustomerNameFieldId(value: String): Self = StObject.set(x, "customerNameFieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomerNameFieldIdUndefined: Self = StObject.set(x, "customerNameFieldId", js.undefined)
      
      @scala.inline
      def setDescriptionDefaultValue(value: FieldValueType): Self = StObject.set(x, "descriptionDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionDefaultValueUndefined: Self = StObject.set(x, "descriptionDefaultValue", js.undefined)
      
      @scala.inline
      def setDescriptionDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "descriptionDefaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDescriptionFieldId(value: String): Self = StObject.set(x, "descriptionFieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionFieldIdUndefined: Self = StObject.set(x, "descriptionFieldId", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailDefaultValue(value: FieldValueType): Self = StObject.set(x, "emailDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailDefaultValueUndefined: Self = StObject.set(x, "emailDefaultValue", js.undefined)
      
      @scala.inline
      def setEmailDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "emailDefaultValue", js.Array(value :_*))
      
      @scala.inline
      def setEmailFieldId(value: String): Self = StObject.set(x, "emailFieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailFieldIdUndefined: Self = StObject.set(x, "emailFieldId", js.undefined)
      
      @scala.inline
      def setEmbeddableKey(value: String): Self = StObject.set(x, "embeddableKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnrollInResearchDefaultValue(value: FieldValueType): Self = StObject.set(x, "enrollInResearchDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnrollInResearchDefaultValueUndefined: Self = StObject.set(x, "enrollInResearchDefaultValue", js.undefined)
      
      @scala.inline
      def setEnrollInResearchDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "enrollInResearchDefaultValue", js.Array(value :_*))
      
      @scala.inline
      def setEnrollInResearchFieldId(value: String): Self = StObject.set(x, "enrollInResearchFieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnrollInResearchFieldIdUndefined: Self = StObject.set(x, "enrollInResearchFieldId", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: () => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setRequestTypeId(value: String): Self = StObject.set(x, "requestTypeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryDefaultValue(value: FieldValueType): Self = StObject.set(x, "summaryDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryDefaultValueUndefined: Self = StObject.set(x, "summaryDefaultValue", js.undefined)
      
      @scala.inline
      def setSummaryDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "summaryDefaultValue", js.Array(value :_*))
      
      @scala.inline
      def setSummaryFieldId(value: String): Self = StObject.set(x, "summaryFieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryFieldIdUndefined: Self = StObject.set(x, "summaryFieldId", js.undefined)
      
      @scala.inline
      def setSummaryTruncateLength(value: Double): Self = StObject.set(x, "summaryTruncateLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryTruncateLengthUndefined: Self = StObject.set(x, "summaryTruncateLength", js.undefined)
      
      @scala.inline
      def setTimeoutOnSubmit(value: Double): Self = StObject.set(x, "timeoutOnSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutOnSubmitUndefined: Self = StObject.set(x, "timeoutOnSubmit", js.undefined)
      
      @scala.inline
      def setTypeBugDefaultValue(value: FieldValueType): Self = StObject.set(x, "typeBugDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeBugDefaultValueUndefined: Self = StObject.set(x, "typeBugDefaultValue", js.undefined)
      
      @scala.inline
      def setTypeBugDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "typeBugDefaultValue", js.Array(value :_*))
      
      @scala.inline
      def setTypeCommentDefaultValue(value: FieldValueType): Self = StObject.set(x, "typeCommentDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeCommentDefaultValueUndefined: Self = StObject.set(x, "typeCommentDefaultValue", js.undefined)
      
      @scala.inline
      def setTypeCommentDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "typeCommentDefaultValue", js.Array(value :_*))
      
      @scala.inline
      def setTypeEmptyDefaultValue(value: FieldValueType): Self = StObject.set(x, "typeEmptyDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeEmptyDefaultValueUndefined: Self = StObject.set(x, "typeEmptyDefaultValue", js.undefined)
      
      @scala.inline
      def setTypeEmptyDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "typeEmptyDefaultValue", js.Array(value :_*))
      
      @scala.inline
      def setTypeFieldId(value: String): Self = StObject.set(x, "typeFieldId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFieldIdUndefined: Self = StObject.set(x, "typeFieldId", js.undefined)
      
      @scala.inline
      def setTypeQuestionDefaultValue(value: FieldValueType): Self = StObject.set(x, "typeQuestionDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeQuestionDefaultValueUndefined: Self = StObject.set(x, "typeQuestionDefaultValue", js.undefined)
      
      @scala.inline
      def setTypeQuestionDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "typeQuestionDefaultValue", js.Array(value :_*))
      
      @scala.inline
      def setTypeSuggestionDefaultValue(value: FieldValueType): Self = StObject.set(x, "typeSuggestionDefaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeSuggestionDefaultValueUndefined: Self = StObject.set(x, "typeSuggestionDefaultValue", js.undefined)
      
      @scala.inline
      def setTypeSuggestionDefaultValueVarargs(value: js.Object*): Self = StObject.set(x, "typeSuggestionDefaultValue", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FeedbackFlagProps extends StObject {
    
    var isDismissAllowed: js.UndefOr[Boolean] = js.native
    
    var onDismissed: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  }
  object FeedbackFlagProps {
    
    @scala.inline
    def apply(): FeedbackFlagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedbackFlagProps]
    }
    
    @scala.inline
    implicit class FeedbackFlagPropsMutableBuilder[Self <: FeedbackFlagProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDismissAllowed(value: Boolean): Self = StObject.set(x, "isDismissAllowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDismissAllowedUndefined: Self = StObject.set(x, "isDismissAllowed", js.undefined)
      
      @scala.inline
      def setOnDismissed(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onDismissed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissedUndefined: Self = StObject.set(x, "onDismissed", js.undefined)
    }
  }
  
  @js.native
  trait FeedbackFormProps extends StObject {
    
    /** Function that will be called to initiate the exit transition. */
    def onClose(): Unit = js.native
    
    /** Function that will be called immediately after the submit action  */
    def onSubmit(formValues: FormFields): Unit = js.native
  }
  object FeedbackFormProps {
    
    @scala.inline
    def apply(onClose: () => Unit, onSubmit: FormFields => Unit): FeedbackFormProps = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onSubmit = js.Any.fromFunction1(onSubmit))
      __obj.asInstanceOf[FeedbackFormProps]
    }
    
    @scala.inline
    implicit class FeedbackFormPropsMutableBuilder[Self <: FeedbackFormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSubmit(value: FormFields => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FeedbackType extends StObject {
    
    var fields: js.Array[FieldType] = js.native
  }
  object FeedbackType {
    
    @scala.inline
    def apply(fields: js.Array[FieldType]): FeedbackType = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedbackType]
    }
    
    @scala.inline
    implicit class FeedbackTypeMutableBuilder[Self <: FeedbackType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[FieldType]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: FieldType*): Self = StObject.set(x, "fields", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FieldType extends StObject {
    
    var id: String = js.native
    
    var value: FieldValueType = js.native
  }
  object FieldType {
    
    @scala.inline
    def apply(id: String, value: FieldValueType): FieldType = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldType]
    }
    
    @scala.inline
    implicit class FieldTypeMutableBuilder[Self <: FieldType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: FieldValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: js.Object*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type FieldValueType = String | js.Object | js.Array[js.Object]
  
  @js.native
  trait FormFields extends StObject {
    
    var canBeContacted: Boolean = js.native
    
    var description: String = js.native
    
    var enrollInResearchGroup: Boolean = js.native
    
    var `type`: SelectValue = js.native
  }
  object FormFields {
    
    @scala.inline
    def apply(canBeContacted: Boolean, description: String, enrollInResearchGroup: Boolean, `type`: SelectValue): FormFields = {
      val __obj = js.Dynamic.literal(canBeContacted = canBeContacted.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enrollInResearchGroup = enrollInResearchGroup.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormFields]
    }
    
    @scala.inline
    implicit class FormFieldsMutableBuilder[Self <: FormFields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanBeContacted(value: Boolean): Self = StObject.set(x, "canBeContacted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnrollInResearchGroup(value: Boolean): Self = StObject.set(x, "enrollInResearchGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: SelectValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def bug: typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.bug = "bug".asInstanceOf[typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.bug]
    
    @scala.inline
    def comment: typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.comment = "comment".asInstanceOf[typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.comment]
    
    @scala.inline
    def empty: typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.empty = "empty".asInstanceOf[typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.empty]
    
    @scala.inline
    def question: typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.question = "question".asInstanceOf[typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.question]
    
    @scala.inline
    def suggestion: typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.suggestion = "suggestion".asInstanceOf[typings.atlaskitFeedbackCollector.atlaskitFeedbackCollectorStrings.suggestion]
  }
}
