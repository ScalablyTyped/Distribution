package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReadinessCheckResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with a readiness check.
    */
  var ReadinessCheckArn: js.UndefOr[stringMax256] = js.undefined
  
  /**
    * Name of a readiness check.
    */
  var ReadinessCheckName: js.UndefOr[stringMax64PatternAAZAZ09Z] = js.undefined
  
  /**
    * Name of the resource set to be checked.
    */
  var ResourceSet: js.UndefOr[stringMax64PatternAAZAZ09Z] = js.undefined
  
  var Tags: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.Tags] = js.undefined
}
object UpdateReadinessCheckResponse {
  
  inline def apply(): UpdateReadinessCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReadinessCheckResponse]
  }
  
  extension [Self <: UpdateReadinessCheckResponse](x: Self) {
    
    inline def setReadinessCheckArn(value: stringMax256): Self = StObject.set(x, "ReadinessCheckArn", value.asInstanceOf[js.Any])
    
    inline def setReadinessCheckArnUndefined: Self = StObject.set(x, "ReadinessCheckArn", js.undefined)
    
    inline def setReadinessCheckName(value: stringMax64PatternAAZAZ09Z): Self = StObject.set(x, "ReadinessCheckName", value.asInstanceOf[js.Any])
    
    inline def setReadinessCheckNameUndefined: Self = StObject.set(x, "ReadinessCheckName", js.undefined)
    
    inline def setResourceSet(value: stringMax64PatternAAZAZ09Z): Self = StObject.set(x, "ResourceSet", value.asInstanceOf[js.Any])
    
    inline def setResourceSetUndefined: Self = StObject.set(x, "ResourceSet", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
