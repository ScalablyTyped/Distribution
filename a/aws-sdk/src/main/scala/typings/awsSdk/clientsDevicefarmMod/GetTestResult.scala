package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTestResult extends StObject {
  
  /**
    * A test condition that is evaluated.
    */
  var test: js.UndefOr[Test] = js.undefined
}
object GetTestResult {
  
  inline def apply(): GetTestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTestResult]
  }
  
  extension [Self <: GetTestResult](x: Self) {
    
    inline def setTest(value: Test): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
