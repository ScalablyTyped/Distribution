package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityProfileResponse extends StObject {
  
  /**
    *  Please use DescribeSecurityProfileResponse$additionalMetricsToRetainV2 instead.  A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetain: js.UndefOr[AdditionalMetricsToRetainList] = js.undefined
  
  /**
    * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
    */
  var additionalMetricsToRetainV2: js.UndefOr[AdditionalMetricsToRetainV2List] = js.undefined
  
  /**
    * Where the alerts are sent. (Alerts are always sent to the console.)
    */
  var alertTargets: js.UndefOr[AlertTargets] = js.undefined
  
  /**
    * Specifies the behaviors that, when violated by a device (thing), cause an alert.
    */
  var behaviors: js.UndefOr[Behaviors] = js.undefined
  
  /**
    * The time the security profile was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the security profile was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the security profile.
    */
  var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined
  
  /**
    * A description of the security profile (associated with the security profile when it was created or updated).
    */
  var securityProfileDescription: js.UndefOr[SecurityProfileDescription] = js.undefined
  
  /**
    * The name of the security profile.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  
  /**
    * The version of the security profile. A new version is generated whenever the security profile is updated.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object DescribeSecurityProfileResponse {
  
  inline def apply(): DescribeSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSecurityProfileResponse]
  }
  
  extension [Self <: DescribeSecurityProfileResponse](x: Self) {
    
    inline def setAdditionalMetricsToRetain(value: AdditionalMetricsToRetainList): Self = StObject.set(x, "additionalMetricsToRetain", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMetricsToRetainUndefined: Self = StObject.set(x, "additionalMetricsToRetain", js.undefined)
    
    inline def setAdditionalMetricsToRetainV2(value: AdditionalMetricsToRetainV2List): Self = StObject.set(x, "additionalMetricsToRetainV2", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMetricsToRetainV2Undefined: Self = StObject.set(x, "additionalMetricsToRetainV2", js.undefined)
    
    inline def setAdditionalMetricsToRetainV2Varargs(value: MetricToRetain*): Self = StObject.set(x, "additionalMetricsToRetainV2", js.Array(value*))
    
    inline def setAdditionalMetricsToRetainVarargs(value: BehaviorMetric*): Self = StObject.set(x, "additionalMetricsToRetain", js.Array(value*))
    
    inline def setAlertTargets(value: AlertTargets): Self = StObject.set(x, "alertTargets", value.asInstanceOf[js.Any])
    
    inline def setAlertTargetsUndefined: Self = StObject.set(x, "alertTargets", js.undefined)
    
    inline def setBehaviors(value: Behaviors): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
    
    inline def setBehaviorsVarargs(value: Behavior*): Self = StObject.set(x, "behaviors", js.Array(value*))
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setSecurityProfileArn(value: SecurityProfileArn): Self = StObject.set(x, "securityProfileArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileArnUndefined: Self = StObject.set(x, "securityProfileArn", js.undefined)
    
    inline def setSecurityProfileDescription(value: SecurityProfileDescription): Self = StObject.set(x, "securityProfileDescription", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileDescriptionUndefined: Self = StObject.set(x, "securityProfileDescription", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
