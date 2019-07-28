package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNamedQueryInput extends js.Object {
  /**
    * The unique ID of the query. Use ListNamedQueries to get query IDs.
    */
  var NamedQueryId: typings.awsDashSdk.clientsAthenaMod.NamedQueryId
}

object GetNamedQueryInput {
  @scala.inline
  def apply(NamedQueryId: NamedQueryId): GetNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryId = NamedQueryId)
  
    __obj.asInstanceOf[GetNamedQueryInput]
  }
}

