package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpProperties extends StObject {
  
  /**
    * The name of an HTTP namespace.
    */
  var HttpName: js.UndefOr[NamespaceName] = js.undefined
}
object HttpProperties {
  
  inline def apply(): HttpProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpProperties]
  }
  
  extension [Self <: HttpProperties](x: Self) {
    
    inline def setHttpName(value: NamespaceName): Self = StObject.set(x, "HttpName", value.asInstanceOf[js.Any])
    
    inline def setHttpNameUndefined: Self = StObject.set(x, "HttpName", js.undefined)
  }
}
