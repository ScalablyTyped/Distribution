package typings
package auth0DashAngularLib.auth0Ns.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAuth0ClientOptions extends js.Object {
  /**
          * Client identifier of your Auth0 application
          */
  var clientID: java.lang.String
  /**
          * Domain of your Auth0 account
          */
  var domain: java.lang.String
  /**
          * Login state if you're using ui-router
          */
  var loginState: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Login url if you're using ngRoute
          */
  var loginUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Use single signon
          */
  var sso: js.UndefOr[scala.Boolean] = js.undefined
}

