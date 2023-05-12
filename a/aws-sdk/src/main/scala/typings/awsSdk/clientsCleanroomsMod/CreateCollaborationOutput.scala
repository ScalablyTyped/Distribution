package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCollaborationOutput extends StObject {
  
  /**
    * The entire created collaboration object.
    */
  var collaboration: Collaboration
}
object CreateCollaborationOutput {
  
  inline def apply(collaboration: Collaboration): CreateCollaborationOutput = {
    val __obj = js.Dynamic.literal(collaboration = collaboration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollaborationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCollaborationOutput] (val x: Self) extends AnyVal {
    
    inline def setCollaboration(value: Collaboration): Self = StObject.set(x, "collaboration", value.asInstanceOf[js.Any])
  }
}
