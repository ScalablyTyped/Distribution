package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Settings extends js.Object {
  /**
    *  An optional parameter to set a folder name in the S3 bucket. If provided, tables are created in the path  bucketFolder/schema_name/table_name/. If this parameter is not specified, then the path used is  schema_name/table_name/. 
    */
  var BucketFolder: js.UndefOr[String] = js.native
  /**
    *  The name of the S3 bucket. 
    */
  var BucketName: js.UndefOr[String] = js.native
  /**
    * A value that enables a change data capture (CDC) load to write only INSERT operations to .csv or columnar storage (.parquet) output files. By default (the false setting), the first field in a .csv or .parquet record contains the letter I (INSERT), U (UPDATE), or D (DELETE). These values indicate whether the row was inserted, updated, or deleted at the source database for a CDC load to the target. If CdcInsertsOnly is set to true or y, only INSERTs from the source database are migrated to the .csv or .parquet file. For .csv format only, how these INSERTs are recorded depends on the value of IncludeOpForFullLoad. If IncludeOpForFullLoad is set to true, the first field of every CDC record is set to I to indicate the INSERT operation at the source. If IncludeOpForFullLoad is set to false, every CDC record is written without a first field to indicate the INSERT operation at the source. For more information about how these settings work together, see Indicating Source DB Operations in Migrated S3 Data in the AWS Database Migration Service User Guide..  AWS DMS supports this interaction between the CdcInsertsOnly and IncludeOpForFullLoad parameters in versions 3.1.4 and later.  
    */
  var CdcInsertsOnly: js.UndefOr[BooleanOptional] = js.native
  /**
    *  An optional parameter to use GZIP to compress the target files. Set to GZIP to compress the target files. Set to NONE (the default) or do not use to leave the files uncompressed. Applies to both .csv and .parquet file formats. 
    */
  var CompressionType: js.UndefOr[CompressionTypeValue] = js.native
  /**
    *  The delimiter used to separate columns in the source files. The default is a comma. 
    */
  var CsvDelimiter: js.UndefOr[String] = js.native
  /**
    *  The delimiter used to separate rows in the source files. The default is a carriage return (\n). 
    */
  var CsvRowDelimiter: js.UndefOr[String] = js.native
  /**
    * The format of the data that you want to use for output. You can choose one of the following:     csv : This is a row-based file format with comma-separated values (.csv).     parquet : Apache Parquet (.parquet) is a columnar storage file format that features efficient compression and provides faster query response.   
    */
  var DataFormat: js.UndefOr[DataFormatValue] = js.native
  /**
    * The size of one data page in bytes. This parameter defaults to 1024 * 1024 bytes (1 MiB). This number is used for .parquet file format only. 
    */
  var DataPageSize: js.UndefOr[IntegerOptional] = js.native
  /**
    * The maximum size of an encoded dictionary page of a column. If the dictionary page exceeds this, this column is stored using an encoding type of PLAIN. This parameter defaults to 1024 * 1024 bytes (1 MiB), the maximum size of a dictionary page before it reverts to PLAIN encoding. This size is used for .parquet file format only. 
    */
  var DictPageSizeLimit: js.UndefOr[IntegerOptional] = js.native
  /**
    * A value that enables statistics for Parquet pages and row groups. Choose true to enable statistics, false to disable. Statistics include NULL, DISTINCT, MAX, and MIN values. This parameter defaults to true. This value is used for .parquet file format only.
    */
  var EnableStatistics: js.UndefOr[BooleanOptional] = js.native
  /**
    * The type of encoding you are using:     RLE_DICTIONARY uses a combination of bit-packing and run-length encoding to store repeated values more efficiently. This is the default.    PLAIN doesn't use encoding at all. Values are stored as they are.    PLAIN_DICTIONARY builds a dictionary of the values encountered in a given column. The dictionary is stored in a dictionary page for each column chunk.  
    */
  var EncodingType: js.UndefOr[EncodingTypeValue] = js.native
  /**
    * The type of server-side encryption that you want to use for your data. This encryption type is part of the endpoint settings or the extra connections attributes for Amazon S3. You can choose either SSE_S3 (the default) or SSE_KMS. To use SSE_S3, you need an AWS Identity and Access Management (IAM) role with permission to allow "arn:aws:s3:::dms-*" to use the following actions:    s3:CreateBucket     s3:ListBucket     s3:DeleteBucket     s3:GetBucketLocation     s3:GetObject     s3:PutObject     s3:DeleteObject     s3:GetObjectVersion     s3:GetBucketPolicy     s3:PutBucketPolicy     s3:DeleteBucketPolicy   
    */
  var EncryptionMode: js.UndefOr[EncryptionModeValue] = js.native
  /**
    *  The external table definition. 
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.native
  /**
    * A value that enables a full load to write INSERT operations to the comma-separated value (.csv) output files only to indicate how the rows were added to the source database.  AWS DMS supports the IncludeOpForFullLoad parameter in versions 3.1.4 and later.  For full load, records can only be inserted. By default (the false setting), no information is recorded in these output files for a full load to indicate that the rows were inserted at the source database. If IncludeOpForFullLoad is set to true or y, the INSERT is recorded as an I annotation in the first field of the .csv file. This allows the format of your target records from a full load to be consistent with the target records from a CDC load.  This setting works together with the CdcInsertsOnly parameter for output to .csv files only. For more information about how these settings work together, see Indicating Source DB Operations in Migrated S3 Data in the AWS Database Migration Service User Guide.. 
    */
  var IncludeOpForFullLoad: js.UndefOr[BooleanOptional] = js.native
  /**
    * A value that specifies the precision of any TIMESTAMP column values that are written to an Amazon S3 object file in .parquet format.  AWS DMS supports the ParquetTimestampInMillisecond parameter in versions 3.1.4 and later.  When ParquetTimestampInMillisecond is set to true or y, AWS DMS writes all TIMESTAMP columns in a .parquet formatted file with millisecond precision. Otherwise, DMS writes them with microsecond precision. Currently, Amazon Athena and AWS Glue can handle only millisecond precision for TIMESTAMP values. Set this parameter to true for S3 endpoint object files that are .parquet formatted only if you plan to query or process the data with Athena or AWS Glue.  AWS DMS writes any TIMESTAMP column values written to an S3 file in .csv format with microsecond precision. Setting ParquetTimestampInMillisecond has no effect on the string format of the timestamp column value that is inserted by setting the TimestampColumnName parameter. 
    */
  var ParquetTimestampInMillisecond: js.UndefOr[BooleanOptional] = js.native
  /**
    * The version of the Apache Parquet format that you want to use: parquet_1_0 (the default) or parquet_2_0.
    */
  var ParquetVersion: js.UndefOr[ParquetVersionValue] = js.native
  /**
    * The number of rows in a row group. A smaller row group size provides faster reads. But as the number of row groups grows, the slower writes become. This parameter defaults to 10,000 rows. This number is used for .parquet file format only.  If you choose a value larger than the maximum, RowGroupLength is set to the max row group length in bytes (64 * 1024 * 1024). 
    */
  var RowGroupLength: js.UndefOr[IntegerOptional] = js.native
  /**
    * If you are using SSE_KMS for the EncryptionMode, provide the AWS KMS key ID. The key that you use needs an attached policy that enables AWS Identity and Access Management (IAM) user permissions and allows use of the key. Here is a CLI example: aws dms create-endpoint --endpoint-identifier value --endpoint-type target --engine-name s3 --s3-settings ServiceAccessRoleArn=value,BucketFolder=value,BucketName=value,EncryptionMode=SSE_KMS,ServerSideEncryptionKmsKeyId=value  
    */
  var ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.native
  /**
    *  The Amazon Resource Name (ARN) used by the service access IAM role. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * A value that when nonblank causes AWS DMS to add a column with timestamp information to the endpoint data for an Amazon S3 target.  AWS DMS supports the TimestampColumnName parameter in versions 3.1.4 and later.  DMS includes an additional STRING column in the .csv or .parquet object files of your migrated data when you set TimestampColumnName to a nonblank value. For a full load, each row of this timestamp column contains a timestamp for when the data was transferred from the source to the target by DMS.  For a change data capture (CDC) load, each row of the timestamp column contains the timestamp for the commit of that row in the source database. The string format for this timestamp column value is yyyy-MM-dd HH:mm:ss.SSSSSS. By default, the precision of this value is in microseconds. For a CDC load, the rounding of the precision depends on the commit timestamp supported by DMS for the source database. When the AddColumnName parameter is set to true, DMS also includes a name for the timestamp column that you set with TimestampColumnName.
    */
  var TimestampColumnName: js.UndefOr[String] = js.native
}

