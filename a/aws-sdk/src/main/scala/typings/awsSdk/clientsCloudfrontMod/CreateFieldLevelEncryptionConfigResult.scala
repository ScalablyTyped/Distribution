package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFieldLevelEncryptionConfigResult extends StObject {
  
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Returned when you create a new field-level encryption configuration.
    */
  var FieldLevelEncryption: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.FieldLevelEncryption] = js.undefined
  
  /**
    * The fully qualified URI of the new configuration resource just created.
    */
  var Location: js.UndefOr[String] = js.undefined
}
object CreateFieldLevelEncryptionConfigResult {
  
  inline def apply(): CreateFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFieldLevelEncryptionConfigResult]
  }
  
  extension [Self <: CreateFieldLevelEncryptionConfigResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setFieldLevelEncryption(value: FieldLevelEncryption): Self = StObject.set(x, "FieldLevelEncryption", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelEncryptionUndefined: Self = StObject.set(x, "FieldLevelEncryption", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
