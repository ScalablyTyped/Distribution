package typings.algoliaClientSearch.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@algolia/client-search.@algolia/client-search.DictionaryName, std.Record<string, boolean>> */
trait RecordDictionaryNameRecor extends StObject {
  
  var compounds: Record[String, Boolean]
  
  var plurals: Record[String, Boolean]
  
  var stopwords: Record[String, Boolean]
}
object RecordDictionaryNameRecor {
  
  inline def apply(
    compounds: Record[String, Boolean],
    plurals: Record[String, Boolean],
    stopwords: Record[String, Boolean]
  ): RecordDictionaryNameRecor = {
    val __obj = js.Dynamic.literal(compounds = compounds.asInstanceOf[js.Any], plurals = plurals.asInstanceOf[js.Any], stopwords = stopwords.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordDictionaryNameRecor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordDictionaryNameRecor] (val x: Self) extends AnyVal {
    
    inline def setCompounds(value: Record[String, Boolean]): Self = StObject.set(x, "compounds", value.asInstanceOf[js.Any])
    
    inline def setPlurals(value: Record[String, Boolean]): Self = StObject.set(x, "plurals", value.asInstanceOf[js.Any])
    
    inline def setStopwords(value: Record[String, Boolean]): Self = StObject.set(x, "stopwords", value.asInstanceOf[js.Any])
  }
}
