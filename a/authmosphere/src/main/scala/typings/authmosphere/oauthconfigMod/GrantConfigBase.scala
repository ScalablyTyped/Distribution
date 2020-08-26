package typings.authmosphere.oauthconfigMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantConfigBase extends js.Object {
  var accessTokenEndpoint: String = js.native
  var bodyParams: js.UndefOr[StringDictionary[String]] = js.native
  var grantType: String = js.native
  var queryParams: js.UndefOr[StringDictionary[String]] = js.native
  var scopes: js.UndefOr[js.Array[String]] = js.native
}

object GrantConfigBase {
  @scala.inline
  def apply(accessTokenEndpoint: String, grantType: String): GrantConfigBase = {
    val __obj = js.Dynamic.literal(accessTokenEndpoint = accessTokenEndpoint.asInstanceOf[js.Any], grantType = grantType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantConfigBase]
  }
  @scala.inline
  implicit class GrantConfigBaseOps[Self <: GrantConfigBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessTokenEndpoint(value: String): Self = this.set("accessTokenEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrantType(value: String): Self = this.set("grantType", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyParams(value: StringDictionary[String]): Self = this.set("bodyParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyParams: Self = this.set("bodyParams", js.undefined)
    @scala.inline
    def setQueryParams(value: StringDictionary[String]): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
  }
  
}

