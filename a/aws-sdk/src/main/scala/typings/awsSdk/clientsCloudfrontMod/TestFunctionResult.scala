package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestFunctionResult extends StObject {
  
  /**
    * An object that represents the result of running the function with the provided event object.
    */
  var TestResult: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.TestResult] = js.undefined
}
object TestFunctionResult {
  
  inline def apply(): TestFunctionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestFunctionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestFunctionResult] (val x: Self) extends AnyVal {
    
    inline def setTestResult(value: TestResult): Self = StObject.set(x, "TestResult", value.asInstanceOf[js.Any])
    
    inline def setTestResultUndefined: Self = StObject.set(x, "TestResult", js.undefined)
  }
}
