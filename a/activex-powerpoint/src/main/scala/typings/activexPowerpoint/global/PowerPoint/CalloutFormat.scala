package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoCalloutAngleType
import typings.activexOffice.Office.MsoCalloutDropType
import typings.activexOffice.Office.MsoCalloutType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.CalloutFormat")
@js.native
/* private */ class CalloutFormat ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.CalloutFormat {
  
  /* CompleteClass */
  var Accent: MsoTriState = js.native
  
  /* CompleteClass */
  var Angle: MsoCalloutAngleType = js.native
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var AutoAttach: MsoTriState = js.native
  
  /* CompleteClass */
  override val AutoLength: MsoTriState = js.native
  
  /* CompleteClass */
  override def AutomaticLength(): Unit = js.native
  
  /* CompleteClass */
  var Border: MsoTriState = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def CustomDrop(Drop: Double): Unit = js.native
  
  /* CompleteClass */
  override def CustomLength(Length: Double): Unit = js.native
  
  /* CompleteClass */
  override val Drop: Double = js.native
  
  /* CompleteClass */
  override val DropType: MsoCalloutDropType = js.native
  
  /* CompleteClass */
  var Gap: Double = js.native
  
  /* CompleteClass */
  override val Length: Double = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.CalloutFormat_typekey")
  var PowerPointDotCalloutFormat_typekey: typings.activexPowerpoint.PowerPoint.CalloutFormat = js.native
  
  /* CompleteClass */
  override def PresetDrop(DropType: MsoCalloutDropType): Unit = js.native
  
  /* CompleteClass */
  var Type: MsoCalloutType = js.native
}
