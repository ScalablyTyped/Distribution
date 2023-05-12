package typings.atlaskitInProductTesting

import typings.atlaskitInProductTesting.distTypesCommonTypesBaseTestCaseMod.InProductTestCaseOpts
import typings.atlaskitInProductTesting.distTypesCommonTypesBaseTestCollectionMod.InProductTestCollectionOpts
import typings.atlaskitInProductTesting.distTypesTypesMod.CypressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/in-product-testing", "InProductTestCase")
  @js.native
  open class InProductTestCase protected ()
    extends typings.atlaskitInProductTesting.distTypesCommonTypesBaseTestCaseMod.InProductTestCase {
    def this(opts: InProductTestCaseOpts[Any]) = this()
  }
  
  @JSImport("@atlaskit/in-product-testing", "InProductTestCollection")
  @js.native
  open class InProductTestCollection protected ()
    extends typings.atlaskitInProductTesting.distTypesCommonTypesBaseTestCollectionMod.InProductTestCollection {
    def this(opts: InProductTestCollectionOpts) = this()
  }
  
  @JSImport("@atlaskit/in-product-testing", "InProductTestPageObject")
  @js.native
  open class InProductTestPageObject protected ()
    extends typings.atlaskitInProductTesting.distTypesCommonTypesBasePageObjectMod.InProductTestPageObject {
    def this(cy: CypressType) = this()
  }
}
