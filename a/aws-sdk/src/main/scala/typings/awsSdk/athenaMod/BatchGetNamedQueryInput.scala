package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetNamedQueryInput extends js.Object {
  /**
    * An array of query IDs.
    */
  var NamedQueryIds: NamedQueryIdList = js.native
}

object BatchGetNamedQueryInput {
  @scala.inline
  def apply(NamedQueryIds: NamedQueryIdList): BatchGetNamedQueryInput = {
    val __obj = js.Dynamic.literal(NamedQueryIds = NamedQueryIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetNamedQueryInput]
  }
}

