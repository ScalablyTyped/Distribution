package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathMat extends StObject {
  
  var Align: WdOMathVertAlignType
  
  val Application: typings.activexWord.Word.Application
  
  def Cell(Row: Double, Col: Double): OMath
  
  var ColGap: Double
  
  var ColGapRule: WdOMathSpacingRule
  
  var ColSpacing: Double
  
  val Cols: OMathMatCols
  
  val Creator: Double
  
  val Parent: js.Any
  
  var PlcHoldHidden: Boolean
  
  var RowSpacing: Double
  
  var RowSpacingRule: WdOMathSpacingRule
  
  val Rows: OMathMatRows
  
  /* private */ @JSName("Word.OMathMat_typekey")
  var WordDotOMathMat_typekey: OMathMat
}
object OMathMat {
  
  inline def apply(
    Align: WdOMathVertAlignType,
    Application: Application,
    Cell: (Double, Double) => OMath,
    ColGap: Double,
    ColGapRule: WdOMathSpacingRule,
    ColSpacing: Double,
    Cols: OMathMatCols,
    Creator: Double,
    Parent: js.Any,
    PlcHoldHidden: Boolean,
    RowSpacing: Double,
    RowSpacingRule: WdOMathSpacingRule,
    Rows: OMathMatRows,
    WordDotOMathMat_typekey: OMathMat
  ): OMathMat = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Cell = js.Any.fromFunction2(Cell), ColGap = ColGap.asInstanceOf[js.Any], ColGapRule = ColGapRule.asInstanceOf[js.Any], ColSpacing = ColSpacing.asInstanceOf[js.Any], Cols = Cols.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlcHoldHidden = PlcHoldHidden.asInstanceOf[js.Any], RowSpacing = RowSpacing.asInstanceOf[js.Any], RowSpacingRule = RowSpacingRule.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathMat_typekey")(WordDotOMathMat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathMat]
  }
  
  extension [Self <: OMathMat](x: Self) {
    
    inline def setAlign(value: WdOMathVertAlignType): Self = StObject.set(x, "Align", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCell(value: (Double, Double) => OMath): Self = StObject.set(x, "Cell", js.Any.fromFunction2(value))
    
    inline def setColGap(value: Double): Self = StObject.set(x, "ColGap", value.asInstanceOf[js.Any])
    
    inline def setColGapRule(value: WdOMathSpacingRule): Self = StObject.set(x, "ColGapRule", value.asInstanceOf[js.Any])
    
    inline def setColSpacing(value: Double): Self = StObject.set(x, "ColSpacing", value.asInstanceOf[js.Any])
    
    inline def setCols(value: OMathMatCols): Self = StObject.set(x, "Cols", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPlcHoldHidden(value: Boolean): Self = StObject.set(x, "PlcHoldHidden", value.asInstanceOf[js.Any])
    
    inline def setRowSpacing(value: Double): Self = StObject.set(x, "RowSpacing", value.asInstanceOf[js.Any])
    
    inline def setRowSpacingRule(value: WdOMathSpacingRule): Self = StObject.set(x, "RowSpacingRule", value.asInstanceOf[js.Any])
    
    inline def setRows(value: OMathMatRows): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathMat_typekey(value: OMathMat): Self = StObject.set(x, "Word.OMathMat_typekey", value.asInstanceOf[js.Any])
  }
}
