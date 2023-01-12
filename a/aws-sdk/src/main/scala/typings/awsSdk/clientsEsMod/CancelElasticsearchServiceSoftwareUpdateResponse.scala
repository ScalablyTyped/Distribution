package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelElasticsearchServiceSoftwareUpdateResponse extends StObject {
  
  /**
    * The current status of the Elasticsearch service software update.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsSdk.clientsEsMod.ServiceSoftwareOptions] = js.undefined
}
object CancelElasticsearchServiceSoftwareUpdateResponse {
  
  inline def apply(): CancelElasticsearchServiceSoftwareUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelElasticsearchServiceSoftwareUpdateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelElasticsearchServiceSoftwareUpdateResponse] (val x: Self) extends AnyVal {
    
    inline def setServiceSoftwareOptions(value: ServiceSoftwareOptions): Self = StObject.set(x, "ServiceSoftwareOptions", value.asInstanceOf[js.Any])
    
    inline def setServiceSoftwareOptionsUndefined: Self = StObject.set(x, "ServiceSoftwareOptions", js.undefined)
  }
}
