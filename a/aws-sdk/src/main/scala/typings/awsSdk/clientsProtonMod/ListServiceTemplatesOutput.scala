package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceTemplatesOutput extends StObject {
  
  /**
    * A token that indicates the location of the next service template in the array of service templates, after the current requested list of service templates.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of service templates with detail data.
    */
  var templates: ServiceTemplateSummaryList
}
object ListServiceTemplatesOutput {
  
  inline def apply(templates: ServiceTemplateSummaryList): ListServiceTemplatesOutput = {
    val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceTemplatesOutput]
  }
  
  extension [Self <: ListServiceTemplatesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplates(value: ServiceTemplateSummaryList): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesVarargs(value: ServiceTemplateSummary*): Self = StObject.set(x, "templates", js.Array(value*))
  }
}
