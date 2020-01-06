package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentDescription extends js.Object {
  /**
    * Details about the document attachments, including names, locations, sizes, etc.
    */
  var AttachmentsInformation: js.UndefOr[AttachmentInformationList] = js.native
  /**
    * The date when the document was created.
    */
  var CreatedDate: js.UndefOr[DateTime] = js.native
  /**
    * The default version.
    */
  var DefaultVersion: js.UndefOr[DocumentVersion] = js.native
  /**
    * A description of the document. 
    */
  var Description: js.UndefOr[DescriptionInDocument] = js.native
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentFormat] = js.native
  /**
    * The type of document.
    */
  var DocumentType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentType] = js.native
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.native
  /**
    * The Sha256 or Sha1 hash created by the system when the document was created.   Sha1 hashes have been deprecated. 
    */
  var Hash: js.UndefOr[DocumentHash] = js.native
  /**
    * The hash type of the document. Valid values include Sha256 or Sha1.  Sha1 hashes have been deprecated. 
    */
  var HashType: js.UndefOr[DocumentHashType] = js.native
  /**
    * The latest version of the document.
    */
  var LatestVersion: js.UndefOr[DocumentVersion] = js.native
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  /**
    * The AWS user account that created the document.
    */
  var Owner: js.UndefOr[DocumentOwner] = js.native
  /**
    * A description of the parameters for a document.
    */
  var Parameters: js.UndefOr[DocumentParameterList] = js.native
  /**
    * The list of OS platforms compatible with this Systems Manager document. 
    */
  var PlatformTypes: js.UndefOr[PlatformTypeList] = js.native
  /**
    * A list of SSM documents required by a document. For example, an ApplicationConfiguration document requires an ApplicationConfigurationSchema document.
    */
  var Requires: js.UndefOr[DocumentRequiresList] = js.native
  /**
    * The schema version.
    */
  var SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.native
  /**
    * The SHA1 hash of the document, which you can use for verification.
    */
  var Sha1: js.UndefOr[DocumentSha1] = js.native
  /**
    * The status of the Systems Manager document.
    */
  var Status: js.UndefOr[DocumentStatus] = js.native
  /**
    * A message returned by AWS Systems Manager that explains the Status value. For example, a Failed status might be explained by the StatusInformation message, "The specified S3 bucket does not exist. Verify that the URL of the S3 bucket is correct."
    */
  var StatusInformation: js.UndefOr[DocumentStatusInformation] = js.native
  /**
    * The tags, or metadata, that have been applied to the document.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[typings.awsDashSdk.clientsSsmMod.TargetType] = js.native
  /**
    * The version of the artifact associated with the document.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.native
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
    Requires: DocumentRequiresList = null,
    SchemaVersion: DocumentSchemaVersion = null,
    Sha1: DocumentSha1 = null,
    Status: DocumentStatus = null,
    StatusInformation: DocumentStatusInformation = null,
    Tags: TagList = null,
    TargetType: TargetType = null,
    VersionName: DocumentVersionName = null
  ): DocumentDescription = {
    val __obj = js.Dynamic.literal()
    if (AttachmentsInformation != null) __obj.updateDynamic("AttachmentsInformation")(AttachmentsInformation.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (DefaultVersion != null) __obj.updateDynamic("DefaultVersion")(DefaultVersion.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DocumentFormat != null) __obj.updateDynamic("DocumentFormat")(DocumentFormat.asInstanceOf[js.Any])
    if (DocumentType != null) __obj.updateDynamic("DocumentType")(DocumentType.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (Hash != null) __obj.updateDynamic("Hash")(Hash.asInstanceOf[js.Any])
    if (HashType != null) __obj.updateDynamic("HashType")(HashType.asInstanceOf[js.Any])
    if (LatestVersion != null) __obj.updateDynamic("LatestVersion")(LatestVersion.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (PlatformTypes != null) __obj.updateDynamic("PlatformTypes")(PlatformTypes.asInstanceOf[js.Any])
    if (Requires != null) __obj.updateDynamic("Requires")(Requires.asInstanceOf[js.Any])
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion.asInstanceOf[js.Any])
    if (Sha1 != null) __obj.updateDynamic("Sha1")(Sha1.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusInformation != null) __obj.updateDynamic("StatusInformation")(StatusInformation.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType.asInstanceOf[js.Any])
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentDescription]
  }
}

