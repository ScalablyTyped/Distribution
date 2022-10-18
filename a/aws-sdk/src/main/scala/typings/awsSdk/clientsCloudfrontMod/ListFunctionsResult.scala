package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFunctionsResult extends StObject {
  
  /**
    * A list of CloudFront functions.
    */
  var FunctionList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.FunctionList] = js.undefined
}
object ListFunctionsResult {
  
  inline def apply(): ListFunctionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionsResult]
  }
  
  extension [Self <: ListFunctionsResult](x: Self) {
    
    inline def setFunctionList(value: FunctionList): Self = StObject.set(x, "FunctionList", value.asInstanceOf[js.Any])
    
    inline def setFunctionListUndefined: Self = StObject.set(x, "FunctionList", js.undefined)
  }
}
