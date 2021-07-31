package typings.addMatchers

import org.scalablytyped.runtime.StringDictionary
import typings.addMatchers.mod.CustomMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmineV1Mod {
  
  @JSImport("add-matchers/dist/jasmine-v1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getJasmineV1Adapter(
    scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.Env */ js.Any
  ): js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[JasmineV1CustomMatcher]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJasmineV1Adapter")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[JasmineV1CustomMatcher]
  ]]
  
  @js.native
  trait JasmineV1CustomMatcher extends StObject {
    
    def apply(args: js.Any*): Boolean = js.native
  }
  
  type JasmineV1MatcherAdapter = js.Function2[/* name */ String, /* matcher */ CustomMatcher, JasmineV1CustomMatcher]
  
  type JasmineV1MatchersByName = StringDictionary[JasmineV1CustomMatcher]
}
