package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTestsResult extends StObject {
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the tests.
    */
  var tests: js.UndefOr[Tests] = js.undefined
}
object ListTestsResult {
  
  inline def apply(): ListTestsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestsResult]
  }
  
  extension [Self <: ListTestsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTests(value: Tests): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    inline def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
    
    inline def setTestsVarargs(value: Test*): Self = StObject.set(x, "tests", js.Array(value*))
  }
}
