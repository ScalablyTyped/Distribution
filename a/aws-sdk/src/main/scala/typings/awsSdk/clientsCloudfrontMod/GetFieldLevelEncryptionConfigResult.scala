package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFieldLevelEncryptionConfigResult extends StObject {
  
  /**
    * The current version of the field level encryption configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Return the field-level encryption configuration information.
    */
  var FieldLevelEncryptionConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.FieldLevelEncryptionConfig] = js.undefined
}
object GetFieldLevelEncryptionConfigResult {
  
  inline def apply(): GetFieldLevelEncryptionConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFieldLevelEncryptionConfigResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFieldLevelEncryptionConfigResult] (val x: Self) extends AnyVal {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setFieldLevelEncryptionConfig(value: FieldLevelEncryptionConfig): Self = StObject.set(x, "FieldLevelEncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setFieldLevelEncryptionConfigUndefined: Self = StObject.set(x, "FieldLevelEncryptionConfig", js.undefined)
  }
}
