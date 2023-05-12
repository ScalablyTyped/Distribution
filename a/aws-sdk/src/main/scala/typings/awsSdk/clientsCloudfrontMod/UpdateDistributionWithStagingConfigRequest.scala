package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDistributionWithStagingConfigRequest extends StObject {
  
  /**
    * The identifier of the primary distribution to which you are copying a staging distribution's configuration.
    */
  var Id: String
  
  /**
    * The current versions (ETag values) of both primary and staging distributions. Provide these in the following format:  &lt;primary ETag&gt;, &lt;staging ETag&gt; 
    */
  var IfMatch: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the staging distribution whose configuration you are copying to the primary distribution.
    */
  var StagingDistributionId: js.UndefOr[String] = js.undefined
}
object UpdateDistributionWithStagingConfigRequest {
  
  inline def apply(Id: String): UpdateDistributionWithStagingConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDistributionWithStagingConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDistributionWithStagingConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
    
    inline def setStagingDistributionId(value: String): Self = StObject.set(x, "StagingDistributionId", value.asInstanceOf[js.Any])
    
    inline def setStagingDistributionIdUndefined: Self = StObject.set(x, "StagingDistributionId", js.undefined)
  }
}
