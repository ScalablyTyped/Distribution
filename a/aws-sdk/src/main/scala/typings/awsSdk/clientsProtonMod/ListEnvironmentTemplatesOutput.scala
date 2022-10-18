package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentTemplatesOutput extends StObject {
  
  /**
    * A token that indicates the location of the next environment template in the array of environment templates, after the current requested list of environment templates.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of environment templates with detail data.
    */
  var templates: EnvironmentTemplateSummaryList
}
object ListEnvironmentTemplatesOutput {
  
  inline def apply(templates: EnvironmentTemplateSummaryList): ListEnvironmentTemplatesOutput = {
    val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEnvironmentTemplatesOutput]
  }
  
  extension [Self <: ListEnvironmentTemplatesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplates(value: EnvironmentTemplateSummaryList): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesVarargs(value: EnvironmentTemplateSummary*): Self = StObject.set(x, "templates", js.Array(value*))
  }
}
