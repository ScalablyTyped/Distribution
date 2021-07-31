package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpMouseActivation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.ActionSettings")
@js.native
class ActionSettings protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.ActionSettings {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: PpMouseActivation): typings.activexPowerpoint.PowerPoint.ActionSetting = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.ActionSettings_typekey")
  var PowerPointDotActionSettings_typekey: typings.activexPowerpoint.PowerPoint.ActionSettings = js.native
}
