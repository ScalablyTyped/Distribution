package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Tag extends StObject {
  
  /**
    * 
    */
  var Key: TagKeyString
  
  /**
    * 
    */
  var Value: TagValueString
}
object S3Tag {
  
  inline def apply(Key: TagKeyString, Value: TagValueString): S3Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Tag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Tag] (val x: Self) extends AnyVal {
    
    inline def setKey(value: TagKeyString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TagValueString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
