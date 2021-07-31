package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoHorizontalAnchor
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoVerticalAnchor
import typings.activexPowerpoint.PowerPoint.PpAutoSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.TextFrame")
@js.native
class TextFrame protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.TextFrame {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var AutoSize: PpAutoSize = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def DeleteText(): Unit = js.native
  
  /* CompleteClass */
  override val HasText: MsoTriState = js.native
  
  /* CompleteClass */
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  
  /* CompleteClass */
  var MarginBottom: Double = js.native
  
  /* CompleteClass */
  var MarginLeft: Double = js.native
  
  /* CompleteClass */
  var MarginRight: Double = js.native
  
  /* CompleteClass */
  var MarginTop: Double = js.native
  
  /* CompleteClass */
  var Orientation: MsoTextOrientation = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.TextFrame_typekey")
  var PowerPointDotTextFrame_typekey: typings.activexPowerpoint.PowerPoint.TextFrame = js.native
  
  /* CompleteClass */
  override val Ruler: typings.activexPowerpoint.PowerPoint.Ruler = js.native
  
  /* CompleteClass */
  override val TextRange: typings.activexPowerpoint.PowerPoint.TextRange = js.native
  
  /* CompleteClass */
  var VerticalAnchor: MsoVerticalAnchor = js.native
  
  /* CompleteClass */
  var WordWrap: MsoTriState = js.native
}
