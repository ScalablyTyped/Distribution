package typings.arangodb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: String
  var headers: StringDictionary[js.UndefOr[String]]
}

object AnonData {
  @scala.inline
  def apply(data: String, headers: StringDictionary[js.UndefOr[String]]): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

