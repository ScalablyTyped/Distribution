package typings.akamaiEdgeworkers.textEncodeTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoderCommon extends js.Object {
  
  /**
    * Returns encoding's name, lowercased.
    */
  val encoding: String = js.native
  
  /**
    * Returns true if error mode is "fatal", and false otherwise.
    */
  val fatal: Boolean = js.native
  
  /**
    * Returns true if ignore BOM flag is set, and false otherwise.
    */
  val ignoreBOM: Boolean = js.native
}
object TextDecoderCommon {
  
  @scala.inline
  def apply(encoding: String, fatal: Boolean, ignoreBOM: Boolean): TextDecoderCommon = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], ignoreBOM = ignoreBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDecoderCommon]
  }
  
  @scala.inline
  implicit class TextDecoderCommonOps[Self <: TextDecoderCommon] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatal(value: Boolean): Self = this.set("fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreBOM(value: Boolean): Self = this.set("ignoreBOM", value.asInstanceOf[js.Any])
  }
}
