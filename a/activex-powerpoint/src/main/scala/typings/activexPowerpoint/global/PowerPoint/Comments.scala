package typings.activexPowerpoint.global.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Comments")
@js.native
class Comments protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.Comments {
  
  /* CompleteClass */
  override def Add(Left: Double, Top: Double, Author: String, AuthorInitials: String, Text: String): typings.activexPowerpoint.PowerPoint.Comment = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): typings.activexPowerpoint.PowerPoint.Comment = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.Comments_typekey")
  var PowerPointDotComments_typekey: typings.activexPowerpoint.PowerPoint.Comments = js.native
}
