package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// there is no way to use the Globals class from within Javascript
@JSGlobal("Excel.Graphic")
@js.native
class Graphic protected ()
  extends StObject
     with typings.activexExcel.Excel.Graphic {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Brightness: Double = js.native
  
  /* CompleteClass */
  var ColorType: MsoPictureColorType = js.native
  
  /* CompleteClass */
  var Contrast: Double = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var CropBottom: Double = js.native
  
  /* CompleteClass */
  var CropLeft: Double = js.native
  
  /* CompleteClass */
  var CropRight: Double = js.native
  
  /* CompleteClass */
  var CropTop: Double = js.native
  
  /* CompleteClass */
  @JSName("Excel.Graphic_typekey")
  var ExcelDotGraphic_typekey: typings.activexExcel.Excel.Graphic = js.native
  
  /* CompleteClass */
  var Filename: String = js.native
  
  /* CompleteClass */
  var Height: Double = js.native
  
  /* CompleteClass */
  var LockAspectRatio: MsoTriState = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Width: Double = js.native
}
