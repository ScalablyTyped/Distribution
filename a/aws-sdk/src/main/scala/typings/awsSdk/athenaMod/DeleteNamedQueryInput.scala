package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNamedQueryInput extends js.Object {
  /**
    * The unique ID of the query to delete.
    */
  var NamedQueryId: typings.awsSdk.athenaMod.NamedQueryId = js.native
}

object DeleteNamedQueryInput {
  @scala.inline
  def apply(NamedQueryId: NamedQueryId): DeleteNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryId = NamedQueryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteNamedQueryInput]
  }
}

