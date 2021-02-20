package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCloudMapInstanceAttribute extends StObject {
  
  /**
    * The name of an AWS Cloud Map service instance attribute key. Any AWS Cloud Map service instance that contains the specified key and value is returned.
    */
  var key: AwsCloudMapInstanceAttributeKey = js.native
  
  /**
    * The value of an AWS Cloud Map service instance attribute key. Any AWS Cloud Map service instance that contains the specified key and value is returned.
    */
  var value: AwsCloudMapInstanceAttributeValue = js.native
}
object AwsCloudMapInstanceAttribute {
  
  @scala.inline
  def apply(key: AwsCloudMapInstanceAttributeKey, value: AwsCloudMapInstanceAttributeValue): AwsCloudMapInstanceAttribute = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudMapInstanceAttribute]
  }
  
  @scala.inline
  implicit class AwsCloudMapInstanceAttributeMutableBuilder[Self <: AwsCloudMapInstanceAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: AwsCloudMapInstanceAttributeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: AwsCloudMapInstanceAttributeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
