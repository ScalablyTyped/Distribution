package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct contains information describing a cross reference.
  *
  * Such references are kept by news servers for managing articles contained in multiple groups. An article can have a sequence of cross references.
  */
trait CrossReference extends StObject {
  
  /** The name of a news group. */
  var Group: String
  
  /** The unique identifier (relative to the server) of an article in the given group. */
  var Id: Double
}
object CrossReference {
  
  @scala.inline
  def apply(Group: String, Id: Double): CrossReference = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossReference]
  }
  
  @scala.inline
  implicit class CrossReferenceMutableBuilder[Self <: CrossReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
