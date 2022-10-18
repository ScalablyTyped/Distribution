package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFieldLevelEncryptionProfileResult extends StObject {
  
  /**
    * The current version of the field level encryption profile. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Returned when you create a new field-level encryption profile.
    */
  var FieldLevelEncryptionProfile: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.FieldLevelEncryptionProfile] = js.undefined
  
  /**
    * The fully qualified URI of the new profile resource just created.
    */
  var Location: js.UndefOr[String] = js.undefined
}
object CreateFieldLevelEncryptionProfileResult {
  
  inline def apply(): CreateFieldLevelEncryptionProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFieldLevelEncryptionProfileResult]
  }
  
  extension [Self <: CreateFieldLevelEncryptionProfileResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setFieldLevelEncryptionProfile(value: FieldLevelEncryptionProfile): Self = StObject.set(x, "FieldLevelEncryptionProfile", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelEncryptionProfileUndefined: Self = StObject.set(x, "FieldLevelEncryptionProfile", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
