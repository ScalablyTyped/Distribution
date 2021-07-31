package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.PictureFormat")
@js.native
class PictureFormat protected ()
  extends StObject
     with typings.activexWord.Word.PictureFormat {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var Brightness: Double = js.native
  
  /* CompleteClass */
  var ColorType: MsoPictureColorType = js.native
  
  /* CompleteClass */
  var Contrast: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var Crop: typings.activexOffice.Office.Crop = js.native
  
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
  var TransparencyColor: Double = js.native
  
  /* CompleteClass */
  var TransparentBackground: MsoTriState = js.native
  
  /* CompleteClass */
  @JSName("Word.PictureFormat_typekey")
  var WordDotPictureFormat_typekey: typings.activexWord.Word.PictureFormat = js.native
}
