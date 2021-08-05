package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpSoundEffectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.SoundEffect")
@js.native
/* private */ class SoundEffect ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.SoundEffect {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override def ImportFromFile(FileName: String): Unit = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Play(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.SoundEffect_typekey")
  var PowerPointDotSoundEffect_typekey: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
  
  /* CompleteClass */
  var Type: PpSoundEffectType = js.native
}
