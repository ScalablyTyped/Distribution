package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logging extends StObject {
  
  /**
    * The cluster control plane logging configuration for your cluster.
    */
  var clusterLogging: js.UndefOr[LogSetups] = js.undefined
}
object Logging {
  
  inline def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  
  extension [Self <: Logging](x: Self) {
    
    inline def setClusterLogging(value: LogSetups): Self = StObject.set(x, "clusterLogging", value.asInstanceOf[js.Any])
    
    inline def setClusterLoggingUndefined: Self = StObject.set(x, "clusterLogging", js.undefined)
    
    inline def setClusterLoggingVarargs(value: LogSetup*): Self = StObject.set(x, "clusterLogging", js.Array(value*))
  }
}
