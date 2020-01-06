package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIndexFieldRequest extends js.Object {
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName = js.native
  /**
    * The name of the index field your want to remove from the domain's indexing options.
    */
  var IndexFieldName: DynamicFieldName = js.native
}

object DeleteIndexFieldRequest {
  @scala.inline
  def apply(DomainName: DomainName, IndexFieldName: DynamicFieldName): DeleteIndexFieldRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], IndexFieldName = IndexFieldName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIndexFieldRequest]
  }
}

