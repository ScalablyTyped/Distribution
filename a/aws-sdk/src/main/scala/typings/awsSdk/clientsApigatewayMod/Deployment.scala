package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  /**
    * A summary of the RestApi at the date and time that the deployment resource was created.
    */
  var apiSummary: js.UndefOr[PathToMapOfMethodSnapshot] = js.undefined
  
  /**
    * The date and time that the deployment resource was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description for the deployment resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the deployment resource.
    */
  var id: js.UndefOr[String] = js.undefined
}
object Deployment {
  
  inline def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    inline def setApiSummary(value: PathToMapOfMethodSnapshot): Self = StObject.set(x, "apiSummary", value.asInstanceOf[js.Any])
    
    inline def setApiSummaryUndefined: Self = StObject.set(x, "apiSummary", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
