package typings.activexPowerpoint.global.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Fonts")
@js.native
class Fonts protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.Fonts {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexPowerpoint.PowerPoint.Font = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.Fonts_typekey")
  var PowerPointDotFonts_typekey: typings.activexPowerpoint.PowerPoint.Fonts = js.native
  
  /* CompleteClass */
  override def Replace(Original: String, Replacement: String): Unit = js.native
}
