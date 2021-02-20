package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceConnectorSettings extends StObject {
  
  /**
    * The Amazon S3 bucket designated for call detail record storage.
    */
  var CdrBucket: js.UndefOr[String] = js.native
}
object VoiceConnectorSettings {
  
  @scala.inline
  def apply(): VoiceConnectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceConnectorSettings]
  }
  
  @scala.inline
  implicit class VoiceConnectorSettingsMutableBuilder[Self <: VoiceConnectorSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdrBucket(value: String): Self = StObject.set(x, "CdrBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdrBucketUndefined: Self = StObject.set(x, "CdrBucket", js.undefined)
  }
}
