package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.ActionSetting")
@js.native
/* private */ open class ActionSetting ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.ActionSetting {
  
  /* CompleteClass */
  var Action: PpActionType = js.native
  
  /* CompleteClass */
  var ActionVerb: String = js.native
  
  /* CompleteClass */
  var AnimateAction: MsoTriState = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Hyperlink: typings.activexPowerpoint.PowerPoint.Hyperlink = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.ActionSetting_typekey")
  var PowerPointDotActionSetting_typekey: typings.activexPowerpoint.PowerPoint.ActionSetting = js.native
  
  /* CompleteClass */
  var Run: String = js.native
  
  /* CompleteClass */
  var ShowAndReturn: MsoTriState = js.native
  
  /* CompleteClass */
  var SlideShowName: String = js.native
  
  /* CompleteClass */
  override val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
}
