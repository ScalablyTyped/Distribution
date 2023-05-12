package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLegalHoldInput extends StObject {
  
  /**
    * This is the string description of the legal hold.
    */
  var Description: String
  
  /**
    * This is a user-chosen string used to distinguish between otherwise identical calls. Retrying a successful request with the same idempotency token results in a success message with no action taken.
    */
  var IdempotencyToken: js.UndefOr[String] = js.undefined
  
  /**
    * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
    */
  var RecoveryPointSelection: js.UndefOr[typings.awsSdk.clientsBackupMod.RecoveryPointSelection] = js.undefined
  
  /**
    * Optional tags to include. A tag is a key-value pair you can use to manage, filter, and search for your resources. Allowed characters include UTF-8 letters, numbers, spaces, and the following characters: + - = . _ : /. 
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsBackupMod.Tags] = js.undefined
  
  /**
    * This is the string title of the legal hold.
    */
  var Title: String
}
object CreateLegalHoldInput {
  
  inline def apply(Description: String, Title: String): CreateLegalHoldInput = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLegalHoldInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLegalHoldInput] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyToken(value: String): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setRecoveryPointSelection(value: RecoveryPointSelection): Self = StObject.set(x, "RecoveryPointSelection", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointSelectionUndefined: Self = StObject.set(x, "RecoveryPointSelection", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
