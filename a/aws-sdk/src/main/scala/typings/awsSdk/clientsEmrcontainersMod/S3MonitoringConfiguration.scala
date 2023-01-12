package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3MonitoringConfiguration extends StObject {
  
  /**
    * Amazon S3 destination URI for log publishing.
    */
  var logUri: UriString
}
object S3MonitoringConfiguration {
  
  inline def apply(logUri: UriString): S3MonitoringConfiguration = {
    val __obj = js.Dynamic.literal(logUri = logUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3MonitoringConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3MonitoringConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLogUri(value: UriString): Self = StObject.set(x, "logUri", value.asInstanceOf[js.Any])
  }
}
