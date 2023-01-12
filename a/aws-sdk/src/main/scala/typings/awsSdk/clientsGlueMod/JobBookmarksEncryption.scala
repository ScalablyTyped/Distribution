package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobBookmarksEncryption extends StObject {
  
  /**
    * The encryption mode to use for job bookmarks data.
    */
  var JobBookmarksEncryptionMode: js.UndefOr[typings.awsSdk.clientsGlueMod.JobBookmarksEncryptionMode] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.clientsGlueMod.KmsKeyArn] = js.undefined
}
object JobBookmarksEncryption {
  
  inline def apply(): JobBookmarksEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobBookmarksEncryption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobBookmarksEncryption] (val x: Self) extends AnyVal {
    
    inline def setJobBookmarksEncryptionMode(value: JobBookmarksEncryptionMode): Self = StObject.set(x, "JobBookmarksEncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setJobBookmarksEncryptionModeUndefined: Self = StObject.set(x, "JobBookmarksEncryptionMode", js.undefined)
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
  }
}
