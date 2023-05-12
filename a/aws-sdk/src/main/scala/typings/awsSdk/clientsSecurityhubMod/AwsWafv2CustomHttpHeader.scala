package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2CustomHttpHeader extends StObject {
  
  /**
    *  The name of the custom header. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The value of the custom header. 
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsWafv2CustomHttpHeader {
  
  inline def apply(): AwsWafv2CustomHttpHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2CustomHttpHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2CustomHttpHeader] (val x: Self) extends AnyVal {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
