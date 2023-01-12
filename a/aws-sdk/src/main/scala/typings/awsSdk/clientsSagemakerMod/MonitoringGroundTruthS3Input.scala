package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringGroundTruthS3Input extends StObject {
  
  /**
    * The address of the Amazon S3 location of the ground truth labels.
    */
  var S3Uri: js.UndefOr[MonitoringS3Uri] = js.undefined
}
object MonitoringGroundTruthS3Input {
  
  inline def apply(): MonitoringGroundTruthS3Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringGroundTruthS3Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringGroundTruthS3Input] (val x: Self) extends AnyVal {
    
    inline def setS3Uri(value: MonitoringS3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
    
    inline def setS3UriUndefined: Self = StObject.set(x, "S3Uri", js.undefined)
  }
}
