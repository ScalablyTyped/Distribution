package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceConnectorSettings extends StObject {
  
  /**
    * The S3 bucket that stores the Voice Connector's call detail records.
    */
  var CdrBucket: js.UndefOr[String] = js.undefined
}
object VoiceConnectorSettings {
  
  inline def apply(): VoiceConnectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceConnectorSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceConnectorSettings] (val x: Self) extends AnyVal {
    
    inline def setCdrBucket(value: String): Self = StObject.set(x, "CdrBucket", value.asInstanceOf[js.Any])
    
    inline def setCdrBucketUndefined: Self = StObject.set(x, "CdrBucket", js.undefined)
  }
}
