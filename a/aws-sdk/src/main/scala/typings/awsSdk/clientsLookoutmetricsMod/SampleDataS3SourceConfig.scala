package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleDataS3SourceConfig extends StObject {
  
  var FileFormatDescriptor: typings.awsSdk.clientsLookoutmetricsMod.FileFormatDescriptor
  
  /**
    * An array of strings containing the historical set of data paths.
    */
  var HistoricalDataPathList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.HistoricalDataPathList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role.
    */
  var RoleArn: Arn
  
  /**
    * An array of strings containing the list of templated paths.
    */
  var TemplatedPathList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.TemplatedPathList] = js.undefined
}
object SampleDataS3SourceConfig {
  
  inline def apply(FileFormatDescriptor: FileFormatDescriptor, RoleArn: Arn): SampleDataS3SourceConfig = {
    val __obj = js.Dynamic.literal(FileFormatDescriptor = FileFormatDescriptor.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleDataS3SourceConfig]
  }
  
  extension [Self <: SampleDataS3SourceConfig](x: Self) {
    
    inline def setFileFormatDescriptor(value: FileFormatDescriptor): Self = StObject.set(x, "FileFormatDescriptor", value.asInstanceOf[js.Any])
    
    inline def setHistoricalDataPathList(value: HistoricalDataPathList): Self = StObject.set(x, "HistoricalDataPathList", value.asInstanceOf[js.Any])
    
    inline def setHistoricalDataPathListUndefined: Self = StObject.set(x, "HistoricalDataPathList", js.undefined)
    
    inline def setHistoricalDataPathListVarargs(value: HistoricalDataPath*): Self = StObject.set(x, "HistoricalDataPathList", js.Array(value*))
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTemplatedPathList(value: TemplatedPathList): Self = StObject.set(x, "TemplatedPathList", value.asInstanceOf[js.Any])
    
    inline def setTemplatedPathListUndefined: Self = StObject.set(x, "TemplatedPathList", js.undefined)
    
    inline def setTemplatedPathListVarargs(value: TemplatedPath*): Self = StObject.set(x, "TemplatedPathList", js.Array(value*))
  }
}
