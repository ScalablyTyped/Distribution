package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpHTMLVersion
import typings.activexPowerpoint.PowerPoint.PpPublishSourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.PublishObject")
@js.native
/* private */ open class PublishObject ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.PublishObject {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var FileName: String = js.native
  
  /* CompleteClass */
  var HTMLVersion: PpHTMLVersion = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.PublishObject_typekey")
  var PowerPointDotPublishObject_typekey: typings.activexPowerpoint.PowerPoint.PublishObject = js.native
  
  /* CompleteClass */
  override def Publish(): Unit = js.native
  
  /* CompleteClass */
  var RangeEnd: Double = js.native
  
  /* CompleteClass */
  var RangeStart: Double = js.native
  
  /* CompleteClass */
  var SlideShowName: String = js.native
  
  /* CompleteClass */
  var SourceType: PpPublishSourceType = js.native
  
  /* CompleteClass */
  var SpeakerNotes: MsoTriState = js.native
}
