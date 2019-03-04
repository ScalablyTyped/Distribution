package typings
package apnLib.apnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseSent extends js.Object {
  var device: java.lang.String
}

object ResponseSent {
  @scala.inline
  def apply(device: java.lang.String): ResponseSent = {
    val __obj = js.Dynamic.literal(device = device)
  
    __obj.asInstanceOf[ResponseSent]
  }
}

