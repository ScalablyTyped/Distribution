package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumedLicenseSummary extends StObject {
  
  /**
    * Number of licenses consumed by the resource.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
  
  /**
    * Resource type of the resource consuming a license.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ResourceType] = js.undefined
}
object ConsumedLicenseSummary {
  
  inline def apply(): ConsumedLicenseSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumedLicenseSummary]
  }
  
  extension [Self <: ConsumedLicenseSummary](x: Self) {
    
    inline def setConsumedLicenses(value: BoxLong): Self = StObject.set(x, "ConsumedLicenses", value.asInstanceOf[js.Any])
    
    inline def setConsumedLicensesUndefined: Self = StObject.set(x, "ConsumedLicenses", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
