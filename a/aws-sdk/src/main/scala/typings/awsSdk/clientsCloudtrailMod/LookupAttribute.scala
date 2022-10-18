package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupAttribute extends StObject {
  
  /**
    * Specifies an attribute on which to filter the events returned.
    */
  var AttributeKey: LookupAttributeKey
  
  /**
    * Specifies a value for the specified AttributeKey.
    */
  var AttributeValue: String
}
object LookupAttribute {
  
  inline def apply(AttributeKey: LookupAttributeKey, AttributeValue: String): LookupAttribute = {
    val __obj = js.Dynamic.literal(AttributeKey = AttributeKey.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupAttribute]
  }
  
  extension [Self <: LookupAttribute](x: Self) {
    
    inline def setAttributeKey(value: LookupAttributeKey): Self = StObject.set(x, "AttributeKey", value.asInstanceOf[js.Any])
    
    inline def setAttributeValue(value: String): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
  }
}
