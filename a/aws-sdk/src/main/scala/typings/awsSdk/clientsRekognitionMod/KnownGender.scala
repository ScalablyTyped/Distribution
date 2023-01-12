package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownGender extends StObject {
  
  /**
    * A string value of the KnownGender info about the Celebrity.
    */
  var Type: js.UndefOr[KnownGenderType] = js.undefined
}
object KnownGender {
  
  inline def apply(): KnownGender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownGender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnownGender] (val x: Self) extends AnyVal {
    
    inline def setType(value: KnownGenderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
