package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathEqArray extends StObject {
  
  var Align: WdOMathVertAlignType
  
  val Application: typings.activexWord.Word.Application
  
  val Creator: Double
  
  val E: OMathArgs
  
  var MaxDist: Boolean
  
  var ObjDist: Boolean
  
  val Parent: js.Any
  
  var RowSpacing: Double
  
  var RowSpacingRule: WdOMathSpacingRule
  
  @JSName("Word.OMathEqArray_typekey")
  var WordDotOMathEqArray_typekey: OMathEqArray
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
  implicit class OMathEqArrayMutableBuilder[Self <: OMathEqArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: WdOMathVertAlignType): Self = StObject.set(x, "Align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: OMathArgs): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDist(value: Boolean): Self = StObject.set(x, "MaxDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjDist(value: Boolean): Self = StObject.set(x, "ObjDist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpacing(value: Double): Self = StObject.set(x, "RowSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpacingRule(value: WdOMathSpacingRule): Self = StObject.set(x, "RowSpacingRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathEqArray_typekey(value: OMathEqArray): Self = StObject.set(x, "Word.OMathEqArray_typekey", value.asInstanceOf[js.Any])
  }
}
