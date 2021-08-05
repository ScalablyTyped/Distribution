package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Design")
@js.native
/* private */ class Design ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.Design {
  
  /* CompleteClass */
  override def AddTitleMaster(): typings.activexPowerpoint.PowerPoint.Master = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val HasTitleMaster: MsoTriState = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override def MoveTo(toPos: Double): Unit = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Design_typekey")
  var PowerPointDotDesign_typekey: typings.activexPowerpoint.PowerPoint.Design = js.native
  
  /* CompleteClass */
  var Preserved: MsoTriState = js.native
  
  /* CompleteClass */
  override val SlideMaster: typings.activexPowerpoint.PowerPoint.Master = js.native
  
  /* CompleteClass */
  override val TitleMaster: typings.activexPowerpoint.PowerPoint.Master = js.native
}
