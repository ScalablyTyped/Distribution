package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object describing the request to be made and how it should be processed.
  * see http://docs.angularjs.org/api/ng/service/$http#usage
  */
@js.native
trait IRequestShortcutConfig extends IHttpProviderDefaults {
  /**
    * {string|Object}
    * Data to be sent as the request message data.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Name of the parameter added (by AngularJS) to the request to specify the name (in the server response) of the JSON-P callback to invoke.
    * If unspecified, $http.defaults.jsonpCallbackParam will be used by default. This property is only applicable to JSON-P requests.
    */
  var jsonpCallbackParam: js.UndefOr[String] = js.native
  /**
    * {Object.<string|Object>}
    * Map of strings or objects which will be turned to ?key1=value1&key2=value2 after the url. If the value is not a string, it will be JSONified.
    */
  var params: js.UndefOr[js.Any] = js.native
  /**
    * See [XMLHttpRequest.responseType]https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest#xmlhttprequest-responsetype
    */
  var responseType: js.UndefOr[String] = js.native
  /**
    * Timeout in milliseconds, or promise that should abort the request when resolved.
    */
  var timeout: js.UndefOr[Double | IPromise[_]] = js.native
}

object IRequestShortcutConfig {
  @scala.inline
  def apply(): IRequestShortcutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequestShortcutConfig]
  }
  @scala.inline
  implicit class IRequestShortcutConfigOps[Self <: IRequestShortcutConfig] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setJsonpCallbackParam(value: String): Self = this.set("jsonpCallbackParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonpCallbackParam: Self = this.set("jsonpCallbackParam", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setTimeout(value: Double | IPromise[_]): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

