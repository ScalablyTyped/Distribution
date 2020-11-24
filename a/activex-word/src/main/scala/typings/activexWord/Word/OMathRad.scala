package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathRad extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val Deg: OMath = js.native
  
  val E: OMath = js.native
  
  var HideDeg: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.OMathRad_typekey")
  var WordDotOMathRad_typekey: OMathRad = js.native
}
object OMathRad {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Deg: OMath,
    E: OMath,
    HideDeg: Boolean,
    Parent: js.Any,
    WordDotOMathRad_typekey: OMathRad
  ): OMathRad = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Deg = Deg.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], HideDeg = HideDeg.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathRad_typekey")(WordDotOMathRad_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathRad]
  }
  
  @scala.inline
  implicit class OMathRadOps[Self <: OMathRad] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeg(value: OMath): Self = this.set("Deg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMath): Self = this.set("E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDeg(value: Boolean): Self = this.set("HideDeg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathRad_typekey(value: OMathRad): Self = this.set("Word.OMathRad_typekey", value.asInstanceOf[js.Any])
  }
}
