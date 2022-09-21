package typings.antvAttr

import typings.antvAttr.baseMod.AttributeConstructor
import typings.antvAttr.baseMod.default
import typings.antvAttr.interfaceMod.AttributeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/attr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/attr", "Attribute")
  @js.native
  open class Attribute protected () extends default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr", "Color")
  @js.native
  open class Color protected ()
    extends typings.antvAttr.colorMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr", "Opacity")
  @js.native
  open class Opacity protected ()
    extends typings.antvAttr.opacityMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr", "Position")
  @js.native
  open class Position protected ()
    extends typings.antvAttr.positionMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr", "Shape")
  @js.native
  open class Shape protected ()
    extends typings.antvAttr.shapeMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr", "Size")
  @js.native
  open class Size protected ()
    extends typings.antvAttr.sizeMod.default {
    def this(cfg: AttributeCfg) = this()
  }
  
  /**
    * 通过类型获得 Attribute 类
    * @param type
    */
  inline def getAttribute(`type`: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def registerAttribute(`type`: String, ctor: AttributeConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAttribute")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
