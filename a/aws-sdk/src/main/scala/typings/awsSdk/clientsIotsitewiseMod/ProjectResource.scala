package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectResource extends StObject {
  
  /**
    * The ID of the project.
    */
  var id: ID
}
object ProjectResource {
  
  inline def apply(id: ID): ProjectResource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectResource] (val x: Self) extends AnyVal {
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
