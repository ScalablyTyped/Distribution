package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparkPoints extends js.Object {
  
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
  implicit class SparkPointsOps[Self <: SparkPoints] (val x: Self) extends AnyVal {
    
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
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotSparkPoints_typekey(value: SparkPoints): Self = this.set("Excel.SparkPoints_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstpoint(value: SparkColor): Self = this.set("Firstpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighpoint(value: SparkColor): Self = this.set("Highpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastpoint(value: SparkColor): Self = this.set("Lastpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowpoint(value: SparkColor): Self = this.set("Lowpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkers(value: SparkColor): Self = this.set("Markers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegative(value: SparkColor): Self = this.set("Negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
}
