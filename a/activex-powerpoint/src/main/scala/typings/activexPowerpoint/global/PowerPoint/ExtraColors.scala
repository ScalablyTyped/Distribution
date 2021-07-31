package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoRGBType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.ExtraColors")
@js.native
class ExtraColors protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.ExtraColors {
  
  /* CompleteClass */
  override def Add(Type: MsoRGBType): Unit = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): MsoRGBType = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.ExtraColors_typekey")
  var PowerPointDotExtraColors_typekey: typings.activexPowerpoint.PowerPoint.ExtraColors = js.native
}
