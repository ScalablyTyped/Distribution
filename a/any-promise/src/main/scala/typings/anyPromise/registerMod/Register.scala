package typings.anyPromise.registerMod

import typings.anyPromise.TypeofPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Register extends js.Object {
  var Promise: TypeofPromise
  var implementation: String
}

object Register {
  @scala.inline
  def apply(Promise: TypeofPromise, implementation: String): Register = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Register]
  }
}

