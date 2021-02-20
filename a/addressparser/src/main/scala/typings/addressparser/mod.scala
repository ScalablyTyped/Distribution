package typings.addressparser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("addressparser", JSImport.Namespace)
  @js.native
  def apply(str: String): js.Array[EmailAddress] = js.native
  
  /**
    * Address details.
    */
  @js.native
  trait EmailAddress extends StObject {
    
    /**
      * The email address.
      */
    var address: String = js.native
    
    /**
      * An array of grouped addresses.
      */
    var group: js.UndefOr[js.Array[EmailAddress]] = js.native
    
    /**
      * The name part of the email/group.
      */
    var name: String = js.native
  }
  object EmailAddress {
    
    @scala.inline
    def apply(address: String, name: String): EmailAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailAddress]
    }
    
    @scala.inline
    implicit class EmailAddressMutableBuilder[Self <: EmailAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: js.Array[EmailAddress]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setGroupVarargs(value: EmailAddress*): Self = StObject.set(x, "group", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
