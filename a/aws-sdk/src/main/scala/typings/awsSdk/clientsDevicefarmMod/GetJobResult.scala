package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobResult extends StObject {
  
  /**
    * An object that contains information about the requested job.
    */
  var job: js.UndefOr[Job] = js.undefined
}
object GetJobResult {
  
  inline def apply(): GetJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobResult]
  }
  
  extension [Self <: GetJobResult](x: Self) {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
