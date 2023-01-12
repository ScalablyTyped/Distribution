package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSummary extends StObject {
  
  /**
    * 
    */
  var Arn: js.UndefOr[SsmSapArn] = js.undefined
  
  /**
    * 
    */
  var Id: js.UndefOr[ApplicationId] = js.undefined
  
  /**
    * 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * 
    */
  var Type: js.UndefOr[ApplicationType] = js.undefined
}
object ApplicationSummary {
  
  inline def apply(): ApplicationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SsmSapArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: ApplicationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: ApplicationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
