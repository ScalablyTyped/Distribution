package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterThingRequest extends StObject {
  
  /**
    * The parameters for provisioning a thing. See Provisioning Templates for more information.
    */
  var parameters: js.UndefOr[Parameters] = js.undefined
  
  /**
    * The provisioning template. See Provisioning Devices That Have Device Certificates for more information.
    */
  var templateBody: TemplateBody
}
object RegisterThingRequest {
  
  inline def apply(templateBody: TemplateBody): RegisterThingRequest = {
    val __obj = js.Dynamic.literal(templateBody = templateBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterThingRequest]
  }
  
  extension [Self <: RegisterThingRequest](x: Self) {
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "templateBody", value.asInstanceOf[js.Any])
  }
}
