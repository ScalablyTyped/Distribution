package typings.atlassianConnectJs

import typings.atlassianConnectJs.AP.dialog.Dialog
import typings.atlassianConnectJs.AP.dialog.DialogButton
import typings.atlassianConnectJs.AP.dialog.DialogOptions
import typings.atlassianConnectJs.AP.flag.Flag
import typings.atlassianConnectJs.AP.jira.WorkflowConfiguration
import typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence
import typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira
import typings.atlassianConnectJs.anon.AtlassianAccountId
import typings.atlassianConnectJs.anon.Body
import typings.atlassianConnectJs.anon.Fields
import typings.atlassianConnectJs.anon.FullName
import typings.atlassianConnectJs.anon.Jql
import typings.atlassianConnectJs.anon.PartialDatePickerOptions
import typings.atlassianConnectJs.anon.PartialNavigatorContext
import typings.atlassianConnectJs.anon.PartialRequestOptions
import typings.atlassianConnectJs.anon.Partialjqlstringheaderstr
import typings.atlassianConnectJs.anon.Partialtitlestringbodystr
import typings.atlassianConnectJs.anon.urlstringPartialRequestOp
import typings.atlassianConnectJs.atlassianConnectJsStrings.cancel
import typings.atlassianConnectJs.atlassianConnectJsStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object AP extends js.Object {
    
    /**
      * allows for dynamic rejection of ajax requests before they can be invoked. eg: by checking against a whitelist
      */
    def addRequestMarshal(): Unit = js.native
    
    def defineGlobal(module: js.Object): Unit = js.native
    
    def defineModule(name: String, module: js.Object): Unit = js.native
    
    /**
      * Get the location of the current page of the host product.
      * @param callback
      */
    def getLocation(callback: js.Function1[/* location */ String, Unit]): Unit = js.native
    
    /**
      * Hide footer..
      * @param hideFooter true if the footer is supposed to be hidden
      */
    def hideFooter(hideFooter: Boolean): Unit = js.native
    
    def request(options: urlstringPartialRequestOp): js.Promise[Body] = js.native
    /**
      * Execute an XMLHttpRequest as a Promise, or via callbacks, in the context of the host application. The format of the response (dataType) will always be set to "text" - even if specified.
      * @param url Either the URI to request or an options object (as below) containing at least a 'url' property; This value should be relative to the context path of the host application.
      * @param options The options of the request.
      */
    def request(url: String): js.Promise[Body] = js.native
    def request(url: String, options: PartialRequestOptions): js.Promise[Body] = js.native
    
    /**
      * Resize the iframe to a specified width and height.
      *
      * Only content within an element with the class `ac-content` will be resized automatically.
      * Content without this identifier is sized according to the `body` element, and will dynamically grow, but not shrink.
      *
      * Note that this method cannot be used in dialogs.
      * @param width the desired width
      * @param height the desired height
      */
    def resize(width: String, height: String): Unit = js.native
    
    /**
      * Resize the iframe, so that it takes the entire page. Add-on may define to hide the footer using data-options.
      *
      * Note that this method is only available for general page modules.
      * @param hideFooter true if the footer is supposed to be hidden
      */
    def sizeToParent(hideFooter: Boolean): Unit = js.native
    
    /**
      * A JavaScript module which provides functions for the current product context.
      */
    @js.native
    object context extends js.Object {
      
      /**
        * Retrieves the current user context containing details such as space key, issue id, etc.
        * @param callback the callback that handles the response
        */
      def getContext(callback: js.Function1[/* context */ js.Any, Unit]): Unit = js.native
      
      /**
        * Retrieves the current user context as a JWT token containing details such as space key, issue id, etc. Throws an error if add-on does not support JWT authentication
        * @param callback the callback that handles the response
        */
      def getToken(callback: js.Function1[/* token */ String, Unit]): Unit = js.native
    }
    
    /**
      * Allows add-ons to store, retrieve and erase cookies against the host Jira / Confluence. These cannot be seen by other add-ons.
      */
    @js.native
    object cookie extends js.Object {
      
      /**
        * Remove the given cookie.
        * @param name the name of the cookie to remove
        */
      def erase(name: String): Unit = js.native
      
      /**
        * Get the value of a cookie.
        * @param name name of cookie to read
        * @param callback callback to pass cookie data
        */
      def read(name: String, callback: js.Function1[/* value */ String, Unit]): Unit = js.native
      
      /**
        * Save a cookie.
        * @param name name of cookie
        * @param value value of cookie
        * @param expires number of days before cookie expires
        */
      def save(name: String, value: String, expires: Double): Unit = js.native
    }
    
    /**
      * The Dialog module provides a mechanism for launching an add-on's modules as modal dialogs from within an add-on's iframe.
      * A modal dialog displays information without requiring the user to leave the current page.
      *
      * The dialog is opened over the entire window, rather than within the iframe itself.
      */
    @js.native
    object dialog extends js.Object {
      
      /**
        * Closes the currently open dialog. Optionally pass data to listeners of the `dialog.close` event. This will only close a dialog that has been opened by your add-on.
        * You can register for close events using the `dialog.close` event and the events module.
        * @param data
        */
      def close(): Unit = js.native
      def close(data: js.Object): Unit = js.native
      
      /**
        * Creates a dialog for a common dialog, page or web-item module key.
        * @param options configuration object of dialog options.
        */
      def create(options: DialogOptions): Dialog = js.native
      
      /**
        * Creates a dialog button that can be controlled with javascript
        */
      def createButton(): DialogButton = js.native
      
      /**
        * Stop the dialog from closing when the submit button is clicked
        */
      def disableCloseOnSubmit(): Unit = js.native
      
      /**
        * Returns the button that was requested (either cancel or submit). If the requested button does not exist, an empty Object will be returned instead.
        */
      @JSName("getButton")
      def getButton_cancel(button: cancel): DialogButton | js.Object = js.native
      @JSName("getButton")
      def getButton_submit(button: submit): DialogButton | js.Object = js.native
      
      /**
        * Passes the custom data Object to the specified callback function.
        * @param customData Callback method to be executed with the custom data.
        */
      def getCustomData(callback: js.Function1[/* customData */ js.Object, Unit]): Unit = js.native
      
      /**
        * Queries the value of the 'closeOnEscape' property.
        *
        * If this property is true then the dialog should close if ESC is pressed.
        * @param callback function to receive the 'closeOnEscape' value.
        */
      def isCloseOnEscape(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = js.native
    }
    
    /**
      * The Events module provides a mechanism for emitting and receiving events.
      *
      * A event emitted by `emit` method will only be received by the modules defined in the same add-on.
      * Public events that emitted by `emitPublic` are used for cross add-on communication. They can be received by any add-on modules that are currently presented on the page.
      */
    @js.native
    object events extends js.Object {
      
      /**
        * Emits an event on this bus, firing listeners by name as well as all 'any' listeners.
        *
        * Arguments following the name parameter are captured and passed to listeners.
        * @param name The name of event to emit
        * @param args 0 or more additional data arguments to deliver with the event
        */
      def emit(name: String, args: js.Array[String]): Unit = js.native
      
      /**
        * Emits a public event on this bus, firing listeners by name as well as all 'anyPublic' listeners.
        *
        * The event can be received by any add-on modules that are currently presented on the page.
        *
        * Arguments following the name parameter are captured and passed to listeners.
        * @param name The name of event to emit
        * @param args 0 or more additional data arguments to deliver with the event
        */
      def emitPublic(name: String, args: js.Array[String]): Unit = js.native
      
      /**
        * Removes a particular listener for an event.
        * @param name The event name to unsubscribe the listener from
        * @param listener The listener callback to unsubscribe from the event name
        */
      def off(name: String, listener: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
      
      /**
        * Removes all listeners from an event name, or unsubscribes all event-name-specific listeners if no name if given.
        * @param name  The event name to unsubscribe all listeners from
        */
      def offAll(name: String): Unit = js.native
      
      /**
        * Removes all listeners from a public event name, or unsubscribes all event-name-specific listeners for public events if no name if given.
        * @param name The event name to unsubscribe all listeners from
        */
      def offAllPublic(name: String): Unit = js.native
      
      /**
        * Removes an `any` event listener.
        * @param listener A listener callback to unsubscribe from any event name
        */
      def offAny(listener: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
      
      /**
        * Removes an `anyPublic` event listener.
        * @param listener A listener callback to unsubscribe from any event name
        */
      def offAnyPublic(listener: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
      
      /**
        * Removes a particular listener for a public event.
        * @param name The event name to unsubscribe the listener from
        * @param listener The listener callback to unsubscribe from the event name
        */
      def offPublic(name: String, listener: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
      
      /**
        * Adds a listener for all occurrences of an event of a particular name.
        *
        * Listener arguments include any arguments passed to events.emit, followed by an object describing the complete event information.
        * @param name The event name to subscribe the listener to
        * @param listener A listener callback to subscribe to the event name
        */
      def on(name: String, listener: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
      
      /**
        * Adds a listener for all occurrences of any event, regardless of name.
        *
        * Listener arguments begin with the event name, followed by any arguments passed to `events.emit`, followed by an object describing the complete event information.
        * @param listener A listener callback to subscribe for any event name
        */
      def onAny(listener: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
      
      /**
        * Adds a listener for all occurrences of any event, regardless of name.
        *
        * Listener arguments begin with the event name, followed by any arguments passed to `events.emit`, followed by an object describing the complete event information.
        *
        * Event emitter's information will be passed to the first argument of the filter function. The listener callback will only be called when filter function returns `true`.
        * @param listener A listener callback to subscribe for any event name
        * @param filter A filter function to filter the events. Callback will always be called when a matching event occurs if the filter is unspecified
        */
      def onAnyPublic(
        listener: js.Function1[/* data */ js.Object, Unit],
        filter: js.Function1[/* toCompare */ js.Any, Boolean]
      ): Unit = js.native
      
      /**
        * Adds a listener for all occurrences of a public event of a particular name.
        *
        * Listener arguments include any arguments passed to `events.emitPublic`, followed by an object describing the complete event information.
        *
        * Event emitter's information will be passed to the first argument of the filter function. The listener callback will only be called when filter function returns `true`.
        * @param name The event name to subscribe the listener to
        * @param listener A listener callback to subscribe to the event name
        * @param filter A filter function to filter the events. Callback will always be called when a matching event occurs if the filter is unspecified
        */
      def onPublic(
        name: String,
        listener: js.Function1[/* data */ js.Object, Unit],
        filter: js.Function1[/* toCompare */ js.Any, Boolean]
      ): Unit = js.native
      
      /**
        * Adds a listener for one occurrence of an event of a particular name.
        *
        * Listener arguments include any argument passed to `events.emit`, followed by an object describing the complete event information.
        * @param name The event name to subscribe the listener to
        * @param listener A listener callback to subscribe to the event name
        */
      def once(name: String, listener: js.Function1[/* data */ js.Object, Unit]): Unit = js.native
      
      /**
        * Adds a listener for one occurrence of a public event of a particular name.
        *
        * Listener arguments include any argument passed to `events.emit`, followed by an object describing the complete event information.
        *
        * Event emitter's information will be passed to the first argument of the filter function. The listener callback will only be called when filter function returns `true`.
        * @param name The event name to subscribe the listener to
        * @param listener A listener callback to subscribe to the event name
        * @param filter A filter function to filter the events. Callback will always be called when a matching event occurs if the filter is unspecified
        */
      def oncePublic(
        name: String,
        listener: js.Function1[/* data */ js.Object, Unit],
        filter: js.Function1[/* toCompare */ js.Any, Boolean]
      ): Unit = js.native
    }
    
    /**
      * Flags are the primary method for providing system feedback in the product user interface.
      * Messages include notifications of various kinds: alerts, confirmations, notices, warnings, info and errors.
      */
    @js.native
    object flag extends js.Object {
      
      def create(options: Partialtitlestringbodystr): Flag = js.native
    }
    
    /**
      * The History API allows your add-on to manipulate the current page URL for use in navigation. When using the history module only the page anchor is modified and not the entire window location.
      *
      * Note: This is only enabled for page modules (Admin page, General page, Configure page, User profile page). It cannot be used if the page module is launched as a dialog.
      */
    @js.native
    object history extends js.Object {
      
      /**
        * Goes back one step in the joint session history. Will invoke the popState callback.
        */
      def back(): Unit = js.native
      
      /**
        * Goes back one step in the joint session history. Will invoke the popState callback.
        */
      def forward(): Unit = js.native
      
      /**
        * Retrieves the current state of the history stack and returns the value. The returned value is the same as what was set with the pushState method.
        * @returns The current url anchor
        */
      def getState(): String = js.native
      
      /**
        * Moves the page history back or forward the specified number of steps.
        * A zero delta will reload the current page. If the delta is out of range, does nothing. This call invoke the popState callback.
        * @param delta Number of places to move in the history
        */
      def go(delta: Double): Unit = js.native
      
      /**
        * Updates the location's anchor with the specified value and pushes the given data onto the session history. Does not invoke popState callback.
        * @param newState
        * @param title
        * @param url URL to add to history
        */
      def pushState(newState: js.Object, title: String, url: String): Unit = js.native
      
      /**
        * Updates the current entry in the session history. Updates the location's anchor with the specified value but does not change the session history. Does not invoke popState callback.
        * @param url URL to update current history value with
        */
      def replaceState(url: String): Unit = js.native
    }
    
    /**
      * Hosts are the primary method for Connect apps to interact with the page.
      */
    @js.native
    object host extends js.Object {
      
      /**
        * Gets the selected text on the page.
        * @param callback method to be executed with the selected text.
        */
      def getSelectedText(callback: js.Function1[/* selection */ String, Unit]): Unit = js.native
    }
    
    /**
      * The inline dialog is a wrapper for secondary content/controls to be displayed on user request.
      * Consider this component as displayed in context to the triggering control with the dialog overlaying the page content.
      * An inline dialog should be preferred over a modal dialog when a connection between the action has a clear benefit versus having a lower user focus.
      *
      * Inline dialogs can be shown via a web item target.
      */
    @js.native
    object inlineDialog extends js.Object {
      
      /**
        * Hide the inline dialog that contains the iframe where this method is called from.
        */
      def hide(): Unit = js.native
    }
    
    /**
      * A JavaScript module which provides functions to interact with Jira.
      */
    @js.native
    object jira extends js.Object {
      
      def getWorkflowConfiguration(callback: js.Function1[/* workflowConfiguration */ WorkflowConfiguration, Unit]): Unit = js.native
      
      /**
        * Prepares the JQL Editor dialog in preparation for fast rendering. This method should be called on iframe load if it contains a JQL editor trigger.
        */
      def initJQLEditor(): Unit = js.native
      
      /**
        * Returns whether the current user is permitted to edit the dashboard item
        * @param callback the callback that handles the response
        */
      def isDashboardItemEditable(callback: js.Function1[/* editable */ Boolean, Unit]): Unit = js.native
      
      /**
        * Returns whether the addon is being shown within a native app on iOS, Android or Mac.
        * @param callback the callback that handles the response
        */
      def isNativeApp(callback: js.Function1[/* isNative */ Boolean, Unit]): Unit = js.native
      
      /**
        * Open the quick create issue dialog. The dialog fields may be pre-filled with supplied data. A callback will be invoked when the dialog is closed and will include an array of issues created.
        * @param callback invoked when dialog is closed, takes a single parameter - array of issues created
        * @param params contains data to pre-fill the dialog with
        */
      def openCreateIssueDialog(callback: js.Function1[/* issues */ js.Array[js.Object], Unit], params: Fields): Unit = js.native
      
      /**
        * Shows a date picker component. A callback will be invoked when the date (and time) is selected by the user.
        * @param options Configuration of the date picker.
        */
      def openDatePicker(options: PartialDatePickerOptions): Unit = js.native
      
      /**
        * Refresh an issue page without reloading the browser.
        *
        * This is helpful when your add-on updates information about an issue in the background.
        */
      def refreshIssuePage(): Unit = js.native
      
      /**
        * Set the title of a dashboard item to the given text.
        * @param title the title of the dashboard item. Any HTML is escaped.
        */
      def setDashboardItemTitle(title: String): Unit = js.native
      
      /**
        * Launches a JQL Editor dialog. A callback will be invoked when the JQL is submitted by the user.
        * @param callback invoked when dialog is submitted, includes an object containing the jql
        * @param options contains data to pre-fill the dialog with
        */
      def showJQLEditor(callback: js.Function1[/* obj */ Jql, Unit], options: Partialjqlstringheaderstr): Unit = js.native
    }
    
    /**
      * The Navigator API allows your add-on to change the current page using JavaScript.
      */
    @js.native
    object navigator extends js.Object {
      
      /**
        * Returns the context of the current page within the host application.
        *
        * This method will provide a context object to the passed in callback. This context object will contain information about the page currently open in the host application.
        *
        * The object will contain a target, which can be used when calling the go method, and a context map containing in formation about the opened page.
        *
        * Currently this method supports two contexts in Confluence only:
        *
        * **contentview** - The host application is currently viewing a page, blog post or other content.
        *
        * **contentedit** - the host application is currently editing a page, blog post or other content.
        * @param callback
        */
      def getLocation(callback: js.Function1[/* location */ String, Unit]): Unit = js.native
      
      def go(target: NavigatorTargetConfluence, context: PartialNavigatorContext): Unit = js.native
      /**
        * Navigates the user from the current page to the specified page. This call navigates the host product, not the iframe content.
        *
        * Requires a target location and the corresponding context. Navigating by passing a concrete url is currently unsupported.
        * @param target
        * @param context
        */
      def go(target: NavigatorTargetJira, context: PartialNavigatorContext): Unit = js.native
      
      /**
        * Triggers a reload of the parent page.
        */
      def reload(): Unit = js.native
      
      @js.native
      object NavigatorTargetConfluence extends js.Object {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence with String] = js.native
        
        /* "addonModule" */ val addonModule: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.addonModule with String = js.native
        
        /* "contentedit" */ val contentedit: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.contentedit with String = js.native
        
        /* "contentlist" */ val contentlist: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.contentlist with String = js.native
        
        /* "contentview" */ val contentview: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.contentview with String = js.native
        
        /* "dashboard" */ val dashboard: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.dashboard with String = js.native
        
        /* "site" */ val site: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.site with String = js.native
        
        /* "spacetools" */ val spacetools: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.spacetools with String = js.native
        
        /* "spaceview" */ val spaceview: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.spaceview with String = js.native
        
        /* "userProfile" */ val userProfile: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.userProfile with String = js.native
      }
      
      @js.native
      object NavigatorTargetJira extends js.Object {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira with String] = js.native
        
        /* "addonModule" */ val addonModule: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.addonModule with String = js.native
        
        /* "dashboard" */ val dashboard: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.dashboard with String = js.native
        
        /* "issue" */ val issue: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.issue with String = js.native
        
        /* "projectAdminSummary" */ val projectAdminSummary: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.projectAdminSummary with String = js.native
        
        /* "projectAdminTabPanel" */ val projectAdminTabPanel: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.projectAdminTabPanel with String = js.native
        
        /* "site" */ val site: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.site with String = js.native
        
        /* "userProfile" */ val userProfile: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.userProfile with String = js.native
      }
    }
    
    /**
      * A JavaScript module which provides functions to interact with the user currently in session.
      */
    @js.native
    object user extends js.Object {
      
      /**
        * This method retrieves the current user object containing the user's Atlassian Account ID.
        * @param callback the callback that handles the response. A single parameter is passed to the callback. This parameter is an object comprising an attribute "atlassianAccountId".
        */
      def getCurrentUser(callback: js.Function1[/* user */ AtlassianAccountId, Unit]): Unit = js.native
      
      /**
        * Retrieve the user's locale used by the product.
        *
        * Please be aware that this field is under profile visibility controls and that a user may intend to hide this field from the public.
        * Because this API will provide unrestricted access to the current user's locale you should only use this API to establish context for the user.
        * You should not present the user's locale in a way that can be seen by other users viewing the application.
        * @param callback the callback that handles the response
        */
      def getLocale(callback: js.Function1[/* locale */ String, Unit]): Unit = js.native
      
      /**
        * Retrieve the current user's timezone. If there is no logged in user, the server timezone is returned.
        *
        * Please be aware that this field is under profile visibility controls and that a user may intend to hide this field from the public.
        * Because this API will provide unrestricted access to the current user's timezone you should only use this API to establish context for the user.
        * You should not present the user's timezone in a way that can be seen by other users viewing the application.
        * @param callback the callback that handles the response
        */
      def getTimeZone(callback: js.Function1[/* timezone */ String, Unit]): Unit = js.native
      
      /**
        * Retrieves the current user object containing the user's id and full name
        * @deprecated Please use a new method AP.user.getCurrentUser() which will simply return the Atlassian Account ID.
        * @param callback the callback that handles the response
        */
      def getUser(callback: js.Function1[/* user */ FullName, Unit]): Unit = js.native
    }
  }
}
