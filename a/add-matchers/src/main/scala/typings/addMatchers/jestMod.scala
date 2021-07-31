package typings.addMatchers

import org.scalablytyped.runtime.StringDictionary
import typings.addMatchers.anon.Expect
import typings.addMatchers.mod.CustomMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestMod {
  
  @JSImport("add-matchers/dist/jest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getJestAdapter(scope: Expect): js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.CustomMatcher */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJestAdapter")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.CustomMatcher */ js.Any
    ]
  ]]
  
  type JestMatcherAdapter = js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.CustomMatcher */ js.Any
  ]
}
