package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectTag extends StObject {
  
  /**
    * The key of the tag. Constraints: Tag keys are case-sensitive and can be up to 128 Unicode characters in length. May not begin with aws:.
    */
  var Key: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the tag. Constraints: Tag values are case-sensitive and can be up to 256 Unicode characters in length.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object S3ObjectTag {
  
  inline def apply(): S3ObjectTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ObjectTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ObjectTag] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
