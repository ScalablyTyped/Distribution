package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderUiTemplateRequest extends StObject {
  
  /**
    * The HumanTaskUiArn of the worker UI that you want to render. Do not provide a HumanTaskUiArn if you use the UiTemplate parameter. See a list of available Human Ui Amazon Resource Names (ARNs) in UiConfig.
    */
  var HumanTaskUiArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HumanTaskUiArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that has access to the S3 objects that are used by the template.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * A RenderableTask object containing a representative task to render.
    */
  var Task: RenderableTask
  
  /**
    * A Template object containing the worker UI template to render.
    */
  var UiTemplate: js.UndefOr[typings.awsSdk.clientsSagemakerMod.UiTemplate] = js.undefined
}
object RenderUiTemplateRequest {
  
  inline def apply(RoleArn: RoleArn, Task: RenderableTask): RenderUiTemplateRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], Task = Task.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderUiTemplateRequest]
  }
  
  extension [Self <: RenderUiTemplateRequest](x: Self) {
    
    inline def setHumanTaskUiArn(value: HumanTaskUiArn): Self = StObject.set(x, "HumanTaskUiArn", value.asInstanceOf[js.Any])
    
    inline def setHumanTaskUiArnUndefined: Self = StObject.set(x, "HumanTaskUiArn", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTask(value: RenderableTask): Self = StObject.set(x, "Task", value.asInstanceOf[js.Any])
    
    inline def setUiTemplate(value: UiTemplate): Self = StObject.set(x, "UiTemplate", value.asInstanceOf[js.Any])
    
    inline def setUiTemplateUndefined: Self = StObject.set(x, "UiTemplate", js.undefined)
  }
}
