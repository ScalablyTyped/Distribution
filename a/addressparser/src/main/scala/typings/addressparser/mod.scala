package typings.addressparser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parses structured e-mail addresses from an address field
    *
    * Example:
    *
    *    'Name <address@domain>'
    *
    * will be converted to
    *
    *     [{name: 'Name', address: 'address@domain'}]
    *
    * @param str Address field
    */
  inline def apply(str: String): js.Array[EmailAddress] = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[EmailAddress]]
  
  @JSImport("addressparser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Address details.
    */
  trait EmailAddress extends StObject {
    
    /**
      * The email address.
      */
    var address: String
    
    /**
      * An array of grouped addresses.
      */
    var group: js.UndefOr[js.Array[EmailAddress]] = js.undefined
    
    /**
      * The name part of the email/group.
      */
    var name: String
  }
  object EmailAddress {
    
    inline def apply(address: String, name: String): EmailAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailAddress]
    }
    
    extension [Self <: EmailAddress](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: js.Array[EmailAddress]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setGroupVarargs(value: EmailAddress*): Self = StObject.set(x, "group", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
