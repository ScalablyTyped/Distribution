package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskTemplateFieldIdentifier extends StObject {
  
  /**
    * The name of the task template field.
    */
  var Name: js.UndefOr[TaskTemplateFieldName] = js.undefined
}
object TaskTemplateFieldIdentifier {
  
  inline def apply(): TaskTemplateFieldIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskTemplateFieldIdentifier]
  }
  
  extension [Self <: TaskTemplateFieldIdentifier](x: Self) {
    
    inline def setName(value: TaskTemplateFieldName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
