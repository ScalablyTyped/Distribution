package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetMetricDataQuery extends StObject {
  
  /**
    * An object that contains mapping between MetricDimensionName and MetricDimensionValue to filter metrics by.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.clientsSesv2Mod.Dimensions] = js.undefined
  
  /**
    * Represents the end date for the query interval.
    */
  var EndDate: js.Date
  
  /**
    * The query identifier.
    */
  var Id: QueryIdentifier
  
  /**
    * The queried metric. This can be one of the following:    SEND – Emails sent eligible for tracking in the VDM dashboard. This excludes emails sent to the mailbox simulator and emails addressed to more than one recipient.    COMPLAINT – Complaints received for your account. This excludes complaints from the mailbox simulator, those originating from your account-level suppression list (if enabled), and those for emails addressed to more than one recipient    PERMANENT_BOUNCE – Permanent bounces - i.e. feedback received for emails sent to non-existent mailboxes. Excludes bounces from the mailbox simulator, those originating from your account-level suppression list (if enabled), and those for emails addressed to more than one recipient.    TRANSIENT_BOUNCE – Transient bounces - i.e. feedback received for delivery failures excluding issues with non-existent mailboxes. Excludes bounces from the mailbox simulator, and those for emails addressed to more than one recipient.    OPEN – Unique open events for emails including open trackers. Excludes opens for emails addressed to more than one recipient.    CLICK – Unique click events for emails including wrapped links. Excludes clicks for emails addressed to more than one recipient.    DELIVERY – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox simulator and for emails addressed to more than one recipient.    DELIVERY_OPEN – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox simulator, for emails addressed to more than one recipient, and emails without open trackers.    DELIVERY_CLICK – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox simulator, for emails addressed to more than one recipient, and emails without click trackers.    DELIVERY_COMPLAINT – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox simulator, for emails addressed to more than one recipient, and emails addressed to recipients hosted by ISPs with which Amazon SES does not have a feedback loop agreement.  
    */
  var Metric: typings.awsSdk.clientsSesv2Mod.Metric
  
  /**
    * The query namespace - e.g. VDM 
    */
  var Namespace: MetricNamespace
  
  /**
    * Represents the start date for the query interval.
    */
  var StartDate: js.Date
}
object BatchGetMetricDataQuery {
  
  inline def apply(
    EndDate: js.Date,
    Id: QueryIdentifier,
    Metric: Metric,
    Namespace: MetricNamespace,
    StartDate: js.Date
  ): BatchGetMetricDataQuery = {
    val __obj = js.Dynamic.literal(EndDate = EndDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], StartDate = StartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetMetricDataQuery]
  }
  
  extension [Self <: BatchGetMetricDataQuery](x: Self) {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setId(value: QueryIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setMetric(value: Metric): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: MetricNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
  }
}
