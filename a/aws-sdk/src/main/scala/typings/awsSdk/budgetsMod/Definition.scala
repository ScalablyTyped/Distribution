package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Definition extends js.Object {
  
  /**
    *  The AWS Identity and Access Management (IAM) action definition details. 
    */
  var IamActionDefinition: js.UndefOr[typings.awsSdk.budgetsMod.IamActionDefinition] = js.native
  
  /**
    *  The service control policies (SCPs) action definition details. 
    */
  var ScpActionDefinition: js.UndefOr[typings.awsSdk.budgetsMod.ScpActionDefinition] = js.native
  
  /**
    *  The AWS Systems Manager (SSM) action definition details. 
    */
  var SsmActionDefinition: js.UndefOr[typings.awsSdk.budgetsMod.SsmActionDefinition] = js.native
}
object Definition {
  
  @scala.inline
  def apply(): Definition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit class DefinitionOps[Self <: Definition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIamActionDefinition(value: IamActionDefinition): Self = this.set("IamActionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamActionDefinition: Self = this.set("IamActionDefinition", js.undefined)
    
    @scala.inline
    def setScpActionDefinition(value: ScpActionDefinition): Self = this.set("ScpActionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScpActionDefinition: Self = this.set("ScpActionDefinition", js.undefined)
    
    @scala.inline
    def setSsmActionDefinition(value: SsmActionDefinition): Self = this.set("SsmActionDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsmActionDefinition: Self = this.set("SsmActionDefinition", js.undefined)
  }
}
