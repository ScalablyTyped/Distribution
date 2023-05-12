package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCollaborationOutput extends StObject {
  
  /**
    * The entire collaboration for this identifier.
    */
  var collaboration: Collaboration
}
object GetCollaborationOutput {
  
  inline def apply(collaboration: Collaboration): GetCollaborationOutput = {
    val __obj = js.Dynamic.literal(collaboration = collaboration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCollaborationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCollaborationOutput] (val x: Self) extends AnyVal {
    
    inline def setCollaboration(value: Collaboration): Self = StObject.set(x, "collaboration", value.asInstanceOf[js.Any])
  }
}
