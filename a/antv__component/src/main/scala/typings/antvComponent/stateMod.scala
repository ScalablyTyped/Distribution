package typings.antvComponent

import typings.antvComponent.typesMod.ListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  @JSImport("@antv/component/lib/util/state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStatesStyle(item: ListItem, elementName: String, stateStyles: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatesStyle")(item.asInstanceOf[js.Any], elementName.asInstanceOf[js.Any], stateStyles.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
