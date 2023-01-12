package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDefaultVocabulariesResponse extends StObject {
  
  /**
    * A list of default vocabularies.
    */
  var DefaultVocabularyList: typings.awsSdk.clientsConnectMod.DefaultVocabularyList
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[VocabularyNextToken] = js.undefined
}
object ListDefaultVocabulariesResponse {
  
  inline def apply(DefaultVocabularyList: DefaultVocabularyList): ListDefaultVocabulariesResponse = {
    val __obj = js.Dynamic.literal(DefaultVocabularyList = DefaultVocabularyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDefaultVocabulariesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDefaultVocabulariesResponse] (val x: Self) extends AnyVal {
    
    inline def setDefaultVocabularyList(value: DefaultVocabularyList): Self = StObject.set(x, "DefaultVocabularyList", value.asInstanceOf[js.Any])
    
    inline def setDefaultVocabularyListVarargs(value: DefaultVocabulary*): Self = StObject.set(x, "DefaultVocabularyList", js.Array(value*))
    
    inline def setNextToken(value: VocabularyNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
