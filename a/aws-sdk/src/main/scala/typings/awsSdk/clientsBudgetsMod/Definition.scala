package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition extends StObject {
  
  /**
    * The Identity and Access Management (IAM) action definition details. 
    */
  var IamActionDefinition: js.UndefOr[typings.awsSdk.clientsBudgetsMod.IamActionDefinition] = js.undefined
  
  /**
    * The service control policies (SCPs) action definition details. 
    */
  var ScpActionDefinition: js.UndefOr[typings.awsSdk.clientsBudgetsMod.ScpActionDefinition] = js.undefined
  
  /**
    * The Amazon Web Services Systems Manager (SSM) action definition details. 
    */
  var SsmActionDefinition: js.UndefOr[typings.awsSdk.clientsBudgetsMod.SsmActionDefinition] = js.undefined
}
object Definition {
  
  inline def apply(): Definition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
    
    inline def setIamActionDefinition(value: IamActionDefinition): Self = StObject.set(x, "IamActionDefinition", value.asInstanceOf[js.Any])
    
    inline def setIamActionDefinitionUndefined: Self = StObject.set(x, "IamActionDefinition", js.undefined)
    
    inline def setScpActionDefinition(value: ScpActionDefinition): Self = StObject.set(x, "ScpActionDefinition", value.asInstanceOf[js.Any])
    
    inline def setScpActionDefinitionUndefined: Self = StObject.set(x, "ScpActionDefinition", js.undefined)
    
    inline def setSsmActionDefinition(value: SsmActionDefinition): Self = StObject.set(x, "SsmActionDefinition", value.asInstanceOf[js.Any])
    
    inline def setSsmActionDefinitionUndefined: Self = StObject.set(x, "SsmActionDefinition", js.undefined)
  }
}
