package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateInput extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of a change set for which CloudFormation returns the associated template. If you specify a name, you must also specify the StackName.
    */
  var ChangeSetName: js.UndefOr[ChangeSetNameOrId] = js.undefined
  
  /**
    * The name or the unique stack ID that's associated with the stack, which aren't always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackName] = js.undefined
  
  /**
    * For templates that include transforms, the stage of the template that CloudFormation returns. To get the user-submitted template, specify Original. To get the template after CloudFormation has processed all transforms, specify Processed. If the template doesn't include transforms, Original and Processed return the same template. By default, CloudFormation specifies Processed.
    */
  var TemplateStage: js.UndefOr[typings.awsSdk.clientsCloudformationMod.TemplateStage] = js.undefined
}
object GetTemplateInput {
  
  inline def apply(): GetTemplateInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetTemplateInput] (val x: Self) extends AnyVal {
    
    inline def setChangeSetName(value: ChangeSetNameOrId): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    inline def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
    
    inline def setTemplateStage(value: TemplateStage): Self = StObject.set(x, "TemplateStage", value.asInstanceOf[js.Any])
    
    inline def setTemplateStageUndefined: Self = StObject.set(x, "TemplateStage", js.undefined)
  }
}
