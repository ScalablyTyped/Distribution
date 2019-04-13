package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Settings extends js.Object {
  /**
    *  An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path &lt;bucketFolder&gt;/&lt;schema_name&gt;/&lt;table_name&gt;/. If this parameter is not specified, then the path used is &lt;schema_name&gt;/&lt;table_name&gt;/. 
    */
  var BucketFolder: js.UndefOr[String] = js.undefined
  /**
    *  The name of the S3 bucket. 
    */
  var BucketName: js.UndefOr[String] = js.undefined
  /**
    * Option to write only INSERT operations to the comma-separated value (CSV) output files. By default, the first field in a CSV record contains the letter I (insert), U (update) or D (delete) to indicate whether the row was inserted, updated, or deleted at the source database. If cdcInsertsOnly is set to true, then only INSERTs are recorded in the CSV file, without the I annotation on each line. Valid values are TRUE and FALSE.
    */
  var CdcInsertsOnly: js.UndefOr[BooleanOptional] = js.undefined
  /**
    *  An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Set to NONE (the default) or do not use to leave the files uncompressed. Applies to both CSV and PARQUET data formats. 
    */
  var CompressionType: js.UndefOr[CompressionTypeValue] = js.undefined
  /**
    *  The delimiter used to separate columns in the source files. The default is a comma. 
    */
  var CsvDelimiter: js.UndefOr[String] = js.undefined
  /**
    *  The delimiter used to separate rows in the source files. The default is a carriage return (\n). 
    */
  var CsvRowDelimiter: js.UndefOr[String] = js.undefined
  /**
    * The format of the data which you want to use for output. You can choose one of the following:     CSV : This is a row-based format with comma-separated values.     PARQUET : Apache Parquet is a columnar storage format that features efficient compression and provides faster query response.   
    */
  var DataFormat: js.UndefOr[DataFormatValue] = js.undefined
  /**
    * The size of one data page in bytes. Defaults to 1024 * 1024 bytes (1MiB). For PARQUET format only. 
    */
  var DataPageSize: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this column is stored using an encoding type of PLAIN. Defaults to 1024 * 1024 bytes (1MiB), the maximum size of a dictionary page before it reverts to PLAIN encoding. For PARQUET format only. 
    */
  var DictPageSizeLimit: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * Enables statistics for Parquet pages and rowGroups. Choose TRUE to enable statistics, choose FALSE to disable. Statistics include NULL, DISTINCT, MAX, and MIN values. Defaults to TRUE. For PARQUET format only.
    */
  var EnableStatistics: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The type of encoding you are using: RLE_DICTIONARY (default), PLAIN, or PLAIN_DICTIONARY.    RLE_DICTIONARY uses a combination of bit-packing and run-length encoding to store repeated values more efficiently.    PLAIN does not use encoding at all. Values are stored as they are.    PLAIN_DICTIONARY builds a dictionary of the values encountered in a given column. The dictionary is stored in a dictionary page for each column chunk.  
    */
  var EncodingType: js.UndefOr[EncodingTypeValue] = js.undefined
  /**
    * The type of server side encryption you want to use for your data. This is part of the endpoint settings or the extra connections attributes for Amazon S3. You can choose either SSE_S3 (default) or SSE_KMS. To use SSE_S3, you need an IAM role with permission to allow "arn:aws:s3:::dms-*" to use the following actions:   s3:CreateBucket   s3:ListBucket   s3:DeleteBucket   s3:GetBucketLocation   s3:GetObject   s3:PutObject   s3:DeleteObject   s3:GetObjectVersion   s3:GetBucketPolicy   s3:PutBucketPolicy   s3:DeleteBucketPolicy  
    */
  var EncryptionMode: js.UndefOr[EncryptionModeValue] = js.undefined
  /**
    *  The external table definition. 
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.undefined
  /**
    * The version of Apache Parquet format you want to use: PARQUET_1_0 (default) or PARQUET_2_0.
    */
  var ParquetVersion: js.UndefOr[ParquetVersionValue] = js.undefined
  /**
    * The number of rows in a row group. A smaller row group size provides faster reads. But as the number of row groups grows, the slower writes become. Defaults to 10,000 (ten thousand) rows. For PARQUET format only.  If you choose a value larger than the maximum, RowGroupLength is set to the max row group length in bytes (64 * 1024 * 1024). 
    */
  var RowGroupLength: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * If you are using SSE_KMS for the EncryptionMode, provide the KMS Key ID. The key you use needs an attached policy that enables IAM user permissions and allows use of the key. Here is a CLI example: aws dms create-endpoint --endpoint-identifier &lt;value&gt; --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=&lt;value&gt;,BucketFolder=&lt;value&gt;,BucketName=&lt;value&gt;,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=&lt;value&gt;  
    */
  var ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.undefined
  /**
    *  The Amazon Resource Name (ARN) used by the service access IAM role. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
}

object S3Settings {
  @scala.inline
  def apply(
    BucketFolder: String = null,
    BucketName: String = null,
    CdcInsertsOnly: js.UndefOr[BooleanOptional] = js.undefined,
    CompressionType: CompressionTypeValue = null,
    CsvDelimiter: String = null,
    CsvRowDelimiter: String = null,
    DataFormat: DataFormatValue = null,
    DataPageSize: js.UndefOr[IntegerOptional] = js.undefined,
    DictPageSizeLimit: js.UndefOr[IntegerOptional] = js.undefined,
    EnableStatistics: js.UndefOr[BooleanOptional] = js.undefined,
    EncodingType: EncodingTypeValue = null,
    EncryptionMode: EncryptionModeValue = null,
    ExternalTableDefinition: String = null,
    ParquetVersion: ParquetVersionValue = null,
    RowGroupLength: js.UndefOr[IntegerOptional] = js.undefined,
    ServerSideEncryptionKmsKeyId: String = null,
    ServiceAccessRoleArn: String = null
  ): S3Settings = {
    val __obj = js.Dynamic.literal()
    if (BucketFolder != null) __obj.updateDynamic("BucketFolder")(BucketFolder)
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName)
    if (!js.isUndefined(CdcInsertsOnly)) __obj.updateDynamic("CdcInsertsOnly")(CdcInsertsOnly)
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    if (CsvDelimiter != null) __obj.updateDynamic("CsvDelimiter")(CsvDelimiter)
    if (CsvRowDelimiter != null) __obj.updateDynamic("CsvRowDelimiter")(CsvRowDelimiter)
    if (DataFormat != null) __obj.updateDynamic("DataFormat")(DataFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(DataPageSize)) __obj.updateDynamic("DataPageSize")(DataPageSize)
    if (!js.isUndefined(DictPageSizeLimit)) __obj.updateDynamic("DictPageSizeLimit")(DictPageSizeLimit)
    if (!js.isUndefined(EnableStatistics)) __obj.updateDynamic("EnableStatistics")(EnableStatistics)
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (EncryptionMode != null) __obj.updateDynamic("EncryptionMode")(EncryptionMode.asInstanceOf[js.Any])
    if (ExternalTableDefinition != null) __obj.updateDynamic("ExternalTableDefinition")(ExternalTableDefinition)
    if (ParquetVersion != null) __obj.updateDynamic("ParquetVersion")(ParquetVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(RowGroupLength)) __obj.updateDynamic("RowGroupLength")(RowGroupLength)
    if (ServerSideEncryptionKmsKeyId != null) __obj.updateDynamic("ServerSideEncryptionKmsKeyId")(ServerSideEncryptionKmsKeyId)
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn)
    __obj.asInstanceOf[S3Settings]
  }
}

