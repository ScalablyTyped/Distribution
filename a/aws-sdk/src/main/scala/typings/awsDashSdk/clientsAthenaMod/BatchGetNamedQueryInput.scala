package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetNamedQueryInput extends js.Object {
  /**
    * An array of query IDs.
    */
  var NamedQueryIds: NamedQueryIdList
}

object BatchGetNamedQueryInput {
  @scala.inline
  def apply(NamedQueryIds: NamedQueryIdList): BatchGetNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryIds = NamedQueryIds)
  
    __obj.asInstanceOf[BatchGetNamedQueryInput]
  }
}

