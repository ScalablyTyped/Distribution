package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoOrientation
import typings.activexPowerpoint.PowerPoint.PpSlideSizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.PageSetup")
@js.native
class PageSetup protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.PageSetup {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var FirstSlideNumber: Double = js.native
  
  /* CompleteClass */
  var NotesOrientation: MsoOrientation = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.PageSetup_typekey")
  var PowerPointDotPageSetup_typekey: typings.activexPowerpoint.PowerPoint.PageSetup = js.native
  
  /* CompleteClass */
  var SlideHeight: Double = js.native
  
  /* CompleteClass */
  var SlideOrientation: MsoOrientation = js.native
  
  /* CompleteClass */
  var SlideSize: PpSlideSizeType = js.native
  
  /* CompleteClass */
  var SlideWidth: Double = js.native
}
