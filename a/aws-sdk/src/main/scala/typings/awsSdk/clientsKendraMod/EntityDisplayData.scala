package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityDisplayData extends StObject {
  
  /**
    * The first name of the user.
    */
  var FirstName: js.UndefOr[NameType] = js.undefined
  
  /**
    * The name of the group.
    */
  var GroupName: js.UndefOr[NameType] = js.undefined
  
  /**
    * The user name of the user.
    */
  var IdentifiedUserName: js.UndefOr[NameType] = js.undefined
  
  /**
    * The last name of the user.
    */
  var LastName: js.UndefOr[NameType] = js.undefined
  
  /**
    * The name of the user.
    */
  var UserName: js.UndefOr[NameType] = js.undefined
}
object EntityDisplayData {
  
  inline def apply(): EntityDisplayData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityDisplayData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityDisplayData] (val x: Self) extends AnyVal {
    
    inline def setFirstName(value: NameType): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    inline def setGroupName(value: NameType): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setIdentifiedUserName(value: NameType): Self = StObject.set(x, "IdentifiedUserName", value.asInstanceOf[js.Any])
    
    inline def setIdentifiedUserNameUndefined: Self = StObject.set(x, "IdentifiedUserName", js.undefined)
    
    inline def setLastName(value: NameType): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    inline def setUserName(value: NameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
