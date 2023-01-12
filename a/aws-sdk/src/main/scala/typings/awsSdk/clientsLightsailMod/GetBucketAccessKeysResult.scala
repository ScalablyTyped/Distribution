package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketAccessKeysResult extends StObject {
  
  /**
    * An object that describes the access keys for the specified bucket.
    */
  var accessKeys: js.UndefOr[AccessKeyList] = js.undefined
}
object GetBucketAccessKeysResult {
  
  inline def apply(): GetBucketAccessKeysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketAccessKeysResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketAccessKeysResult] (val x: Self) extends AnyVal {
    
    inline def setAccessKeys(value: AccessKeyList): Self = StObject.set(x, "accessKeys", value.asInstanceOf[js.Any])
    
    inline def setAccessKeysUndefined: Self = StObject.set(x, "accessKeys", js.undefined)
    
    inline def setAccessKeysVarargs(value: AccessKey*): Self = StObject.set(x, "accessKeys", js.Array(value*))
  }
}
