package typings.autosuggestTrie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: js.Object */](items: js.Array[T], textKey: /* keyof T */ String): Trie[T] = (^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any], textKey.asInstanceOf[js.Any])).asInstanceOf[Trie[T]]
  inline def apply[T /* <: js.Object */](items: js.Array[T], textKey: /* keyof T */ String, options: TrieOptions[T]): Trie[T] = (^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any], textKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Trie[T]]
  
  @JSImport("autosuggest-trie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MatchOptions extends StObject {
    
    /**
      * Integer >= 1
      * For example: getMatches('me', { limit: 3 }) will return no more than 3 items that match 'me'.
      * @default Infinity
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Used to split the query into words.
      * @default /\s+/
      */
    var splitRegex: js.UndefOr[js.RegExp] = js.undefined
  }
  object MatchOptions {
    
    inline def apply(): MatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchOptions]
    }
    
    extension [Self <: MatchOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setSplitRegex(value: js.RegExp): Self = StObject.set(x, "splitRegex", value.asInstanceOf[js.Any])
      
      inline def setSplitRegexUndefined: Self = StObject.set(x, "splitRegex", js.undefined)
    }
  }
  
  @js.native
  trait Trie[T] extends StObject {
    
    /**
      * Returns items that match the given query.
      * @param query Non-blank query string. If query is blank, [] is returned..
      * @param options Additional query options.
      */
    def getMatches(query: String): js.Array[T] = js.native
    def getMatches(query: String, options: MatchOptions): js.Array[T] = js.native
  }
  
  trait TrieOptions[T] extends StObject {
    
    /**
      * Items comparator, similar to Array#sort's compareFunction.
      * It gets two items, and should return a number.
      *
      * Note: Matches in the first word (let's call it "group 1") are prioritized over matches in the second word ("group 2"),
      * which are prioritized over matches in the third word ("group 3"), and so on.
      * comparator will only sort the matches within each group.
      *
      * When comparator is not specified, items within each group will preserve their order in items.
      */
    var comparator: js.UndefOr[js.Function2[/* a */ T, /* b */ T, Double]] = js.undefined
    
    /**
      * Used to split items' textKey into words.
      * @default /\s+/
      */
    var splitRegex: js.UndefOr[js.RegExp] = js.undefined
  }
  object TrieOptions {
    
    inline def apply[T](): TrieOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrieOptions[T]]
    }
    
    extension [Self <: TrieOptions[?], T](x: Self & TrieOptions[T]) {
      
      inline def setComparator(value: (/* a */ T, /* b */ T) => Double): Self = StObject.set(x, "comparator", js.Any.fromFunction2(value))
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setSplitRegex(value: js.RegExp): Self = StObject.set(x, "splitRegex", value.asInstanceOf[js.Any])
      
      inline def setSplitRegexUndefined: Self = StObject.set(x, "splitRegex", js.undefined)
    }
  }
}
