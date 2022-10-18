package typings.antvG2

import org.scalablytyped.runtime.Instantiable2
import typings.antvG2.libInteractionActionBaseMod.default
import typings.antvG2.libInterfaceMod.ActionCallback
import typings.antvG2.libInterfaceMod.IInteractionContext
import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionRegisterMod {
  
  @JSImport("@antv/g2/lib/interaction/action/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAction(actionName: String, context: IInteractionContext): default[LooseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionName.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[default[LooseObject]]
  
  inline def createCallbackAction(callback: ActionCallback, context: IInteractionContext): typings.antvG2.libInteractionActionCallbackMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("createCallbackAction")(callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.antvG2.libInteractionActionCallbackMod.default]
  
  inline def getActionClass(actionName: String): ActionConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionClass")(actionName.asInstanceOf[js.Any]).asInstanceOf[ActionConstructor]
  
  inline def registerAction(actionName: String, ActionClass: ActionConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerAction(actionName: String, ActionClass: ActionConstructor, cfg: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterAction(actionName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterAction")(actionName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Action 构造函数 */
  type ActionConstructor = Instantiable2[
    /* context */ IInteractionContext, 
    /* cfg */ js.UndefOr[LooseObject], 
    default[LooseObject]
  ]
}
