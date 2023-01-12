package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkResourceDefinition extends StObject {
  
  /**
    * The count in the network resource definition.
    */
  var count: NetworkResourceDefinitionCountInteger
  
  /**
    * The options in the network resource definition.
    */
  var options: js.UndefOr[Options] = js.undefined
  
  /**
    * The type in the network resource definition.
    */
  var `type`: NetworkResourceDefinitionType
}
object NetworkResourceDefinition {
  
  inline def apply(count: NetworkResourceDefinitionCountInteger, `type`: NetworkResourceDefinitionType): NetworkResourceDefinition = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkResourceDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkResourceDefinition] (val x: Self) extends AnyVal {
    
    inline def setCount(value: NetworkResourceDefinitionCountInteger): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: NameValuePair*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setType(value: NetworkResourceDefinitionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
