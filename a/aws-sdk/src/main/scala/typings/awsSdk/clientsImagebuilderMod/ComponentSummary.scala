package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * The change description for the current version of the component.
    */
  var changeDescription: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The original creation date of the component.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the component.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the component.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Indicates whether component source is hidden from view in the console, and from component detail results for API, CLI, or SDK operations.
    */
  var obfuscate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The owner of the component.
    */
  var owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The operating system platform of the component.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * Contains the name of the publisher if this is a third-party component. Otherwise, this property is empty.
    */
  var publisher: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Describes the current status of the component.
    */
  var state: js.UndefOr[ComponentState] = js.undefined
  
  /**
    * The operating system (OS) version that the component supports. If the OS information is available, Image Builder performs a prefix match against the base image OS version during image recipe creation.
    */
  var supportedOsVersions: js.UndefOr[OsVersionList] = js.undefined
  
  /**
    * The tags that apply to the component.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The component type specifies whether Image Builder uses the component to build the image or only to test it.
    */
  var `type`: js.UndefOr[ComponentType] = js.undefined
  
  /**
    * The version of the component.
    */
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object ComponentSummary {
  
  inline def apply(): ComponentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setChangeDescription(value: NonEmptyString): Self = StObject.set(x, "changeDescription", value.asInstanceOf[js.Any])
    
    inline def setChangeDescriptionUndefined: Self = StObject.set(x, "changeDescription", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObfuscate(value: Boolean): Self = StObject.set(x, "obfuscate", value.asInstanceOf[js.Any])
    
    inline def setObfuscateUndefined: Self = StObject.set(x, "obfuscate", js.undefined)
    
    inline def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setPublisher(value: NonEmptyString): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setState(value: ComponentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportedOsVersions(value: OsVersionList): Self = StObject.set(x, "supportedOsVersions", value.asInstanceOf[js.Any])
    
    inline def setSupportedOsVersionsUndefined: Self = StObject.set(x, "supportedOsVersions", js.undefined)
    
    inline def setSupportedOsVersionsVarargs(value: OsVersion*): Self = StObject.set(x, "supportedOsVersions", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: ComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
