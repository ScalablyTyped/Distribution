package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametricS3MonitoringConfiguration extends StObject {
  
  /**
    * Amazon S3 destination URI for log publishing.
    */
  var logUri: js.UndefOr[UriString] = js.undefined
}
object ParametricS3MonitoringConfiguration {
  
  inline def apply(): ParametricS3MonitoringConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParametricS3MonitoringConfiguration]
  }
  
  extension [Self <: ParametricS3MonitoringConfiguration](x: Self) {
    
    inline def setLogUri(value: UriString): Self = StObject.set(x, "logUri", value.asInstanceOf[js.Any])
    
    inline def setLogUriUndefined: Self = StObject.set(x, "logUri", js.undefined)
  }
}
