package typings.apolloDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var __typename: String
  var id: String | Double
}

object Anon_Id {
  @scala.inline
  def apply(__typename: String, id: String | Double): Anon_Id = {
    val __obj = js.Dynamic.literal(__typename = __typename, id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Id]
  }
}

