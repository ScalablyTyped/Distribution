package typings.antvG2

import typings.antvG2.anon.WriteableLabelPointCfg
import typings.antvG2.labelInterfaceMod.LabelCfg
import typings.antvG2.libInterfaceMod.MappingDatum
import typings.antvG2.libInterfaceMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelIntervalMod {
  
  @JSImport("@antv/g2/lib/geometry/label/interval", JSImport.Default)
  @js.native
  open class default () extends IntervalLabel
  
  @js.native
  trait IntervalLabel
    extends typings.antvG2.labelBaseMod.default {
    
    /* protected */ def getLabelOffsetPoint(labelCfg: LabelCfg, index: Double, total: Double, position: String): Point = js.native
    
    /**
      * 获取 interval label 的方向，取决于 value 的值是正还是负
      * @param labelCfg
      */
    /* private */ var getLabelValueDir: Any = js.native
    
    /* protected */ def setLabelPosition(labelPointCfg: WriteableLabelPointCfg, mappingData: MappingDatum, index: Double, position: String): Unit = js.native
  }
}
