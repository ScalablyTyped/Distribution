package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineIndexFieldResponse extends js.Object {
  var IndexField: IndexFieldStatus
}

object DefineIndexFieldResponse {
  @scala.inline
  def apply(IndexField: IndexFieldStatus): DefineIndexFieldResponse = {
    val __obj = js.Dynamic.literal(IndexField = IndexField)
  
    __obj.asInstanceOf[DefineIndexFieldResponse]
  }
}

