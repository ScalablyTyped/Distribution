package typings.activexLibreoffice.com_.sun.star.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Number format code information returned by various {@link XNumberFormatCode} methods. */
@js.native
trait NumberFormatCode extends js.Object {
  
  var Code: String = js.native
  
  var Default: Boolean = js.native
  
  var DefaultName: String = js.native
  
  var Index: Double = js.native
  
  var NameID: String = js.native
  
  var Type: Double = js.native
  
  var Usage: Double = js.native
}
object NumberFormatCode {
  
  @scala.inline
  def apply(
    Code: String,
    Default: Boolean,
    DefaultName: String,
    Index: Double,
    NameID: String,
    Type: Double,
    Usage: Double
  ): NumberFormatCode = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Default = Default.asInstanceOf[js.Any], DefaultName = DefaultName.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], NameID = NameID.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Usage = Usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatCode]
  }
  
  @scala.inline
  implicit class NumberFormatCodeOps[Self <: NumberFormatCode] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("Default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultName(value: String): Self = this.set("DefaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameID(value: String): Self = this.set("NameID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: Double): Self = this.set("Usage", value.asInstanceOf[js.Any])
  }
}
