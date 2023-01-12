package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyUsage extends StObject {
  
  /**
    * A string value that contains a Key Usage extension name.
    */
  var Name: js.UndefOr[KeyUsageName] = js.undefined
}
object KeyUsage {
  
  inline def apply(): KeyUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyUsage] (val x: Self) extends AnyVal {
    
    inline def setName(value: KeyUsageName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
