package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsDynamoDbTableKeySchema extends StObject {
  
  /**
    * The name of the key schema attribute.
    */
  var AttributeName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of key used for the key schema attribute. Valid values are HASH or RANGE.
    */
  var KeyType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsDynamoDbTableKeySchema {
  
  inline def apply(): AwsDynamoDbTableKeySchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableKeySchema]
  }
  
  extension [Self <: AwsDynamoDbTableKeySchema](x: Self) {
    
    inline def setAttributeName(value: NonEmptyString): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setKeyType(value: NonEmptyString): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "KeyType", js.undefined)
  }
}
