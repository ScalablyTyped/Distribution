package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolution extends js.Object {
  var authority: java.lang.String
  var status: ResolutionStatus
  var values: js.Array[ResolutionValueContainer]
}

object Resolution {
  @scala.inline
  def apply(authority: java.lang.String, status: ResolutionStatus, values: js.Array[ResolutionValueContainer]): Resolution = {
    val __obj = js.Dynamic.literal(authority = authority, status = status, values = values)
  
    __obj.asInstanceOf[Resolution]
  }
}

