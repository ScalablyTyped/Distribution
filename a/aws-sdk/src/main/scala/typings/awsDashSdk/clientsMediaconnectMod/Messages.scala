package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messages extends js.Object {
  /**
    * A list of errors that might have been generated from processes on this flow.
    */
  var Errors: __listOf__string
}

object Messages {
  @scala.inline
  def apply(Errors: __listOf__string): Messages = {
    val __obj = js.Dynamic.literal(Errors = Errors)
  
    __obj.asInstanceOf[Messages]
  }
}

