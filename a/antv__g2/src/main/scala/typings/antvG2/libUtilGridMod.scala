package typings.antvG2

import typings.antvG2.antvG2Strings.common
import typings.antvG2.libConstantMod.DIRECTION
import typings.antvG2.libDependentsMod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilGridMod {
  
  @JSImport("@antv/g2/lib/util/grid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCircleGridItems(
    coordinate: Coordinate,
    xScale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any,
    yScale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any,
    alignTick: Boolean,
    dim: String
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCircleGridItems")(coordinate.asInstanceOf[js.Any], xScale.asInstanceOf[js.Any], yScale.asInstanceOf[js.Any], alignTick.asInstanceOf[js.Any], dim.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getGridThemeCfg(theme: js.Object, direction: DIRECTION): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getGridThemeCfg")(theme.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def getGridThemeCfg_common(theme: js.Object, direction: common): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getGridThemeCfg")(theme.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def getLineGridItems(
    coordinate: Coordinate,
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any,
    dim: String
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineGridItems")(coordinate.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], dim.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def getLineGridItems(
    coordinate: Coordinate,
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any,
    dim: String,
    alignTick: Boolean
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineGridItems")(coordinate.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], dim.asInstanceOf[js.Any], alignTick.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def showGrid(axisTheme: Any, axisOption: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("showGrid")(axisTheme.asInstanceOf[js.Any], axisOption.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
