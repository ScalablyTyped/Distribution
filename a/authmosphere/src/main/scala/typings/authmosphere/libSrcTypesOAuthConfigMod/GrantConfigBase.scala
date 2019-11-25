package typings.authmosphere.libSrcTypesOAuthConfigMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantConfigBase extends js.Object {
  var accessTokenEndpoint: String
  var bodyParams: js.UndefOr[StringDictionary[String]] = js.undefined
  var grantType: String
  var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object GrantConfigBase {
  @scala.inline
  def apply(
    accessTokenEndpoint: String,
    grantType: String,
    bodyParams: StringDictionary[String] = null,
    queryParams: StringDictionary[String] = null,
    scopes: js.Array[String] = null
  ): GrantConfigBase = {
    val __obj = js.Dynamic.literal(accessTokenEndpoint = accessTokenEndpoint.asInstanceOf[js.Any], grantType = grantType.asInstanceOf[js.Any])
    if (bodyParams != null) __obj.updateDynamic("bodyParams")(bodyParams.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantConfigBase]
  }
}

