package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberAssociation extends js.Object {
  
  /**
    * The timestamp of the phone number association, in ISO 8601 format.
    */
  var AssociatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  
  /**
    * Defines the association with an Amazon Chime account ID, user ID, Amazon Chime Voice Connector ID, or Amazon Chime Voice Connector group ID.
    */
  var Name: js.UndefOr[PhoneNumberAssociationName] = js.native
  
  /**
    * Contains the ID for the entity specified in Name.
    */
  var Value: js.UndefOr[String] = js.native
}
object PhoneNumberAssociation {
  
  @scala.inline
  def apply(): PhoneNumberAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberAssociation]
  }
  
  @scala.inline
  implicit class PhoneNumberAssociationOps[Self <: PhoneNumberAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociatedTimestamp(value: Iso8601Timestamp): Self = this.set("AssociatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedTimestamp: Self = this.set("AssociatedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: PhoneNumberAssociationName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
