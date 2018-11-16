package typings
package angularDashUiDashRouterLib.angularDashUiDashRouterMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IState extends js.Object {
  var `abstract`: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Boolean (default true). If false will reload state on everytransitions. Useful for when you'd like to restore all data  to its initial state.
               */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * String, component name
               */
  var component: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A controller paired to the state. Function, annotated array or name as String
               */
  var controller: js.UndefOr[js.Function | java.lang.String | (js.Array[java.lang.String | js.Function])] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Function (injectable), returns the actual controller function or string.
               */
  var controllerProvider: js.UndefOr[js.Function | (js.Array[java.lang.String | js.Function])] = js.undefined
  /**
               * Arbitrary data object, useful for custom configuration.
               */
  var data: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Callback function for when a state is entered. Good way to trigger an action or dispatch an event, such as opening a dialog.
               * If minifying your scripts, make sure to explicitly annotate this function, because it won't be automatically annotated by your build tools.
               */
  var onEnter: js.UndefOr[js.Function | (js.Array[java.lang.String | js.Function])] = js.undefined
  /**
               * Callback functions for when a state is entered and exited. Good way to trigger an action or dispatch an event, such as opening a dialog.
               * If minifying your scripts, make sure to explicitly annotate this function, because it won't be automatically annotated by your build tools.
               */
  var onExit: js.UndefOr[js.Function | (js.Array[java.lang.String | js.Function])] = js.undefined
  /**
               * A map which optionally configures parameters declared in the url, or defines additional non-url parameters. Only use this within a state if you are not using url. Otherwise you can specify your parameters within the url. When a state is navigated or transitioned to, the $stateParams service will be populated with any parameters that were passed.
               */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
               * Specifies the parent state of this state
               */
  var parent: js.UndefOr[java.lang.String | IState] = js.undefined
  /**
               * string | function | object
               * Synchronously or asynchronously redirects Transitions to a different state/params
               */
  var redirectTo: js.UndefOr[java.lang.String | js.Function | IState] = js.undefined
  /**
               * Boolean (default true). If false will not re-trigger the same state just because a search/query parameter has changed. Useful for when you'd like to modify $location.search() without triggering a reload.
               */
  var reloadOnSearch: js.UndefOr[scala.Boolean] = js.undefined
  var resolve: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
               * String HTML content, or function that returns an HTML string
               */
  var template: js.UndefOr[java.lang.String | angularDashUiDashRouterLib.Anon_Params] = js.undefined
  /**
               * Function, returns HTML content string
               */
  var templateProvider: js.UndefOr[js.Function | (js.Array[java.lang.String | js.Function])] = js.undefined
  /**
               * String URL path to template file OR Function, returns URL path string
               */
  var templateUrl: js.UndefOr[java.lang.String | angularDashUiDashRouterLib.Anon_Params] = js.undefined
  /**
               * A url with optional parameters. When a state is navigated or transitioned to, the $stateParams service will be populated with any parameters that were passed.
               */
  var url: js.UndefOr[java.lang.String | IUrlMatcher] = js.undefined
  /**
               * Use the views property to set up multiple views. If you don't need multiple views within a single state this property is not needed. Tip: remember that often nested views are more useful and powerful than multiple sibling views.
               */
  var views: js.UndefOr[ScalablyTyped.runtime.StringDictionary[IState]] = js.undefined
}

