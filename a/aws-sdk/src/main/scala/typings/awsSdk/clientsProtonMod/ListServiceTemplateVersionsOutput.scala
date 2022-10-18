package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceTemplateVersionsOutput extends StObject {
  
  /**
    * A token that indicates the location of the next major or minor version in the array of major or minor versions of a service template, after the current requested list of service major or minor versions.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of major or minor versions of a service template with detail data.
    */
  var templateVersions: ServiceTemplateVersionSummaryList
}
object ListServiceTemplateVersionsOutput {
  
  inline def apply(templateVersions: ServiceTemplateVersionSummaryList): ListServiceTemplateVersionsOutput = {
    val __obj = js.Dynamic.literal(templateVersions = templateVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceTemplateVersionsOutput]
  }
  
  extension [Self <: ListServiceTemplateVersionsOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplateVersions(value: ServiceTemplateVersionSummaryList): Self = StObject.set(x, "templateVersions", value.asInstanceOf[js.Any])
    
    inline def setTemplateVersionsVarargs(value: ServiceTemplateVersionSummary*): Self = StObject.set(x, "templateVersions", js.Array(value*))
  }
}
