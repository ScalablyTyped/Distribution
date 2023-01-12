package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAPODataSourceProperties extends StObject {
  
  /**
    *  The object path specified in the SAPOData flow source. 
    */
  var objectPath: js.UndefOr[Object] = js.undefined
}
object SAPODataSourceProperties {
  
  inline def apply(): SAPODataSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAPODataSourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SAPODataSourceProperties] (val x: Self) extends AnyVal {
    
    inline def setObjectPath(value: Object): Self = StObject.set(x, "objectPath", value.asInstanceOf[js.Any])
    
    inline def setObjectPathUndefined: Self = StObject.set(x, "objectPath", js.undefined)
  }
}
