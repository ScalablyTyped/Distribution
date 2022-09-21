package typings.algoliasearchHelper.anon

import typings.algoliaClientSearch.mod.FindAnswersOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V4FindAnswersOptions extends StObject {
  
  var v3: Any
  
  // answers only exists in v4
  // @ts-ignore
  var v4: FindAnswersOptions
  
  var v5: Any
}
object V4FindAnswersOptions {
  
  inline def apply(v3: Any, v4: FindAnswersOptions, v5: Any): V4FindAnswersOptions = {
    val __obj = js.Dynamic.literal(v3 = v3.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
    __obj.asInstanceOf[V4FindAnswersOptions]
  }
  
  extension [Self <: V4FindAnswersOptions](x: Self) {
    
    inline def setV3(value: Any): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
    
    inline def setV4(value: FindAnswersOptions): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
    
    inline def setV5(value: Any): Self = StObject.set(x, "v5", value.asInstanceOf[js.Any])
  }
}
