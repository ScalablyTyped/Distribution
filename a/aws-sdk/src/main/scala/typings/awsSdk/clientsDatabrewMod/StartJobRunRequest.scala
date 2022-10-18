package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartJobRunRequest extends StObject {
  
  /**
    * The name of the job to be run.
    */
  var Name: JobName
}
object StartJobRunRequest {
  
  inline def apply(Name: JobName): StartJobRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRunRequest]
  }
  
  extension [Self <: StartJobRunRequest](x: Self) {
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
