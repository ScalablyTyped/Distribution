package typings.antvAttr

import typings.antvAttr.libAttributesBaseMod.AttributeConstructor
import typings.antvAttr.libAttributesBaseMod.default
import typings.antvAttr.libInterfaceMod.AttributeCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoryMod {
  
  @JSImport("@antv/attr/lib/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/attr/lib/factory", "Attribute")
  @js.native
  open class Attribute protected () extends default {
    def this(cfg: AttributeCfg) = this()
  }
  
  /**
    * 通过类型获得 Attribute 类
    * @param type
    */
  inline def getAttribute(`type`: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttribute")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def registerAttribute(`type`: String, ctor: AttributeConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAttribute")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
