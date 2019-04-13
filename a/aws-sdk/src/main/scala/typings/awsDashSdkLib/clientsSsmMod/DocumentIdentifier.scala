package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentIdentifier extends js.Object {
  /**
    * The document format, either JSON or YAML.
    */
  var DocumentFormat: js.UndefOr[DocumentFormat] = js.undefined
  /**
    * The document type.
    */
  var DocumentType: js.UndefOr[DocumentType] = js.undefined
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  /**
    * The AWS user account that created the document.
    */
  var Owner: js.UndefOr[DocumentOwner] = js.undefined
  /**
    * The operating system platform. 
    */
  var PlatformTypes: js.UndefOr[PlatformTypeList] = js.undefined
  /**
    * The schema version.
    */
  var SchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined
  /**
    * The tags, or metadata, that have been applied to the document.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The target type which defines the kinds of resources the document can run on. For example, /AWS::EC2::Instance. For a list of valid resource types, see AWS Resource Types Reference in the AWS CloudFormation User Guide. 
    */
  var TargetType: js.UndefOr[TargetType] = js.undefined
  /**
    * An optional field specifying the version of the artifact associated with the document. For example, "Release 12, Update 6". This value is unique across all versions of a document, and cannot be changed.
    */
  var VersionName: js.UndefOr[DocumentVersionName] = js.undefined
}

object DocumentIdentifier {
  @scala.inline
  def apply(
    DocumentFormat: DocumentFormat = null,
    DocumentType: DocumentType = null,
    DocumentVersion: DocumentVersion = null,
    Name: DocumentARN = null,
    Owner: DocumentOwner = null,
    PlatformTypes: PlatformTypeList = null,
    SchemaVersion: DocumentSchemaVersion = null,
    Tags: TagList = null,
    TargetType: TargetType = null,
    VersionName: DocumentVersionName = null
  ): DocumentIdentifier = {
    val __obj = js.Dynamic.literal()
    if (DocumentFormat != null) __obj.updateDynamic("DocumentFormat")(DocumentFormat.asInstanceOf[js.Any])
    if (DocumentType != null) __obj.updateDynamic("DocumentType")(DocumentType.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (PlatformTypes != null) __obj.updateDynamic("PlatformTypes")(PlatformTypes)
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType)
    if (VersionName != null) __obj.updateDynamic("VersionName")(VersionName)
    __obj.asInstanceOf[DocumentIdentifier]
  }
}

