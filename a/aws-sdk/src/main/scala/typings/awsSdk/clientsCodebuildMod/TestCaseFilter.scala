package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCaseFilter extends StObject {
  
  /**
    * A keyword that is used to filter on the name or the prefix of the test cases. Only test cases where the keyword is a substring of the name or the prefix will be returned.
    */
  var keyword: js.UndefOr[String] = js.undefined
  
  /**
    * The status used to filter test cases. A TestCaseFilter can have one status. Valid values are:    SUCCEEDED     FAILED     ERROR     SKIPPED     UNKNOWN   
    */
  var status: js.UndefOr[String] = js.undefined
}
object TestCaseFilter {
  
  inline def apply(): TestCaseFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCaseFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestCaseFilter] (val x: Self) extends AnyVal {
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
