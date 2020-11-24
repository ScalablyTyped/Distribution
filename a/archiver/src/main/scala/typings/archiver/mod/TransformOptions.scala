package typings.archiver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformOptions extends js.Object {
  
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  
  var decodeStrings: js.UndefOr[Boolean] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var objectmode: js.UndefOr[Boolean] = js.native
  
  var readableObjectMode: js.UndefOr[Boolean] = js.native
  
  var writeableObjectMode: js.UndefOr[Boolean] = js.native
}
object TransformOptions {
  
  @scala.inline
  def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  
  @scala.inline
  implicit class TransformOptionsOps[Self <: TransformOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowHalfOpen(value: Boolean): Self = this.set("allowHalfOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHalfOpen: Self = this.set("allowHalfOpen", js.undefined)
    
    @scala.inline
    def setDecodeStrings(value: Boolean): Self = this.set("decodeStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecodeStrings: Self = this.set("decodeStrings", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    
    @scala.inline
    def setObjectmode(value: Boolean): Self = this.set("objectmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectmode: Self = this.set("objectmode", js.undefined)
    
    @scala.inline
    def setReadableObjectMode(value: Boolean): Self = this.set("readableObjectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadableObjectMode: Self = this.set("readableObjectMode", js.undefined)
    
    @scala.inline
    def setWriteableObjectMode(value: Boolean): Self = this.set("writeableObjectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteableObjectMode: Self = this.set("writeableObjectMode", js.undefined)
  }
}
