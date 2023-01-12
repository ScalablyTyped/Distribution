package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectKeyPhrasesItemResult extends StObject {
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
  
  /**
    * One or more KeyPhrase objects, one for each key phrase detected in the document.
    */
  var KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.undefined
}
object BatchDetectKeyPhrasesItemResult {
  
  inline def apply(): BatchDetectKeyPhrasesItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectKeyPhrasesItemResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDetectKeyPhrasesItemResult] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Integer): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
    
    inline def setKeyPhrases(value: ListOfKeyPhrases): Self = StObject.set(x, "KeyPhrases", value.asInstanceOf[js.Any])
    
    inline def setKeyPhrasesUndefined: Self = StObject.set(x, "KeyPhrases", js.undefined)
    
    inline def setKeyPhrasesVarargs(value: KeyPhrase*): Self = StObject.set(x, "KeyPhrases", js.Array(value*))
  }
}
