package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDBSnapshotMessage extends StObject {
  
  /**
    * A value that indicates whether to copy all tags from the source DB snapshot to the target DB snapshot. By default, tags are not copied.
    */
  var CopyTags: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Amazon Web Services KMS key identifier for an encrypted DB snapshot. The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. If you copy an encrypted DB snapshot from your Amazon Web Services account, you can specify a value for this parameter to encrypt the copy with a new KMS key. If you don't specify a value for this parameter, then the copy of the DB snapshot is encrypted with the same Amazon Web Services KMS key as the source DB snapshot. If you copy an encrypted DB snapshot that is shared from another Amazon Web Services account, then you must specify a value for this parameter. If you specify this parameter when you copy an unencrypted snapshot, the copy is encrypted. If you copy an encrypted snapshot to a different Amazon Web Services Region, then you must specify an Amazon Web Services KMS key identifier for the destination Amazon Web Services Region. KMS keys are specific to the Amazon Web Services Region that they are created in, and you can't use KMS keys from one Amazon Web Services Region in another Amazon Web Services Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of an option group to associate with the copy of the snapshot. Specify this option if you are copying a snapshot from one Amazon Web Services Region to another, and your DB instance uses a nondefault option group. If your source DB instance uses Transparent Data Encryption for Oracle or Microsoft SQL Server, you must specify this option when copying across Amazon Web Services Regions. For more information, see Option group considerations in the Amazon RDS User Guide.
    */
  var OptionGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * When you are copying a snapshot from one Amazon Web Services GovCloud (US) Region to another, the URL that contains a Signature Version 4 signed request for the CopyDBSnapshot API operation in the source Amazon Web Services Region that contains the source DB snapshot to copy. This setting applies only to Amazon Web Services GovCloud (US) Regions. It's ignored in other Amazon Web Services Regions. You must specify this parameter when you copy an encrypted DB snapshot from another Amazon Web Services Region by using the Amazon RDS API. Don't specify PreSignedUrl when you are copying an encrypted DB snapshot in the same Amazon Web Services Region. The presigned URL must be a valid request for the CopyDBClusterSnapshot API operation that can run in the source Amazon Web Services Region that contains the encrypted DB cluster snapshot to copy. The presigned URL request must contain the following parameter values:    DestinationRegion - The Amazon Web Services Region that the encrypted DB snapshot is copied to. This Amazon Web Services Region is the same one where the CopyDBSnapshot operation is called that contains this presigned URL. For example, if you copy an encrypted DB snapshot from the us-west-2 Amazon Web Services Region to the us-east-1 Amazon Web Services Region, then you call the CopyDBSnapshot operation in the us-east-1 Amazon Web Services Region and provide a presigned URL that contains a call to the CopyDBSnapshot operation in the us-west-2 Amazon Web Services Region. For this example, the DestinationRegion in the presigned URL must be set to the us-east-1 Amazon Web Services Region.    KmsKeyId - The KMS key identifier for the KMS key to use to encrypt the copy of the DB snapshot in the destination Amazon Web Services Region. This is the same identifier for both the CopyDBSnapshot operation that is called in the destination Amazon Web Services Region, and the operation contained in the presigned URL.    SourceDBSnapshotIdentifier - The DB snapshot identifier for the encrypted snapshot to be copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web Services Region. For example, if you are copying an encrypted DB snapshot from the us-west-2 Amazon Web Services Region, then your SourceDBSnapshotIdentifier looks like the following example: arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115.   To learn how to generate a Signature Version 4 signed request, see Authenticating Requests: Using Query Parameters (Amazon Web Services Signature Version 4) and Signature Version 4 Signing Process.  If you are using an Amazon Web Services SDK tool or the CLI, you can specify SourceRegion (or --source-region for the CLI) instead of specifying PreSignedUrl manually. Specifying SourceRegion autogenerates a presigned URL that is a valid request for the operation that can run in the source Amazon Web Services Region. If you supply a value for this operation's SourceRegion parameter, a pre-signed URL will be calculated on your behalf.
    */
  var PreSignedUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the source DB snapshot. If the source snapshot is in the same Amazon Web Services Region as the copy, specify a valid DB snapshot identifier. For example, you might specify rds:mysql-instance1-snapshot-20130805. If the source snapshot is in a different Amazon Web Services Region than the copy, specify a valid DB snapshot ARN. For example, you might specify arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805. If you are copying from a shared manual DB snapshot, this parameter must be the Amazon Resource Name (ARN) of the shared DB snapshot. If you are copying an encrypted snapshot this parameter must be in the ARN format for the source Amazon Web Services Region. Constraints:   Must specify a valid system snapshot in the "available" state.   Example: rds:mydb-2012-04-02-00-01  Example: arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805 
    */
  var SourceDBSnapshotIdentifier: String
  
  /**
    * The ID of the region that contains the snapshot to be copied.
    */
  var SourceRegion: js.UndefOr[String] = js.undefined
  
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The external custom Availability Zone (CAZ) identifier for the target CAZ. Example: rds-caz-aiqhTgQv.
    */
  var TargetCustomAvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the copy of the snapshot. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-db-snapshot 
    */
  var TargetDBSnapshotIdentifier: String
}
object CopyDBSnapshotMessage {
  
  inline def apply(SourceDBSnapshotIdentifier: String, TargetDBSnapshotIdentifier: String): CopyDBSnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceDBSnapshotIdentifier = SourceDBSnapshotIdentifier.asInstanceOf[js.Any], TargetDBSnapshotIdentifier = TargetDBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBSnapshotMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyDBSnapshotMessage] (val x: Self) extends AnyVal {
    
    inline def setCopyTags(value: BooleanOptional): Self = StObject.set(x, "CopyTags", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsUndefined: Self = StObject.set(x, "CopyTags", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    inline def setPreSignedUrl(value: String): Self = StObject.set(x, "PreSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setPreSignedUrlUndefined: Self = StObject.set(x, "PreSignedUrl", js.undefined)
    
    inline def setSourceDBSnapshotIdentifier(value: String): Self = StObject.set(x, "SourceDBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceRegion(value: String): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetCustomAvailabilityZone(value: String): Self = StObject.set(x, "TargetCustomAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setTargetCustomAvailabilityZoneUndefined: Self = StObject.set(x, "TargetCustomAvailabilityZone", js.undefined)
    
    inline def setTargetDBSnapshotIdentifier(value: String): Self = StObject.set(x, "TargetDBSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
