package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudTrailDetails extends StObject {
  
  /**
    * The ARN of the service role that IAM Access Analyzer uses to access your CloudTrail trail and service last accessed information.
    */
  var accessRole: RoleArn
  
  /**
    * The end of the time range for which IAM Access Analyzer reviews your CloudTrail events. Events with a timestamp after this time are not considered to generate a policy. If this is not included in the request, the default value is the current time.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start of the time range for which IAM Access Analyzer reviews your CloudTrail events. Events with a timestamp before this time are not considered to generate a policy.
    */
  var startTime: js.Date
  
  /**
    * A Trail object that contains settings for a trail.
    */
  var trails: TrailList
}
object CloudTrailDetails {
  
  inline def apply(accessRole: RoleArn, startTime: js.Date, trails: TrailList): CloudTrailDetails = {
    val __obj = js.Dynamic.literal(accessRole = accessRole.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], trails = trails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudTrailDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudTrailDetails] (val x: Self) extends AnyVal {
    
    inline def setAccessRole(value: RoleArn): Self = StObject.set(x, "accessRole", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTrails(value: TrailList): Self = StObject.set(x, "trails", value.asInstanceOf[js.Any])
    
    inline def setTrailsVarargs(value: Trail*): Self = StObject.set(x, "trails", js.Array(value*))
  }
}
