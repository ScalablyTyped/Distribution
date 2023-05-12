package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteRunConfiguration extends StObject {
  
  /**
    * TRUE if multiple test suites run in parallel.
    */
  var parallelRun: js.UndefOr[ParallelRun] = js.undefined
  
  /**
    * Sets the primary device for the test suite run. This requires a thing ARN or a certificate ARN.
    */
  var primaryDevice: DeviceUnderTest
  
  /**
    * Sets test case list.
    */
  var selectedTestList: js.UndefOr[SelectedTestList] = js.undefined
}
object SuiteRunConfiguration {
  
  inline def apply(primaryDevice: DeviceUnderTest): SuiteRunConfiguration = {
    val __obj = js.Dynamic.literal(primaryDevice = primaryDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteRunConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuiteRunConfiguration] (val x: Self) extends AnyVal {
    
    inline def setParallelRun(value: ParallelRun): Self = StObject.set(x, "parallelRun", value.asInstanceOf[js.Any])
    
    inline def setParallelRunUndefined: Self = StObject.set(x, "parallelRun", js.undefined)
    
    inline def setPrimaryDevice(value: DeviceUnderTest): Self = StObject.set(x, "primaryDevice", value.asInstanceOf[js.Any])
    
    inline def setSelectedTestList(value: SelectedTestList): Self = StObject.set(x, "selectedTestList", value.asInstanceOf[js.Any])
    
    inline def setSelectedTestListUndefined: Self = StObject.set(x, "selectedTestList", js.undefined)
    
    inline def setSelectedTestListVarargs(value: UUID*): Self = StObject.set(x, "selectedTestList", js.Array(value*))
  }
}
