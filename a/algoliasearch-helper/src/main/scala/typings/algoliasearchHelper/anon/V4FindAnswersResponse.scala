package typings.algoliasearchHelper.anon

import typings.algoliaClientSearch.mod.FindAnswersResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V4FindAnswersResponse[T] extends StObject {
  
  var v3: Any
  
  // answers only exists in v4
  // @ts-ignore
  var v4: FindAnswersResponse[T]
  
  var v5: Any
}
object V4FindAnswersResponse {
  
  inline def apply[T](v3: Any, v4: FindAnswersResponse[T], v5: Any): V4FindAnswersResponse[T] = {
    val __obj = js.Dynamic.literal(v3 = v3.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
    __obj.asInstanceOf[V4FindAnswersResponse[T]]
  }
  
  extension [Self <: V4FindAnswersResponse[?], T](x: Self & V4FindAnswersResponse[T]) {
    
    inline def setV3(value: Any): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
    
    inline def setV4(value: FindAnswersResponse[T]): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
    
    inline def setV5(value: Any): Self = StObject.set(x, "v5", value.asInstanceOf[js.Any])
  }
}
