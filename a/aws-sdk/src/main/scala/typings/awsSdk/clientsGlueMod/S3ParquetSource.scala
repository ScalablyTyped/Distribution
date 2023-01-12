package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ParquetSource extends StObject {
  
  /**
    * Specifies additional connection options.
    */
  var AdditionalOptions: js.UndefOr[S3DirectSourceAdditionalOptions] = js.undefined
  
  /**
    * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension. Possible values are "gzip" and "bzip").
    */
  var CompressionType: js.UndefOr[ParquetCompressionType] = js.undefined
  
  /**
    * A string containing a JSON list of Unix-style glob patterns to exclude. For example, "[\"**.pdf\"]" excludes all PDF files. 
    */
  var Exclusions: js.UndefOr[EnclosedInStringProperties] = js.undefined
  
  /**
    * Grouping files is turned on by default when the input contains more than 50,000 files. To turn on grouping with fewer than 50,000 files, set this parameter to "inPartition". To disable grouping when there are more than 50,000 files, set this parameter to "none".
    */
  var GroupFiles: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The target group size in bytes. The default is computed based on the input data size and the size of your cluster. When there are fewer than 50,000 input files, "groupFiles" must be set to "inPartition" for this to take effect.
    */
  var GroupSize: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * This option controls the duration in milliseconds after which the s3 listing is likely to be consistent. Files with modification timestamps falling within the last maxBand milliseconds are tracked specially when using JobBookmarks to account for Amazon S3 eventual consistency. Most users don't need to set this option. The default is 900000 milliseconds, or 15 minutes.
    */
  var MaxBand: js.UndefOr[BoxedNonNegativeInt] = js.undefined
  
  /**
    * This option specifies the maximum number of files to save from the last maxBand seconds. If this number is exceeded, extra files are skipped and only processed in the next job run.
    */
  var MaxFilesInBand: js.UndefOr[BoxedNonNegativeInt] = js.undefined
  
  /**
    * The name of the data store.
    */
  var Name: NodeName
  
  /**
    * Specifies the data schema for the S3 Parquet source.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
  
  /**
    * A list of the Amazon S3 paths to read from.
    */
  var Paths: EnclosedInStringProperties
  
  /**
    * If set to true, recursively reads files in all subdirectories under the specified paths.
    */
  var Recurse: js.UndefOr[BoxedBoolean] = js.undefined
}
object S3ParquetSource {
  
  inline def apply(Name: NodeName, Paths: EnclosedInStringProperties): S3ParquetSource = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Paths = Paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ParquetSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ParquetSource] (val x: Self) extends AnyVal {
    
    inline def setAdditionalOptions(value: S3DirectSourceAdditionalOptions): Self = StObject.set(x, "AdditionalOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionsUndefined: Self = StObject.set(x, "AdditionalOptions", js.undefined)
    
    inline def setCompressionType(value: ParquetCompressionType): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
    
    inline def setExclusions(value: EnclosedInStringProperties): Self = StObject.set(x, "Exclusions", value.asInstanceOf[js.Any])
    
    inline def setExclusionsUndefined: Self = StObject.set(x, "Exclusions", js.undefined)
    
    inline def setExclusionsVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "Exclusions", js.Array(value*))
    
    inline def setGroupFiles(value: EnclosedInStringProperty): Self = StObject.set(x, "GroupFiles", value.asInstanceOf[js.Any])
    
    inline def setGroupFilesUndefined: Self = StObject.set(x, "GroupFiles", js.undefined)
    
    inline def setGroupSize(value: EnclosedInStringProperty): Self = StObject.set(x, "GroupSize", value.asInstanceOf[js.Any])
    
    inline def setGroupSizeUndefined: Self = StObject.set(x, "GroupSize", js.undefined)
    
    inline def setMaxBand(value: BoxedNonNegativeInt): Self = StObject.set(x, "MaxBand", value.asInstanceOf[js.Any])
    
    inline def setMaxBandUndefined: Self = StObject.set(x, "MaxBand", js.undefined)
    
    inline def setMaxFilesInBand(value: BoxedNonNegativeInt): Self = StObject.set(x, "MaxFilesInBand", value.asInstanceOf[js.Any])
    
    inline def setMaxFilesInBandUndefined: Self = StObject.set(x, "MaxFilesInBand", js.undefined)
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
    
    inline def setPaths(value: EnclosedInStringProperties): Self = StObject.set(x, "Paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "Paths", js.Array(value*))
    
    inline def setRecurse(value: BoxedBoolean): Self = StObject.set(x, "Recurse", value.asInstanceOf[js.Any])
    
    inline def setRecurseUndefined: Self = StObject.set(x, "Recurse", js.undefined)
  }
}
