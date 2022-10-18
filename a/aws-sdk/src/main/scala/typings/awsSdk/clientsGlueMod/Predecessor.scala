package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Predecessor extends StObject {
  
  /**
    * The name of the job definition used by the predecessor job run.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The job-run ID of the predecessor job run.
    */
  var RunId: js.UndefOr[IdString] = js.undefined
}
object Predecessor {
  
  inline def apply(): Predecessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Predecessor]
  }
  
  extension [Self <: Predecessor](x: Self) {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
