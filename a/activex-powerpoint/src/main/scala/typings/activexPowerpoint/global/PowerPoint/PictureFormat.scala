package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.PictureFormat")
@js.native
class PictureFormat protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.PictureFormat {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var Brightness: Double = js.native
  
  /* CompleteClass */
  var ColorType: MsoPictureColorType = js.native
  
  /* CompleteClass */
  var Contrast: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val Crop: typings.activexOffice.Office.Crop = js.native
  
  /* CompleteClass */
  var CropBottom: Double = js.native
  
  /* CompleteClass */
  var CropLeft: Double = js.native
  
  /* CompleteClass */
  var CropRight: Double = js.native
  
  /* CompleteClass */
  var CropTop: Double = js.native
  
  /* CompleteClass */
  override def IncrementBrightness(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override def IncrementContrast(Increment: Double): Unit = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.PictureFormat_typekey")
  var PowerPointDotPictureFormat_typekey: typings.activexPowerpoint.PowerPoint.PictureFormat = js.native
  
  /* CompleteClass */
  var TransparencyColor: MsoRGBType = js.native
  
  /* CompleteClass */
  var TransparentBackground: MsoTriState = js.native
}
