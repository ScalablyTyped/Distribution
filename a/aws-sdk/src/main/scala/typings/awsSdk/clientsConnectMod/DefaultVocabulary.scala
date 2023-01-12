package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultVocabulary extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see What is Amazon Transcribe? 
    */
  var LanguageCode: VocabularyLanguageCode
  
  /**
    * The identifier of the custom vocabulary.
    */
  var VocabularyId: typings.awsSdk.clientsConnectMod.VocabularyId
  
  /**
    * A unique name of the custom vocabulary.
    */
  var VocabularyName: typings.awsSdk.clientsConnectMod.VocabularyName
}
object DefaultVocabulary {
  
  inline def apply(
    InstanceId: InstanceId,
    LanguageCode: VocabularyLanguageCode,
    VocabularyId: VocabularyId,
    VocabularyName: VocabularyName
  ): DefaultVocabulary = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyId = VocabularyId.asInstanceOf[js.Any], VocabularyName = VocabularyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultVocabulary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultVocabulary] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: VocabularyLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setVocabularyId(value: VocabularyId): Self = StObject.set(x, "VocabularyId", value.asInstanceOf[js.Any])
    
    inline def setVocabularyName(value: VocabularyName): Self = StObject.set(x, "VocabularyName", value.asInstanceOf[js.Any])
  }
}
