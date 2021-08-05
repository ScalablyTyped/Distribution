package typings.addMatchers

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(matchersByName: MatchersByName): Unit = ^.asInstanceOf[js.Dynamic].apply(matchersByName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("add-matchers/dist", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def asymmetric(matchersByName: MatchersByName): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("asymmetric")(matchersByName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object addMatchers {
    
    inline def apply(matchersByName: MatchersByName): Unit = ^.asInstanceOf[js.Dynamic].apply(matchersByName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("add-matchers/dist", "addMatchers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def asymmetric(matchersByName: MatchersByName): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("asymmetric")(matchersByName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait AdapterGetters extends StObject {
    
    var getJasmineV1Adapter: js.Any
    
    var getJasmineV2Adapter: js.Any
    
    var getJestAdapter: js.Any
  }
  object AdapterGetters {
    
    inline def apply(getJasmineV1Adapter: js.Any, getJasmineV2Adapter: js.Any, getJestAdapter: js.Any): AdapterGetters = {
      val __obj = js.Dynamic.literal(getJasmineV1Adapter = getJasmineV1Adapter.asInstanceOf[js.Any], getJasmineV2Adapter = getJasmineV2Adapter.asInstanceOf[js.Any], getJestAdapter = getJestAdapter.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdapterGetters]
    }
    
    extension [Self <: AdapterGetters](x: Self) {
      
      inline def setGetJasmineV1Adapter(value: js.Any): Self = StObject.set(x, "getJasmineV1Adapter", value.asInstanceOf[js.Any])
      
      inline def setGetJasmineV2Adapter(value: js.Any): Self = StObject.set(x, "getJasmineV2Adapter", value.asInstanceOf[js.Any])
      
      inline def setGetJestAdapter(value: js.Any): Self = StObject.set(x, "getJestAdapter", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomMatcher extends StObject {
    
    def apply(args: js.Any*): Boolean = js.native
  }
  
  type MatchersByName = StringDictionary[CustomMatcher]
  
  object global {
    
    object NodeJS {
      
      trait Global extends StObject {
        
        var any: StringDictionary[js.Any]
      }
      object Global {
        
        inline def apply(any: StringDictionary[js.Any]): Global = {
          val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
          __obj.asInstanceOf[Global]
        }
        
        extension [Self <: Global](x: Self) {
          
          inline def setAny(value: StringDictionary[js.Any]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
