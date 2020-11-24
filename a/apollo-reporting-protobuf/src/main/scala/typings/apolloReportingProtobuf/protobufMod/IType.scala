package typings.apolloReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IType extends js.Object {
  
  /** Type field */
  var field: js.UndefOr[js.Array[IField] | Null] = js.native
  
  /** Type name */
  var name: js.UndefOr[String | Null] = js.native
}
object IType {
  
  @scala.inline
  def apply(): IType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IType]
  }
  
  @scala.inline
  implicit class ITypeOps[Self <: IType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldVarargs(value: IField*): Self = this.set("field", js.Array(value :_*))
    
    @scala.inline
    def setField(value: js.Array[IField]): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFieldNull: Self = this.set("field", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
  }
}
