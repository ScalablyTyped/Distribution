package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSourceControlFromJobResponse extends StObject {
  
  /**
    * The name of the Glue job.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
}
object UpdateSourceControlFromJobResponse {
  
  inline def apply(): UpdateSourceControlFromJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSourceControlFromJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSourceControlFromJobResponse] (val x: Self) extends AnyVal {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
  }
}
