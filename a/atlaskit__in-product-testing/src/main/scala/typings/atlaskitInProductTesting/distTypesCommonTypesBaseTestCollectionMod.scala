package typings.atlaskitInProductTesting

import typings.atlaskitInProductTesting.distTypesCommonTypesBaseTestCaseMod.InProductTestCase
import typings.atlaskitInProductTesting.distTypesTypesMod.CypressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonTypesBaseTestCollectionMod {
  
  @JSImport("@atlaskit/in-product-testing/dist/types/common/types/base-test-collection", "InProductTestCollection")
  @js.native
  open class InProductTestCollection protected () extends StObject {
    def this(opts: InProductTestCollectionOpts) = this()
    
    def test(cy: CypressType): Unit = js.native
    
    /* private */ var testCases: Any = js.native
    
    /* private */ var title: Any = js.native
  }
  
  trait InProductTestCollectionOpts extends StObject {
    
    var testCases: js.Array[InProductTestCase]
    
    var title: String
  }
  object InProductTestCollectionOpts {
    
    inline def apply(testCases: js.Array[InProductTestCase], title: String): InProductTestCollectionOpts = {
      val __obj = js.Dynamic.literal(testCases = testCases.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[InProductTestCollectionOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InProductTestCollectionOpts] (val x: Self) extends AnyVal {
      
      inline def setTestCases(value: js.Array[InProductTestCase]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
      
      inline def setTestCasesVarargs(value: InProductTestCase*): Self = StObject.set(x, "testCases", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
