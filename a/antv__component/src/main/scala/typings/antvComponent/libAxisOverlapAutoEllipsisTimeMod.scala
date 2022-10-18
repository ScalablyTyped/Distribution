package typings.antvComponent

import typings.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAxisOverlapAutoEllipsisTimeMod {
  
  @JSImport("@antv/component/lib/axis/overlap/auto-ellipsis-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ellipsisTime(labelGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsisTime")(labelGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
