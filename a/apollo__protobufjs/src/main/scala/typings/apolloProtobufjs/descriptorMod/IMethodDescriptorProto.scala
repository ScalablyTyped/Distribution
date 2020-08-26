package typings.apolloProtobufjs.descriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMethodDescriptorProto extends js.Object {
  var clientStreaming: js.UndefOr[Boolean] = js.native
  var inputType: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[IMethodOptions] = js.native
  var outputType: js.UndefOr[String] = js.native
  var serverStreaming: js.UndefOr[Boolean] = js.native
}

object IMethodDescriptorProto {
  @scala.inline
  def apply(): IMethodDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMethodDescriptorProto]
  }
  @scala.inline
  implicit class IMethodDescriptorProtoOps[Self <: IMethodDescriptorProto] (val x: Self) extends AnyVal {
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
    def setClientStreaming(value: Boolean): Self = this.set("clientStreaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientStreaming: Self = this.set("clientStreaming", js.undefined)
    @scala.inline
    def setInputType(value: String): Self = this.set("inputType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptions(value: IMethodOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setOutputType(value: String): Self = this.set("outputType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputType: Self = this.set("outputType", js.undefined)
    @scala.inline
    def setServerStreaming(value: Boolean): Self = this.set("serverStreaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerStreaming: Self = this.set("serverStreaming", js.undefined)
  }
  
}

