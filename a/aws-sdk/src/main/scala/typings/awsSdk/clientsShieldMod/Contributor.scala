package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contributor extends StObject {
  
  /**
    * The name of the contributor. The type of name that you'll find here depends on the AttackPropertyIdentifier setting in the AttackProperty where this contributor is defined. For example, if the AttackPropertyIdentifier is SOURCE_COUNTRY, the Name could be United States.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The contribution of this contributor expressed in Protection units. For example 10,000.
    */
  var Value: js.UndefOr[Long] = js.undefined
}
object Contributor {
  
  inline def apply(): Contributor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contributor]
  }
  
  extension [Self <: Contributor](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: Long): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
