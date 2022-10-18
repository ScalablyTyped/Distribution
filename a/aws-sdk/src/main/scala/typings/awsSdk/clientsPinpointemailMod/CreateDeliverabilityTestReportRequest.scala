package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeliverabilityTestReportRequest extends StObject {
  
  /**
    * The HTML body of the message that you sent when you performed the predictive inbox placement test.
    */
  var Content: EmailContent
  
  /**
    * The email address that the predictive inbox placement test email was sent from.
    */
  var FromEmailAddress: EmailAddress
  
  /**
    * A unique name that helps you to identify the predictive inbox placement test when you retrieve the results.
    */
  var ReportName: js.UndefOr[typings.awsSdk.clientsPinpointemailMod.ReportName] = js.undefined
  
  /**
    * An array of objects that define the tags (keys and values) that you want to associate with the predictive inbox placement test.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDeliverabilityTestReportRequest {
  
  inline def apply(Content: EmailContent, FromEmailAddress: EmailAddress): CreateDeliverabilityTestReportRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], FromEmailAddress = FromEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeliverabilityTestReportRequest]
  }
  
  extension [Self <: CreateDeliverabilityTestReportRequest](x: Self) {
    
    inline def setContent(value: EmailContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setFromEmailAddress(value: EmailAddress): Self = StObject.set(x, "FromEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setReportName(value: ReportName): Self = StObject.set(x, "ReportName", value.asInstanceOf[js.Any])
    
    inline def setReportNameUndefined: Self = StObject.set(x, "ReportName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
