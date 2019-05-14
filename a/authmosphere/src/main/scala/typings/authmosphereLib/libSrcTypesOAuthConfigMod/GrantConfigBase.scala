package typings
package authmosphereLib.libSrcTypesOAuthConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantConfigBase extends js.Object {
  var accessTokenEndpoint: java.lang.String
  var bodyParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var grantType: java.lang.String
  var queryParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object GrantConfigBase {
  @scala.inline
  def apply(
    accessTokenEndpoint: java.lang.String,
    grantType: java.lang.String,
    bodyParams: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    queryParams: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    scopes: js.Array[java.lang.String] = null
  ): GrantConfigBase = {
    val __obj = js.Dynamic.literal(accessTokenEndpoint = accessTokenEndpoint, grantType = grantType)
    if (bodyParams != null) __obj.updateDynamic("bodyParams")(bodyParams)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[GrantConfigBase]
  }
}

