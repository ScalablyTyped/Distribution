package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceTemplateVersionsInput extends StObject {
  
  /**
    * To view a list of minor of versions under a major version of a service template, include major Version. To view a list of major versions of a service template, exclude major Version.
    */
  var majorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
  
  /**
    * The maximum number of major or minor versions of a service template to list.
    */
  var maxResults: js.UndefOr[MaxPageResults] = js.undefined
  
  /**
    * A token that indicates the location of the next major or minor version in the array of major or minor versions of a service template, after the list of major or minor versions that was previously requested.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of the service template.
    */
  var templateName: ResourceName
}
object ListServiceTemplateVersionsInput {
  
  inline def apply(templateName: ResourceName): ListServiceTemplateVersionsInput = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceTemplateVersionsInput]
  }
  
  extension [Self <: ListServiceTemplateVersionsInput](x: Self) {
    
    inline def setMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "majorVersion", value.asInstanceOf[js.Any])
    
    inline def setMajorVersionUndefined: Self = StObject.set(x, "majorVersion", js.undefined)
    
    inline def setMaxResults(value: MaxPageResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
