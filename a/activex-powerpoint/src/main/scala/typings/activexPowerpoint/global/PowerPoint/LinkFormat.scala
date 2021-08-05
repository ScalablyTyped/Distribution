package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpUpdateOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.LinkFormat")
@js.native
/* private */ class LinkFormat ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.LinkFormat {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var AutoUpdate: PpUpdateOption = js.native
  
  /* CompleteClass */
  override def BreakLink(): Unit = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.LinkFormat_typekey")
  var PowerPointDotLinkFormat_typekey: typings.activexPowerpoint.PowerPoint.LinkFormat = js.native
  
  /* CompleteClass */
  var SourceFullName: String = js.native
  
  /* CompleteClass */
  override def Update(): Unit = js.native
}
