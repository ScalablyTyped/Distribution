package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SoundEffect extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  def ImportFromFile(FileName: String): Unit = js.native
  
  var Name: String = js.native
  
  val Parent: js.Any = js.native
  
  def Play(): Unit = js.native
  
  @JSName("PowerPoint.SoundEffect_typekey")
  var PowerPointDotSoundEffect_typekey: SoundEffect = js.native
  
  var Type: PpSoundEffectType = js.native
}
object SoundEffect {
  
  @scala.inline
  def apply(
    Application: Application,
    ImportFromFile: String => Unit,
    Name: String,
    Parent: js.Any,
    Play: () => Unit,
    PowerPointDotSoundEffect_typekey: SoundEffect,
    Type: PpSoundEffectType
  ): SoundEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ImportFromFile = js.Any.fromFunction1(ImportFromFile), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Play = js.Any.fromFunction0(Play), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SoundEffect_typekey")(PowerPointDotSoundEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundEffect]
  }
  
  @scala.inline
  implicit class SoundEffectMutableBuilder[Self <: SoundEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportFromFile(value: String => Unit): Self = StObject.set(x, "ImportFromFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "Play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPowerPointDotSoundEffect_typekey(value: SoundEffect): Self = StObject.set(x, "PowerPoint.SoundEffect_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PpSoundEffectType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
