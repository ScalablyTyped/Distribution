package typings.awsSdk.clientsSimpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCondition extends StObject {
  
  /**
    * A value specifying whether or not the specified attribute must exist with the specified value in order for the update condition to be satisfied. Specify true if the attribute must exist for the update condition to be satisfied. Specify false if the attribute should not exist in order for the update condition to be satisfied.
    */
  var Exists: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the attribute involved in the condition.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The value of an attribute. This value can only be specified when the Exists parameter is equal to true.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object UpdateCondition {
  
  inline def apply(): UpdateCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCondition] (val x: Self) extends AnyVal {
    
    inline def setExists(value: Boolean): Self = StObject.set(x, "Exists", value.asInstanceOf[js.Any])
    
    inline def setExistsUndefined: Self = StObject.set(x, "Exists", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
