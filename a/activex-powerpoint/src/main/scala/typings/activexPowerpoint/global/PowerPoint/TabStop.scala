package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpTabStopType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.TabStop")
@js.native
/* private */ class TabStop ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.TabStop {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.TabStop_typekey")
  var PowerPointDotTabStop_typekey: typings.activexPowerpoint.PowerPoint.TabStop = js.native
  
  /* CompleteClass */
  var Type: PpTabStopType = js.native
}
