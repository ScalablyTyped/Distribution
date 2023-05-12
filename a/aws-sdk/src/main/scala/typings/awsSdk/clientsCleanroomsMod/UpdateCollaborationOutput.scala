package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCollaborationOutput extends StObject {
  
  /**
    * The entire collaboration that has been updated.
    */
  var collaboration: Collaboration
}
object UpdateCollaborationOutput {
  
  inline def apply(collaboration: Collaboration): UpdateCollaborationOutput = {
    val __obj = js.Dynamic.literal(collaboration = collaboration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCollaborationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCollaborationOutput] (val x: Self) extends AnyVal {
    
    inline def setCollaboration(value: Collaboration): Self = StObject.set(x, "collaboration", value.asInstanceOf[js.Any])
  }
}
