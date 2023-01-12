package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateOutput extends StObject {
  
  /**
    * The stage of the template that you can retrieve. For stacks, the Original and Processed templates are always available. For change sets, the Original template is always available. After CloudFormation finishes creating the change set, the Processed template becomes available.
    */
  var StagesAvailable: js.UndefOr[StageList] = js.undefined
  
  /**
    * Structure containing the template body. (For more information, go to Template Anatomy in the CloudFormation User Guide.) CloudFormation returns the same template that was used when the stack was created.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TemplateBody] = js.undefined
}
object GetTemplateOutput {
  
  inline def apply(): GetTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplateOutput] (val x: Self) extends AnyVal {
    
    inline def setStagesAvailable(value: StageList): Self = StObject.set(x, "StagesAvailable", value.asInstanceOf[js.Any])
    
    inline def setStagesAvailableUndefined: Self = StObject.set(x, "StagesAvailable", js.undefined)
    
    inline def setStagesAvailableVarargs(value: TemplateStage*): Self = StObject.set(x, "StagesAvailable", js.Array(value*))
    
    inline def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "TemplateBody", value.asInstanceOf[js.Any])
    
    inline def setTemplateBodyUndefined: Self = StObject.set(x, "TemplateBody", js.undefined)
  }
}
