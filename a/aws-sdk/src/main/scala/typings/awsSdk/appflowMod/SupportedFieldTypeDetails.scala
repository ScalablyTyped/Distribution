package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportedFieldTypeDetails extends js.Object {
  
  /**
    *  The initial supported version for fieldType. If this is later changed to a different version, v2 will be introduced. 
    */
  var v1: FieldTypeDetails = js.native
}
object SupportedFieldTypeDetails {
  
  @scala.inline
  def apply(v1: FieldTypeDetails): SupportedFieldTypeDetails = {
    val __obj = js.Dynamic.literal(v1 = v1.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedFieldTypeDetails]
  }
  
  @scala.inline
  implicit class SupportedFieldTypeDetailsOps[Self <: SupportedFieldTypeDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setV1(value: FieldTypeDetails): Self = this.set("v1", value.asInstanceOf[js.Any])
  }
}
