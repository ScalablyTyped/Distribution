package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportComponentRequest extends StObject {
  
  /**
    * The change description of the component. Describes what change has been made in this version, or what makes this version different from other versions of this component.
    */
  var changeDescription: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The idempotency token of the component.
    */
  var clientToken: ClientToken
  
  /**
    * The data of the component. Used to specify the data inline. Either data or uri can be used to specify the data within the component.
    */
  var data: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The description of the component. Describes the contents of the component.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The format of the resource that you want to import as a component.
    */
  var format: ComponentFormat
  
  /**
    * The ID of the KMS key that should be used to encrypt this component.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The name of the component.
    */
  var name: ResourceName
  
  /**
    * The platform of the component.
    */
  var platform: Platform
  
  /**
    * The semantic version of the component. This version follows the semantic version syntax.  The semantic version has four nodes: &lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;/&lt;build&gt;. You can assign values for the first three, and can filter on all of them.  Filtering: With semantic versioning, you have the flexibility to use wildcards (x) to specify the most recent versions or nodes when selecting the base image or components for your recipe. When you use a wildcard in any node, all nodes to the right of the first wildcard must also be wildcards. 
    */
  var semanticVersion: VersionNumber
  
  /**
    * The tags of the component.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of the component denotes whether the component is used to build the image, or only to test it.
    */
  var `type`: ComponentType
  
  /**
    * The uri of the component. Must be an Amazon S3 URL and the requester must have permission to access the Amazon S3 bucket. If you use Amazon S3, you can specify component content up to your service quota. Either data or uri can be used to specify the data within the component.
    */
  var uri: js.UndefOr[Uri] = js.undefined
}
object ImportComponentRequest {
  
  inline def apply(
    clientToken: ClientToken,
    format: ComponentFormat,
    name: ResourceName,
    platform: Platform,
    semanticVersion: VersionNumber,
    `type`: ComponentType
  ): ImportComponentRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], semanticVersion = semanticVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportComponentRequest]
  }
  
  extension [Self <: ImportComponentRequest](x: Self) {
    
    inline def setChangeDescription(value: NonEmptyString): Self = StObject.set(x, "changeDescription", value.asInstanceOf[js.Any])
    
    inline def setChangeDescriptionUndefined: Self = StObject.set(x, "changeDescription", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setData(value: NonEmptyString): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFormat(value: ComponentFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setSemanticVersion(value: VersionNumber): Self = StObject.set(x, "semanticVersion", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: ComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
