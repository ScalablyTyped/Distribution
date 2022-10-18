package typings.algoliasearchHelper.anon

import typings.algoliaClientSearch.mod.SnippetResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V4SnippetResult[T] extends StObject {
  
  // @ts-ignore this doesn't exist as an exact type in v3
  var v3: Any
  
  // @ts-ignore
  var v4: SnippetResult[T]
  
  // @ts-ignore the type in the v5 library is not yet correct https://github.com/algolia/api-clients-automation/issues/853
  var v5: Any
}
object V4SnippetResult {
  
  inline def apply[T](v3: Any, v4: SnippetResult[T], v5: Any): V4SnippetResult[T] = {
    val __obj = js.Dynamic.literal(v3 = v3.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
    __obj.asInstanceOf[V4SnippetResult[T]]
  }
  
  extension [Self <: V4SnippetResult[?], T](x: Self & V4SnippetResult[T]) {
    
    inline def setV3(value: Any): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
    
    inline def setV4(value: SnippetResult[T]): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
    
    inline def setV5(value: Any): Self = StObject.set(x, "v5", value.asInstanceOf[js.Any])
  }
}
