package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceType extends StObject {
  
  /**
    * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. 
    */
  var awsSourceType: js.UndefOr[AwsLogSourceType] = js.undefined
  
  /**
    * Amazon Security Lake supports custom source types. For a detailed list, see the Amazon Security Lake User Guide.
    */
  var customSourceType: js.UndefOr[CustomSourceType] = js.undefined
}
object SourceType {
  
  inline def apply(): SourceType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceType] (val x: Self) extends AnyVal {
    
    inline def setAwsSourceType(value: AwsLogSourceType): Self = StObject.set(x, "awsSourceType", value.asInstanceOf[js.Any])
    
    inline def setAwsSourceTypeUndefined: Self = StObject.set(x, "awsSourceType", js.undefined)
    
    inline def setCustomSourceType(value: CustomSourceType): Self = StObject.set(x, "customSourceType", value.asInstanceOf[js.Any])
    
    inline def setCustomSourceTypeUndefined: Self = StObject.set(x, "customSourceType", js.undefined)
  }
}
