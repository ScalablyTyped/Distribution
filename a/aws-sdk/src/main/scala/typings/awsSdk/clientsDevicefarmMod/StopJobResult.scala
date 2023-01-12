package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopJobResult extends StObject {
  
  /**
    * The job that was stopped.
    */
  var job: js.UndefOr[Job] = js.undefined
}
object StopJobResult {
  
  inline def apply(): StopJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopJobResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopJobResult] (val x: Self) extends AnyVal {
    
    inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
