package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the parameter group
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the parameter group
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter group family that this parameter group is compatible with.
    */
  var Family: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter group
    */
  var Name: js.UndefOr[String] = js.undefined
}
object ParameterGroup {
  
  inline def apply(): ParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterGroup] (val x: Self) extends AnyVal {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFamily(value: String): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
