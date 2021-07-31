package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition extends StObject {
  
  /**
    *  The AWS Identity and Access Management (IAM) action definition details. 
    */
  var IamActionDefinition: js.UndefOr[typings.awsSdk.budgetsMod.IamActionDefinition] = js.undefined
  
  /**
    *  The service control policies (SCPs) action definition details. 
    */
  var ScpActionDefinition: js.UndefOr[typings.awsSdk.budgetsMod.ScpActionDefinition] = js.undefined
  
  /**
    *  The AWS Systems Manager (SSM) action definition details. 
    */
  var SsmActionDefinition: js.UndefOr[typings.awsSdk.budgetsMod.SsmActionDefinition] = js.undefined
}
object Definition {
  
  @scala.inline
  def apply(): Definition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit class DefinitionMutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamActionDefinition(value: IamActionDefinition): Self = StObject.set(x, "IamActionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamActionDefinitionUndefined: Self = StObject.set(x, "IamActionDefinition", js.undefined)
    
    @scala.inline
    def setScpActionDefinition(value: ScpActionDefinition): Self = StObject.set(x, "ScpActionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScpActionDefinitionUndefined: Self = StObject.set(x, "ScpActionDefinition", js.undefined)
    
    @scala.inline
    def setSsmActionDefinition(value: SsmActionDefinition): Self = StObject.set(x, "SsmActionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmActionDefinitionUndefined: Self = StObject.set(x, "SsmActionDefinition", js.undefined)
  }
}
