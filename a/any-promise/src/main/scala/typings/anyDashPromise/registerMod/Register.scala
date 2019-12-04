package typings.anyDashPromise.registerMod

import typings.anyDashPromise.TypeofClassPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Register extends js.Object {
  var Promise: TypeofClassPromise
  var implementation: String
}

object Register {
  @scala.inline
  def apply(Promise: TypeofClassPromise, implementation: String): Register = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Register]
  }
}

