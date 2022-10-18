package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotDefaultValueSpecification extends StObject {
  
  /**
    * A list of default values. Amazon Lex chooses the default value to use in the order that they are presented in the list.
    */
  var defaultValueList: SlotDefaultValueList
}
object SlotDefaultValueSpecification {
  
  inline def apply(defaultValueList: SlotDefaultValueList): SlotDefaultValueSpecification = {
    val __obj = js.Dynamic.literal(defaultValueList = defaultValueList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDefaultValueSpecification]
  }
  
  extension [Self <: SlotDefaultValueSpecification](x: Self) {
    
    inline def setDefaultValueList(value: SlotDefaultValueList): Self = StObject.set(x, "defaultValueList", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueListVarargs(value: SlotDefaultValue*): Self = StObject.set(x, "defaultValueList", js.Array(value*))
  }
}
