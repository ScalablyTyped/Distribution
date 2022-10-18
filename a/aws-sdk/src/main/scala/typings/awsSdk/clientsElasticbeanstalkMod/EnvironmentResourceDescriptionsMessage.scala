package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentResourceDescriptionsMessage extends StObject {
  
  /**
    *  A list of EnvironmentResourceDescription. 
    */
  var EnvironmentResources: js.UndefOr[EnvironmentResourceDescription] = js.undefined
}
object EnvironmentResourceDescriptionsMessage {
  
  inline def apply(): EnvironmentResourceDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResourceDescriptionsMessage]
  }
  
  extension [Self <: EnvironmentResourceDescriptionsMessage](x: Self) {
    
    inline def setEnvironmentResources(value: EnvironmentResourceDescription): Self = StObject.set(x, "EnvironmentResources", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentResourcesUndefined: Self = StObject.set(x, "EnvironmentResources", js.undefined)
  }
}
