package typings.achingbrainElectronFetch.mod

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends js.Object {
  
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  
  def blob(): js.Promise[Blob] = js.native
  
  val bodyUsed: Boolean = js.native
  
  def buffer(): js.Promise[Buffer] = js.native
  
  def formData(): js.Promise[FormData] = js.native
  
  def json[T](): js.Promise[T] = js.native
  
  def text(): js.Promise[String] = js.native
}
object Body {
  
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    buffer: () => js.Promise[Buffer],
    formData: () => js.Promise[FormData],
    json: () => js.Promise[js.Any],
    text: () => js.Promise[String]
  ): Body = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], buffer = js.Any.fromFunction0(buffer), formData = js.Any.fromFunction0(formData), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    
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
    def setArrayBuffer(value: () => js.Promise[ArrayBuffer]): Self = this.set("arrayBuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBlob(value: () => js.Promise[Blob]): Self = this.set("blob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBodyUsed(value: Boolean): Self = this.set("bodyUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffer(value: () => js.Promise[Buffer]): Self = this.set("buffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormData(value: () => js.Promise[FormData]): Self = this.set("formData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setJson(value: () => js.Promise[js.Any]): Self = this.set("json", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => js.Promise[String]): Self = this.set("text", js.Any.fromFunction0(value))
  }
}
