package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparkPoints extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.SparkPoints_typekey")
  var ExcelDotSparkPoints_typekey: SparkPoints = js.native
  
  val Firstpoint: SparkColor = js.native
  
  val Highpoint: SparkColor = js.native
  
  val Lastpoint: SparkColor = js.native
  
  val Lowpoint: SparkColor = js.native
  
  val Markers: SparkColor = js.native
  
  val Negative: SparkColor = js.native
  
  val Parent: js.Any = js.native
}
object SparkPoints {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotSparkPoints_typekey: SparkPoints,
    Firstpoint: SparkColor,
    Highpoint: SparkColor,
    Lastpoint: SparkColor,
    Lowpoint: SparkColor,
    Markers: SparkColor,
    Negative: SparkColor,
    Parent: js.Any
  ): SparkPoints = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Firstpoint = Firstpoint.asInstanceOf[js.Any], Highpoint = Highpoint.asInstanceOf[js.Any], Lastpoint = Lastpoint.asInstanceOf[js.Any], Lowpoint = Lowpoint.asInstanceOf[js.Any], Markers = Markers.asInstanceOf[js.Any], Negative = Negative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.SparkPoints_typekey")(ExcelDotSparkPoints_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparkPoints]
  }
  
  @scala.inline
  implicit class SparkPointsMutableBuilder[Self <: SparkPoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSparkPoints_typekey(value: SparkPoints): Self = StObject.set(x, "Excel.SparkPoints_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstpoint(value: SparkColor): Self = StObject.set(x, "Firstpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighpoint(value: SparkColor): Self = StObject.set(x, "Highpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastpoint(value: SparkColor): Self = StObject.set(x, "Lastpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowpoint(value: SparkColor): Self = StObject.set(x, "Lowpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkers(value: SparkColor): Self = StObject.set(x, "Markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegative(value: SparkColor): Self = StObject.set(x, "Negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
