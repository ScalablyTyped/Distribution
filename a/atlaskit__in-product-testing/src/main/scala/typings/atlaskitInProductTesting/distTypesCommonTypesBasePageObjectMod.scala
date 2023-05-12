package typings.atlaskitInProductTesting

import typings.atlaskitInProductTesting.distTypesTypesMod.CypressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonTypesBasePageObjectMod {
  
  @JSImport("@atlaskit/in-product-testing/dist/types/common/types/base-page-object", "InProductTestPageObject")
  @js.native
  open class InProductTestPageObject protected () extends StObject {
    def this(cy: CypressType) = this()
    
    /* protected */ var cy: CypressType = js.native
    
    /* protected */ def toAriaLabel(label: String): String = js.native
    
    /* protected */ def toTestId(id: String): String = js.native
  }
}
