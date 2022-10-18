package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobTemplateRequest extends StObject {
  
  /**
    * The name of the job template.
    */
  var Name: string
}
object GetJobTemplateRequest {
  
  inline def apply(Name: string): GetJobTemplateRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobTemplateRequest]
  }
  
  extension [Self <: GetJobTemplateRequest](x: Self) {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
