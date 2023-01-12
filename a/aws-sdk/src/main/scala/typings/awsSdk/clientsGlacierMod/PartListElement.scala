package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartListElement extends StObject {
  
  /**
    * The byte range of a part, inclusive of the upper value of the range.
    */
  var RangeInBytes: js.UndefOr[String] = js.undefined
  
  /**
    * The SHA256 tree hash value that Amazon S3 Glacier calculated for the part. This field is never null.
    */
  var SHA256TreeHash: js.UndefOr[String] = js.undefined
}
object PartListElement {
  
  inline def apply(): PartListElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartListElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartListElement] (val x: Self) extends AnyVal {
    
    inline def setRangeInBytes(value: String): Self = StObject.set(x, "RangeInBytes", value.asInstanceOf[js.Any])
    
    inline def setRangeInBytesUndefined: Self = StObject.set(x, "RangeInBytes", js.undefined)
    
    inline def setSHA256TreeHash(value: String): Self = StObject.set(x, "SHA256TreeHash", value.asInstanceOf[js.Any])
    
    inline def setSHA256TreeHashUndefined: Self = StObject.set(x, "SHA256TreeHash", js.undefined)
  }
}
