package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessCallingSettings extends StObject {
  
  /**
    * The Amazon S3 bucket designated for call detail record storage.
    */
  var CdrBucket: js.UndefOr[String] = js.undefined
}
object BusinessCallingSettings {
  
  inline def apply(): BusinessCallingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessCallingSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BusinessCallingSettings] (val x: Self) extends AnyVal {
    
    inline def setCdrBucket(value: String): Self = StObject.set(x, "CdrBucket", value.asInstanceOf[js.Any])
    
    inline def setCdrBucketUndefined: Self = StObject.set(x, "CdrBucket", js.undefined)
  }
}
