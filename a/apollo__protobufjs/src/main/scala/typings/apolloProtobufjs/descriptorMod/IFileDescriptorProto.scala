package typings.apolloProtobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileDescriptorProto extends js.Object {
  
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  
  var dependency: js.UndefOr[js.Any] = js.native
  
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto]] = js.native
  
  var extension: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.native
  
  var messageType: js.UndefOr[js.Array[IDescriptorProto]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[IFileOptions] = js.native
  
  var publicDependency: js.UndefOr[js.Any] = js.native
  
  var service: js.UndefOr[js.Array[IServiceDescriptorProto]] = js.native
  
  var sourceCodeInfo: js.UndefOr[js.Any] = js.native
  
  var syntax: js.UndefOr[String] = js.native
  
  var weakDependency: js.UndefOr[js.Any] = js.native
}
object IFileDescriptorProto {
  
  @scala.inline
  def apply(): IFileDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDescriptorProto]
  }
  
  @scala.inline
  implicit class IFileDescriptorProtoOps[Self <: IFileDescriptorProto] (val x: Self) extends AnyVal {
    
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
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    
    @scala.inline
    def setDependency(value: js.Any): Self = this.set("dependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependency: Self = this.set("dependency", js.undefined)
    
    @scala.inline
    def setEnumTypeVarargs(value: IEnumDescriptorProto*): Self = this.set("enumType", js.Array(value :_*))
    
    @scala.inline
    def setEnumType(value: js.Array[IEnumDescriptorProto]): Self = this.set("enumType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumType: Self = this.set("enumType", js.undefined)
    
    @scala.inline
    def setExtensionVarargs(value: IFieldDescriptorProto*): Self = this.set("extension", js.Array(value :_*))
    
    @scala.inline
    def setExtension(value: js.Array[IFieldDescriptorProto]): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setMessageTypeVarargs(value: IDescriptorProto*): Self = this.set("messageType", js.Array(value :_*))
    
    @scala.inline
    def setMessageType(value: js.Array[IDescriptorProto]): Self = this.set("messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageType: Self = this.set("messageType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptions(value: IFileOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPublicDependency(value: js.Any): Self = this.set("publicDependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicDependency: Self = this.set("publicDependency", js.undefined)
    
    @scala.inline
    def setServiceVarargs(value: IServiceDescriptorProto*): Self = this.set("service", js.Array(value :_*))
    
    @scala.inline
    def setService(value: js.Array[IServiceDescriptorProto]): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setSourceCodeInfo(value: js.Any): Self = this.set("sourceCodeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeInfo: Self = this.set("sourceCodeInfo", js.undefined)
    
    @scala.inline
    def setSyntax(value: String): Self = this.set("syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
    
    @scala.inline
    def setWeakDependency(value: js.Any): Self = this.set("weakDependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeakDependency: Self = this.set("weakDependency", js.undefined)
  }
}
