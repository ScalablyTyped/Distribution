package typings.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: String
  var headers: StringDictionary[js.UndefOr[String]]
}

object Data {
  @scala.inline
  def apply(data: String, headers: StringDictionary[js.UndefOr[String]]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

