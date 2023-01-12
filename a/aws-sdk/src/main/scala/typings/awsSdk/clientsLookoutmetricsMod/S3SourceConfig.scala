package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3SourceConfig extends StObject {
  
  /**
    * Contains information about a source file's formatting.
    */
  var FileFormatDescriptor: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.FileFormatDescriptor] = js.undefined
  
  /**
    * A list of paths to the historical data files.
    */
  var HistoricalDataPathList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.HistoricalDataPathList] = js.undefined
  
  /**
    * The ARN of an IAM role that has read and write access permissions to the source S3 bucket.
    */
  var RoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A list of templated paths to the source files.
    */
  var TemplatedPathList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.TemplatedPathList] = js.undefined
}
object S3SourceConfig {
  
  inline def apply(): S3SourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SourceConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3SourceConfig] (val x: Self) extends AnyVal {
    
    inline def setFileFormatDescriptor(value: FileFormatDescriptor): Self = StObject.set(x, "FileFormatDescriptor", value.asInstanceOf[js.Any])
    
    inline def setFileFormatDescriptorUndefined: Self = StObject.set(x, "FileFormatDescriptor", js.undefined)
    
    inline def setHistoricalDataPathList(value: HistoricalDataPathList): Self = StObject.set(x, "HistoricalDataPathList", value.asInstanceOf[js.Any])
    
    inline def setHistoricalDataPathListUndefined: Self = StObject.set(x, "HistoricalDataPathList", js.undefined)
    
    inline def setHistoricalDataPathListVarargs(value: HistoricalDataPath*): Self = StObject.set(x, "HistoricalDataPathList", js.Array(value*))
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setTemplatedPathList(value: TemplatedPathList): Self = StObject.set(x, "TemplatedPathList", value.asInstanceOf[js.Any])
    
    inline def setTemplatedPathListUndefined: Self = StObject.set(x, "TemplatedPathList", js.undefined)
    
    inline def setTemplatedPathListVarargs(value: TemplatedPath*): Self = StObject.set(x, "TemplatedPathList", js.Array(value*))
  }
}
