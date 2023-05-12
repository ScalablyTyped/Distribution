package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependentService extends StObject {
  
  /**
    * The name of the dependent service.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.clientsSnowballMod.ServiceName] = js.undefined
  
  /**
    * The version of the dependent service.
    */
  var ServiceVersion: js.UndefOr[typings.awsSdk.clientsSnowballMod.ServiceVersion] = js.undefined
}
object DependentService {
  
  inline def apply(): DependentService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DependentService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DependentService] (val x: Self) extends AnyVal {
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setServiceVersion(value: ServiceVersion): Self = StObject.set(x, "ServiceVersion", value.asInstanceOf[js.Any])
    
    inline def setServiceVersionUndefined: Self = StObject.set(x, "ServiceVersion", js.undefined)
  }
}
