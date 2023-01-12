package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomDBEngineVersionMessage extends StObject {
  
  /**
    * The name of an Amazon S3 bucket that contains database installation files for your CEV. For example, a valid bucket name is my-custom-installation-files.
    */
  var DatabaseInstallationFilesS3BucketName: BucketName
  
  /**
    * The Amazon S3 directory that contains the database installation files for your CEV. For example, a valid bucket name is 123456789012/cev1. If this setting isn't specified, no prefix is assumed.
    */
  var DatabaseInstallationFilesS3Prefix: js.UndefOr[String255] = js.undefined
  
  /**
    * An optional description of your CEV.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsRdsMod.Description] = js.undefined
  
  /**
    * The database engine to use for your custom engine version (CEV). The only supported value is custom-oracle-ee.
    */
  var Engine: CustomEngineName
  
  /**
    * The name of your CEV. The name format is 19.customized_string . For example, a valid name is 19.my_cev1. This setting is required for RDS Custom for Oracle, but optional for Amazon RDS. The combination of Engine and EngineVersion is unique per customer per Region.
    */
  var EngineVersion: CustomEngineVersion
  
  /**
    * The Amazon Web Services KMS key identifier for an encrypted CEV. A symmetric encryption KMS key is required for RDS Custom, but optional for Amazon RDS. If you have an existing symmetric encryption KMS key in your account, you can use it with RDS Custom. No further action is necessary. If you don't already have a symmetric encryption KMS key in your account, follow the instructions in  Creating a symmetric encryption KMS key in the Amazon Web Services Key Management Service Developer Guide. You can choose the same symmetric encryption key when you create a CEV and a DB instance, or choose different keys.
    */
  var KMSKeyId: KmsKeyIdOrArn
  
  /**
    * The CEV manifest, which is a JSON document that describes the installation .zip files stored in Amazon S3. Specify the name/value pairs in a file or a quoted string. RDS Custom applies the patches in the order in which they are listed. The following JSON fields are valid:  MediaImportTemplateVersion  Version of the CEV manifest. The date is in the format YYYY-MM-DD.  databaseInstallationFileNames  Ordered list of installation files for the CEV.  opatchFileNames  Ordered list of OPatch installers used for the Oracle DB engine.  psuRuPatchFileNames  The PSU and RU patches for this CEV.  OtherPatchFileNames  The patches that are not in the list of PSU and RU patches. Amazon RDS applies these patches after applying the PSU and RU patches.   For more information, see  Creating the CEV manifest in the Amazon RDS User Guide.
    */
  var Manifest: CustomDBEngineVersionManifest
  
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateCustomDBEngineVersionMessage {
  
  inline def apply(
    DatabaseInstallationFilesS3BucketName: BucketName,
    Engine: CustomEngineName,
    EngineVersion: CustomEngineVersion,
    KMSKeyId: KmsKeyIdOrArn,
    Manifest: CustomDBEngineVersionManifest
  ): CreateCustomDBEngineVersionMessage = {
    val __obj = js.Dynamic.literal(DatabaseInstallationFilesS3BucketName = DatabaseInstallationFilesS3BucketName.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], EngineVersion = EngineVersion.asInstanceOf[js.Any], KMSKeyId = KMSKeyId.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomDBEngineVersionMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomDBEngineVersionMessage] (val x: Self) extends AnyVal {
    
    inline def setDatabaseInstallationFilesS3BucketName(value: BucketName): Self = StObject.set(x, "DatabaseInstallationFilesS3BucketName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseInstallationFilesS3Prefix(value: String255): Self = StObject.set(x, "DatabaseInstallationFilesS3Prefix", value.asInstanceOf[js.Any])
    
    inline def setDatabaseInstallationFilesS3PrefixUndefined: Self = StObject.set(x, "DatabaseInstallationFilesS3Prefix", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngine(value: CustomEngineName): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: CustomEngineVersion): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyId(value: KmsKeyIdOrArn): Self = StObject.set(x, "KMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: CustomDBEngineVersionManifest): Self = StObject.set(x, "Manifest", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
