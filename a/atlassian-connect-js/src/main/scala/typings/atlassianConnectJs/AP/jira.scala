package typings.atlassianConnectJs.AP

import typings.atlassianConnectJs.anon.Left
import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JavaScript module which provides functions to interact with Jira.
  */
object jira {
  
  @js.native
  trait DatePickerOptions extends StObject {
    
    /**
      * Date (and time) that should be pre-selected when displaying the picker in the format understandable by Date.parse method in JavaScript.
      *
      * ISO 8601 is preferred. Timezone should be set to Z for UTC time or in the format of +/-hh:mm. Not setting it will cause JavaScript to use local timezone set in the browser.
      * Defaults to current date/time.
      */
    var date: String = js.native
    
    /**
      * HTML element below which date picker will be positioned. If provided, it takes precedence over `options.position`.
      */
    var element: HTMLElement = js.native
    
    /**
      * Callback that will be invoked when the date (and time) is selected by the user.
      */
    def onSelect(isoDate: String, date: Date): Unit = js.native
    
    /**
      * Position of the element relative to the iframe. options.element takes precedence over it when provided.
      */
    var position: Left = js.native
    
    /**
      * Flag determining whether the component should also have a time picker. Defaults to `false`.
      */
    var showTime: Boolean = js.native
  }
  object DatePickerOptions {
    
    @scala.inline
    def apply(
      date: String,
      element: HTMLElement,
      onSelect: (String, Date) => Unit,
      position: Left,
      showTime: Boolean
    ): DatePickerOptions = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2(onSelect), position = position.asInstanceOf[js.Any], showTime = showTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerOptions]
    }
    
    @scala.inline
    implicit class DatePickerOptionsMutableBuilder[Self <: DatePickerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSelect(value: (String, Date) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPosition(value: Left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WorkflowConfiguration extends StObject {
    
    /**
      * Attach a callback function to run when a workflow is saved
      * @param listener called on save.
      */
    def onSave(listener: js.Function1[/* listener */ js.Object, Unit]): Unit = js.native
    
    /**
      * Validate a workflow configuration before saving
      * @param listener called on validation. Return false to indicate that validation has not passed and the workflow cannot be saved.
      */
    def onSaveValidation(listener: js.Function1[/* listener */ js.Object, Unit]): Unit = js.native
    
    /**
      * Save a workflow configuration if valid.
      */
    def trigger(): WorkflowConfigurationTriggerResponse = js.native
  }
  object WorkflowConfiguration {
    
    @scala.inline
    def apply(
      onSave: js.Function1[/* listener */ js.Object, Unit] => Unit,
      onSaveValidation: js.Function1[/* listener */ js.Object, Unit] => Unit,
      trigger: () => WorkflowConfigurationTriggerResponse
    ): WorkflowConfiguration = {
      val __obj = js.Dynamic.literal(onSave = js.Any.fromFunction1(onSave), onSaveValidation = js.Any.fromFunction1(onSaveValidation), trigger = js.Any.fromFunction0(trigger))
      __obj.asInstanceOf[WorkflowConfiguration]
    }
    
    @scala.inline
    implicit class WorkflowConfigurationMutableBuilder[Self <: WorkflowConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnSave(value: js.Function1[/* listener */ js.Object, Unit] => Unit): Self = StObject.set(x, "onSave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSaveValidation(value: js.Function1[/* listener */ js.Object, Unit] => Unit): Self = StObject.set(x, "onSaveValidation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrigger(value: () => WorkflowConfigurationTriggerResponse): Self = StObject.set(x, "trigger", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait WorkflowConfigurationTriggerResponse extends StObject {
    
    /**
      * The result of the validation listener [WorkflowConfiguration.onSaveValidation]{@link WorkflowConfiguration.onSaveValidation}.
      */
    var valid: js.Any = js.native
    
    /**
      * The result of the [WorkflowConfiguration.onSave]{@link WorkflowConfiguration.onSave}.
      */
    var value: js.Any = js.native
  }
  object WorkflowConfigurationTriggerResponse {
    
    @scala.inline
    def apply(valid: js.Any, value: js.Any): WorkflowConfigurationTriggerResponse = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkflowConfigurationTriggerResponse]
    }
    
    @scala.inline
    implicit class WorkflowConfigurationTriggerResponseMutableBuilder[Self <: WorkflowConfigurationTriggerResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValid(value: js.Any): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
