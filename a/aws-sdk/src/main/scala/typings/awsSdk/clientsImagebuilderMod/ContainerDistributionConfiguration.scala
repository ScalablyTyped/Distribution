package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerDistributionConfiguration extends StObject {
  
  /**
    * Tags that are attached to the container distribution configuration.
    */
  var containerTags: js.UndefOr[StringList] = js.undefined
  
  /**
    * The description of the container distribution configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The destination repository for the container distribution configuration.
    */
  var targetRepository: TargetContainerRepository
}
object ContainerDistributionConfiguration {
  
  inline def apply(targetRepository: TargetContainerRepository): ContainerDistributionConfiguration = {
    val __obj = js.Dynamic.literal(targetRepository = targetRepository.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDistributionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerDistributionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setContainerTags(value: StringList): Self = StObject.set(x, "containerTags", value.asInstanceOf[js.Any])
    
    inline def setContainerTagsUndefined: Self = StObject.set(x, "containerTags", js.undefined)
    
    inline def setContainerTagsVarargs(value: NonEmptyString*): Self = StObject.set(x, "containerTags", js.Array(value*))
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTargetRepository(value: TargetContainerRepository): Self = StObject.set(x, "targetRepository", value.asInstanceOf[js.Any])
  }
}
