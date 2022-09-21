package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.algoliaClientSearchStrings.disabled
import typings.algoliaClientSearch.algoliaClientSearchStrings.enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictionaryEntry extends StObject {
  
  val decomposition: js.UndefOr[js.Array[String]] = js.undefined
  
  val language: String
  
  /**
    * Unique identifier for the rule (format: [A-Za-z0-9_-]+).
    */
  val objectID: String
  
  val state: js.UndefOr[enabled | disabled] = js.undefined
  
  val word: js.UndefOr[String] = js.undefined
  
  val words: js.UndefOr[js.Array[String]] = js.undefined
}
object DictionaryEntry {
  
  inline def apply(language: String, objectID: String): DictionaryEntry = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryEntry]
  }
  
  extension [Self <: DictionaryEntry](x: Self) {
    
    inline def setDecomposition(value: js.Array[String]): Self = StObject.set(x, "decomposition", value.asInstanceOf[js.Any])
    
    inline def setDecompositionUndefined: Self = StObject.set(x, "decomposition", js.undefined)
    
    inline def setDecompositionVarargs(value: String*): Self = StObject.set(x, "decomposition", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    inline def setState(value: enabled | disabled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    
    inline def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
