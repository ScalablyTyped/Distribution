package typings.activexExcel.global.Excel

import typings.activexOffice.Office.MsoShadowStyle
import typings.activexOffice.Office.MsoShadowType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.ShadowFormat")
@js.native
class ShadowFormat protected ()
  extends StObject
     with typings.activexExcel.Excel.ShadowFormat {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var Blur: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  @JSName("Excel.ShadowFormat_typekey")
  var ExcelDotShadowFormat_typekey: typings.activexExcel.Excel.ShadowFormat = js.native
  
  /* CompleteClass */
  var ForeColor: typings.activexExcel.Excel.ColorFormat = js.native
  
  /* CompleteClass */
  override def IncrementOffsetX(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override def IncrementOffsetY(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  var Obscured: MsoTriState = js.native
  
  /* CompleteClass */
  var OffsetX: Double = js.native
  
  /* CompleteClass */
  var OffsetY: Double = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var RotateWithShape: MsoTriState = js.native
  
  /* CompleteClass */
  var Size: Double = js.native
  
  /* CompleteClass */
  var Style: MsoShadowStyle = js.native
  
  /* CompleteClass */
  var Transparency: Double = js.native
  
  /* CompleteClass */
  var Type: MsoShadowType = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
}
