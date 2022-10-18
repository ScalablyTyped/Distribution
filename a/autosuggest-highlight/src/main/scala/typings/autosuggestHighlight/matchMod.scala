package typings.autosuggestHighlight

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchMod {
  
  inline def apply(text: String, query: String): js.Array[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  inline def apply(text: String, query: String, options: Options): js.Array[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[Double, Double]]]
  
  @JSImport("autosuggest-highlight/match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Finds all occurrences of each match.
      *
      * @default false
      */
    var findAllOccurrences: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Searches inside words.
      *
      * @default false
      */
    var insideWords: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Requires each word of query to be found in text or else returns an empty
      * set.
      *
      * @default false
      */
    var requireMatchAll: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFindAllOccurrences(value: Boolean): Self = StObject.set(x, "findAllOccurrences", value.asInstanceOf[js.Any])
      
      inline def setFindAllOccurrencesUndefined: Self = StObject.set(x, "findAllOccurrences", js.undefined)
      
      inline def setInsideWords(value: Boolean): Self = StObject.set(x, "insideWords", value.asInstanceOf[js.Any])
      
      inline def setInsideWordsUndefined: Self = StObject.set(x, "insideWords", js.undefined)
      
      inline def setRequireMatchAll(value: Boolean): Self = StObject.set(x, "requireMatchAll", value.asInstanceOf[js.Any])
      
      inline def setRequireMatchAllUndefined: Self = StObject.set(x, "requireMatchAll", js.undefined)
    }
  }
}
