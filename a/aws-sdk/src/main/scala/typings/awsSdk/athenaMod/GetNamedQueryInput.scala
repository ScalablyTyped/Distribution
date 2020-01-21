package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNamedQueryInput extends js.Object {
  /**
    * The unique ID of the query. Use ListNamedQueries to get query IDs.
    */
  var NamedQueryId: typings.awsSdk.athenaMod.NamedQueryId = js.native
}

object GetNamedQueryInput {
  @scala.inline
  def apply(NamedQueryId: NamedQueryId): GetNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryId = NamedQueryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetNamedQueryInput]
  }
}

