package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableAttributeDefinition extends StObject {
  
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of the attribute.
    */
  var AttributeType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsDynamoDbTableAttributeDefinition {
  
  inline def apply(): AwsDynamoDbTableAttributeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableAttributeDefinition]
  }
  
  extension [Self <: AwsDynamoDbTableAttributeDefinition](x: Self) {
    
    inline def setAttributeName(value: NonEmptyString): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setAttributeType(value: NonEmptyString): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    inline def setAttributeTypeUndefined: Self = StObject.set(x, "AttributeType", js.undefined)
  }
}
