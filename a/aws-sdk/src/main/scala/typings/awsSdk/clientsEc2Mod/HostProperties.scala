package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostProperties extends StObject {
  
  /**
    * The number of cores on the Dedicated Host.
    */
  var Cores: js.UndefOr[Integer] = js.undefined
  
  /**
    * The instance family supported by the Dedicated Host. For example, m5.
    */
  var InstanceFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type supported by the Dedicated Host. For example, m5.large. If the host supports multiple instance types, no instanceType is returned.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of sockets on the Dedicated Host.
    */
  var Sockets: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of vCPUs on the Dedicated Host.
    */
  var TotalVCpus: js.UndefOr[Integer] = js.undefined
}
object HostProperties {
  
  inline def apply(): HostProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostProperties] (val x: Self) extends AnyVal {
    
    inline def setCores(value: Integer): Self = StObject.set(x, "Cores", value.asInstanceOf[js.Any])
    
    inline def setCoresUndefined: Self = StObject.set(x, "Cores", js.undefined)
    
    inline def setInstanceFamily(value: String): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setSockets(value: Integer): Self = StObject.set(x, "Sockets", value.asInstanceOf[js.Any])
    
    inline def setSocketsUndefined: Self = StObject.set(x, "Sockets", js.undefined)
    
    inline def setTotalVCpus(value: Integer): Self = StObject.set(x, "TotalVCpus", value.asInstanceOf[js.Any])
    
    inline def setTotalVCpusUndefined: Self = StObject.set(x, "TotalVCpus", js.undefined)
  }
}
