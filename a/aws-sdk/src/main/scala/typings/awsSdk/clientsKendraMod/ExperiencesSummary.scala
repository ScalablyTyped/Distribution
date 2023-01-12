package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperiencesSummary extends StObject {
  
  /**
    * The date-time your Amazon Kendra experience was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The endpoint URLs for your Amazon Kendra experiences. The URLs are unique and fully hosted by Amazon Web Services.
    */
  var Endpoints: js.UndefOr[ExperienceEndpoints] = js.undefined
  
  /**
    * The identifier of your Amazon Kendra experience.
    */
  var Id: js.UndefOr[ExperienceId] = js.undefined
  
  /**
    * The name of your Amazon Kendra experience.
    */
  var Name: js.UndefOr[ExperienceName] = js.undefined
  
  /**
    * The processing status of your Amazon Kendra experience.
    */
  var Status: js.UndefOr[ExperienceStatus] = js.undefined
}
object ExperiencesSummary {
  
  inline def apply(): ExperiencesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperiencesSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperiencesSummary] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEndpoints(value: ExperienceEndpoints): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: ExperienceEndpoint*): Self = StObject.set(x, "Endpoints", js.Array(value*))
    
    inline def setId(value: ExperienceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ExperienceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: ExperienceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
