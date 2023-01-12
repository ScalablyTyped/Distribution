package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamPolicyVersion extends StObject {
  
  /**
    * Indicates when the version was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the version is the default version.
    */
  var IsDefaultVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the policy version.
    */
  var VersionId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsIamPolicyVersion {
  
  inline def apply(): AwsIamPolicyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamPolicyVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsIamPolicyVersion] (val x: Self) extends AnyVal {
    
    inline def setCreateDate(value: NonEmptyString): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setIsDefaultVersion(value: Boolean): Self = StObject.set(x, "IsDefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultVersionUndefined: Self = StObject.set(x, "IsDefaultVersion", js.undefined)
    
    inline def setVersionId(value: NonEmptyString): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
