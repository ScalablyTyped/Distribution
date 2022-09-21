package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudMapInstanceAttribute extends StObject {
  
  /**
    * The name of an Cloud Map service instance attribute key. Any Cloud Map service instance that contains the specified key and value is returned.
    */
  var key: AwsCloudMapInstanceAttributeKey
  
  /**
    * The value of an Cloud Map service instance attribute key. Any Cloud Map service instance that contains the specified key and value is returned.
    */
  var value: AwsCloudMapInstanceAttributeValue
}
object AwsCloudMapInstanceAttribute {
  
  inline def apply(key: AwsCloudMapInstanceAttributeKey, value: AwsCloudMapInstanceAttributeValue): AwsCloudMapInstanceAttribute = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudMapInstanceAttribute]
  }
  
  extension [Self <: AwsCloudMapInstanceAttribute](x: Self) {
    
    inline def setKey(value: AwsCloudMapInstanceAttributeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: AwsCloudMapInstanceAttributeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
