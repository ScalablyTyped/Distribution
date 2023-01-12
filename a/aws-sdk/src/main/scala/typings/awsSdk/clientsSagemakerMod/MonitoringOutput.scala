package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringOutput extends StObject {
  
  /**
    * The Amazon S3 storage location where the results of a monitoring job are saved.
    */
  var S3Output: MonitoringS3Output
}
object MonitoringOutput {
  
  inline def apply(S3Output: MonitoringS3Output): MonitoringOutput = {
    val __obj = js.Dynamic.literal(S3Output = S3Output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringOutput] (val x: Self) extends AnyVal {
    
    inline def setS3Output(value: MonitoringS3Output): Self = StObject.set(x, "S3Output", value.asInstanceOf[js.Any])
  }
}
