package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetContainerRepository extends StObject {
  
  /**
    * The name of the container repository where the output container image is stored. This name is prefixed by the repository location.
    */
  var repositoryName: NonEmptyString
  
  /**
    * Specifies the service in which this image was registered.
    */
  var service: ContainerRepositoryService
}
object TargetContainerRepository {
  
  inline def apply(repositoryName: NonEmptyString, service: ContainerRepositoryService): TargetContainerRepository = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetContainerRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetContainerRepository] (val x: Self) extends AnyVal {
    
    inline def setRepositoryName(value: NonEmptyString): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setService(value: ContainerRepositoryService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
