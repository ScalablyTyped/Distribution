package typings.antvG2

import typings.antvG2.grammarInteractionMod.InteractionSteps
import typings.antvG2.interactionInteractionMod.InteractionConstructor
import typings.antvG2.interactionInteractionMod.default
import typings.antvG2.libInterfaceMod.LooseObject
import typings.antvG2.registerMod.ActionConstructor
import typings.antvG2.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionMod {
  
  @JSImport("@antv/g2/lib/interaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2/lib/interaction", "Interaction")
  @js.native
  open class Interaction protected () extends default {
    def this(view: View, cfg: LooseObject) = this()
  }
  
  inline def createInteraction(name: String, view: View): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createInteraction")(name.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createInteraction(name: String, view: View, cfg: LooseObject): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createInteraction")(name.asInstanceOf[js.Any], view.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def getActionClass(actionName: String): ActionConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionClass")(actionName.asInstanceOf[js.Any]).asInstanceOf[ActionConstructor]
  
  inline def getInteraction(name: String): InteractionSteps | InteractionConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteraction")(name.asInstanceOf[js.Any]).asInstanceOf[InteractionSteps | InteractionConstructor]
  
  inline def registerAction(actionName: String, ActionClass: ActionConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerAction(actionName: String, ActionClass: ActionConstructor, cfg: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerInteraction(name: String, interaction: InteractionSteps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInteraction")(name.asInstanceOf[js.Any], interaction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerInteraction(name: String, interaction: InteractionConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInteraction")(name.asInstanceOf[js.Any], interaction.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
