package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureEffect extends StObject {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  def EffectParameters(Index: String): EffectParameter = js.native
  def EffectParameters(Index: Double): EffectParameter = js.native
  @JSName("EffectParameters")
  val EffectParameters_Original: EffectParameters = js.native
  
  @JSName("Office.PictureEffect_typekey")
  var OfficeDotPictureEffect_typekey: PictureEffect = js.native
  
  var Position: Double = js.native
  
  val Type: MsoPictureEffectType = js.native
  
  var Visible: MsoTriState = js.native
}
