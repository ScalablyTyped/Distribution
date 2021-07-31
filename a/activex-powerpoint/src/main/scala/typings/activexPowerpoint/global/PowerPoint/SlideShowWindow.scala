package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.SlideShowWindow")
@js.native
class SlideShowWindow protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.SlideShowWindow {
  
  /* CompleteClass */
  override def Activate(): Unit = js.native
  
  /* CompleteClass */
  override val Active: MsoTriState = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var Height: Double = js.native
  
  /* CompleteClass */
  override val IsFullScreen: MsoTriState = js.native
  
  /* CompleteClass */
  var Left: Double = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.SlideShowWindow_typekey")
  var PowerPointDotSlideShowWindow_typekey: typings.activexPowerpoint.PowerPoint.SlideShowWindow = js.native
  
  /* CompleteClass */
  override val Presentation: typings.activexPowerpoint.PowerPoint.Presentation = js.native
  
  /* CompleteClass */
  var Top: Double = js.native
  
  /* CompleteClass */
  override val View: typings.activexPowerpoint.PowerPoint.SlideShowView = js.native
  
  /* CompleteClass */
  var Width: Double = js.native
}
