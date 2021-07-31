package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HiLoLines extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Border: ChartBorder
  
  val Creator: Double
  
  def Delete(): js.Any
  
  val Format: ChartFormat
  
  val Name: String
  
  val Parent: js.Any
  
  @JSName("PowerPoint.HiLoLines_typekey")
  var PowerPointDotHiLoLines_typekey: HiLoLines
  
  def Select(): js.Any
}
object HiLoLines {
  
  @scala.inline
  def apply(
    Application: Application,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => js.Any,
    Format: ChartFormat,
    Name: String,
    Parent: js.Any,
    PowerPointDotHiLoLines_typekey: HiLoLines,
    Select: () => js.Any
  ): HiLoLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("PowerPoint.HiLoLines_typekey")(PowerPointDotHiLoLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HiLoLines]
  }
  
  @scala.inline
  implicit class HiLoLinesMutableBuilder[Self <: HiLoLines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotHiLoLines_typekey(value: HiLoLines): Self = StObject.set(x, "PowerPoint.HiLoLines_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
  }
}
