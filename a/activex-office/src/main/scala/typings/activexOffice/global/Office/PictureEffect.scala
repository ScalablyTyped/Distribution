package typings.activexOffice.global.Office

import typings.activexOffice.Office.EffectParameters
import typings.activexOffice.Office.MsoPictureEffectType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.PictureEffect")
@js.native
/* private */ open class PictureEffect ()
  extends StObject
     with typings.activexOffice.Office.PictureEffect {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override def EffectParameters(Index: String): typings.activexOffice.Office.EffectParameter = js.native
  /* CompleteClass */
  override def EffectParameters(Index: Double): typings.activexOffice.Office.EffectParameter = js.native
  /* CompleteClass */
  @JSName("EffectParameters")
  override val EffectParameters_Original: EffectParameters = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.PictureEffect_typekey")
  var OfficeDotPictureEffect_typekey: typings.activexOffice.Office.PictureEffect = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* CompleteClass */
  override val Type: MsoPictureEffectType = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
}
