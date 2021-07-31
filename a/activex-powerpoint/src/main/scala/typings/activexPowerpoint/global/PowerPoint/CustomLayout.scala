package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoThemeColorSchemeIndex
import typings.activexOffice.Office.MsoTriState
import typings.activexOffice.Office.ThemeColor
import typings.activexOffice.Office.ThemeColorScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.CustomLayout")
@js.native
class CustomLayout protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.CustomLayout {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Background: typings.activexPowerpoint.PowerPoint.ShapeRange = js.native
  
  /* CompleteClass */
  override def Copy(): Unit = js.native
  
  /* CompleteClass */
  override val CustomerData: typings.activexPowerpoint.PowerPoint.CustomerData = js.native
  
  /* CompleteClass */
  override def Cut(): Unit = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val Design: typings.activexPowerpoint.PowerPoint.Design = js.native
  
  /* CompleteClass */
  var DisplayMasterShapes: MsoTriState = js.native
  
  /* CompleteClass */
  override def Duplicate(): typings.activexPowerpoint.PowerPoint.CustomLayout = js.native
  
  /* CompleteClass */
  var FollowMasterBackground: MsoTriState = js.native
  
  /* CompleteClass */
  override val HeadersFooters: typings.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  
  /* CompleteClass */
  override val Height: Double = js.native
  
  /* CompleteClass */
  override val Hyperlinks: typings.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  var MatchingName: String = js.native
  
  /* CompleteClass */
  override def MoveTo(toPos: Double): Unit = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.CustomLayout_typekey")
  var PowerPointDotCustomLayout_typekey: typings.activexPowerpoint.PowerPoint.CustomLayout = js.native
  
  /* CompleteClass */
  var Preserved: MsoTriState = js.native
  
  /* CompleteClass */
  override def Select(): Unit = js.native
  
  /* CompleteClass */
  override val Shapes: typings.activexPowerpoint.PowerPoint.Shapes = js.native
  
  /* CompleteClass */
  override val SlideShowTransition: typings.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  
  /* CompleteClass */
  override def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  /* CompleteClass */
  @JSName("ThemeColorScheme")
  override val ThemeColorScheme_Original: ThemeColorScheme = js.native
  
  /* CompleteClass */
  override val TimeLine: typings.activexPowerpoint.PowerPoint.TimeLine = js.native
  
  /* CompleteClass */
  override val Width: Double = js.native
}
