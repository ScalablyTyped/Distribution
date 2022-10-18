package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessControlAttributeValue extends StObject {
  
  /**
    * The identity source to use when mapping a specified attribute to IAM Identity Center.
    */
  var Source: AccessControlAttributeValueSourceList
}
object AccessControlAttributeValue {
  
  inline def apply(Source: AccessControlAttributeValueSourceList): AccessControlAttributeValue = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlAttributeValue]
  }
  
  extension [Self <: AccessControlAttributeValue](x: Self) {
    
    inline def setSource(value: AccessControlAttributeValueSourceList): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceVarargs(value: AccessControlAttributeValueSource*): Self = StObject.set(x, "Source", js.Array(value*))
  }
}
