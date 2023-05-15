package typings.antDesignCssinjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLintersInterfaceMod {
  
  type Linter = js.Function3[/* key */ String, /* value */ String | Double, /* info */ LinterInfo, Unit]
  
  trait LinterInfo extends StObject {
    
    var hashId: js.UndefOr[String] = js.undefined
    
    var parentSelectors: js.Array[String]
    
    var path: js.UndefOr[String] = js.undefined
  }
  object LinterInfo {
    
    inline def apply(parentSelectors: js.Array[String]): LinterInfo = {
      val __obj = js.Dynamic.literal(parentSelectors = parentSelectors.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinterInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinterInfo] (val x: Self) extends AnyVal {
      
      inline def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
      
      inline def setHashIdUndefined: Self = StObject.set(x, "hashId", js.undefined)
      
      inline def setParentSelectors(value: js.Array[String]): Self = StObject.set(x, "parentSelectors", value.asInstanceOf[js.Any])
      
      inline def setParentSelectorsVarargs(value: String*): Self = StObject.set(x, "parentSelectors", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
