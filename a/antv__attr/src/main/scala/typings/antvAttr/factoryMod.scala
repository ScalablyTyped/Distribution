package typings.antvAttr

import typings.antvAttr.baseMod.AttributeConstructor
import typings.antvAttr.baseMod.default
import typings.antvAttr.interfaceMod.AttributeCfg
import typings.antvScale.typesMod.ScaleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@antv/attr/lib/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/attr/lib/factory", "Attribute")
  @js.native
  class Attribute protected () extends default {
    def this(cfg: AttributeCfg) = this()
  }
  
  @JSImport("@antv/attr/lib/factory", "Scale")
  @js.native
  abstract class Scale protected ()
    extends typings.antvAttr.interfaceMod.Scale {
    def this(cfg: ScaleConfig) = this()
  }
  
  /**
    * 通过类型获得 Attribute 类
    * @param type
    */
  inline def getAttribute(`type`: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def registerAttribute(`type`: String, ctor: AttributeConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAttribute")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
