package typings.apolloServerExpress.apolloServerMod

import typings.bodyParser.mod.OptionsJson
import typings.cors.mod.CorsOptions
import typings.cors.mod.CorsOptionsDelegate
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMiddlewareOptions extends js.Object {
  var bodyParserConfig: js.UndefOr[OptionsJson | Boolean] = js.native
  var cors: js.UndefOr[CorsOptions | CorsOptionsDelegate | Boolean] = js.native
  var disableHealthCheck: js.UndefOr[Boolean] = js.native
  var onHealthCheck: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], js.Promise[_]]] = js.native
  var path: js.UndefOr[String] = js.native
}

object GetMiddlewareOptions {
  @scala.inline
  def apply(): GetMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMiddlewareOptions]
  }
  @scala.inline
  implicit class GetMiddlewareOptionsOps[Self <: GetMiddlewareOptions] (val x: Self) extends AnyVal {
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
    def setBodyParserConfig(value: OptionsJson | Boolean): Self = this.set("bodyParserConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyParserConfig: Self = this.set("bodyParserConfig", js.undefined)
    @scala.inline
    def setCorsFunction2(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* callback */ js.Function2[/* err */ Error | Null, /* options */ js.UndefOr[CorsOptions], Unit]) => Unit
    ): Self = this.set("cors", js.Any.fromFunction2(value))
    @scala.inline
    def setCors(value: CorsOptions | CorsOptionsDelegate | Boolean): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setDisableHealthCheck(value: Boolean): Self = this.set("disableHealthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHealthCheck: Self = this.set("disableHealthCheck", js.undefined)
    @scala.inline
    def setOnHealthCheck(value: /* req */ Request_[ParamsDictionary, _, _, Query] => js.Promise[_]): Self = this.set("onHealthCheck", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHealthCheck: Self = this.set("onHealthCheck", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

