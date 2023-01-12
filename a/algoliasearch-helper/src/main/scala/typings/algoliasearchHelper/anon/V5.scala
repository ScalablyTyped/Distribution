package typings.algoliasearchHelper.anon

import typings.algoliaClientSearch.mod.HighlightResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V5[T] extends StObject {
  
  // @ts-ignore this doesn't exist as an exact type in v3
  var v3: Any
  
  // @ts-ignore
  var v4: HighlightResult[T]
  
  // @ts-ignore the type in the v5 library is not yet correct https://github.com/algolia/api-clients-automation/issues/853
  var v5: Any
}
object V5 {
  
  inline def apply[T](v3: Any, v4: HighlightResult[T], v5: Any): V5[T] = {
    val __obj = js.Dynamic.literal(v3 = v3.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
    __obj.asInstanceOf[V5[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: V5[?], T] (val x: Self & V5[T]) extends AnyVal {
    
    inline def setV3(value: Any): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
    
    inline def setV4(value: HighlightResult[T]): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
    
    inline def setV5(value: Any): Self = StObject.set(x, "v5", value.asInstanceOf[js.Any])
  }
}
