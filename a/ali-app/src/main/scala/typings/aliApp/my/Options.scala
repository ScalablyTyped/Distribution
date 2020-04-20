package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  		// 当前小程序的 query
  var path: String
  var query: js.Any
}

object Options {
  @scala.inline
  def apply(path: String, query: js.Any): Options = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

