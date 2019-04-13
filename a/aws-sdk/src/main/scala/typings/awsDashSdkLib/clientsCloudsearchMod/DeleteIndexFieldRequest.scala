package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteIndexFieldRequest extends js.Object {
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
  /**
    * The name of the index field your want to remove from the domain's indexing options.
    */
  var IndexFieldName: DynamicFieldName
}

object DeleteIndexFieldRequest {
  @scala.inline
  def apply(DomainName: DomainName, IndexFieldName: DynamicFieldName): DeleteIndexFieldRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, IndexFieldName = IndexFieldName)
  
    __obj.asInstanceOf[DeleteIndexFieldRequest]
  }
}

