package typings.antvG2

import typings.antvG2.anon.Center
import typings.antvG2.anon.EndStart
import typings.antvG2.constantMod.DIRECTION
import typings.antvG2.dependentsMod.Coordinate
import typings.antvG2.libInterfaceMod.AxisCfg
import typings.antvG2.libInterfaceMod.AxisOption
import typings.antvG2.libInterfaceMod.Point
import typings.antvG2.libInterfaceMod.Region
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilAxisMod {
  
  @JSImport("@antv/g2/lib/util/axis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAxisDirection(axisOption: AxisOption, `def`: DIRECTION): DIRECTION = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisDirection")(axisOption.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[DIRECTION]
  
  inline def getAxisFactor(coordinate: Coordinate, direction: DIRECTION): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisFactor")(coordinate.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getAxisFactorByRegion(region: Region, center: Point): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisFactorByRegion")(region.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getAxisOption(axes: Boolean, field: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisOption")(axes.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getAxisOption(axes: Record[String, AxisOption], field: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisOption")(axes.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getAxisRegion(coordinate: Coordinate, direction: DIRECTION): Region = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisRegion")(coordinate.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Region]
  
  inline def getAxisThemeCfg(theme: js.Object, direction: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisThemeCfg")(theme.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def getAxisTitleOptions(theme: js.Object, direction: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisTitleOptions")(theme.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def getAxisTitleOptions(theme: js.Object, direction: String, axisOptions: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisTitleOptions")(theme.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], axisOptions.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def getAxisTitleText(
    scale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any,
    axisOption: AxisCfg
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisTitleText")(scale.asInstanceOf[js.Any], axisOption.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getCircleAxisCenterRadius(coordinate: Coordinate): Center = ^.asInstanceOf[js.Dynamic].applyDynamic("getCircleAxisCenterRadius")(coordinate.asInstanceOf[js.Any]).asInstanceOf[Center]
  
  inline def getCircleAxisRelativeRegion(coordinate: Coordinate): EndStart = ^.asInstanceOf[js.Dynamic].applyDynamic("getCircleAxisRelativeRegion")(coordinate.asInstanceOf[js.Any]).asInstanceOf[EndStart]
  
  inline def getLineAxisRelativeRegion(direction: DIRECTION): Region = ^.asInstanceOf[js.Dynamic].applyDynamic("getLineAxisRelativeRegion")(direction.asInstanceOf[js.Any]).asInstanceOf[Region]
  
  inline def isVertical(region: Region): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVertical")(region.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
