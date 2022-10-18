package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexProgramSettings extends StObject {
  
  /**
    * Indicates which pipeline is preferred by the multiplex for program ingest.
    */
  var PreferredChannelPipeline: js.UndefOr[typings.awsSdk.clientsMedialiveMod.PreferredChannelPipeline] = js.undefined
  
  /**
    * Unique program number.
    */
  var ProgramNumber: integerMin0Max65535
  
  /**
    * Transport stream service descriptor configuration for the Multiplex program.
    */
  var ServiceDescriptor: js.UndefOr[MultiplexProgramServiceDescriptor] = js.undefined
  
  /**
    * Program video settings configuration.
    */
  var VideoSettings: js.UndefOr[MultiplexVideoSettings] = js.undefined
}
object MultiplexProgramSettings {
  
  inline def apply(ProgramNumber: integerMin0Max65535): MultiplexProgramSettings = {
    val __obj = js.Dynamic.literal(ProgramNumber = ProgramNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiplexProgramSettings]
  }
  
  extension [Self <: MultiplexProgramSettings](x: Self) {
    
    inline def setPreferredChannelPipeline(value: PreferredChannelPipeline): Self = StObject.set(x, "PreferredChannelPipeline", value.asInstanceOf[js.Any])
    
    inline def setPreferredChannelPipelineUndefined: Self = StObject.set(x, "PreferredChannelPipeline", js.undefined)
    
    inline def setProgramNumber(value: integerMin0Max65535): Self = StObject.set(x, "ProgramNumber", value.asInstanceOf[js.Any])
    
    inline def setServiceDescriptor(value: MultiplexProgramServiceDescriptor): Self = StObject.set(x, "ServiceDescriptor", value.asInstanceOf[js.Any])
    
    inline def setServiceDescriptorUndefined: Self = StObject.set(x, "ServiceDescriptor", js.undefined)
    
    inline def setVideoSettings(value: MultiplexVideoSettings): Self = StObject.set(x, "VideoSettings", value.asInstanceOf[js.Any])
    
    inline def setVideoSettingsUndefined: Self = StObject.set(x, "VideoSettings", js.undefined)
  }
}
