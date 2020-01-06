package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIndexFieldResponse extends js.Object {
  /**
    * The status of the index field being deleted.
    */
  var IndexField: IndexFieldStatus = js.native
}

object DeleteIndexFieldResponse {
  @scala.inline
  def apply(IndexField: IndexFieldStatus): DeleteIndexFieldResponse = {
    val __obj = js.Dynamic.literal(IndexField = IndexField.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIndexFieldResponse]
  }
}

