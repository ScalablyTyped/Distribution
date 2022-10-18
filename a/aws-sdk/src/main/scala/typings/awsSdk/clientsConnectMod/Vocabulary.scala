package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vocabulary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom vocabulary.
    */
  var Arn: ARN
  
  /**
    * The content of the custom vocabulary in plain-text format with a table of values. Each row in the table represents a word or a phrase, described with Phrase, IPA, SoundsLike, and DisplayAs fields. Separate the fields with TAB characters. For more information, see Create a custom vocabulary using a table.
    */
  var Content: js.UndefOr[VocabularyContent] = js.undefined
  
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
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object Vocabulary {
  
  inline def apply(
    Arn: ARN,
    Id: VocabularyId,
    LanguageCode: VocabularyLanguageCode,
    LastModifiedTime: js.Date,
    Name: VocabularyName,
    State: VocabularyState
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LanguageCode = LanguageCode.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vocabulary]
  }
  
  extension [Self <: Vocabulary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setContent(value: VocabularyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setFailureReason(value: VocabularyFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setId(value: VocabularyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLanguageCode(value: VocabularyLanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: VocabularyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setState(value: VocabularyState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
