package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZonalStatisticsConfigInput extends StObject {
  
  /**
    * List of zonal statistics to compute.
    */
  var Statistics: ZonalStatisticsListInput
  
  /**
    * Bands used in the operation. If no target bands are specified, it uses all bands available input.
    */
  var TargetBands: js.UndefOr[StringListInput] = js.undefined
  
  /**
    * The Amazon S3 path pointing to the GeoJSON containing the polygonal zones.
    */
  var ZoneS3Path: S3Uri
  
  /**
    * The Amazon Resource Name (ARN) or an ID of a Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to decrypt your output artifacts with Amazon S3 server-side encryption. The SageMaker execution role must have kms:GenerateDataKey permission. The KmsKeyId can be any of the following formats:   // KMS Key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    // Amazon Resource Name (ARN) of a KMS Key  "arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"    For more information about key identifiers, see Key identifiers (KeyID) in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
    */
  var ZoneS3PathKmsKeyId: js.UndefOr[KmsKey] = js.undefined
}
object ZonalStatisticsConfigInput {
  
  inline def apply(Statistics: ZonalStatisticsListInput, ZoneS3Path: S3Uri): ZonalStatisticsConfigInput = {
    val __obj = js.Dynamic.literal(Statistics = Statistics.asInstanceOf[js.Any], ZoneS3Path = ZoneS3Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZonalStatisticsConfigInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZonalStatisticsConfigInput] (val x: Self) extends AnyVal {
    
    inline def setStatistics(value: ZonalStatisticsListInput): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsVarargs(value: ZonalStatistics*): Self = StObject.set(x, "Statistics", js.Array(value*))
    
    inline def setTargetBands(value: StringListInput): Self = StObject.set(x, "TargetBands", value.asInstanceOf[js.Any])
    
    inline def setTargetBandsUndefined: Self = StObject.set(x, "TargetBands", js.undefined)
    
    inline def setTargetBandsVarargs(value: String*): Self = StObject.set(x, "TargetBands", js.Array(value*))
    
    inline def setZoneS3Path(value: S3Uri): Self = StObject.set(x, "ZoneS3Path", value.asInstanceOf[js.Any])
    
    inline def setZoneS3PathKmsKeyId(value: KmsKey): Self = StObject.set(x, "ZoneS3PathKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setZoneS3PathKmsKeyIdUndefined: Self = StObject.set(x, "ZoneS3PathKmsKeyId", js.undefined)
  }
}
