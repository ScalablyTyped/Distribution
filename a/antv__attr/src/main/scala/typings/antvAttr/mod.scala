package typings.antvAttr

import typings.antvAttr.baseMod.AttributeConstructor
import typings.antvAttr.baseMod.default
import typings.antvAttr.interfaceMod.AttributeCfg
import typings.antvScale.typesMod.ScaleConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/attr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * 通过类型获得 Attribute 类
    * @param type
    */
  def getAttribute(`type`: String): js.Any = js.native
  
  def registerAttribute(`type`: String, ctor: AttributeConstructor): Unit = js.native
  
  @js.native
  class Attribute protected () extends default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  class Color protected ()
    extends typings.antvAttr.colorMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  class Opacity protected ()
    extends typings.antvAttr.opacityMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  class Position protected ()
    extends typings.antvAttr.positionMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  abstract class Scale protected ()
    extends typings.antvAttr.interfaceMod.Scale {
    def this(cfg: ScaleConfig) = this()
  }
  
  @js.native
  class Shape protected ()
    extends typings.antvAttr.shapeMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @js.native
  class Size protected ()
    extends typings.antvAttr.sizeMod.default {
    def this(cfg: AttributeCfg) = this()
  }
}
