package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionSetting extends StObject {
  
  /**
    * The password used to encrypt the associated transcript file.
    */
  var associatedTranscriptsPassword: js.UndefOr[FilePassword] = js.undefined
  
  /**
    * The password used to encrypt the recommended bot recommendation file.
    */
  var botLocaleExportPassword: js.UndefOr[FilePassword] = js.undefined
  
  /**
    * The KMS key ARN used to encrypt the metadata associated with the bot recommendation.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
}
object EncryptionSetting {
  
  inline def apply(): EncryptionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionSetting] (val x: Self) extends AnyVal {
    
    inline def setAssociatedTranscriptsPassword(value: FilePassword): Self = StObject.set(x, "associatedTranscriptsPassword", value.asInstanceOf[js.Any])
    
    inline def setAssociatedTranscriptsPasswordUndefined: Self = StObject.set(x, "associatedTranscriptsPassword", js.undefined)
    
    inline def setBotLocaleExportPassword(value: FilePassword): Self = StObject.set(x, "botLocaleExportPassword", value.asInstanceOf[js.Any])
    
    inline def setBotLocaleExportPasswordUndefined: Self = StObject.set(x, "botLocaleExportPassword", js.undefined)
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
  }
}
