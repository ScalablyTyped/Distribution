package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Object describing the request to be made and how it should be processed.
     * see http://docs.angularjs.org/api/ng/service/$http#usage
     */

trait IRequestShortcutConfig extends IHttpProviderDefaults {
  /**
           * {string|Object}
           * Data to be sent as the request message data.
           */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
           * Name of the parameter added (by AngularJS) to the request to specify the name (in the server response) of the JSON-P callback to invoke.
           * If unspecified, $http.defaults.jsonpCallbackParam will be used by default. This property is only applicable to JSON-P requests.
           */
  var jsonpCallbackParam: js.UndefOr[java.lang.String] = js.undefined
  /**
           * {Object.<string|Object>}
           * Map of strings or objects which will be turned to ?key1=value1&key2=value2 after the url. If the value is not a string, it will be JSONified.
           */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
           * See [XMLHttpRequest.responseType]https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest#xmlhttprequest-responsetype
           */
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Timeout in milliseconds, or promise that should abort the request when resolved.
           */
  var timeout: js.UndefOr[scala.Double | IPromise[_]] = js.undefined
}

