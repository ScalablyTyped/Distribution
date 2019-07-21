package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Settings extends js.Object {
  /**
    *  An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path  bucketFolder/schema_name/table_name/. If this parameter is not specified, then the path used is  schema_name/table_name/. 
    */
  var BucketFolder: js.UndefOr[String] = js.undefined
  /**
    *  The name of the S3 bucket. 
    */
  var BucketName: js.UndefOr[String] = js.undefined
  /**
    * A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar storage (.parquet) output files. By default (the false setting), the first field in a .csv or .parquet record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate whether the row was inserted, updated, or deleted at the source database for a CDC load to the target. If cdcInsertsOnly is set to true or y, only INSERTs from the source database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded depends on the value of IncludeOpForFullLoad. If IncludeOpForFullLoad is set to true, the first field of every CDC record is set to I to indicate the INSERT operation at the source. If IncludeOpForFullLoad is set to false, every CDC record is written without a first field to indicate the INSERT operation at the source. For more information about how these settings work together, see Indicating Source DB Operations in Migrated S3 Data in the AWS Database Migration Service User Guide..  AWS DMS supports this interaction between CdcInsertsOnly and IncludeOpForFullLoad in versions 3.1.4 and later.  
    */
  var CdcInsertsOnly: js.UndefOr[BooleanOptional] = js.undefined
  /**
    *  An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Set to NONE (the default) or do not use to leave the files uncompressed. Applies to both .csv and .parquet file formats. 
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
    * The format of the data that you want to use for output. You can choose one of the following:     csv : This is a row-based file format with comma-separated values (.csv).     parquet : Apache Parquet (.parquet) is a columnar storage file format that features efficient compression and provides faster query response.   
    */
  var DataFormat: js.UndefOr[DataFormatValue] = js.undefined
  /**
    * The size of one data page in bytes. This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for .parquet file format only. 
    */
  var DataPageSize: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this column is stored using an encoding type of PLAIN. This parameter defaults to 1024 * 1024 bytes (1 MiB), the maximum size of a dictionary page before it reverts to PLAIN encoding. This size is used for .parquet file format only. 
    */
  var DictPageSizeLimit: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A value that enables statistics for Parquet pages and row groups. Choose true to enable statistics, false to disable. Statistics include NULL, DISTINCT, MAX, and MIN values. This parameter defaults to true. This value is used for .parquet file format only.
    */
  var EnableStatistics: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The type of encoding you are using:     RLE_DICTIONARY uses a combination of bit-packing and run-length encoding to store repeated values more efficiently. This is the default.    PLAIN doesn't use encoding at all. Values are stored as they are.    PLAIN_DICTIONARY builds a dictionary of the values encountered in a given column. The dictionary is stored in a dictionary page for each column chunk.  
    */
  var EncodingType: js.UndefOr[EncodingTypeValue] = js.undefined
  /**
    * The type of server-side encryption that you want to use for your data. This encryption type is part of the endpoint settings or the extra connections attributes for Amazon S3. You can choose either SSE_S3 (the default) or SSE_KMS. To use SSE_S3, you need an AWS Identity and Access Management (IAM) role with permission to allow "arn:aws:s3:::dms-*" to use the following actions:    s3:CreateBucket     s3:ListBucket     s3:DeleteBucket     s3:GetBucketLocation     s3:GetObject     s3:PutObject     s3:DeleteObject     s3:GetObjectVersion     s3:GetBucketPolicy     s3:PutBucketPolicy     s3:DeleteBucketPolicy   
    */
  var EncryptionMode: js.UndefOr[EncryptionModeValue] = js.undefined
  /**
    *  The external table definition. 
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.undefined
  /**
    * A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output files only to indicate how the rows were added to the source database.  AWS DMS supports IncludeOpForFullLoad in versions 3.1.4 and later.  For full load, records can only be inserted. By default (the false setting), no information is recorded in these output files for a full load to indicate that the rows were inserted at the source database. If IncludeOpForFullLoad is set to true or y, the INSERT is recorded as an I annotation in the first field of the .csv file. This allows the format of your target records from a full load to be consistent with the target records from a CDC load.  This setting works together with CdcInsertsOnly for output to .csv files only. For more information about how these settings work together, see Indicating Source DB Operations in Migrated S3 Data in the AWS Database Migration Service User Guide.. 
    */
  var IncludeOpForFullLoad: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The version of the Apache Parquet format that you want to use: parquet_1_0 (the default) or parquet_2_0.
    */
  var ParquetVersion: js.UndefOr[ParquetVersionValue] = js.undefined
  /**
    * The number of rows in a row group. A smaller row group size provides faster reads. But as the number of row groups grows, the slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet file format only.  If you choose a value larger than the maximum, RowGroupLength is set to the max row group length in bytes (64 * 1024 * 1024). 
    */
  var RowGroupLength: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * If you are using SSE_KMS for the EncryptionMode, provide the AWS KMS key ID. The key that you use needs an attached policy that enables AWS Identity and Access Management (IAM) user permissions and allows use of the key. Here is a CLI example: aws dms create-endpoint --endpoint-identifier value --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=value,BucketFolder=value,BucketName=value,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=value  
    */
  var ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.undefined
  /**
    *  The Amazon Resource Name (ARN) used by the service access IAM role. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  /**
    * A value that includes a timestamp column in the Amazon S3 target endpoint data. AWS DMS includes an additional column in the migrated data when you set timestampColumnName to a non-blank value.   AWS DMS supports TimestampColumnName in versions 3.1.4 and later.  For a full load, each row of the timestamp column contains a timestamp for when the data was transferred from the source to the target by DMS. For a CDC load, each row of the timestamp column contains the timestamp for the commit of that row in the source database. The format for the timestamp column value is yyyy-MM-dd HH:mm:ss.SSSSSS. For CDC, the microsecond precision depends on the commit timestamp supported by DMS for the source database. When the AddColumnName setting is set to true, DMS also includes the name for the timestamp column that you set as the nonblank value of timestampColumnName.
    */
  var TimestampColumnName: js.UndefOr[String] = js.undefined
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
    IncludeOpForFullLoad: js.UndefOr[BooleanOptional] = js.undefined,
    ParquetVersion: ParquetVersionValue = null,
    RowGroupLength: js.UndefOr[IntegerOptional] = js.undefined,
    ServerSideEncryptionKmsKeyId: String = null,
    ServiceAccessRoleArn: String = null,
    TimestampColumnName: String = null
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
    if (!js.isUndefined(IncludeOpForFullLoad)) __obj.updateDynamic("IncludeOpForFullLoad")(IncludeOpForFullLoad)
    if (ParquetVersion != null) __obj.updateDynamic("ParquetVersion")(ParquetVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(RowGroupLength)) __obj.updateDynamic("RowGroupLength")(RowGroupLength)
    if (ServerSideEncryptionKmsKeyId != null) __obj.updateDynamic("ServerSideEncryptionKmsKeyId")(ServerSideEncryptionKmsKeyId)
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn)
    if (TimestampColumnName != null) __obj.updateDynamic("TimestampColumnName")(TimestampColumnName)
    __obj.asInstanceOf[S3Settings]
  }
}

