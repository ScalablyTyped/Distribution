package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoShadowStyle
import typings.activexOffice.Office.MsoShadowType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.ShadowFormat")
@js.native
class ShadowFormat protected ()
  extends StObject
     with typings.activexWord.Word.ShadowFormat {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var Blur: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val ForeColor: typings.activexWord.Word.ColorFormat = js.native
  
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
  
  /* CompleteClass */
  @JSName("Word.ShadowFormat_typekey")
  var WordDotShadowFormat_typekey: typings.activexWord.Word.ShadowFormat = js.native
}
