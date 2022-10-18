package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAliasRequest extends StObject {
  
  /**
    * The alias (also known as a CNAME) to add to the target distribution.
    */
  var Alias: String
  
  /**
    * The ID of the distribution that you’re associating the alias with.
    */
  var TargetDistributionId: String
}
object AssociateAliasRequest {
  
  inline def apply(Alias: String, TargetDistributionId: String): AssociateAliasRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias.asInstanceOf[js.Any], TargetDistributionId = TargetDistributionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateAliasRequest]
  }
  
  extension [Self <: AssociateAliasRequest](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setTargetDistributionId(value: String): Self = StObject.set(x, "TargetDistributionId", value.asInstanceOf[js.Any])
  }
}
