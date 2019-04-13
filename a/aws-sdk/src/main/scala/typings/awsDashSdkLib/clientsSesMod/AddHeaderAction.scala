package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddHeaderAction extends js.Object {
  /**
    * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and dashes only.
    */
  var HeaderName: awsDashSdkLib.clientsSesMod.HeaderName
  /**
    * Must be less than 2048 characters, and must not contain newline characters ("\r" or "\n").
    */
  var HeaderValue: awsDashSdkLib.clientsSesMod.HeaderValue
}

object AddHeaderAction {
  @scala.inline
  def apply(HeaderName: HeaderName, HeaderValue: HeaderValue): AddHeaderAction = {
    val __obj = js.Dynamic.literal(HeaderName = HeaderName, HeaderValue = HeaderValue)
  
    __obj.asInstanceOf[AddHeaderAction]
  }
}

