package typings.angularCommon.httpHttpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used to construct an `HttpParams` instance.
  *
  * @publicApi
  */
@js.native
trait HttpParamsOptions extends js.Object {
  /** Encoding codec used to parse and serialize the parameters. */
  var encoder: js.UndefOr[HttpParameterCodec] = js.native
  /** Object map of the HTTP parameters. Mutually exclusive with `fromString`. */
  var fromObject: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
  /**
    * String representation of the HTTP parameters in URL-query-string format.
    * Mutually exclusive with `fromObject`.
    */
  var fromString: js.UndefOr[String] = js.native
}

object HttpParamsOptions {
  @scala.inline
  def apply(): HttpParamsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpParamsOptions]
  }
  @scala.inline
  implicit class HttpParamsOptionsOps[Self <: HttpParamsOptions] (val x: Self) extends AnyVal {
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
    def setEncoder(value: HttpParameterCodec): Self = this.set("encoder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoder: Self = this.set("encoder", js.undefined)
    @scala.inline
    def setFromObject(value: StringDictionary[String | js.Array[String]]): Self = this.set("fromObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromObject: Self = this.set("fromObject", js.undefined)
    @scala.inline
    def setFromString(value: String): Self = this.set("fromString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromString: Self = this.set("fromString", js.undefined)
  }
  
}

