package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterGroup extends StObject {
  
  /**
    * A description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
}
object ParameterGroup {
  
  inline def apply(): ParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterGroup]
  }
  
  extension [Self <: ParameterGroup](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
  }
}
