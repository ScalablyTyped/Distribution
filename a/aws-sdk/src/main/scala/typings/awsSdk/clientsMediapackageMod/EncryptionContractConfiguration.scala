package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionContractConfiguration extends StObject {
  
  /**
    * A collection of audio encryption presets.
    */
  var PresetSpeke20Audio: typings.awsSdk.clientsMediapackageMod.PresetSpeke20Audio
  
  /**
    * A collection of video encryption presets.
    */
  var PresetSpeke20Video: typings.awsSdk.clientsMediapackageMod.PresetSpeke20Video
}
object EncryptionContractConfiguration {
  
  inline def apply(PresetSpeke20Audio: PresetSpeke20Audio, PresetSpeke20Video: PresetSpeke20Video): EncryptionContractConfiguration = {
    val __obj = js.Dynamic.literal(PresetSpeke20Audio = PresetSpeke20Audio.asInstanceOf[js.Any], PresetSpeke20Video = PresetSpeke20Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionContractConfiguration]
  }
  
  extension [Self <: EncryptionContractConfiguration](x: Self) {
    
    inline def setPresetSpeke20Audio(value: PresetSpeke20Audio): Self = StObject.set(x, "PresetSpeke20Audio", value.asInstanceOf[js.Any])
    
    inline def setPresetSpeke20Video(value: PresetSpeke20Video): Self = StObject.set(x, "PresetSpeke20Video", value.asInstanceOf[js.Any])
  }
}
