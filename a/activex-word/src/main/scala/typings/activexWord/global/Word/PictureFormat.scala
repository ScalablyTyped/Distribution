package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoPictureColorType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.PictureFormat")
@js.native
class PictureFormat protected ()
  extends typings.activexWord.Word.PictureFormat {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var Brightness: Double = js.native
  /* CompleteClass */
  override var ColorType: MsoPictureColorType = js.native
  /* CompleteClass */
  override var Contrast: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Crop: typings.activexOffice.Office.Crop = js.native
  /* CompleteClass */
  override var CropBottom: Double = js.native
  /* CompleteClass */
  override var CropLeft: Double = js.native
  /* CompleteClass */
  override var CropRight: Double = js.native
  /* CompleteClass */
  override var CropTop: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var TransparencyColor: Double = js.native
  /* CompleteClass */
  override var TransparentBackground: MsoTriState = js.native
  /* CompleteClass */
  @JSName("Word.PictureFormat_typekey")
  override var WordDotPictureFormat_typekey: typings.activexWord.Word.PictureFormat = js.native
  /* CompleteClass */
  override def IncrementBrightness(Increment: Double): Unit = js.native
  /* CompleteClass */
  override def IncrementContrast(Increment: Double): Unit = js.native
}

