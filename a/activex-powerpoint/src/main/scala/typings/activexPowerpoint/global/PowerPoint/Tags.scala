package typings.activexPowerpoint.global.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Tags")
@js.native
/* private */ class Tags ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.Tags {
  
  /* CompleteClass */
  override def Add(Name: String, Value: String): Unit = js.native
  
  /* CompleteClass */
  override def AddBinary(Name: String, FilePath: String): Unit = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override def BinaryValue(Name: String): Double = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Delete(Name: String): Unit = js.native
  
  /* CompleteClass */
  override def Item(Name: String): String = js.native
  
  /* CompleteClass */
  override def Name(Index: Double): String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Tags_typekey")
  var PowerPointDotTags_typekey: typings.activexPowerpoint.PowerPoint.Tags = js.native
  
  /* CompleteClass */
  override def Value(Index: Double): String = js.native
}
