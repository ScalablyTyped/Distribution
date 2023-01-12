package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketState extends StObject {
  
  /**
    * The state code of the bucket. The following codes are possible:    OK - The bucket is in a running state.    Unknown - Creation of the bucket might have timed-out. You might want to delete the bucket and create a new one.  
    */
  var code: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A message that describes the state of the bucket.
    */
  var message: js.UndefOr[String] = js.undefined
}
object BucketState {
  
  inline def apply(): BucketState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketState] (val x: Self) extends AnyVal {
    
    inline def setCode(value: NonEmptyString): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
