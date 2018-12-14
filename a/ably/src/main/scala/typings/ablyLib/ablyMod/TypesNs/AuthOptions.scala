package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AuthOptions extends js.Object {
  /**
       * A function which is called when a new token is required.
       * The role of the callback is to either generate a signed TokenRequest which may then be submitted automatically
       * by the library to the Ably REST API requestToken; or to provide a valid token in as a TokenDetails object.
       **/
  var authCallback: js.UndefOr[
    js.Function2[
      /* data */ TokenParams, 
      /* callback */ js.Function2[
        /* error */ ErrorInfo | java.lang.String, 
        /* tokenRequestOrDetails */ TokenDetails | TokenRequest | java.lang.String, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var authHeaders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var authMethod: js.UndefOr[HTTPMethods] = js.undefined
  var authParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
       * A URL that the library may use to obtain a token string (in plain text format), or a signed TokenRequest or TokenDetails (in JSON format).
       **/
  var authUrl: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var queryTime: js.UndefOr[scala.Boolean] = js.undefined
  var token: js.UndefOr[TokenDetails | java.lang.String] = js.undefined
  var tokenDetails: js.UndefOr[TokenDetails] = js.undefined
  var useTokenAuth: js.UndefOr[scala.Boolean] = js.undefined
}

