package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  		// 当前小程序的 query
  var path: java.lang.String
  var query: js.Any
}

object Options {
  @scala.inline
  def apply(path: java.lang.String, query: js.Any): Options = {
    val __obj = js.Dynamic.literal(path = path, query = query)
  
    __obj.asInstanceOf[Options]
  }
}

