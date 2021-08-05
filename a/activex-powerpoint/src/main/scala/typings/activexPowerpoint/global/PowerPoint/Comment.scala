package typings.activexPowerpoint.global.PowerPoint

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Comment")
@js.native
/* private */ class Comment ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.Comment {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Author: String = js.native
  
  /* CompleteClass */
  override val AuthorIndex: Double = js.native
  
  /* CompleteClass */
  override val AuthorInitials: String = js.native
  
  /* CompleteClass */
  override val DateTime: VarDate = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val Left: Double = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Comment_typekey")
  var PowerPointDotComment_typekey: typings.activexPowerpoint.PowerPoint.Comment = js.native
  
  /* CompleteClass */
  override val Text: String = js.native
  
  /* CompleteClass */
  override val Top: Double = js.native
}
