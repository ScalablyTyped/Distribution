package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectAlternativeNames extends StObject {
  
  /**
    * An object that represents the criteria for determining a SANs match.
    */
  var `match`: SubjectAlternativeNameMatchers
}
object SubjectAlternativeNames {
  
  inline def apply(`match`: SubjectAlternativeNameMatchers): SubjectAlternativeNames = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAlternativeNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubjectAlternativeNames] (val x: Self) extends AnyVal {
    
    inline def setMatch(value: SubjectAlternativeNameMatchers): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
  }
}
