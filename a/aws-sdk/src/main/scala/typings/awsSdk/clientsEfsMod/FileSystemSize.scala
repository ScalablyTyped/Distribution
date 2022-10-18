package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemSize extends StObject {
  
  /**
    * The time at which the size of data, returned in the Value field, was determined. The value is the integer number of seconds since 1970-01-01T00:00:00Z.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The latest known metered size (in bytes) of data stored in the file system.
    */
  var Value: FileSystemSizeValue
  
  /**
    * The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
    */
  var ValueInIA: js.UndefOr[FileSystemNullableSizeValue] = js.undefined
  
  /**
    * The latest known metered size (in bytes) of data stored in the Standard storage class.
    */
  var ValueInStandard: js.UndefOr[FileSystemNullableSizeValue] = js.undefined
}
object FileSystemSize {
  
  inline def apply(Value: FileSystemSizeValue): FileSystemSize = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemSize]
  }
  
  extension [Self <: FileSystemSize](x: Self) {
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    inline def setValue(value: FileSystemSizeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueInIA(value: FileSystemNullableSizeValue): Self = StObject.set(x, "ValueInIA", value.asInstanceOf[js.Any])
    
    inline def setValueInIAUndefined: Self = StObject.set(x, "ValueInIA", js.undefined)
    
    inline def setValueInStandard(value: FileSystemNullableSizeValue): Self = StObject.set(x, "ValueInStandard", value.asInstanceOf[js.Any])
    
    inline def setValueInStandardUndefined: Self = StObject.set(x, "ValueInStandard", js.undefined)
  }
}
