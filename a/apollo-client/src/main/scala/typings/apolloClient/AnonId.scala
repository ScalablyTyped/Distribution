package typings.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var __typename: String
  var id: String | Double
}

object AnonId {
  @scala.inline
  def apply(__typename: String, id: String | Double): AnonId = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

