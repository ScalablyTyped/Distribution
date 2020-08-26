package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cors extends js.Object {
  /**
    * Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
    */
  var AllowCredentials: js.UndefOr[boolean] = js.native
  /**
    * Represents a collection of allowed headers. Supported only for HTTP APIs.
    */
  var AllowHeaders: js.UndefOr[CorsHeaderList] = js.native
  /**
    * Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
    */
  var AllowMethods: js.UndefOr[CorsMethodList] = js.native
  /**
    * Represents a collection of allowed origins. Supported only for HTTP APIs.
    */
  var AllowOrigins: js.UndefOr[CorsOriginList] = js.native
  /**
    * Represents a collection of exposed headers. Supported only for HTTP APIs.
    */
  var ExposeHeaders: js.UndefOr[CorsHeaderList] = js.native
  /**
    * The number of seconds that the browser should cache preflight request results. Supported only for HTTP APIs.
    */
  var MaxAge: js.UndefOr[IntegerWithLengthBetweenMinus1And86400] = js.native
}

object Cors {
  @scala.inline
  def apply(): Cors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cors]
  }
  @scala.inline
  implicit class CorsOps[Self <: Cors] (val x: Self) extends AnyVal {
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
    def setAllowCredentials(value: boolean): Self = this.set("AllowCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCredentials: Self = this.set("AllowCredentials", js.undefined)
    @scala.inline
    def setAllowHeadersVarargs(value: string*): Self = this.set("AllowHeaders", js.Array(value :_*))
    @scala.inline
    def setAllowHeaders(value: CorsHeaderList): Self = this.set("AllowHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHeaders: Self = this.set("AllowHeaders", js.undefined)
    @scala.inline
    def setAllowMethodsVarargs(value: StringWithLengthBetween1And64*): Self = this.set("AllowMethods", js.Array(value :_*))
    @scala.inline
    def setAllowMethods(value: CorsMethodList): Self = this.set("AllowMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMethods: Self = this.set("AllowMethods", js.undefined)
    @scala.inline
    def setAllowOriginsVarargs(value: string*): Self = this.set("AllowOrigins", js.Array(value :_*))
    @scala.inline
    def setAllowOrigins(value: CorsOriginList): Self = this.set("AllowOrigins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowOrigins: Self = this.set("AllowOrigins", js.undefined)
    @scala.inline
    def setExposeHeadersVarargs(value: string*): Self = this.set("ExposeHeaders", js.Array(value :_*))
    @scala.inline
    def setExposeHeaders(value: CorsHeaderList): Self = this.set("ExposeHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposeHeaders: Self = this.set("ExposeHeaders", js.undefined)
    @scala.inline
    def setMaxAge(value: IntegerWithLengthBetweenMinus1And86400): Self = this.set("MaxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("MaxAge", js.undefined)
  }
  
}

