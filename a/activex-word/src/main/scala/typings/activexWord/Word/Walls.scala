package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Walls extends StObject {
  
  val Application: js.Any
  
  val Border: ChartBorder
  
  def ClearFormats(): js.Any
  
  val Creator: Double
  
  val Fill: ChartFillFormat
  
  val Format: ChartFormat
  
  val Interior: typings.activexWord.Word.Interior
  
  val Name: String
  
  val Parent: js.Any
  
  def Paste(): Unit
  
  var PictureType: js.Any
  
  var PictureUnit: js.Any
  
  def Select(): js.Any
  
  var Thickness: Double
  
  @JSName("Word.Walls_typekey")
  var WordDotWalls_typekey: Walls
}
object Walls {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Border: ChartBorder,
    ClearFormats: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    Paste: () => Unit,
    PictureType: js.Any,
    PictureUnit: js.Any,
    Select: () => js.Any,
    Thickness: Double,
    WordDotWalls_typekey: Walls
  ): Walls = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), PictureType = PictureType.asInstanceOf[js.Any], PictureUnit = PictureUnit.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Thickness = Thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Walls_typekey")(WordDotWalls_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Walls]
  }
  
  @scala.inline
  implicit class WallsMutableBuilder[Self <: Walls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaste(value: () => Unit): Self = StObject.set(x, "Paste", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPictureType(value: js.Any): Self = StObject.set(x, "PictureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureUnit(value: js.Any): Self = StObject.set(x, "PictureUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "Thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotWalls_typekey(value: Walls): Self = StObject.set(x, "Word.Walls_typekey", value.asInstanceOf[js.Any])
  }
}
