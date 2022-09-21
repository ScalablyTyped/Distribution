package typings.activexPowerpoint.global.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.AddIns")
@js.native
/* private */ open class AddIns ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.AddIns {
  
  /* CompleteClass */
  override def Add(FileName: String): typings.activexPowerpoint.PowerPoint.AddIn = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typings.activexPowerpoint.PowerPoint.AddIn = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.AddIns_typekey")
  var PowerPointDotAddIns_typekey: typings.activexPowerpoint.PowerPoint.AddIns = js.native
  
  /* CompleteClass */
  override def Remove(Index: Any): Unit = js.native
}
