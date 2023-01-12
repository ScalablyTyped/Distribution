package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contacts extends StObject {
  
  /** 选中的支付宝联系人数组 */
  var contacts: js.Array[Avatar]
}
object Contacts {
  
  inline def apply(contacts: js.Array[Avatar]): Contacts = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contacts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contacts] (val x: Self) extends AnyVal {
    
    inline def setContacts(value: js.Array[Avatar]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsVarargs(value: Avatar*): Self = StObject.set(x, "contacts", js.Array(value*))
  }
}
