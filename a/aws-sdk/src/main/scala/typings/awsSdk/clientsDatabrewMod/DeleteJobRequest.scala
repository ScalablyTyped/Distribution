package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteJobRequest extends StObject {
  
  /**
    * The name of the job to be deleted.
    */
  var Name: JobName
}
object DeleteJobRequest {
  
  inline def apply(Name: JobName): DeleteJobRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJobRequest]
  }
  
  extension [Self <: DeleteJobRequest](x: Self) {
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
