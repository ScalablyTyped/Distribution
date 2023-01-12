package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingS3Input extends StObject {
  
  /**
    * The local path in your container where you want Amazon SageMaker to write input data to. LocalPath is an absolute path to the input data and must begin with /opt/ml/processing/. LocalPath is a required parameter when AppManaged is False (default).
    */
  var LocalPath: js.UndefOr[ProcessingLocalPath] = js.undefined
  
  /**
    * Whether to GZIP-decompress the data in Amazon S3 as it is streamed into the processing container. Gzip can only be used when Pipe mode is specified as the S3InputMode. In Pipe mode, Amazon SageMaker streams input data from the source directly to your container without using the EBS volume.
    */
  var S3CompressionType: js.UndefOr[ProcessingS3CompressionType] = js.undefined
  
  /**
    * Whether to distribute the data from Amazon S3 to all processing instances with FullyReplicated, or whether the data from Amazon S3 is shared by Amazon S3 key, downloading one shard of data to each processing instance.
    */
  var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType] = js.undefined
  
  /**
    * Whether you use an S3Prefix or a ManifestFile for the data type. If you choose S3Prefix, S3Uri identifies a key name prefix. Amazon SageMaker uses all objects with the specified key name prefix for the processing job. If you choose ManifestFile, S3Uri identifies an object that is a manifest file containing a list of object keys that you want Amazon SageMaker to use for the processing job.
    */
  var S3DataType: ProcessingS3DataType
  
  /**
    * Whether to use File or Pipe input mode. In File mode, Amazon SageMaker copies the data from the input source onto the local ML storage volume before starting your processing container. This is the most commonly used input mode. In Pipe mode, Amazon SageMaker streams input data from the source directly to your processing container into named pipes without using the ML storage volume.
    */
  var S3InputMode: js.UndefOr[ProcessingS3InputMode] = js.undefined
  
  /**
    * The URI of the Amazon S3 prefix Amazon SageMaker downloads data required to run a processing job.
    */
  var S3Uri: typings.awsSdk.clientsSagemakerMod.S3Uri
}
object ProcessingS3Input {
  
  inline def apply(S3DataType: ProcessingS3DataType, S3Uri: S3Uri): ProcessingS3Input = {
    val __obj = js.Dynamic.literal(S3DataType = S3DataType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingS3Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessingS3Input] (val x: Self) extends AnyVal {
    
    inline def setLocalPath(value: ProcessingLocalPath): Self = StObject.set(x, "LocalPath", value.asInstanceOf[js.Any])
    
    inline def setLocalPathUndefined: Self = StObject.set(x, "LocalPath", js.undefined)
    
    inline def setS3CompressionType(value: ProcessingS3CompressionType): Self = StObject.set(x, "S3CompressionType", value.asInstanceOf[js.Any])
    
    inline def setS3CompressionTypeUndefined: Self = StObject.set(x, "S3CompressionType", js.undefined)
    
    inline def setS3DataDistributionType(value: ProcessingS3DataDistributionType): Self = StObject.set(x, "S3DataDistributionType", value.asInstanceOf[js.Any])
    
    inline def setS3DataDistributionTypeUndefined: Self = StObject.set(x, "S3DataDistributionType", js.undefined)
    
    inline def setS3DataType(value: ProcessingS3DataType): Self = StObject.set(x, "S3DataType", value.asInstanceOf[js.Any])
    
    inline def setS3InputMode(value: ProcessingS3InputMode): Self = StObject.set(x, "S3InputMode", value.asInstanceOf[js.Any])
    
    inline def setS3InputModeUndefined: Self = StObject.set(x, "S3InputMode", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
