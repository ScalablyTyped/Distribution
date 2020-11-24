package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct contains information describing a cross reference.
  *
  * Such references are kept by news servers for managing articles contained in multiple groups. An article can have a sequence of cross references.
  */
@js.native
trait CrossReference extends js.Object {
  
  /** The name of a news group. */
  var Group: String = js.native
  
  /** The unique identifier (relative to the server) of an article in the given group. */
  var Id: Double = js.native
}
object CrossReference {
  
  @scala.inline
  def apply(Group: String, Id: Double): CrossReference = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossReference]
  }
  
  @scala.inline
  implicit class CrossReferenceOps[Self <: CrossReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGroup(value: String): Self = this.set("Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
}
