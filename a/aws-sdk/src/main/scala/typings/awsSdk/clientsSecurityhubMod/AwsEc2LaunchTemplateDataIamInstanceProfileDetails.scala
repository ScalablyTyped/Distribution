package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataIamInstanceProfileDetails extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the instance profile. 
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The name of the instance profile. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataIamInstanceProfileDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataIamInstanceProfileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataIamInstanceProfileDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataIamInstanceProfileDetails] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
