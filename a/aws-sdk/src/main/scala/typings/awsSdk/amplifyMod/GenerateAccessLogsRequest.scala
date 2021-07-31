package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateAccessLogsRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The name of the domain. 
    */
  var domainName: DomainName
  
  /**
    *  The time at which the logs should end. The time range specified is inclusive of the end time. 
    */
  var endTime: js.UndefOr[EndTime] = js.undefined
  
  /**
    *  The time at which the logs should start. The time range specified is inclusive of the start time. 
    */
  var startTime: js.UndefOr[StartTime] = js.undefined
}
object GenerateAccessLogsRequest {
  
  @scala.inline
  def apply(appId: AppId, domainName: DomainName): GenerateAccessLogsRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateAccessLogsRequest]
  }
  
  @scala.inline
  implicit class GenerateAccessLogsRequestMutableBuilder[Self <: GenerateAccessLogsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: EndTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: StartTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
