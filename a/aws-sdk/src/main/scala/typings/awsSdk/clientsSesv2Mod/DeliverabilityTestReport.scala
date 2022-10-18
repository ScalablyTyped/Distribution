package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliverabilityTestReport extends StObject {
  
  /**
    * The date and time when the predictive inbox placement test was created, in Unix time format.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the predictive inbox placement test. If the status is IN_PROGRESS, then the predictive inbox placement test is currently running. Predictive inbox placement tests are usually complete within 24 hours of creating the test. If the status is COMPLETE, then the test is finished, and you can use the GetDeliverabilityTestReport to view the results of the test.
    */
  var DeliverabilityTestStatus: js.UndefOr[typings.awsSdk.clientsSesv2Mod.DeliverabilityTestStatus] = js.undefined
  
  /**
    * The sender address that you specified for the predictive inbox placement test.
    */
  var FromEmailAddress: js.UndefOr[EmailAddress] = js.undefined
  
  /**
    * A unique string that identifies the predictive inbox placement test.
    */
  var ReportId: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ReportId] = js.undefined
  
  /**
    * A name that helps you identify a predictive inbox placement test report.
    */
  var ReportName: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ReportName] = js.undefined
  
  /**
    * The subject line for an email that you submitted in a predictive inbox placement test.
    */
  var Subject: js.UndefOr[DeliverabilityTestSubject] = js.undefined
}
object DeliverabilityTestReport {
  
  inline def apply(): DeliverabilityTestReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliverabilityTestReport]
  }
  
  extension [Self <: DeliverabilityTestReport](x: Self) {
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setDeliverabilityTestStatus(value: DeliverabilityTestStatus): Self = StObject.set(x, "DeliverabilityTestStatus", value.asInstanceOf[js.Any])
    
    inline def setDeliverabilityTestStatusUndefined: Self = StObject.set(x, "DeliverabilityTestStatus", js.undefined)
    
    inline def setFromEmailAddress(value: EmailAddress): Self = StObject.set(x, "FromEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setFromEmailAddressUndefined: Self = StObject.set(x, "FromEmailAddress", js.undefined)
    
    inline def setReportId(value: ReportId): Self = StObject.set(x, "ReportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "ReportId", js.undefined)
    
    inline def setReportName(value: ReportName): Self = StObject.set(x, "ReportName", value.asInstanceOf[js.Any])
    
    inline def setReportNameUndefined: Self = StObject.set(x, "ReportName", js.undefined)
    
    inline def setSubject(value: DeliverabilityTestSubject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
  }
}
