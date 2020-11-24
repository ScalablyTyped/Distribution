package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserData extends js.Object {
  
  /**
    * The email of a user.
    */
  var Email: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Email] = js.native
  
  /**
    * The enrollment ARN of a user.
    */
  var EnrollmentId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.EnrollmentId] = js.native
  
  /**
    * The enrollment status of a user.
    */
  var EnrollmentStatus: js.UndefOr[typings.awsSdk.alexaforbusinessMod.EnrollmentStatus] = js.native
  
  /**
    * The first name of a user.
    */
  var FirstName: js.UndefOr[userFirstName] = js.native
  
  /**
    * The last name of a user.
    */
  var LastName: js.UndefOr[userLastName] = js.native
  
  /**
    * The ARN of a user.
    */
  var UserArn: js.UndefOr[Arn] = js.native
}
object UserData {
  
  @scala.inline
  def apply(): UserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserData]
  }
  
  @scala.inline
  implicit class UserDataOps[Self <: UserData] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: Email): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    
    @scala.inline
    def setEnrollmentId(value: EnrollmentId): Self = this.set("EnrollmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnrollmentId: Self = this.set("EnrollmentId", js.undefined)
    
    @scala.inline
    def setEnrollmentStatus(value: EnrollmentStatus): Self = this.set("EnrollmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnrollmentStatus: Self = this.set("EnrollmentStatus", js.undefined)
    
    @scala.inline
    def setFirstName(value: userFirstName): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("FirstName", js.undefined)
    
    @scala.inline
    def setLastName(value: userLastName): Self = this.set("LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("LastName", js.undefined)
    
    @scala.inline
    def setUserArn(value: Arn): Self = this.set("UserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserArn: Self = this.set("UserArn", js.undefined)
  }
}
