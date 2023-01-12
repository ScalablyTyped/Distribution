package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeKeyResponse extends StObject {
  
  /**
    * Metadata associated with the key.
    */
  var KeyMetadata: js.UndefOr[typings.awsSdk.clientsKmsMod.KeyMetadata] = js.undefined
}
object DescribeKeyResponse {
  
  inline def apply(): DescribeKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setKeyMetadata(value: KeyMetadata): Self = StObject.set(x, "KeyMetadata", value.asInstanceOf[js.Any])
    
    inline def setKeyMetadataUndefined: Self = StObject.set(x, "KeyMetadata", js.undefined)
  }
}
