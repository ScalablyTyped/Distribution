package typings.antvG2

import typings.antvG2.actionBaseMod.default
import typings.antvG2.libInterfaceMod.IInteractionContext
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.registerMod.ActionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionMod {
  
  @JSImport("@antv/g2/lib/interaction/action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Action 的基类
    */
  @JSImport("@antv/g2/lib/interaction/action", "Action")
  @js.native
  abstract class Action[T] protected () extends default[T] {
    def this(context: IInteractionContext) = this()
    def this(context: IInteractionContext, cfg: T) = this()
  }
  
  inline def createAction(actionName: String, context: IInteractionContext): default[LooseObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(actionName.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[default[LooseObject]]
  
  inline def getActionClass(actionName: String): ActionConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionClass")(actionName.asInstanceOf[js.Any]).asInstanceOf[ActionConstructor]
  
  inline def registerAction(actionName: String, ActionClass: ActionConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerAction(actionName: String, ActionClass: ActionConstructor, cfg: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
