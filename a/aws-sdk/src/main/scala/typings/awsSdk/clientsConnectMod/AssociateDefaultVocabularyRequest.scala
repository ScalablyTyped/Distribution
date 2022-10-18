package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateDefaultVocabularyRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see What is Amazon Transcribe? 
    */
  var LanguageCode: VocabularyLanguageCode
  
  /**
    * The identifier of the custom vocabulary. If this is empty, the default is set to none.
    */
  var VocabularyId: js.UndefOr[typings.awsSdk.clientsConnectMod.VocabularyId] = js.undefined
}
object AssociateDefaultVocabularyRequest {
  
  inline def apply(InstanceId: InstanceId, LanguageCode: VocabularyLanguageCode): AssociateDefaultVocabularyRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDefaultVocabularyRequest]
  }
  
  extension [Self <: AssociateDefaultVocabularyRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: VocabularyLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setVocabularyId(value: VocabularyId): Self = StObject.set(x, "VocabularyId", value.asInstanceOf[js.Any])
    
    inline def setVocabularyIdUndefined: Self = StObject.set(x, "VocabularyId", js.undefined)
  }
}
