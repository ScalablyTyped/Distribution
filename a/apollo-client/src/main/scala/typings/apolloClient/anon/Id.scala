package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var __typename: String
  var id: String | Double
}

object Id {
  @scala.inline
  def apply(__typename: String, id: String | Double): Id = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

