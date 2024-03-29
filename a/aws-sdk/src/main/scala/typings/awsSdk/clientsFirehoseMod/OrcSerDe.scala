package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrcSerDe extends StObject {
  
  /**
    * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
    */
  var BlockSizeBytes: js.UndefOr[typings.awsSdk.clientsFirehoseMod.BlockSizeBytes] = js.undefined
  
  /**
    * The column names for which you want Kinesis Data Firehose to create bloom filters. The default is null.
    */
  var BloomFilterColumns: js.UndefOr[ListOfNonEmptyStringsWithoutWhitespace] = js.undefined
  
  /**
    * The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The default value is 0.05, the minimum is 0, and the maximum is 1.
    */
  var BloomFilterFalsePositiveProbability: js.UndefOr[Proportion] = js.undefined
  
  /**
    * The compression code to use over data blocks. The default is SNAPPY.
    */
  var Compression: js.UndefOr[OrcCompression] = js.undefined
  
  /**
    * Represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this fraction to a number that is less than the number of distinct keys in a dictionary. To always use dictionary encoding, set this threshold to 1.
    */
  var DictionaryKeyThreshold: js.UndefOr[Proportion] = js.undefined
  
  /**
    * Set this to true to indicate that you want stripes to be padded to the HDFS block boundaries. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is false.
    */
  var EnablePadding: js.UndefOr[BooleanObject] = js.undefined
  
  /**
    * The version of the file to write. The possible values are V0_11 and V0_12. The default is V0_12.
    */
  var FormatVersion: js.UndefOr[OrcFormatVersion] = js.undefined
  
  /**
    * A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe size. The default value is 0.05, which means 5 percent of stripe size. For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the available size within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that space. This ensures that no stripe crosses block boundaries and causes remote reads within a node-local task. Kinesis Data Firehose ignores this parameter when OrcSerDe$EnablePadding is false.
    */
  var PaddingTolerance: js.UndefOr[Proportion] = js.undefined
  
  /**
    * The number of rows between index entries. The default is 10,000 and the minimum is 1,000.
    */
  var RowIndexStride: js.UndefOr[OrcRowIndexStride] = js.undefined
  
  /**
    * The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
    */
  var StripeSizeBytes: js.UndefOr[OrcStripeSizeBytes] = js.undefined
}
object OrcSerDe {
  
  inline def apply(): OrcSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrcSerDe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrcSerDe] (val x: Self) extends AnyVal {
    
    inline def setBlockSizeBytes(value: BlockSizeBytes): Self = StObject.set(x, "BlockSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeBytesUndefined: Self = StObject.set(x, "BlockSizeBytes", js.undefined)
    
    inline def setBloomFilterColumns(value: ListOfNonEmptyStringsWithoutWhitespace): Self = StObject.set(x, "BloomFilterColumns", value.asInstanceOf[js.Any])
    
    inline def setBloomFilterColumnsUndefined: Self = StObject.set(x, "BloomFilterColumns", js.undefined)
    
    inline def setBloomFilterColumnsVarargs(value: NonEmptyStringWithoutWhitespace*): Self = StObject.set(x, "BloomFilterColumns", js.Array(value*))
    
    inline def setBloomFilterFalsePositiveProbability(value: Proportion): Self = StObject.set(x, "BloomFilterFalsePositiveProbability", value.asInstanceOf[js.Any])
    
    inline def setBloomFilterFalsePositiveProbabilityUndefined: Self = StObject.set(x, "BloomFilterFalsePositiveProbability", js.undefined)
    
    inline def setCompression(value: OrcCompression): Self = StObject.set(x, "Compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "Compression", js.undefined)
    
    inline def setDictionaryKeyThreshold(value: Proportion): Self = StObject.set(x, "DictionaryKeyThreshold", value.asInstanceOf[js.Any])
    
    inline def setDictionaryKeyThresholdUndefined: Self = StObject.set(x, "DictionaryKeyThreshold", js.undefined)
    
    inline def setEnablePadding(value: BooleanObject): Self = StObject.set(x, "EnablePadding", value.asInstanceOf[js.Any])
    
    inline def setEnablePaddingUndefined: Self = StObject.set(x, "EnablePadding", js.undefined)
    
    inline def setFormatVersion(value: OrcFormatVersion): Self = StObject.set(x, "FormatVersion", value.asInstanceOf[js.Any])
    
    inline def setFormatVersionUndefined: Self = StObject.set(x, "FormatVersion", js.undefined)
    
    inline def setPaddingTolerance(value: Proportion): Self = StObject.set(x, "PaddingTolerance", value.asInstanceOf[js.Any])
    
    inline def setPaddingToleranceUndefined: Self = StObject.set(x, "PaddingTolerance", js.undefined)
    
    inline def setRowIndexStride(value: OrcRowIndexStride): Self = StObject.set(x, "RowIndexStride", value.asInstanceOf[js.Any])
    
    inline def setRowIndexStrideUndefined: Self = StObject.set(x, "RowIndexStride", js.undefined)
    
    inline def setStripeSizeBytes(value: OrcStripeSizeBytes): Self = StObject.set(x, "StripeSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setStripeSizeBytesUndefined: Self = StObject.set(x, "StripeSizeBytes", js.undefined)
  }
}
