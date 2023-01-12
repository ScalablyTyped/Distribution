package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VocabularySummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom vocabulary.
    */
  var Arn: ARN
  
  /**
    * The reason why the custom vocabulary was not created.
    */
  var FailureReason: js.UndefOr[VocabularyFailureReason] = js.undefined
  
  /**
    * The identifier of the custom vocabulary.
    */
  var Id: VocabularyId
  
  /**
    * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see What is Amazon Transcribe? 
    */
  var LanguageCode: VocabularyLanguageCode
  
  /**
    * The timestamp when the custom vocabulary was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * A unique name of the custom vocabulary.
    */
  var Name: VocabularyName
  
  /**
    * The current state of the custom vocabulary.
    */
  var State: VocabularyState
}
object VocabularySummary {
  
  inline def apply(
    Arn: ARN,
    Id: VocabularyId,
    LanguageCode: VocabularyLanguageCode,
    LastModifiedTime: js.Date,
    Name: VocabularyName,
    State: VocabularyState
  ): VocabularySummary = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[VocabularySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VocabularySummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: VocabularyFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setId(value: VocabularyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: VocabularyLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: VocabularyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setState(value: VocabularyState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
