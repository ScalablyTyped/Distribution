package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudTrailProperties extends StObject {
  
  /**
    * The end of the time range for which IAM Access Analyzer reviews your CloudTrail events. Events with a timestamp after this time are not considered to generate a policy. If this is not included in the request, the default value is the current time.
    */
  var endTime: js.Date
  
  /**
    * The start of the time range for which IAM Access Analyzer reviews your CloudTrail events. Events with a timestamp before this time are not considered to generate a policy.
    */
  var startTime: js.Date
  
  /**
    * A TrailProperties object that contains settings for trail properties.
    */
  var trailProperties: TrailPropertiesList
}
object CloudTrailProperties {
  
  inline def apply(endTime: js.Date, startTime: js.Date, trailProperties: TrailPropertiesList): CloudTrailProperties = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], trailProperties = trailProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudTrailProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudTrailProperties] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTrailProperties(value: TrailPropertiesList): Self = StObject.set(x, "trailProperties", value.asInstanceOf[js.Any])
    
    inline def setTrailPropertiesVarargs(value: TrailProperties*): Self = StObject.set(x, "trailProperties", js.Array(value*))
  }
}
