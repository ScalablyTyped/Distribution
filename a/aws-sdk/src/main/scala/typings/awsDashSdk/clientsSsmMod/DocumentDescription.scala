package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentDescription extends js.Object {
  /**
    * Details about the document attachments, including names, locations, sizes, etc.
    */
  var AttachmentsInformation: js.UndefOr[AttachmentInformationList] = js.undefined
  /**
    * The date when the document was created.
    */
  var CreatedDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The default version.
    */
  var DefaultVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * A description of the document. 
    */
  var Description: js.UndefOr[DescriptionInDocument] = js.undefined
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentFormat] = js.undefined
  /**
    * The type of document.
    */
  var DocumentType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentType] = js.undefined
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.undefined
  /**
    * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
    */
  var Hash: js.UndefOr[DocumentHash] = js.undefined
  /**
    * The hash type of the document. Valid values include Sha256 or Sha1.  Sha1 hashes have been deprecated. 
    */
  var HashType: js.UndefOr[DocumentHashType] = js.undefined
  /**
    * The latest version of the document.
    */
  var LatestVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  /**
    * The AWS user account that created the document.
    */
  var Owner: js.UndefOr[DocumentOwner] = js.undefined
  /**
    * A description of the parameters for a document.
    */
  var Parameters: js.UndefOr[DocumentParameterList] = js.undefined
  /**
    * The list of OS platforms compatible with this Systems Manager document. 
    */
  var PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined
  /**
    * The schema version.
    */
  var SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined
  /**
    * The SHA1 hash of the document, which you can use for verification.
    */
  var Sha1: js.UndefOr[DocumentSha1] = js.undefined
  /**
    * The status of the Systems Manager document.
    */
  var Status: js.UndefOr[DocumentStatus] = js.undefined
  /**
    * A message returned by AWS Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
    */
  var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.undefined
  /**
    * The tags, or metadata, that have been applied to the document.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetType] = js.undefined
  /**
    * The version of the artifact associated with the document.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}

object DocumentDescription {
  @scala.inline
  def apply(
    AttachmentsInformation: AttachmentInformationList = null,
    CreatedDate: DateTime = null,
    DefaultVersion: DocumentVersion = null,
    Description: DescriptionInDocument = null,
    DocumentFormat: DocumentFormat = null,
    DocumentType: DocumentType = null,
    DocumentVersion: DocumentVersion = null,
    Hash: DocumentHash = null,
    HashType: DocumentHashType = null,
    LatestVersion: DocumentVersion = null,
    Name: DocumentARN = null,
    Owner: DocumentOwner = null,
    Parameters: DocumentParameterList = null,
    PlatformTypes: PlatformTypeList = null,
    SchemaVersion: DocumentSchemaVersion = null,
    Sha1: DocumentSha1 = null,
    Status: DocumentStatus = null,
    StatusInformation: DocumentStatusInformation = null,
    Tags: TagList = null,
    TargetType: TargetType = null,
    VersionName: DocumentVersionName = null
  ): DocumentDescription = {
    val __obj = js.Dynamic.literal()
    if (AttachmentsInformation != null) __obj.updateDynamic("AttachmentsInformation")(AttachmentsInformation)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (DefaultVersion != null) __obj.updateDynamic("DefaultVersion")(DefaultVersion)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DocumentFormat != null) __obj.updateDynamic("DocumentFormat")(DocumentFormat.asInstanceOf[js.Any])
    if (DocumentType != null) __obj.updateDynamic("DocumentType")(DocumentType.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (Hash != null) __obj.updateDynamic("Hash")(Hash)
    if (HashType != null) __obj.updateDynamic("HashType")(HashType.asInstanceOf[js.Any])
    if (LatestVersion != null) __obj.updateDynamic("LatestVersion")(LatestVersion)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (PlatformTypes != null) __obj.updateDynamic("PlatformTypes")(PlatformTypes)
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion)
    if (Sha1 != null) __obj.updateDynamic("Sha1")(Sha1)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusInformation != null) __obj.updateDynamic("StatusInformation")(StatusInformation)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType)
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName)
    __obj.asInstanceOf[DocumentDescription]
  }
}

