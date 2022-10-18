package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkGroupOutput extends StObject {
  
  /**
    * Information about the workgroup.
    */
  var WorkGroup: js.UndefOr[typings.awsSdk.clientsAthenaMod.WorkGroup] = js.undefined
}
object GetWorkGroupOutput {
  
  inline def apply(): GetWorkGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkGroupOutput]
  }
  
  extension [Self <: GetWorkGroupOutput](x: Self) {
    
    inline def setWorkGroup(value: WorkGroup): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
