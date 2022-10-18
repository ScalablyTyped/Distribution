package typings.awsSdk.clientsMigrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the template.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the template.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the template.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the template.
    */
  var name: js.UndefOr[String] = js.undefined
}
object TemplateSummary {
  
  inline def apply(): TemplateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSummary]
  }
  
  extension [Self <: TemplateSummary](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
