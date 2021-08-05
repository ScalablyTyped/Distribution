package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpBorderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Borders")
@js.native
/* private */ class Borders ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.Borders {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(BorderType: PpBorderType): typings.activexPowerpoint.PowerPoint.LineFormat = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Borders_typekey")
  var PowerPointDotBorders_typekey: typings.activexPowerpoint.PowerPoint.Borders = js.native
}
