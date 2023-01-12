package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleRunConfiguration extends StObject {
  
  /**
    * A list of upload ARNs for app packages to be installed with your app.
    */
  var auxiliaryApps: js.UndefOr[AmazonResourceNames] = js.undefined
  
  /**
    * Specifies the billing method for a test run: metered or unmetered. If the parameter is not specified, the default value is metered.  If you have purchased unmetered device slots, you must set this parameter to unmetered to make use of them. Otherwise, your run counts against your metered time. 
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.undefined
  
  /**
    * Input CustomerArtifactPaths object for the scheduled run configuration.
    */
  var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.undefined
  
  /**
    * The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm extracts to external data for Android or the app's sandbox for iOS.
    */
  var extraDataPackageArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Information about the locale that is used for the run.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the location that is used for the run.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    * Reserved for internal use.
    */
  var networkProfileArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Information about the radio states for the run.
    */
  var radios: js.UndefOr[Radios] = js.undefined
  
  /**
    * An array of ARNs for your VPC endpoint configurations.
    */
  var vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.undefined
}
object ScheduleRunConfiguration {
  
  inline def apply(): ScheduleRunConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleRunConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleRunConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAuxiliaryApps(value: AmazonResourceNames): Self = StObject.set(x, "auxiliaryApps", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryAppsUndefined: Self = StObject.set(x, "auxiliaryApps", js.undefined)
    
    inline def setAuxiliaryAppsVarargs(value: AmazonResourceName*): Self = StObject.set(x, "auxiliaryApps", js.Array(value*))
    
    inline def setBillingMethod(value: BillingMethod): Self = StObject.set(x, "billingMethod", value.asInstanceOf[js.Any])
    
    inline def setBillingMethodUndefined: Self = StObject.set(x, "billingMethod", js.undefined)
    
    inline def setCustomerArtifactPaths(value: CustomerArtifactPaths): Self = StObject.set(x, "customerArtifactPaths", value.asInstanceOf[js.Any])
    
    inline def setCustomerArtifactPathsUndefined: Self = StObject.set(x, "customerArtifactPaths", js.undefined)
    
    inline def setExtraDataPackageArn(value: AmazonResourceName): Self = StObject.set(x, "extraDataPackageArn", value.asInstanceOf[js.Any])
    
    inline def setExtraDataPackageArnUndefined: Self = StObject.set(x, "extraDataPackageArn", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNetworkProfileArn(value: AmazonResourceName): Self = StObject.set(x, "networkProfileArn", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileArnUndefined: Self = StObject.set(x, "networkProfileArn", js.undefined)
    
    inline def setRadios(value: Radios): Self = StObject.set(x, "radios", value.asInstanceOf[js.Any])
    
    inline def setRadiosUndefined: Self = StObject.set(x, "radios", js.undefined)
    
    inline def setVpceConfigurationArns(value: AmazonResourceNames): Self = StObject.set(x, "vpceConfigurationArns", value.asInstanceOf[js.Any])
    
    inline def setVpceConfigurationArnsUndefined: Self = StObject.set(x, "vpceConfigurationArns", js.undefined)
    
    inline def setVpceConfigurationArnsVarargs(value: AmazonResourceName*): Self = StObject.set(x, "vpceConfigurationArns", js.Array(value*))
  }
}
