package typings.aliApp.anon

import typings.aliApp.my.ContactsDic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactsDicArray extends StObject {
  
  var contactsDicArray: js.Array[ContactsDic]
}
object ContactsDicArray {
  
  inline def apply(contactsDicArray: js.Array[ContactsDic]): ContactsDicArray = {
    val __obj = js.Dynamic.literal(contactsDicArray = contactsDicArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsDicArray]
  }
  
  extension [Self <: ContactsDicArray](x: Self) {
    
    inline def setContactsDicArray(value: js.Array[ContactsDic]): Self = StObject.set(x, "contactsDicArray", value.asInstanceOf[js.Any])
    
    inline def setContactsDicArrayVarargs(value: ContactsDic*): Self = StObject.set(x, "contactsDicArray", js.Array(value :_*))
  }
}
