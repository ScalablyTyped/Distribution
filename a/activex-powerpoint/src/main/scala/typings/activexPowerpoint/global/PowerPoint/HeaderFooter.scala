package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpDateTimeFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.HeaderFooter")
@js.native
/* private */ class HeaderFooter ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.HeaderFooter {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var Format: PpDateTimeFormat = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.HeaderFooter_typekey")
  var PowerPointDotHeaderFooter_typekey: typings.activexPowerpoint.PowerPoint.HeaderFooter = js.native
  
  /* CompleteClass */
  var Text: String = js.native
  
  /* CompleteClass */
  var UseFormat: MsoTriState = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
}
