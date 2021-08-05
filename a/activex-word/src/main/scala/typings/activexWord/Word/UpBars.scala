package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpBars extends StObject {
  
  val Application: js.Any
  
  val Border: ChartBorder
  
  val Creator: Double
  
  def Delete(): js.Any
  
  val Fill: ChartFillFormat
  
  val Format: ChartFormat
  
  val Interior: typings.activexWord.Word.Interior
  
  val Name: String
  
  val Parent: js.Any
  
  def Select(): js.Any
  
  /* private */ @JSName("Word.UpBars_typekey")
  var WordDotUpBars_typekey: UpBars
}
object UpBars {
  
  inline def apply(
    Application: js.Any,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => js.Any,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any,
    WordDotUpBars_typekey: UpBars
  ): UpBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.UpBars_typekey")(WordDotUpBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpBars]
  }
  
  extension [Self <: UpBars](x: Self) {
    
    inline def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    inline def setWordDotUpBars_typekey(value: UpBars): Self = StObject.set(x, "Word.UpBars_typekey", value.asInstanceOf[js.Any])
  }
}
