package typings.atlaskitInProductTesting

import typings.atlaskitInProductTesting.distTypesTypesMod.CypressType
import typings.atlaskitInProductTesting.distTypesTypesMod.InProductCommonTestCaseOpts
import typings.cypress.Cypress.cy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonTypesBaseTestCaseMod {
  
  @JSImport("@atlaskit/in-product-testing/dist/types/common/types/base-test-case", "InProductTestCase")
  @js.native
  open class InProductTestCase protected () extends StObject {
    def this(opts: InProductTestCaseOpts[Any]) = this()
    
    /* private */ var _assertions: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _precondition: Any = js.native
    
    /* private */ var _testOptions: Any = js.native
    
    /* private */ var _title: Any = js.native
    
    def assertions: js.Function1[
        /* cy */ cy & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter */ Any), 
        Unit
      ] = js.native
    
    /* private */ var shouldSkipTest: Any = js.native
    
    def test(cy: CypressType): Unit = js.native
  }
  
  trait InProductTestCaseOpts[TestCaseOpts /* <: InProductCommonTestCaseOpts */] extends StObject {
    
    def assertions(cy: CypressType): Unit
    
    var id: String
    
    var precondition: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var testOptions: js.UndefOr[TestCaseOpts] = js.undefined
    
    var title: String
  }
  object InProductTestCaseOpts {
    
    inline def apply[TestCaseOpts /* <: InProductCommonTestCaseOpts */](assertions: CypressType => Unit, id: String, title: String): InProductTestCaseOpts[TestCaseOpts] = {
      val __obj = js.Dynamic.literal(assertions = js.Any.fromFunction1(assertions), id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[InProductTestCaseOpts[TestCaseOpts]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InProductTestCaseOpts[?], TestCaseOpts /* <: InProductCommonTestCaseOpts */] (val x: Self & InProductTestCaseOpts[TestCaseOpts]) extends AnyVal {
      
      inline def setAssertions(value: CypressType => Unit): Self = StObject.set(x, "assertions", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrecondition(value: () => Boolean): Self = StObject.set(x, "precondition", js.Any.fromFunction0(value))
      
      inline def setPreconditionUndefined: Self = StObject.set(x, "precondition", js.undefined)
      
      inline def setTestOptions(value: TestCaseOpts): Self = StObject.set(x, "testOptions", value.asInstanceOf[js.Any])
      
      inline def setTestOptionsUndefined: Self = StObject.set(x, "testOptions", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
