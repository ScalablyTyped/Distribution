package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3CsvSource extends StObject {
  
  /**
    * Specifies additional connection options.
    */
  var AdditionalOptions: js.UndefOr[S3DirectSourceAdditionalOptions] = js.undefined
  
  /**
    * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension. Possible values are "gzip" and "bzip").
    */
  var CompressionType: js.UndefOr[typings.awsSdk.clientsGlueMod.CompressionType] = js.undefined
  
  /**
    * Specifies a character to use for escaping. This option is used only when reading CSV files. The default value is none. If enabled, the character which immediately follows is used as-is, except for a small set of well-known escapes (\n, \r, \t, and \0).
    */
  var Escaper: js.UndefOr[EnclosedInStringPropertyWithQuote] = js.undefined
  
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
    * A Boolean value that specifies whether a single record can span multiple lines. This can occur when a field contains a quoted new-line character. You must set this option to True if any record spans multiple lines. The default value is False, which allows for more aggressive file-splitting during parsing.
    */
  var Multiline: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The name of the data store.
    */
  var Name: NodeName
  
  /**
    * A Boolean value that specifies whether to use the advanced SIMD CSV reader along with Apache Arrow based columnar memory formats. Only available in Glue version 3.0.
    */
  var OptimizePerformance: js.UndefOr[BooleanValue] = js.undefined
  
  /**
    * Specifies the data schema for the S3 CSV source.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
  
  /**
    * A list of the Amazon S3 paths to read from.
    */
  var Paths: EnclosedInStringProperties
  
  /**
    * Specifies the character to use for quoting. The default is a double quote: '"'. Set this to -1 to turn off quoting entirely.
    */
  var QuoteChar: typings.awsSdk.clientsGlueMod.QuoteChar
  
  /**
    * If set to true, recursively reads files in all subdirectories under the specified paths.
    */
  var Recurse: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Specifies the delimiter character. The default is a comma: ",", but any other character can be specified.
    */
  var Separator: typings.awsSdk.clientsGlueMod.Separator
  
  /**
    * A Boolean value that specifies whether to skip the first data line. The default value is False.
    */
  var SkipFirst: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A Boolean value that specifies whether to treat the first line as a header. The default value is False.
    */
  var WithHeader: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * A Boolean value that specifies whether to write the header to output. The default value is True. 
    */
  var WriteHeader: js.UndefOr[BoxedBoolean] = js.undefined
}
object S3CsvSource {
  
  inline def apply(Name: NodeName, Paths: EnclosedInStringProperties, QuoteChar: QuoteChar, Separator: Separator): S3CsvSource = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Paths = Paths.asInstanceOf[js.Any], QuoteChar = QuoteChar.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3CsvSource]
  }
  
  extension [Self <: S3CsvSource](x: Self) {
    
    inline def setAdditionalOptions(value: S3DirectSourceAdditionalOptions): Self = StObject.set(x, "AdditionalOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionsUndefined: Self = StObject.set(x, "AdditionalOptions", js.undefined)
    
    inline def setCompressionType(value: CompressionType): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
    
    inline def setEscaper(value: EnclosedInStringPropertyWithQuote): Self = StObject.set(x, "Escaper", value.asInstanceOf[js.Any])
    
    inline def setEscaperUndefined: Self = StObject.set(x, "Escaper", js.undefined)
    
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
    
    inline def setMultiline(value: BoxedBoolean): Self = StObject.set(x, "Multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "Multiline", js.undefined)
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOptimizePerformance(value: BooleanValue): Self = StObject.set(x, "OptimizePerformance", value.asInstanceOf[js.Any])
    
    inline def setOptimizePerformanceUndefined: Self = StObject.set(x, "OptimizePerformance", js.undefined)
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
    
    inline def setPaths(value: EnclosedInStringProperties): Self = StObject.set(x, "Paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "Paths", js.Array(value*))
    
    inline def setQuoteChar(value: QuoteChar): Self = StObject.set(x, "QuoteChar", value.asInstanceOf[js.Any])
    
    inline def setRecurse(value: BoxedBoolean): Self = StObject.set(x, "Recurse", value.asInstanceOf[js.Any])
    
    inline def setRecurseUndefined: Self = StObject.set(x, "Recurse", js.undefined)
    
    inline def setSeparator(value: Separator): Self = StObject.set(x, "Separator", value.asInstanceOf[js.Any])
    
    inline def setSkipFirst(value: BoxedBoolean): Self = StObject.set(x, "SkipFirst", value.asInstanceOf[js.Any])
    
    inline def setSkipFirstUndefined: Self = StObject.set(x, "SkipFirst", js.undefined)
    
    inline def setWithHeader(value: BoxedBoolean): Self = StObject.set(x, "WithHeader", value.asInstanceOf[js.Any])
    
    inline def setWithHeaderUndefined: Self = StObject.set(x, "WithHeader", js.undefined)
    
    inline def setWriteHeader(value: BoxedBoolean): Self = StObject.set(x, "WriteHeader", value.asInstanceOf[js.Any])
    
    inline def setWriteHeaderUndefined: Self = StObject.set(x, "WriteHeader", js.undefined)
  }
}
