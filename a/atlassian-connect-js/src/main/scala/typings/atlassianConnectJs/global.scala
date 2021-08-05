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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AP {
    
    @JSGlobal("AP")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * allows for dynamic rejection of ajax requests before they can be invoked. eg: by checking against a whitelist
      */
    inline def addRequestMarshal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMarshal")().asInstanceOf[Unit]
    
    /**
      * A JavaScript module which provides functions for the current product context.
      */
    object context {
      
      @JSGlobal("AP.context")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Retrieves the current user context containing details such as space key, issue id, etc.
        * @param callback the callback that handles the response
        */
      inline def getContext(callback: js.Function1[/* context */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Retrieves the current user context as a JWT token containing details such as space key, issue id, etc. Throws an error if add-on does not support JWT authentication
        * @param callback the callback that handles the response
        */
      inline def getToken(callback: js.Function1[/* token */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * Allows add-ons to store, retrieve and erase cookies against the host Jira / Confluence. These cannot be seen by other add-ons.
      */
    object cookie {
      
      @JSGlobal("AP.cookie")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Remove the given cookie.
        * @param name the name of the cookie to remove
        */
      inline def erase(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("erase")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Get the value of a cookie.
        * @param name name of cookie to read
        * @param callback callback to pass cookie data
        */
      inline def read(name: String, callback: js.Function1[/* value */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Save a cookie.
        * @param name name of cookie
        * @param value value of cookie
        * @param expires number of days before cookie expires
        */
      inline def save(name: String, value: String, expires: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], expires.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    inline def defineGlobal(module: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defineGlobal")(module.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def defineModule(name: String, module: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineModule")(name.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * The Dialog module provides a mechanism for launching an add-on's modules as modal dialogs from within an add-on's iframe.
      * A modal dialog displays information without requiring the user to leave the current page.
      *
      * The dialog is opened over the entire window, rather than within the iframe itself.
      */
    object dialog {
      
      @JSGlobal("AP.dialog")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Closes the currently open dialog. Optionally pass data to listeners of the `dialog.close` event. This will only close a dialog that has been opened by your add-on.
        * You can register for close events using the `dialog.close` event and the events module.
        * @param data
        */
      inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
      inline def close(data: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Creates a dialog for a common dialog, page or web-item module key.
        * @param options configuration object of dialog options.
        */
      inline def create(options: DialogOptions): Dialog = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Dialog]
      
      /**
        * Creates a dialog button that can be controlled with javascript
        */
      inline def createButton(): DialogButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createButton")().asInstanceOf[DialogButton]
      
      /**
        * Stop the dialog from closing when the submit button is clicked
        */
      inline def disableCloseOnSubmit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableCloseOnSubmit")().asInstanceOf[Unit]
      
      /**
        * Returns the button that was requested (either cancel or submit). If the requested button does not exist, an empty Object will be returned instead.
        */
      inline def getButton_cancel(button: cancel): DialogButton | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getButton")(button.asInstanceOf[js.Any]).asInstanceOf[DialogButton | js.Object]
      
      inline def getButton_submit(button: submit): DialogButton | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getButton")(button.asInstanceOf[js.Any]).asInstanceOf[DialogButton | js.Object]
      
      /**
        * Passes the custom data Object to the specified callback function.
        * @param customData Callback method to be executed with the custom data.
        */
      inline def getCustomData(callback: js.Function1[/* customData */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomData")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Queries the value of the 'closeOnEscape' property.
        *
        * If this property is true then the dialog should close if ESC is pressed.
        * @param callback function to receive the 'closeOnEscape' value.
        */
      inline def isCloseOnEscape(callback: js.Function1[/* enabled */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloseOnEscape")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * The Events module provides a mechanism for emitting and receiving events.
      *
      * A event emitted by `emit` method will only be received by the modules defined in the same add-on.
      * Public events that emitted by `emitPublic` are used for cross add-on communication. They can be received by any add-on modules that are currently presented on the page.
      */
    object events {
      
      @JSGlobal("AP.events")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Emits an event on this bus, firing listeners by name as well as all 'any' listeners.
        *
        * Arguments following the name parameter are captured and passed to listeners.
        * @param name The name of event to emit
        * @param args 0 or more additional data arguments to deliver with the event
        */
      inline def emit(name: String, args: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Emits a public event on this bus, firing listeners by name as well as all 'anyPublic' listeners.
        *
        * The event can be received by any add-on modules that are currently presented on the page.
        *
        * Arguments following the name parameter are captured and passed to listeners.
        * @param name The name of event to emit
        * @param args 0 or more additional data arguments to deliver with the event
        */
      inline def emitPublic(name: String, args: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitPublic")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Removes a particular listener for an event.
        * @param name The event name to unsubscribe the listener from
        * @param listener The listener callback to unsubscribe from the event name
        */
      inline def off(name: String, listener: js.Function1[/* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(name.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Removes all listeners from an event name, or unsubscribes all event-name-specific listeners if no name if given.
        * @param name  The event name to unsubscribe all listeners from
        */
      inline def offAll(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offAll")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Removes all listeners from a public event name, or unsubscribes all event-name-specific listeners for public events if no name if given.
        * @param name The event name to unsubscribe all listeners from
        */
      inline def offAllPublic(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offAllPublic")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Removes an `any` event listener.
        * @param listener A listener callback to unsubscribe from any event name
        */
      inline def offAny(listener: js.Function1[/* data */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offAny")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Removes an `anyPublic` event listener.
        * @param listener A listener callback to unsubscribe from any event name
        */
      inline def offAnyPublic(listener: js.Function1[/* data */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offAnyPublic")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Removes a particular listener for a public event.
        * @param name The event name to unsubscribe the listener from
        * @param listener The listener callback to unsubscribe from the event name
        */
      inline def offPublic(name: String, listener: js.Function1[/* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offPublic")(name.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Adds a listener for all occurrences of an event of a particular name.
        *
        * Listener arguments include any arguments passed to events.emit, followed by an object describing the complete event information.
        * @param name The event name to subscribe the listener to
        * @param listener A listener callback to subscribe to the event name
        */
      inline def on(name: String, listener: js.Function1[/* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Adds a listener for all occurrences of any event, regardless of name.
        *
        * Listener arguments begin with the event name, followed by any arguments passed to `events.emit`, followed by an object describing the complete event information.
        * @param listener A listener callback to subscribe for any event name
        */
      inline def onAny(listener: js.Function1[/* data */ js.Object, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onAny")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Adds a listener for all occurrences of any event, regardless of name.
        *
        * Listener arguments begin with the event name, followed by any arguments passed to `events.emit`, followed by an object describing the complete event information.
        *
        * Event emitter's information will be passed to the first argument of the filter function. The listener callback will only be called when filter function returns `true`.
        * @param listener A listener callback to subscribe for any event name
        * @param filter A filter function to filter the events. Callback will always be called when a matching event occurs if the filter is unspecified
        */
      inline def onAnyPublic(
        listener: js.Function1[/* data */ js.Object, Unit],
        filter: js.Function1[/* toCompare */ js.Any, Boolean]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onAnyPublic")(listener.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
      inline def onPublic(
        name: String,
        listener: js.Function1[/* data */ js.Object, Unit],
        filter: js.Function1[/* toCompare */ js.Any, Boolean]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onPublic")(name.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Adds a listener for one occurrence of an event of a particular name.
        *
        * Listener arguments include any argument passed to `events.emit`, followed by an object describing the complete event information.
        * @param name The event name to subscribe the listener to
        * @param listener A listener callback to subscribe to the event name
        */
      inline def once(name: String, listener: js.Function1[/* data */ js.Object, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(name.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
      inline def oncePublic(
        name: String,
        listener: js.Function1[/* data */ js.Object, Unit],
        filter: js.Function1[/* toCompare */ js.Any, Boolean]
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("oncePublic")(name.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /**
      * Flags are the primary method for providing system feedback in the product user interface.
      * Messages include notifications of various kinds: alerts, confirmations, notices, warnings, info and errors.
      */
    object flag {
      
      @JSGlobal("AP.flag")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(options: Partialtitlestringbodystr): Flag = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Flag]
    }
    
    /**
      * Get the location of the current page of the host product.
      * @param callback
      */
    inline def getLocation(callback: js.Function1[/* location */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Hide footer..
      * @param hideFooter true if the footer is supposed to be hidden
      */
    inline def hideFooter(hideFooter: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideFooter")(hideFooter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * The History API allows your add-on to manipulate the current page URL for use in navigation. When using the history module only the page anchor is modified and not the entire window location.
      *
      * Note: This is only enabled for page modules (Admin page, General page, Configure page, User profile page). It cannot be used if the page module is launched as a dialog.
      */
    object history {
      
      @JSGlobal("AP.history")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Goes back one step in the joint session history. Will invoke the popState callback.
        */
      inline def back(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[Unit]
      
      /**
        * Goes back one step in the joint session history. Will invoke the popState callback.
        */
      inline def forward(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[Unit]
      
      /**
        * Retrieves the current state of the history stack and returns the value. The returned value is the same as what was set with the pushState method.
        * @returns The current url anchor
        */
      inline def getState(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")().asInstanceOf[String]
      
      /**
        * Moves the page history back or forward the specified number of steps.
        * A zero delta will reload the current page. If the delta is out of range, does nothing. This call invoke the popState callback.
        * @param delta Number of places to move in the history
        */
      inline def go(delta: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("go")(delta.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Updates the location's anchor with the specified value and pushes the given data onto the session history. Does not invoke popState callback.
        * @param newState
        * @param title
        * @param url URL to add to history
        */
      inline def pushState(newState: js.Object, title: String, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pushState")(newState.asInstanceOf[js.Any], title.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Updates the current entry in the session history. Updates the location's anchor with the specified value but does not change the session history. Does not invoke popState callback.
        * @param url URL to update current history value with
        */
      inline def replaceState(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceState")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * Hosts are the primary method for Connect apps to interact with the page.
      */
    object host {
      
      @JSGlobal("AP.host")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Gets the selected text on the page.
        * @param callback method to be executed with the selected text.
        */
      inline def getSelectedText(callback: js.Function1[/* selection */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedText")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    /**
      * The inline dialog is a wrapper for secondary content/controls to be displayed on user request.
      * Consider this component as displayed in context to the triggering control with the dialog overlaying the page content.
      * An inline dialog should be preferred over a modal dialog when a connection between the action has a clear benefit versus having a lower user focus.
      *
      * Inline dialogs can be shown via a web item target.
      */
    object inlineDialog {
      
      @JSGlobal("AP.inlineDialog")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Hide the inline dialog that contains the iframe where this method is called from.
        */
      inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
    }
    
    /**
      * A JavaScript module which provides functions to interact with Jira.
      */
    object jira {
      
      @JSGlobal("AP.jira")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getWorkflowConfiguration(callback: js.Function1[/* workflowConfiguration */ WorkflowConfiguration, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkflowConfiguration")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Prepares the JQL Editor dialog in preparation for fast rendering. This method should be called on iframe load if it contains a JQL editor trigger.
        */
      inline def initJQLEditor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initJQLEditor")().asInstanceOf[Unit]
      
      /**
        * Returns whether the current user is permitted to edit the dashboard item
        * @param callback the callback that handles the response
        */
      inline def isDashboardItemEditable(callback: js.Function1[/* editable */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isDashboardItemEditable")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Returns whether the addon is being shown within a native app on iOS, Android or Mac.
        * @param callback the callback that handles the response
        */
      inline def isNativeApp(callback: js.Function1[/* isNative */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isNativeApp")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Open the quick create issue dialog. The dialog fields may be pre-filled with supplied data. A callback will be invoked when the dialog is closed and will include an array of issues created.
        * @param callback invoked when dialog is closed, takes a single parameter - array of issues created
        * @param params contains data to pre-fill the dialog with
        */
      inline def openCreateIssueDialog(callback: js.Function1[/* issues */ js.Array[js.Object], Unit], params: Fields): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openCreateIssueDialog")(callback.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Shows a date picker component. A callback will be invoked when the date (and time) is selected by the user.
        * @param options Configuration of the date picker.
        */
      inline def openDatePicker(options: PartialDatePickerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openDatePicker")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Refresh an issue page without reloading the browser.
        *
        * This is helpful when your add-on updates information about an issue in the background.
        */
      inline def refreshIssuePage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshIssuePage")().asInstanceOf[Unit]
      
      /**
        * Set the title of a dashboard item to the given text.
        * @param title the title of the dashboard item. Any HTML is escaped.
        */
      inline def setDashboardItemTitle(title: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDashboardItemTitle")(title.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Launches a JQL Editor dialog. A callback will be invoked when the JQL is submitted by the user.
        * @param callback invoked when dialog is submitted, includes an object containing the jql
        * @param options contains data to pre-fill the dialog with
        */
      inline def showJQLEditor(callback: js.Function1[/* obj */ Jql, Unit], options: Partialjqlstringheaderstr): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showJQLEditor")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /**
      * The Navigator API allows your add-on to change the current page using JavaScript.
      */
    object navigator {
      
      @JSGlobal("AP.navigator")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("AP.navigator.NavigatorTargetConfluence")
      @js.native
      object NavigatorTargetConfluence extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence & String] = js.native
        
        /* "addonModule" */ val addonModule: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.addonModule & String = js.native
        
        /* "contentedit" */ val contentedit: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.contentedit & String = js.native
        
        /* "contentlist" */ val contentlist: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.contentlist & String = js.native
        
        /* "contentview" */ val contentview: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.contentview & String = js.native
        
        /* "dashboard" */ val dashboard: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.dashboard & String = js.native
        
        /* "site" */ val site: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.site & String = js.native
        
        /* "spacetools" */ val spacetools: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.spacetools & String = js.native
        
        /* "spaceview" */ val spaceview: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.spaceview & String = js.native
        
        /* "userProfile" */ val userProfile: typings.atlassianConnectJs.AP.navigator.NavigatorTargetConfluence.userProfile & String = js.native
      }
      
      @JSGlobal("AP.navigator.NavigatorTargetJira")
      @js.native
      object NavigatorTargetJira extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira & String] = js.native
        
        /* "addonModule" */ val addonModule: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.addonModule & String = js.native
        
        /* "dashboard" */ val dashboard: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.dashboard & String = js.native
        
        /* "issue" */ val issue: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.issue & String = js.native
        
        /* "projectAdminSummary" */ val projectAdminSummary: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.projectAdminSummary & String = js.native
        
        /* "projectAdminTabPanel" */ val projectAdminTabPanel: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.projectAdminTabPanel & String = js.native
        
        /* "site" */ val site: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.site & String = js.native
        
        /* "userProfile" */ val userProfile: typings.atlassianConnectJs.AP.navigator.NavigatorTargetJira.userProfile & String = js.native
      }
      
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
      inline def getLocation(callback: js.Function1[/* location */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def go(target: NavigatorTargetConfluence, context: PartialNavigatorContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("go")(target.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
      /**
        * Navigates the user from the current page to the specified page. This call navigates the host product, not the iframe content.
        *
        * Requires a target location and the corresponding context. Navigating by passing a concrete url is currently unsupported.
        * @param target
        * @param context
        */
      inline def go(target: NavigatorTargetJira, context: PartialNavigatorContext): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("go")(target.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Triggers a reload of the parent page.
        */
      inline def reload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[Unit]
    }
    
    inline def request(options: urlstringPartialRequestOp): js.Promise[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Body]]
    /**
      * Execute an XMLHttpRequest as a Promise, or via callbacks, in the context of the host application. The format of the response (dataType) will always be set to "text" - even if specified.
      * @param url Either the URI to request or an options object (as below) containing at least a 'url' property; This value should be relative to the context path of the host application.
      * @param options The options of the request.
      */
    inline def request(url: String): js.Promise[Body] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Body]]
    inline def request(url: String, options: PartialRequestOptions): js.Promise[Body] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Body]]
    
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
    inline def resize(width: String, height: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Resize the iframe, so that it takes the entire page. Add-on may define to hide the footer using data-options.
      *
      * Note that this method is only available for general page modules.
      * @param hideFooter true if the footer is supposed to be hidden
      */
    inline def sizeToParent(hideFooter: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeToParent")(hideFooter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * A JavaScript module which provides functions to interact with the user currently in session.
      */
    object user {
      
      @JSGlobal("AP.user")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * This method retrieves the current user object containing the user's Atlassian Account ID.
        * @param callback the callback that handles the response. A single parameter is passed to the callback. This parameter is an object comprising an attribute "atlassianAccountId".
        */
      inline def getCurrentUser(callback: js.Function1[/* user */ AtlassianAccountId, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentUser")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Retrieve the user's locale used by the product.
        *
        * Please be aware that this field is under profile visibility controls and that a user may intend to hide this field from the public.
        * Because this API will provide unrestricted access to the current user's locale you should only use this API to establish context for the user.
        * You should not present the user's locale in a way that can be seen by other users viewing the application.
        * @param callback the callback that handles the response
        */
      inline def getLocale(callback: js.Function1[/* locale */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Retrieve the current user's timezone. If there is no logged in user, the server timezone is returned.
        *
        * Please be aware that this field is under profile visibility controls and that a user may intend to hide this field from the public.
        * Because this API will provide unrestricted access to the current user's timezone you should only use this API to establish context for the user.
        * You should not present the user's timezone in a way that can be seen by other users viewing the application.
        * @param callback the callback that handles the response
        */
      inline def getTimeZone(callback: js.Function1[/* timezone */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeZone")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Retrieves the current user object containing the user's id and full name
        * @deprecated Please use a new method AP.user.getCurrentUser() which will simply return the Atlassian Account ID.
        * @param callback the callback that handles the response
        */
      inline def getUser(callback: js.Function1[/* user */ FullName, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
  }
}
