package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoAutoSize
import typings.activexOffice.Office.MsoHorizontalAnchor
import typings.activexOffice.Office.MsoPathFormat
import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoTextOrientation
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.MsoVerticalAnchor
import typings.activexOffice.Office.MsoWarpFormat
import typings.activexOffice.Office.Ruler2
import typings.activexOffice.Office.TextColumn2
import typings.activexOffice.Office.TextRange2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.TextFrame2")
@js.native
/* private */ class TextFrame2 ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.TextFrame2 {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var AutoSize: MsoAutoSize = js.native
  
  /* CompleteClass */
  override val Column: TextColumn2 = js.native
  
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
  var NoTextRotation: MsoTriState = js.native
  
  /* CompleteClass */
  var Orientation: MsoTextOrientation = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var PathFormat: MsoPathFormat = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.TextFrame2_typekey")
  var PowerPointDotTextFrame2_typekey: typings.activexPowerpoint.PowerPoint.TextFrame2 = js.native
  
  /* CompleteClass */
  override val Ruler: Ruler2 = js.native
  
  /* CompleteClass */
  override val TextRange: TextRange2 = js.native
  
  /* CompleteClass */
  override val ThreeD: typings.activexPowerpoint.PowerPoint.ThreeDFormat = js.native
  
  /* CompleteClass */
  var VerticalAnchor: MsoVerticalAnchor = js.native
  
  /* CompleteClass */
  var WarpFormat: MsoWarpFormat = js.native
  
  /* CompleteClass */
  var WordArtFormat: MsoPresetTextEffect = js.native
  
  /* CompleteClass */
  var WordWrap: MsoTriState = js.native
}
