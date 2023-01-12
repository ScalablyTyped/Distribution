package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  /**
    * The number of documents that have the value counted for the particular bucket.
    */
  var count: js.UndefOr[Count] = js.undefined
  
  /**
    * The value counted for the particular bucket.
    */
  var keyValue: js.UndefOr[BucketKeyValue] = js.undefined
}
object Bucket {
  
  inline def apply(): Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setKeyValue(value: BucketKeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
  }
}
