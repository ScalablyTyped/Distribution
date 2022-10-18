package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableSecurityHubRequest extends StObject {
  
  /**
    * Whether to enable the security standards that Security Hub has designated as automatically enabled. If you do not provide a value for EnableDefaultStandards, it is set to true. To not enable the automatically enabled standards, set EnableDefaultStandards to false.
    */
  var EnableDefaultStandards: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tags to add to the hub resource when you enable Security Hub.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object EnableSecurityHubRequest {
  
  inline def apply(): EnableSecurityHubRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableSecurityHubRequest]
  }
  
  extension [Self <: EnableSecurityHubRequest](x: Self) {
    
    inline def setEnableDefaultStandards(value: Boolean): Self = StObject.set(x, "EnableDefaultStandards", value.asInstanceOf[js.Any])
    
    inline def setEnableDefaultStandardsUndefined: Self = StObject.set(x, "EnableDefaultStandards", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
