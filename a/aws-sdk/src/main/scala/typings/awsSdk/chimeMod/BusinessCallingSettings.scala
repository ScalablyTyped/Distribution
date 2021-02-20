package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusinessCallingSettings extends StObject {
  
  /**
    * The Amazon S3 bucket designated for call detail record storage.
    */
  var CdrBucket: js.UndefOr[String] = js.native
}
object BusinessCallingSettings {
  
  @scala.inline
  def apply(): BusinessCallingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessCallingSettings]
  }
  
  @scala.inline
  implicit class BusinessCallingSettingsMutableBuilder[Self <: BusinessCallingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdrBucket(value: String): Self = StObject.set(x, "CdrBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdrBucketUndefined: Self = StObject.set(x, "CdrBucket", js.undefined)
  }
}
