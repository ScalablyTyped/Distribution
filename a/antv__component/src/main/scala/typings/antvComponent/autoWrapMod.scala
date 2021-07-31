package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoWrapMod {
  
  @JSImport("@antv/component/lib/axis/overlap/auto-wrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def wrapLabels(labelGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapLabels")(labelGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
