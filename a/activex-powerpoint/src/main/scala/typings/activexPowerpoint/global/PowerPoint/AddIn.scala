package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.AddIn")
@js.native
/* private */ open class AddIn ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.AddIn {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var AutoLoad: MsoTriState = js.native
  
  /* CompleteClass */
  var DisplayAlerts: MsoTriState = js.native
  
  /* CompleteClass */
  override val FullName: String = js.native
  
  /* CompleteClass */
  var Loaded: MsoTriState = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Path: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.AddIn_typekey")
  var PowerPointDotAddIn_typekey: typings.activexPowerpoint.PowerPoint.AddIn = js.native
  
  /* CompleteClass */
  var Registered: MsoTriState = js.native
  
  /* CompleteClass */
  override val RegisteredInHKLM: MsoTriState = js.native
}
