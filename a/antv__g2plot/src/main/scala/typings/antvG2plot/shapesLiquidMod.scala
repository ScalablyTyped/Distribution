package typings.antvG2plot

import typings.antvG2plot.animationMod.Animation
import typings.antvG2plot.attrMod.ShapeStyle
import typings.antvGBase.interfacesMod.IGroup
import typings.antvGBase.interfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapesLiquidMod {
  
  @JSImport("@antv/g2plot/lib/plots/liquid/shapes/liquid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addWaterWave(
    x: Double,
    y: Double,
    level: Double,
    waveCount: Double,
    waveAttrs: ShapeStyle,
    group: IGroup,
    clip: IShape,
    radius: Double,
    waveLength: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWaterWave")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], waveCount.asInstanceOf[js.Any], waveAttrs.asInstanceOf[js.Any], group.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], waveLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addWaterWave(
    x: Double,
    y: Double,
    level: Double,
    waveCount: Double,
    waveAttrs: ShapeStyle,
    group: IGroup,
    clip: IShape,
    radius: Double,
    waveLength: Double,
    animation: Animation
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWaterWave")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], waveCount.asInstanceOf[js.Any], waveAttrs.asInstanceOf[js.Any], group.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], waveLength.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
