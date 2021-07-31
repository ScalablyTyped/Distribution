package typings.addMatchers

import org.scalablytyped.runtime.StringDictionary
import typings.addMatchers.anon.BeforeEach
import typings.addMatchers.mod.CustomMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmineV2Mod {
  
  @JSImport("add-matchers/dist/jasmine-v2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getJasmineV2Adapter(scope: BeforeEach): js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.CustomMatcherFactory */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJasmineV2Adapter")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.CustomMatcherFactory */ js.Any
    ]
  ]]
  
  type JasmineV2MatcherAdapter = js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.CustomMatcherFactory */ js.Any
  ]
}
