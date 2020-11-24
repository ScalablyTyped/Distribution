package typings.akamaiEdgeworkers.streamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformStream[I, O] extends js.Object {
  
  val readable: ReadableStream[O] = js.native
  
  val writable: WritableStream[I] = js.native
}
object TransformStream {
  
  @scala.inline
  def apply[I, O](readable: ReadableStream[O], writable: WritableStream[I]): TransformStream[I, O] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformStream[I, O]]
  }
  
  @scala.inline
  implicit class TransformStreamOps[Self <: TransformStream[_, _], I, O] (val x: Self with (TransformStream[I, O])) extends AnyVal {
    
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
    def setReadable(value: ReadableStream[O]): Self = this.set("readable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritable(value: WritableStream[I]): Self = this.set("writable", value.asInstanceOf[js.Any])
  }
}
