package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathEqArray extends js.Object {
  
  var Align: WdOMathVertAlignType = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  val E: OMathArgs = js.native
  
  var MaxDist: Boolean = js.native
  
  var ObjDist: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var RowSpacing: Double = js.native
  
  var RowSpacingRule: WdOMathSpacingRule = js.native
  
  @JSName("Word.OMathEqArray_typekey")
  var WordDotOMathEqArray_typekey: OMathEqArray = js.native
}
object OMathEqArray {
  
  @scala.inline
  def apply(
    Align: WdOMathVertAlignType,
    Application: Application,
    Creator: Double,
    E: OMathArgs,
    MaxDist: Boolean,
    ObjDist: Boolean,
    Parent: js.Any,
    RowSpacing: Double,
    RowSpacingRule: WdOMathSpacingRule,
    WordDotOMathEqArray_typekey: OMathEqArray
  ): OMathEqArray = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], MaxDist = MaxDist.asInstanceOf[js.Any], ObjDist = ObjDist.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RowSpacing = RowSpacing.asInstanceOf[js.Any], RowSpacingRule = RowSpacingRule.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathEqArray_typekey")(WordDotOMathEqArray_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathEqArray]
  }
  
  @scala.inline
  implicit class OMathEqArrayOps[Self <: OMathEqArray] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: WdOMathVertAlignType): Self = this.set("Align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMathArgs): Self = this.set("E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDist(value: Boolean): Self = this.set("MaxDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjDist(value: Boolean): Self = this.set("ObjDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpacing(value: Double): Self = this.set("RowSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpacingRule(value: WdOMathSpacingRule): Self = this.set("RowSpacingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathEqArray_typekey(value: OMathEqArray): Self = this.set("Word.OMathEqArray_typekey", value.asInstanceOf[js.Any])
  }
}
