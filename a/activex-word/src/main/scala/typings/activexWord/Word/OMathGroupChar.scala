package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathGroupChar extends js.Object {
  
  var AlignTop: Boolean = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var Char: Double = js.native
  
  var CharTop: Boolean = js.native
  
  val Creator: Double = js.native
  
  val E: OMath = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.OMathGroupChar_typekey")
  var WordDotOMathGroupChar_typekey: OMathGroupChar = js.native
}
object OMathGroupChar {
  
  @scala.inline
  def apply(
    AlignTop: Boolean,
    Application: Application,
    Char: Double,
    CharTop: Boolean,
    Creator: Double,
    E: OMath,
    Parent: js.Any,
    WordDotOMathGroupChar_typekey: OMathGroupChar
  ): OMathGroupChar = {
    val __obj = js.Dynamic.literal(AlignTop = AlignTop.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], CharTop = CharTop.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathGroupChar_typekey")(WordDotOMathGroupChar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathGroupChar]
  }
  
  @scala.inline
  implicit class OMathGroupCharOps[Self <: OMathGroupChar] (val x: Self) extends AnyVal {
    
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
    def setAlignTop(value: Boolean): Self = this.set("AlignTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChar(value: Double): Self = this.set("Char", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharTop(value: Boolean): Self = this.set("CharTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = this.set("E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathGroupChar_typekey(value: OMathGroupChar): Self = this.set("Word.OMathGroupChar_typekey", value.asInstanceOf[js.Any])
  }
}
