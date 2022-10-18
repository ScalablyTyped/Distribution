package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobFromSourceControlResponse extends StObject {
  
  /**
    * The name of the Glue job.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
}
object UpdateJobFromSourceControlResponse {
  
  inline def apply(): UpdateJobFromSourceControlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobFromSourceControlResponse]
  }
  
  extension [Self <: UpdateJobFromSourceControlResponse](x: Self) {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
  }
}
