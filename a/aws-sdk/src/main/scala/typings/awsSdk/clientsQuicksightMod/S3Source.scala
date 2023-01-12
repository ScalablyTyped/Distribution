package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Source extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the data source.
    */
  var DataSourceArn: Arn
  
  /**
    * A physical table type for an S3 data source.  For files that aren't JSON, only STRING data types are supported in input columns. 
    */
  var InputColumns: InputColumnList
  
  /**
    * Information about the format for the S3 source file or files.
    */
  var UploadSettings: js.UndefOr[typings.awsSdk.clientsQuicksightMod.UploadSettings] = js.undefined
}
object S3Source {
  
  inline def apply(DataSourceArn: Arn, InputColumns: InputColumnList): S3Source = {
    val __obj = js.Dynamic.literal(DataSourceArn = DataSourceArn.asInstanceOf[js.Any], InputColumns = InputColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Source] (val x: Self) extends AnyVal {
    
    inline def setDataSourceArn(value: Arn): Self = StObject.set(x, "DataSourceArn", value.asInstanceOf[js.Any])
    
    inline def setInputColumns(value: InputColumnList): Self = StObject.set(x, "InputColumns", value.asInstanceOf[js.Any])
    
    inline def setInputColumnsVarargs(value: InputColumn*): Self = StObject.set(x, "InputColumns", js.Array(value*))
    
    inline def setUploadSettings(value: UploadSettings): Self = StObject.set(x, "UploadSettings", value.asInstanceOf[js.Any])
    
    inline def setUploadSettingsUndefined: Self = StObject.set(x, "UploadSettings", js.undefined)
  }
}
