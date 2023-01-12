package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupResult extends StObject {
  
  /**
    * Group result ID.
    */
  var groupId: js.UndefOr[UUID] = js.undefined
  
  /**
    * Group Result Name.
    */
  var groupName: js.UndefOr[GroupName] = js.undefined
  
  /**
    * Tests under Group Result.
    */
  var tests: js.UndefOr[TestCaseRuns] = js.undefined
}
object GroupResult {
  
  inline def apply(): GroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupResult] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: UUID): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    
    inline def setTests(value: TestCaseRuns): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    inline def setTestsUndefined: Self = StObject.set(x, "tests", js.undefined)
    
    inline def setTestsVarargs(value: TestCaseRun*): Self = StObject.set(x, "tests", js.Array(value*))
  }
}
