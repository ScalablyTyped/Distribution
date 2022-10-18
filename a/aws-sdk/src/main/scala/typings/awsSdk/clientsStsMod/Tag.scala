package typings.awsSdk.clientsStsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag extends StObject {
  
  /**
    * The key for a session tag. You can pass up to 50 session tags. The plain text session tag keys can’t exceed 128 characters. For these and additional limits, see IAM and STS Character Limits in the IAM User Guide.
    */
  var Key: tagKeyType
  
  /**
    * The value for a session tag. You can pass up to 50 session tags. The plain text session tag values can’t exceed 256 characters. For these and additional limits, see IAM and STS Character Limits in the IAM User Guide.
    */
  var Value: tagValueType
}
object Tag {
  
  inline def apply(Key: tagKeyType, Value: tagValueType): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  
  extension [Self <: Tag](x: Self) {
    
    inline def setKey(value: tagKeyType): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: tagValueType): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
