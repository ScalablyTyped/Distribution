package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeVersionSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the extension version.
    */
  var Arn: js.UndefOr[TypeArn] = js.undefined
  
  /**
    * The description of the extension version.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Description] = js.undefined
  
  /**
    * Whether the specified extension version is set as the default version. This applies only to private extensions you have registered in your account, and extensions published by Amazon. For public third-party extensions, CloudFormation returns null.
    */
  var IsDefaultVersion: js.UndefOr[typings.awsSdk.clientsCloudformationMod.IsDefaultVersion] = js.undefined
  
  /**
    * For public extensions that have been activated for this account and region, the version of the public extension to be used for CloudFormation operations in this account and region. For any extensions other than activated third-arty extensions, CloudFormation returns null. How you specified AutoUpdate when enabling the extension affects whether CloudFormation automatically updates the extension in this account and region when a new version is released. For more information, see Setting CloudFormation to automatically use new versions of extensions in the CloudFormation User Guide.
    */
  var PublicVersionNumber: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PublicVersionNumber] = js.undefined
  
  /**
    * When the version was registered.
    */
  var TimeCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The kind of extension.
    */
  var Type: js.UndefOr[RegistryType] = js.undefined
  
  /**
    * The name of the extension.
    */
  var TypeName: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TypeName] = js.undefined
  
  /**
    * The ID of a specific version of the extension. The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the extension version when it's registered.
    */
  var VersionId: js.UndefOr[TypeVersionId] = js.undefined
}
object TypeVersionSummary {
  
  inline def apply(): TypeVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeVersionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeVersionSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TypeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsDefaultVersion(value: IsDefaultVersion): Self = StObject.set(x, "IsDefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultVersionUndefined: Self = StObject.set(x, "IsDefaultVersion", js.undefined)
    
    inline def setPublicVersionNumber(value: PublicVersionNumber): Self = StObject.set(x, "PublicVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setPublicVersionNumberUndefined: Self = StObject.set(x, "PublicVersionNumber", js.undefined)
    
    inline def setTimeCreated(value: js.Date): Self = StObject.set(x, "TimeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeCreatedUndefined: Self = StObject.set(x, "TimeCreated", js.undefined)
    
    inline def setType(value: RegistryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: TypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setVersionId(value: TypeVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
