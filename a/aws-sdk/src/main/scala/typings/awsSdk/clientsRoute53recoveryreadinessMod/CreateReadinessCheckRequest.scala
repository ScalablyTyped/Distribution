package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReadinessCheckRequest extends StObject {
  
  /**
    * The name of the readiness check to create.
    */
  var ReadinessCheckName: string
  
  /**
    * The name of the resource set to check.
    */
  var ResourceSetName: string
  
  var Tags: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.Tags] = js.undefined
}
object CreateReadinessCheckRequest {
  
  inline def apply(ReadinessCheckName: string, ResourceSetName: string): CreateReadinessCheckRequest = {
    val __obj = js.Dynamic.literal(ReadinessCheckName = ReadinessCheckName.asInstanceOf[js.Any], ResourceSetName = ResourceSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReadinessCheckRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateReadinessCheckRequest] (val x: Self) extends AnyVal {
    
    inline def setReadinessCheckName(value: string): Self = StObject.set(x, "ReadinessCheckName", value.asInstanceOf[js.Any])
    
    inline def setResourceSetName(value: string): Self = StObject.set(x, "ResourceSetName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
