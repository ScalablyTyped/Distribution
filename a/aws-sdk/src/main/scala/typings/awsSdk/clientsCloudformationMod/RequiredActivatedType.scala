package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredActivatedType extends StObject {
  
  /**
    * The type name of the public extension. If you specified a TypeNameAlias when enabling the extension in this account and region, CloudFormation treats that alias as the extension's type name within the account and region, not the type name of the public extension. For more information, see Specifying aliases to refer to extensions in the CloudFormation User Guide.
    */
  var OriginalTypeName: js.UndefOr[TypeName] = js.undefined
  
  /**
    * The publisher ID of the extension publisher.
    */
  var PublisherId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.PublisherId] = js.undefined
  
  /**
    * A list of the major versions of the extension type that the macro supports.
    */
  var SupportedMajorVersions: js.UndefOr[typings.awsSdk.clientsCloudformationMod.SupportedMajorVersions] = js.undefined
  
  /**
    * An alias assigned to the public extension, in this account and region. If you specify an alias for the extension, CloudFormation treats the alias as the extension type name within this account and region. You must use the alias to refer to the extension in your templates, API calls, and CloudFormation console.
    */
  var TypeNameAlias: js.UndefOr[TypeName] = js.undefined
}
object RequiredActivatedType {
  
  inline def apply(): RequiredActivatedType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredActivatedType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredActivatedType] (val x: Self) extends AnyVal {
    
    inline def setOriginalTypeName(value: TypeName): Self = StObject.set(x, "OriginalTypeName", value.asInstanceOf[js.Any])
    
    inline def setOriginalTypeNameUndefined: Self = StObject.set(x, "OriginalTypeName", js.undefined)
    
    inline def setPublisherId(value: PublisherId): Self = StObject.set(x, "PublisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdUndefined: Self = StObject.set(x, "PublisherId", js.undefined)
    
    inline def setSupportedMajorVersions(value: SupportedMajorVersions): Self = StObject.set(x, "SupportedMajorVersions", value.asInstanceOf[js.Any])
    
    inline def setSupportedMajorVersionsUndefined: Self = StObject.set(x, "SupportedMajorVersions", js.undefined)
    
    inline def setSupportedMajorVersionsVarargs(value: SupportedMajorVersion*): Self = StObject.set(x, "SupportedMajorVersions", js.Array(value*))
    
    inline def setTypeNameAlias(value: TypeName): Self = StObject.set(x, "TypeNameAlias", value.asInstanceOf[js.Any])
    
    inline def setTypeNameAliasUndefined: Self = StObject.set(x, "TypeNameAlias", js.undefined)
  }
}
