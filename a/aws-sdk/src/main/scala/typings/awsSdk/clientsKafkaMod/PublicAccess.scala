package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicAccess extends StObject {
  
  /**
    * 
    The value DISABLED indicates that public access is turned off. SERVICE_PROVIDED_EIPS indicates that public access is turned on.
    
    */
  var Type: js.UndefOr[string] = js.undefined
}
object PublicAccess {
  
  inline def apply(): PublicAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicAccess] (val x: Self) extends AnyVal {
    
    inline def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
