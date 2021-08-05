package typings.algoliaTransporter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulHost
  extends StObject
     with StatelessHost {
  
  /**
    * Holds the last time this host failed in milliseconds elapsed
    * since the UNIX epoch. This failure can be because of an
    * timeout error or a because the host is not available.
    */
  val lastUpdate: Double
  
  /**
    * Holds the host status. Note that, depending of the `lastUpdate`
    * an host may be considered as `Up` on the transporter layer.
    */
  val status: HostStatusType
}
object StatefulHost {
  
  inline def apply(accept: CallType, lastUpdate: Double, protocol: String, status: HostStatusType, url: String): StatefulHost = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], lastUpdate = lastUpdate.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulHost]
  }
  
  extension [Self <: StatefulHost](x: Self) {
    
    inline def setLastUpdate(value: Double): Self = StObject.set(x, "lastUpdate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: HostStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
