package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedThroughput extends StObject {
  
  /**
    * 
    Provisioned throughput is enabled or not.
    
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * 
    Throughput value of the EBS volumes for the data drive on each kafka broker node in MiB per second.
    
    */
  var VolumeThroughput: js.UndefOr[integer] = js.undefined
}
object ProvisionedThroughput {
  
  inline def apply(): ProvisionedThroughput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedThroughput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionedThroughput] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setVolumeThroughput(value: integer): Self = StObject.set(x, "VolumeThroughput", value.asInstanceOf[js.Any])
    
    inline def setVolumeThroughputUndefined: Self = StObject.set(x, "VolumeThroughput", js.undefined)
  }
}
