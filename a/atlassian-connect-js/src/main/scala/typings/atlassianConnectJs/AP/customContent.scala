package typings.atlassianConnectJs.AP

import typings.atlassianConnectJs.atlassianConnectJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Confluence specific JavaScript module which provides functions to interact with the custom content.
  */
object customContent {
  
  @js.native
  trait EditComponent extends StObject {
    
    /**
      * Used inside an event listener for a `confluence.customcontent.cancel` event to do something before the user is redirected and/or
      * to instruct Confluence on whether to redirect the user to the content page view after the user clicked the "Close" button.
      * If no redirect is desired, an error message can also be shown.
      * @param doRedirect Whether to redirect the user to the content view. If false, an error can be shown.
      * @param error The error to display if no redirect is desired
      * @see InterceptableEvent
      */
    def cancelCallback(doRedirect: Boolean): Unit = js.native
    def cancelCallback(doRedirect: Boolean, error: String): Unit = js.native
    
    /**
      * See docs on InterceptableEvent type
      * @param event Event to intercept
      * @see InterceptableEvent
      */
    def intercept(event: InterceptableEvent): Unit = js.native
    
    /**
      * Used inside an event listener for a `confluence.customcontent.submit` event to submit the content of the macro.
      * @param contentBody can be either content body string, a complete content object or false (cancels submit action)
      * @see InterceptableEvent
      */
    def submitCallback(contentBody: String): Unit = js.native
    def submitCallback(contentBody: js.Object): Unit = js.native
    @JSName("submitCallback")
    def submitCallback_false(contentBody: `false`): Unit = js.native
    
    /**
      * Used inside an event listener for a `confluence.customcontent.submitError` event to do something before the error is being shown and/or
      * prevent Confluence from showing the default error message and optionally providing a custom one.
      * @param preventDefaultErrorMessage Whether to show the default error message. If false, a custom error can be shown
      * @param customError The error to show instead of the default Confluence one
      * @see InterceptableEvent
      */
    def submitErrorCallback(preventDefaultErrorMessage: Boolean): Unit = js.native
    def submitErrorCallback(preventDefaultErrorMessage: Boolean, customError: String): Unit = js.native
    
    /**
      * Used inside an event listener for a `confluence.customcontent.submitSuccess` event to do something before the user is redirected and/or
      * to instruct Confluence on whether to redirect the user to the content page view after the content was saved successfully.
      * If no redirect is desired, an error message can also be shown.
      * @param doRedirect Whether to redirect the user to the content view. If false, an error can be shown.
      * @param error The error to display if no redirect is desired
      * @see InterceptableEvent
      */
    def submitSuccessCallback(doRedirect: Boolean): Unit = js.native
    def submitSuccessCallback(doRedirect: Boolean, error: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotsubmit
    - typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotsubmitSuccess
    - typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotsubmitError
    - typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotcancel
  */
  trait InterceptableEvent extends StObject
  object InterceptableEvent {
    
    inline def confluenceDotcustomcontentDotcancel: typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotcancel = "confluence.customcontent.cancel".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotcancel]
    
    inline def confluenceDotcustomcontentDotsubmit: typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotsubmit = "confluence.customcontent.submit".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotsubmit]
    
    inline def confluenceDotcustomcontentDotsubmitError: typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotsubmitError = "confluence.customcontent.submitError".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotsubmitError]
    
    inline def confluenceDotcustomcontentDotsubmitSuccess: typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotsubmitSuccess = "confluence.customcontent.submitSuccess".asInstanceOf[typings.atlassianConnectJs.atlassianConnectJsStrings.confluenceDotcustomcontentDotsubmitSuccess]
  }
}
