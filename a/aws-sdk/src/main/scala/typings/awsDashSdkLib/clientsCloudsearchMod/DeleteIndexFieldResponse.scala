package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIndexFieldResponse extends js.Object {
  /**
    * The status of the index field being deleted.
    */
  var IndexField: IndexFieldStatus
}

object DeleteIndexFieldResponse {
  @scala.inline
  def apply(IndexField: IndexFieldStatus): DeleteIndexFieldResponse = {
    val __obj = js.Dynamic.literal(IndexField = IndexField)
  
    __obj.asInstanceOf[DeleteIndexFieldResponse]
  }
}

