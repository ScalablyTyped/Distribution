package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSiteInput extends StObject {
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the site. 
    */
  var SiteId: typings.awsSdk.clientsOutpostsMod.SiteId
}
object GetSiteInput {
  
  inline def apply(SiteId: SiteId): GetSiteInput = {
    val __obj = js.Dynamic.literal(SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSiteInput]
  }
  
  extension [Self <: GetSiteInput](x: Self) {
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}
