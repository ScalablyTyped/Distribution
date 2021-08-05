package typings.apicache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exclude extends StObject {
    
    /** list status codes to specifically exclude (e.g. [404, 403] cache all responses unless they had a 404 or 403 status) */
    var exclude: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** list status codes to require (e.g. [200] caches ONLY responses with a success/200 code) */
    var include: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Exclude {
    
    inline def apply(): Exclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclude]
    }
    
    extension [Self <: Exclude](x: Self) {
      
      inline def setExclude(value: js.Array[Double]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: Double*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setInclude(value: js.Array[Double]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: Double*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
}
