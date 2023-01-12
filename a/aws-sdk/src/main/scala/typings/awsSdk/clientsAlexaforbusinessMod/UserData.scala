package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserData extends StObject {
  
  /**
    * The email of a user.
    */
  var Email: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.Email] = js.undefined
  
  /**
    * The enrollment ARN of a user.
    */
  var EnrollmentId: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.EnrollmentId] = js.undefined
  
  /**
    * The enrollment status of a user.
    */
  var EnrollmentStatus: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.EnrollmentStatus] = js.undefined
  
  /**
    * The first name of a user.
    */
  var FirstName: js.UndefOr[userFirstName] = js.undefined
  
  /**
    * The last name of a user.
    */
  var LastName: js.UndefOr[userLastName] = js.undefined
  
  /**
    * The ARN of a user.
    */
  var UserArn: js.UndefOr[Arn] = js.undefined
}
object UserData {
  
  inline def apply(): UserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserData] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setEnrollmentId(value: EnrollmentId): Self = StObject.set(x, "EnrollmentId", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentIdUndefined: Self = StObject.set(x, "EnrollmentId", js.undefined)
    
    inline def setEnrollmentStatus(value: EnrollmentStatus): Self = StObject.set(x, "EnrollmentStatus", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentStatusUndefined: Self = StObject.set(x, "EnrollmentStatus", js.undefined)
    
    inline def setFirstName(value: userFirstName): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    inline def setLastName(value: userLastName): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    inline def setUserArn(value: Arn): Self = StObject.set(x, "UserArn", value.asInstanceOf[js.Any])
    
    inline def setUserArnUndefined: Self = StObject.set(x, "UserArn", js.undefined)
  }
}
