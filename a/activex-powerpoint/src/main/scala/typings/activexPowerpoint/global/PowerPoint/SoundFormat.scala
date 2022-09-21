package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpSoundFormatType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.SoundFormat")
@js.native
/* private */ open class SoundFormat ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.SoundFormat {
  
  /* CompleteClass */
  override def Export(FileName: String): PpSoundFormatType = js.native
  
  /* CompleteClass */
  override def Import(FileName: String): Unit = js.native
  
  /* CompleteClass */
  override def Play(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.SoundFormat_typekey")
  var PowerPointDotSoundFormat_typekey: typings.activexPowerpoint.PowerPoint.SoundFormat = js.native
  
  /* CompleteClass */
  override val SourceFullName: String = js.native
  
  /* CompleteClass */
  override val Type: PpSoundFormatType = js.native
}
