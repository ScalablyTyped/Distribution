package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityManagerSetRedirectionHandlerHandlerFunction
  extends stdLib.Object {
  /**
    * The URL of the secure resource that triggers the redirection to the ArcGIS.com sign-in page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var resourceUrl: java.lang.String
  /**
    * The application URL where the sign-in page redirects after a successful login. To create the return URL, append the application's URL to signInPage as a parameter. The *returnUrlParamName* contains the name of the parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var returnUrlParamName: java.lang.String
  /**
    * The ServerInfo object describing the server where the secure resource is hosted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var serverInfo: ServerInfo
  /**
    * URL of the sign-in page where users will be redirected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  var signInPage: java.lang.String
}

object IdentityManagerSetRedirectionHandlerHandlerFunction {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    resourceUrl: java.lang.String,
    returnUrlParamName: java.lang.String,
    serverInfo: ServerInfo,
    signInPage: java.lang.String
  ): IdentityManagerSetRedirectionHandlerHandlerFunction = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, resourceUrl = resourceUrl, returnUrlParamName = returnUrlParamName, serverInfo = serverInfo, signInPage = signInPage)
  
    __obj.asInstanceOf[IdentityManagerSetRedirectionHandlerHandlerFunction]
  }
}

