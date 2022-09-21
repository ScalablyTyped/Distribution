package typings.algoliasearchHelper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitIndex extends StObject {
  
  var initIndex: Any
}
object InitIndex {
  
  inline def apply(initIndex: Any): InitIndex = {
    val __obj = js.Dynamic.literal(initIndex = initIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitIndex]
  }
  
  extension [Self <: InitIndex](x: Self) {
    
    inline def setInitIndex(value: Any): Self = StObject.set(x, "initIndex", value.asInstanceOf[js.Any])
  }
}
