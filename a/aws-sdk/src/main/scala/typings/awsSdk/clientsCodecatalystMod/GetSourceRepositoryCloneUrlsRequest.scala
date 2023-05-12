package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSourceRepositoryCloneUrlsRequest extends StObject {
  
  /**
    * The name of the project in the space.
    */
  var projectName: NameString
  
  /**
    * The name of the source repository.
    */
  var sourceRepositoryName: SourceRepositoryNameString
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object GetSourceRepositoryCloneUrlsRequest {
  
  inline def apply(projectName: NameString, sourceRepositoryName: SourceRepositoryNameString, spaceName: NameString): GetSourceRepositoryCloneUrlsRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any], sourceRepositoryName = sourceRepositoryName.asInstanceOf[js.Any], spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSourceRepositoryCloneUrlsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSourceRepositoryCloneUrlsRequest] (val x: Self) extends AnyVal {
    
    inline def setProjectName(value: NameString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setSourceRepositoryName(value: SourceRepositoryNameString): Self = StObject.set(x, "sourceRepositoryName", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
