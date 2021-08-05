package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoBackgroundStyleIndex
import typings.activexOffice.Office.OfficeTheme
import typings.activexOffice.Office.Script
import typings.activexOffice.Office.Scripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Master")
@js.native
/* private */ class Master ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.Master {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override def ApplyTheme(themeName: String): Unit = js.native
  
  /* CompleteClass */
  override val Background: typings.activexPowerpoint.PowerPoint.ShapeRange = js.native
  
  /* CompleteClass */
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  
  /* CompleteClass */
  var ColorScheme: typings.activexPowerpoint.PowerPoint.ColorScheme = js.native
  
  /* CompleteClass */
  override val CustomLayouts: typings.activexPowerpoint.PowerPoint.CustomLayouts = js.native
  
  /* CompleteClass */
  override val CustomerData: typings.activexPowerpoint.PowerPoint.CustomerData = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val Design: typings.activexPowerpoint.PowerPoint.Design = js.native
  
  /* CompleteClass */
  override val HeadersFooters: typings.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  
  /* CompleteClass */
  override val Height: Double = js.native
  
  /* CompleteClass */
  override val Hyperlinks: typings.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Master_typekey")
  var PowerPointDotMaster_typekey: typings.activexPowerpoint.PowerPoint.Master = js.native
  
  /* CompleteClass */
  override def Scripts(Index: js.Any): Script = js.native
  /* CompleteClass */
  @JSName("Scripts")
  override val Scripts_Original: Scripts = js.native
  
  /* CompleteClass */
  override val Shapes: typings.activexPowerpoint.PowerPoint.Shapes = js.native
  
  /* CompleteClass */
  override val SlideShowTransition: typings.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  
  /* CompleteClass */
  override val TextStyles: typings.activexPowerpoint.PowerPoint.TextStyles = js.native
  
  /* CompleteClass */
  override val Theme: OfficeTheme = js.native
  
  /* CompleteClass */
  override val TimeLine: typings.activexPowerpoint.PowerPoint.TimeLine = js.native
  
  /* CompleteClass */
  override val Width: Double = js.native
}
