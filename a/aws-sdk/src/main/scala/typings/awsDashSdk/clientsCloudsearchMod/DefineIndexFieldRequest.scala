package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineIndexFieldRequest extends js.Object {
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName
  /**
    * The index field and field options you want to configure. 
    */
  var IndexField: typings.awsDashSdk.clientsCloudsearchMod.IndexField
}

object DefineIndexFieldRequest {
  @scala.inline
  def apply(DomainName: DomainName, IndexField: IndexField): DefineIndexFieldRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, IndexField = IndexField)
  
    __obj.asInstanceOf[DefineIndexFieldRequest]
  }
}