object S3Settings {
  @scala.inline
  def apply(
    BucketFolder: String = null,
    BucketName: String = null,
    CdcInsertsOnly: js.UndefOr[scala.Boolean] = js.undefined,
    CompressionType: CompressionTypeValue = null,
    CsvDelimiter: String = null,
    CsvRowDelimiter: String = null,
    DataFormat: DataFormatValue = null,
    DataPageSize: Int | Double = null,
    DictPageSizeLimit: Int | Double = null,
    EnableStatistics: js.UndefOr[scala.Boolean] = js.undefined,
    EncodingType: EncodingTypeValue = null,
    EncryptionMode: EncryptionModeValue = null,
    ExternalTableDefinition: String = null,
    IncludeOpForFullLoad: js.UndefOr[scala.Boolean] = js.undefined,
    ParquetTimestampInMillisecond: js.UndefOr[scala.Boolean] = js.undefined,
    ParquetVersion: ParquetVersionValue = null,
    RowGroupLength: Int | Double = null,
    ServerSideEncryptionKmsKeyId: String = null,
    ServiceAccessRoleArn: String = null,
    TimestampColumnName: String = null
  ): S3Settings = {
    val __obj = js.Dynamic.literal()
    if (BucketFolder != null) __obj.updateDynamic("BucketFolder")(BucketFolder.asInstanceOf[js.Any])
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName.asInstanceOf[js.Any])
    if (!js.isUndefined(CdcInsertsOnly)) __obj.updateDynamic("CdcInsertsOnly")(CdcInsertsOnly.asInstanceOf[js.Any])
    if (CompressionType != null) __obj.updateDynamic("CompressionType")(CompressionType.asInstanceOf[js.Any])
    if (CsvDelimiter != null) __obj.updateDynamic("CsvDelimiter")(CsvDelimiter.asInstanceOf[js.Any])
    if (CsvRowDelimiter != null) __obj.updateDynamic("CsvRowDelimiter")(CsvRowDelimiter.asInstanceOf[js.Any])
    if (DataFormat != null) __obj.updateDynamic("DataFormat")(DataFormat.asInstanceOf[js.Any])
    if (DataPageSize != null) __obj.updateDynamic("DataPageSize")(DataPageSize.asInstanceOf[js.Any])
    if (DictPageSizeLimit != null) __obj.updateDynamic("DictPageSizeLimit")(DictPageSizeLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableStatistics)) __obj.updateDynamic("EnableStatistics")(EnableStatistics.asInstanceOf[js.Any])
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (EncryptionMode != null) __obj.updateDynamic("EncryptionMode")(EncryptionMode.asInstanceOf[js.Any])
    if (ExternalTableDefinition != null) __obj.updateDynamic("ExternalTableDefinition")(ExternalTableDefinition.asInstanceOf[js.Any])
    if (!js.isUndefined(IncludeOpForFullLoad)) __obj.updateDynamic("IncludeOpForFullLoad")(IncludeOpForFullLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(ParquetTimestampInMillisecond)) __obj.updateDynamic("ParquetTimestampInMillisecond")(ParquetTimestampInMillisecond.asInstanceOf[js.Any])
    if (ParquetVersion != null) __obj.updateDynamic("ParquetVersion")(ParquetVersion.asInstanceOf[js.Any])
    if (RowGroupLength != null) __obj.updateDynamic("RowGroupLength")(RowGroupLength.asInstanceOf[js.Any])
    if (ServerSideEncryptionKmsKeyId != null) __obj.updateDynamic("ServerSideEncryptionKmsKeyId")(ServerSideEncryptionKmsKeyId.asInstanceOf[js.Any])
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn.asInstanceOf[js.Any])
    if (TimestampColumnName != null) __obj.updateDynamic("TimestampColumnName")(TimestampColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Settings]
  }
}

