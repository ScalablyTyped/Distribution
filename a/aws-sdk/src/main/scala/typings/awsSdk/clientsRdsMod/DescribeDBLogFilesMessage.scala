package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBLogFilesMessage extends StObject {
  
  /**
    * The customer-assigned name of the DB instance that contains the log files you want to list. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String
  
  /**
    * Filters the available log files for files written since the specified date, in POSIX timestamp format with milliseconds.
    */
  var FileLastWritten: js.UndefOr[Long] = js.undefined
  
  /**
    * Filters the available log files for files larger than the specified size.
    */
  var FileSize: js.UndefOr[Long] = js.undefined
  
  /**
    * Filters the available log files for log file names that contain the specified string.
    */
  var FilenameContains: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The pagination token provided in the previous request. If this parameter is specified the response includes only records beyond the marker, up to MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}
object DescribeDBLogFilesMessage {
  
  inline def apply(DBInstanceIdentifier: String): DescribeDBLogFilesMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBLogFilesMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDBLogFilesMessage] (val x: Self) extends AnyVal {
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setFileLastWritten(value: Long): Self = StObject.set(x, "FileLastWritten", value.asInstanceOf[js.Any])
    
    inline def setFileLastWrittenUndefined: Self = StObject.set(x, "FileLastWritten", js.undefined)
    
    inline def setFileSize(value: Long): Self = StObject.set(x, "FileSize", value.asInstanceOf[js.Any])
    
    inline def setFileSizeUndefined: Self = StObject.set(x, "FileSize", js.undefined)
    
    inline def setFilenameContains(value: String): Self = StObject.set(x, "FilenameContains", value.asInstanceOf[js.Any])
    
    inline def setFilenameContainsUndefined: Self = StObject.set(x, "FilenameContains", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
