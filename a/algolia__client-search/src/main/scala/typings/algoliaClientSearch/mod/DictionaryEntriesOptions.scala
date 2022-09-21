package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictionaryEntriesOptions extends StObject {
  
  /**
    * Array of dictionary entries
    */
  val dictionaryEntries: js.Array[DictionaryEntry]
}
object DictionaryEntriesOptions {
  
  inline def apply(dictionaryEntries: js.Array[DictionaryEntry]): DictionaryEntriesOptions = {
    val __obj = js.Dynamic.literal(dictionaryEntries = dictionaryEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionaryEntriesOptions]
  }
  
  extension [Self <: DictionaryEntriesOptions](x: Self) {
    
    inline def setDictionaryEntries(value: js.Array[DictionaryEntry]): Self = StObject.set(x, "dictionaryEntries", value.asInstanceOf[js.Any])
    
    inline def setDictionaryEntriesVarargs(value: DictionaryEntry*): Self = StObject.set(x, "dictionaryEntries", js.Array(value*))
  }
}
