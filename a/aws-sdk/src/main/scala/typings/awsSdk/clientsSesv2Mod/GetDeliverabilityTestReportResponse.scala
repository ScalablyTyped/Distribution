package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeliverabilityTestReportResponse extends StObject {
  
  /**
    * An object that contains the results of the predictive inbox placement test.
    */
  var DeliverabilityTestReport: typings.awsSdk.clientsSesv2Mod.DeliverabilityTestReport
  
  /**
    * An object that describes how the test email was handled by several email providers, including Gmail, Hotmail, Yahoo, AOL, and others.
    */
  var IspPlacements: typings.awsSdk.clientsSesv2Mod.IspPlacements
  
  /**
    * An object that contains the message that you sent when you performed this predictive inbox placement test.
    */
  var Message: js.UndefOr[MessageContent] = js.undefined
  
  /**
    * An object that specifies how many test messages that were sent during the predictive inbox placement test were delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many weren't delivered.
    */
  var OverallPlacement: PlacementStatistics
  
  /**
    * An array of objects that define the tags (keys and values) that are associated with the predictive inbox placement test.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object GetDeliverabilityTestReportResponse {
  
  inline def apply(
    DeliverabilityTestReport: DeliverabilityTestReport,
    IspPlacements: IspPlacements,
    OverallPlacement: PlacementStatistics
  ): GetDeliverabilityTestReportResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestReport = DeliverabilityTestReport.asInstanceOf[js.Any], IspPlacements = IspPlacements.asInstanceOf[js.Any], OverallPlacement = OverallPlacement.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityTestReportResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDeliverabilityTestReportResponse] (val x: Self) extends AnyVal {
    
    inline def setDeliverabilityTestReport(value: DeliverabilityTestReport): Self = StObject.set(x, "DeliverabilityTestReport", value.asInstanceOf[js.Any])
    
    inline def setIspPlacements(value: IspPlacements): Self = StObject.set(x, "IspPlacements", value.asInstanceOf[js.Any])
    
    inline def setIspPlacementsVarargs(value: IspPlacement*): Self = StObject.set(x, "IspPlacements", js.Array(value*))
    
    inline def setMessage(value: MessageContent): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setOverallPlacement(value: PlacementStatistics): Self = StObject.set(x, "OverallPlacement", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
