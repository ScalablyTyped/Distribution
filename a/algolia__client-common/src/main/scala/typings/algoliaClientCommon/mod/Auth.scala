package typings.algoliaClientCommon.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth extends js.Object {
  
  /**
    * Returns the headers related to auth. Should be
    * merged to the transporter headers.
    */
  def headers(): Record[String, String] = js.native
  
  /**
    * Returns the query parameters related to auth. Should be
    * merged to the query parameters headers.
    */
  def queryParameters(): Record[String, String] = js.native
}
object Auth {
  
  @scala.inline
  def apply(headers: () => Record[String, String], queryParameters: () => Record[String, String]): Auth = {
    val __obj = js.Dynamic.literal(headers = js.Any.fromFunction0(headers), queryParameters = js.Any.fromFunction0(queryParameters))
    __obj.asInstanceOf[Auth]
  }
  
  @scala.inline
  implicit class AuthOps[Self <: Auth] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: () => Record[String, String]): Self = this.set("headers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQueryParameters(value: () => Record[String, String]): Self = this.set("queryParameters", js.Any.fromFunction0(value))
  }
}
