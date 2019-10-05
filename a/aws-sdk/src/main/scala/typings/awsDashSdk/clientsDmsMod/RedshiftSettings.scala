package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedshiftSettings extends js.Object {
  /**
    * A value that indicates to allow any date format, including invalid formats such as 00/00/00 00:00:00, to be loaded without generating an error. You can choose true or false (the default). This parameter applies only to TIMESTAMP and DATE columns. Always use ACCEPTANYDATE with the DATEFORMAT parameter. If the date format for the data doesn't match the DATEFORMAT specification, Amazon Redshift inserts a NULL value into that field. 
    */
  var AcceptAnyDate: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * Code to run after connecting. This parameter should contain the code itself, not the name of a file containing the code.
    */
  var AfterConnectScript: js.UndefOr[String] = js.undefined
  /**
    * The location where the comma-separated value (.csv) files are stored before being uploaded to the S3 bucket. 
    */
  var BucketFolder: js.UndefOr[String] = js.undefined
  /**
    * The name of the S3 bucket you want to use
    */
  var BucketName: js.UndefOr[String] = js.undefined
  /**
    * A value that sets the amount of time to wait (in milliseconds) before timing out, beginning from when you initially establish a connection.
    */
  var ConnectionTimeout: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The name of the Amazon Redshift data warehouse (service) that you are working with.
    */
  var DatabaseName: js.UndefOr[String] = js.undefined
  /**
    * The date format that you are using. Valid values are auto (case-sensitive), your date format string enclosed in quotes, or NULL. If this parameter is left unset (NULL), it defaults to a format of 'YYYY-MM-DD'. Using auto recognizes most strings, even some that aren't supported when you use a date format string.  If your date and time values use formats different from each other, set this to auto. 
    */
  var DateFormat: js.UndefOr[String] = js.undefined
  /**
    * A value that specifies whether AWS DMS should migrate empty CHAR and VARCHAR fields as NULL. A value of true sets empty CHAR and VARCHAR fields to null. The default is false.
    */
  var EmptyAsNull: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The type of server-side encryption that you want to use for your data. This encryption type is part of the endpoint settings or the extra connections attributes for Amazon S3. You can choose either SSE_S3 (the default) or SSE_KMS. To use SSE_S3, create an AWS Identity and Access Management (IAM) role with a policy that allows "arn:aws:s3:::*" to use the following actions: "s3:PutObject", "s3:ListBucket" 
    */
  var EncryptionMode: js.UndefOr[EncryptionModeValue] = js.undefined
  /**
    * The number of threads used to upload a single file. This parameter accepts a value from 1 through 64. It defaults to 10.
    */
  var FileTransferUploadStreams: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The amount of time to wait (in milliseconds) before timing out, beginning from when you begin loading.
    */
  var LoadTimeout: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The maximum size (in KB) of any .csv file used to transfer data to Amazon Redshift. This accepts a value from 1 through 1,048,576. It defaults to 32,768 KB (32 MB).
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The password for the user named in the username property.
    */
  var Password: js.UndefOr[SecretString] = js.undefined
  /**
    * The port number for Amazon Redshift. The default value is 5439.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * A value that specifies to remove surrounding quotation marks from strings in the incoming data. All characters within the quotation marks, including delimiters, are retained. Choose true to remove quotation marks. The default is false.
    */
  var RemoveQuotes: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A value that specifies to replaces the invalid characters specified in ReplaceInvalidChars, substituting the specified characters instead. The default is "?".
    */
  var ReplaceChars: js.UndefOr[String] = js.undefined
  /**
    * A list of characters that you want to replace. Use with ReplaceChars.
    */
  var ReplaceInvalidChars: js.UndefOr[String] = js.undefined
  /**
    * The name of the Amazon Redshift cluster you are using.
    */
  var ServerName: js.UndefOr[String] = js.undefined
  /**
    * The AWS KMS key ID. If you are using SSE_KMS for the EncryptionMode, provide this key ID. The key that you use needs an attached policy that enables IAM user permissions and allows use of the key.
    */
  var ServerSideEncryptionKmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role that has access to the Amazon Redshift service.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
  /**
    * The time format that you want to use. Valid values are auto (case-sensitive), 'timeformat_string', 'epochsecs', or 'epochmillisecs'. It defaults to 10. Using auto recognizes most strings, even some that aren't supported when you use a time format string.  If your date and time values use formats different from each other, set this parameter to auto. 
    */
  var TimeFormat: js.UndefOr[String] = js.undefined
  /**
    * A value that specifies to remove the trailing white space characters from a VARCHAR string. This parameter applies only to columns with a VARCHAR data type. Choose true to remove unneeded white space. The default is false.
    */
  var TrimBlanks: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * A value that specifies to truncate data in columns to the appropriate number of characters, so that the data fits in the column. This parameter applies only to columns with a VARCHAR or CHAR data type, and rows with a size of 4 MB or less. Choose true to truncate data. The default is false.
    */
  var TruncateColumns: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * An Amazon Redshift user name for a registered user.
    */
  var Username: js.UndefOr[String] = js.undefined
  /**
    * The size of the write buffer to use in rows. Valid values range from 1 through 2,048. The default is 1,024. Use this setting to tune performance. 
    */
  var WriteBufferSize: js.UndefOr[IntegerOptional] = js.undefined
}

