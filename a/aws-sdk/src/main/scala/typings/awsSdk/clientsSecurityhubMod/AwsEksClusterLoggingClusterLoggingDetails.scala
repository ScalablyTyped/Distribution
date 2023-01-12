package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEksClusterLoggingClusterLoggingDetails extends StObject {
  
  /**
    * Whether the logging types that are listed in Types are enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of logging types. Valid values are as follows:    api     audit     authenticator     controllerManager     scheduler   
    */
  var Types: js.UndefOr[NonEmptyStringList] = js.undefined
}
object AwsEksClusterLoggingClusterLoggingDetails {
  
  inline def apply(): AwsEksClusterLoggingClusterLoggingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEksClusterLoggingClusterLoggingDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEksClusterLoggingClusterLoggingDetails] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setTypes(value: NonEmptyStringList): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "Types", js.undefined)
    
    inline def setTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "Types", js.Array(value*))
  }
}
