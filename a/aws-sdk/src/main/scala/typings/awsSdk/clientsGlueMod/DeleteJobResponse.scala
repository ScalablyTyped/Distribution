package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobResponse extends StObject {
  
  /**
    * The name of the job definition that was deleted.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
}
object DeleteJobResponse {
  
  inline def apply(): DeleteJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteJobResponse] (val x: Self) extends AnyVal {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
  }
}