object RedshiftSettings {
  @scala.inline
  def apply(
    AcceptAnyDate: js.UndefOr[scala.Boolean] = js.undefined,
    AfterConnectScript: String = null,
    BucketFolder: String = null,
    BucketName: String = null,
    ConnectionTimeout: Int | Double = null,
    DatabaseName: String = null,
    DateFormat: String = null,
    EmptyAsNull: js.UndefOr[scala.Boolean] = js.undefined,
    EncryptionMode: EncryptionModeValue = null,
    FileTransferUploadStreams: Int | Double = null,
    LoadTimeout: Int | Double = null,
    MaxFileSize: Int | Double = null,
    Password: SecretString = null,
    Port: Int | Double = null,
    RemoveQuotes: js.UndefOr[scala.Boolean] = js.undefined,
    ReplaceChars: String = null,
    ReplaceInvalidChars: String = null,
    ServerName: String = null,
    ServerSideEncryptionKmsKeyId: String = null,
    ServiceAccessRoleArn: String = null,
    TimeFormat: String = null,
    TrimBlanks: js.UndefOr[scala.Boolean] = js.undefined,
    TruncateColumns: js.UndefOr[scala.Boolean] = js.undefined,
    Username: String = null,
    WriteBufferSize: Int | Double = null
  ): RedshiftSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AcceptAnyDate)) __obj.updateDynamic("AcceptAnyDate")(AcceptAnyDate)
    if (AfterConnectScript != null) __obj.updateDynamic("AfterConnectScript")(AfterConnectScript)
    if (BucketFolder != null) __obj.updateDynamic("BucketFolder")(BucketFolder)
    if (BucketName != null) __obj.updateDynamic("BucketName")(BucketName)
    if (ConnectionTimeout != null) __obj.updateDynamic("ConnectionTimeout")(ConnectionTimeout.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName)
    if (DateFormat != null) __obj.updateDynamic("DateFormat")(DateFormat)
    if (!js.isUndefined(EmptyAsNull)) __obj.updateDynamic("EmptyAsNull")(EmptyAsNull)
    if (EncryptionMode != null) __obj.updateDynamic("EncryptionMode")(EncryptionMode.asInstanceOf[js.Any])
    if (FileTransferUploadStreams != null) __obj.updateDynamic("FileTransferUploadStreams")(FileTransferUploadStreams.asInstanceOf[js.Any])
    if (LoadTimeout != null) __obj.updateDynamic("LoadTimeout")(LoadTimeout.asInstanceOf[js.Any])
    if (MaxFileSize != null) __obj.updateDynamic("MaxFileSize")(MaxFileSize.asInstanceOf[js.Any])
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (!js.isUndefined(RemoveQuotes)) __obj.updateDynamic("RemoveQuotes")(RemoveQuotes)
    if (ReplaceChars != null) __obj.updateDynamic("ReplaceChars")(ReplaceChars)
    if (ReplaceInvalidChars != null) __obj.updateDynamic("ReplaceInvalidChars")(ReplaceInvalidChars)
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName)
    if (ServerSideEncryptionKmsKeyId != null) __obj.updateDynamic("ServerSideEncryptionKmsKeyId")(ServerSideEncryptionKmsKeyId)
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn)
    if (TimeFormat != null) __obj.updateDynamic("TimeFormat")(TimeFormat)
    if (!js.isUndefined(TrimBlanks)) __obj.updateDynamic("TrimBlanks")(TrimBlanks)
    if (!js.isUndefined(TruncateColumns)) __obj.updateDynamic("TruncateColumns")(TruncateColumns)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    if (WriteBufferSize != null) __obj.updateDynamic("WriteBufferSize")(WriteBufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftSettings]
  }
}

