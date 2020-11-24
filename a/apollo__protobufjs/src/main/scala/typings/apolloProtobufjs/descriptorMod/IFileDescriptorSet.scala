package typings.apolloProtobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileDescriptorSet extends js.Object {
  
  var file: js.Array[IFileDescriptorProto] = js.native
}
object IFileDescriptorSet {
  
  @scala.inline
  def apply(file: js.Array[IFileDescriptorProto]): IFileDescriptorSet = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDescriptorSet]
  }
  
  @scala.inline
  implicit class IFileDescriptorSetOps[Self <: IFileDescriptorSet] (val x: Self) extends AnyVal {
    
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
    def setFileVarargs(value: IFileDescriptorProto*): Self = this.set("file", js.Array(value :_*))
    
    @scala.inline
    def setFile(value: js.Array[IFileDescriptorProto]): Self = this.set("file", value.asInstanceOf[js.Any])
  }
}
