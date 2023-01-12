package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedApplication extends StObject {
  
  /**
    *  ID of the application as defined in Application Discovery Service. 
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    *  Name of the application as defined in Application Discovery Service. 
    */
  var name: js.UndefOr[String] = js.undefined
}
object AssociatedApplication {
  
  inline def apply(): AssociatedApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociatedApplication] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
