package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDetails extends StObject {
  
  /**
    *  The default version of the launch template. 
    */
  var DefaultVersionNumber: js.UndefOr[Long] = js.undefined
  
  /**
    *  An ID for the launch template. 
    */
  var Id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The latest version of the launch template. 
    */
  var LatestVersionNumber: js.UndefOr[Long] = js.undefined
  
  /**
    *  The information to include in the launch template. 
    */
  var LaunchTemplateData: js.UndefOr[AwsEc2LaunchTemplateDataDetails] = js.undefined
  
  /**
    *  A name for the launch template. 
    */
  var LaunchTemplateName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDetails] (val x: Self) extends AnyVal {
    
    inline def setDefaultVersionNumber(value: Long): Self = StObject.set(x, "DefaultVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionNumberUndefined: Self = StObject.set(x, "DefaultVersionNumber", js.undefined)
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLatestVersionNumber(value: Long): Self = StObject.set(x, "LatestVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionNumberUndefined: Self = StObject.set(x, "LatestVersionNumber", js.undefined)
    
    inline def setLaunchTemplateData(value: AwsEc2LaunchTemplateDataDetails): Self = StObject.set(x, "LaunchTemplateData", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateDataUndefined: Self = StObject.set(x, "LaunchTemplateData", js.undefined)
    
    inline def setLaunchTemplateName(value: NonEmptyString): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
  }
}
