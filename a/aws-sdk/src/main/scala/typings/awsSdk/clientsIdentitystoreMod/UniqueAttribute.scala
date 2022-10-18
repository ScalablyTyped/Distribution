package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueAttribute extends StObject {
  
  /**
    * A string representation of the path to a given attribute or sub-attribute. Supports JMESPath.
    */
  var AttributePath: typings.awsSdk.clientsIdentitystoreMod.AttributePath
  
  /**
    * The value of the attribute. This is a Document type. This type is not supported by Java V1, Go V1, and older versions of the AWS CLI.
    */
  var AttributeValue: typings.awsSdk.clientsIdentitystoreMod.AttributeValue
}
object UniqueAttribute {
  
  inline def apply(AttributePath: AttributePath, AttributeValue: AttributeValue): UniqueAttribute = {
    val __obj = js.Dynamic.literal(AttributePath = AttributePath.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueAttribute]
  }
  
  extension [Self <: UniqueAttribute](x: Self) {
    
    inline def setAttributePath(value: AttributePath): Self = StObject.set(x, "AttributePath", value.asInstanceOf[js.Any])
    
    inline def setAttributeValue(value: AttributeValue): Self = StObject.set(x, "AttributeValue", value.asInstanceOf[js.Any])
  }
}
