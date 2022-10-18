package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddObjectInput extends StObject {
  
  /**
    * The Amazon S3 ETag of the object. Returned by GetTableObjects for validation and used to identify changes to the underlying data.
    */
  var ETag: ETagString
  
  /**
    * A list of partition values for the object. A value must be specified for each partition key associated with the table. The supported data types are integer, long, date(yyyy-MM-dd), timestamp(yyyy-MM-dd HH:mm:ssXXX or yyyy-MM-dd HH:mm:ss"), string and decimal.
    */
  var PartitionValues: js.UndefOr[PartitionValuesList] = js.undefined
  
  /**
    * The size of the Amazon S3 object in bytes.
    */
  var Size: ObjectSize
  
  /**
    * The Amazon S3 location of the object.
    */
  var Uri: URI
}
object AddObjectInput {
  
  inline def apply(ETag: ETagString, Size: ObjectSize, Uri: URI): AddObjectInput = {
    val __obj = js.Dynamic.literal(ETag = ETag.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddObjectInput]
  }
  
  extension [Self <: AddObjectInput](x: Self) {
    
    inline def setETag(value: ETagString): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setPartitionValues(value: PartitionValuesList): Self = StObject.set(x, "PartitionValues", value.asInstanceOf[js.Any])
    
    inline def setPartitionValuesUndefined: Self = StObject.set(x, "PartitionValues", js.undefined)
    
    inline def setPartitionValuesVarargs(value: PartitionValueString*): Self = StObject.set(x, "PartitionValues", js.Array(value*))
    
    inline def setSize(value: ObjectSize): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setUri(value: URI): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
  }
}
