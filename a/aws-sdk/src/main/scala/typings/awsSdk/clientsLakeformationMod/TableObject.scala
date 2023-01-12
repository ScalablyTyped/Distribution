package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableObject extends StObject {
  
  /**
    * The Amazon S3 ETag of the object. Returned by GetTableObjects for validation and used to identify changes to the underlying data.
    */
  var ETag: js.UndefOr[ETagString] = js.undefined
  
  /**
    * The size of the Amazon S3 object in bytes.
    */
  var Size: js.UndefOr[ObjectSize] = js.undefined
  
  /**
    * The Amazon S3 location of the object.
    */
  var Uri: js.UndefOr[URI] = js.undefined
}
object TableObject {
  
  inline def apply(): TableObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableObject] (val x: Self) extends AnyVal {
    
    inline def setETag(value: ETagString): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setSize(value: ObjectSize): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setUri(value: URI): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "Uri", js.undefined)
  }
}
