package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpColorSchemeIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.ColorScheme")
@js.native
/* private */ open class ColorScheme ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.ColorScheme {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override def Colors(SchemeColor: PpColorSchemeIndex): typings.activexPowerpoint.PowerPoint.RGBColor = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.ColorScheme_typekey")
  var PowerPointDotColorScheme_typekey: typings.activexPowerpoint.PowerPoint.ColorScheme = js.native
}
