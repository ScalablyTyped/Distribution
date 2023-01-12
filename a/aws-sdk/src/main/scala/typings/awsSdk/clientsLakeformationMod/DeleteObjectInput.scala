package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectInput extends StObject {
  
  /**
    * The Amazon S3 ETag of the object. Returned by GetTableObjects for validation and used to identify changes to the underlying data.
    */
  var ETag: js.UndefOr[ETagString] = js.undefined
  
  /**
    * A list of partition values for the object. A value must be specified for each partition key associated with the governed table.
    */
  var PartitionValues: js.UndefOr[PartitionValuesList] = js.undefined
  
  /**
    * The Amazon S3 location of the object to delete.
    */
  var Uri: URI
}
object DeleteObjectInput {
  
  inline def apply(Uri: URI): DeleteObjectInput = {
    val __obj = js.Dynamic.literal(Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteObjectInput] (val x: Self) extends AnyVal {
    
    inline def setETag(value: ETagString): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setPartitionValues(value: PartitionValuesList): Self = StObject.set(x, "PartitionValues", value.asInstanceOf[js.Any])
    
    inline def setPartitionValuesUndefined: Self = StObject.set(x, "PartitionValues", js.undefined)
    
    inline def setPartitionValuesVarargs(value: PartitionValueString*): Self = StObject.set(x, "PartitionValues", js.Array(value*))
    
    inline def setUri(value: URI): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
  }
}
