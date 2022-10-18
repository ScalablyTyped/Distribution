package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceConnectorSettings extends StObject {
  
  /**
    * The Amazon S3 bucket designated for call detail record storage.
    */
  var CdrBucket: js.UndefOr[String] = js.undefined
}
object VoiceConnectorSettings {
  
  inline def apply(): VoiceConnectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceConnectorSettings]
  }
  
  extension [Self <: VoiceConnectorSettings](x: Self) {
    
    inline def setCdrBucket(value: String): Self = StObject.set(x, "CdrBucket", value.asInstanceOf[js.Any])
    
    inline def setCdrBucketUndefined: Self = StObject.set(x, "CdrBucket", js.undefined)
  }
}
