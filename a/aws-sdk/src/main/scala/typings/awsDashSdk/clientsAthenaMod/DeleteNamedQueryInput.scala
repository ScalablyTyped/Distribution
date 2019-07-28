package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNamedQueryInput extends js.Object {
  /**
    * The unique ID of the query to delete.
    */
  var NamedQueryId: typings.awsDashSdk.clientsAthenaMod.NamedQueryId
}

object DeleteNamedQueryInput {
  @scala.inline
  def apply(NamedQueryId: NamedQueryId): DeleteNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryId = NamedQueryId)
  
    __obj.asInstanceOf[DeleteNamedQueryInput]
  }
}

