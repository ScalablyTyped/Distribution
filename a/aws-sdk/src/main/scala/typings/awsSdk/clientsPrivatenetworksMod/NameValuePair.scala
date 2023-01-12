package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameValuePair extends StObject {
  
  /**
    * The name of the pair.
    */
  var name: String
  
  /**
    * The value of the pair.
    */
  var value: js.UndefOr[String] = js.undefined
}
object NameValuePair {
  
  inline def apply(name: String): NameValuePair = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameValuePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameValuePair] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
