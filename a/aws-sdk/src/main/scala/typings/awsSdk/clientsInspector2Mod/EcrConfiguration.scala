package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcrConfiguration extends StObject {
  
  /**
    * The ECR automated re-scan duration defines how long an ECR image will be actively scanned by Amazon Inspector. When the number of days since an image was last pushed exceeds the automated re-scan duration the monitoring state of that image becomes inactive and all associated findings are scheduled for closure.
    */
  var rescanDuration: EcrRescanDuration
}
object EcrConfiguration {
  
  inline def apply(rescanDuration: EcrRescanDuration): EcrConfiguration = {
    val __obj = js.Dynamic.literal(rescanDuration = rescanDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcrConfiguration]
  }
  
  extension [Self <: EcrConfiguration](x: Self) {
    
    inline def setRescanDuration(value: EcrRescanDuration): Self = StObject.set(x, "rescanDuration", value.asInstanceOf[js.Any])
  }
}
