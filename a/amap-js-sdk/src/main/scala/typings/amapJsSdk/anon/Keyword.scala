package typings.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyword extends js.Object {
  var city: String
  var keyword: String
}

object Keyword {
  @scala.inline
  def apply(city: String, keyword: String): Keyword = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword]
  }
}

