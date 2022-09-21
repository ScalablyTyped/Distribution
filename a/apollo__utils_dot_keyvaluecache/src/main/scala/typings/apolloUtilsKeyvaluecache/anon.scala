package typings.apolloUtilsKeyvaluecache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ttl extends StObject {
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object Ttl {
    
    inline def apply(): Ttl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ttl]
    }
    
    extension [Self <: Ttl](x: Self) {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
