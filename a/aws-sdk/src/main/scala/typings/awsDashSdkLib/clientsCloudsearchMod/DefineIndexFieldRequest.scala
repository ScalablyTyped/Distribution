package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineIndexFieldRequest extends js.Object {
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
  /**
    * The index field and field options you want to configure. 
    */
  var IndexField: awsDashSdkLib.clientsCloudsearchMod.IndexField
}

object DefineIndexFieldRequest {
  @scala.inline
  def apply(DomainName: DomainName, IndexField: IndexField): DefineIndexFieldRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, IndexField = IndexField)
  
    __obj.asInstanceOf[DefineIndexFieldRequest]
  }
}

