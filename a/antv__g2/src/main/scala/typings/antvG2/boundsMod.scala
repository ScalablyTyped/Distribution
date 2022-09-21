package typings.antvG2

import typings.antvG2.typesMod.BoxObject
import typings.antvG2.variableMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundsMod {
  
  @JSImport("@antv/g2/lib/chart/layout/constraint/bounds", "Bounds")
  @js.native
  open class Bounds protected () extends StObject {
    def this(name: String) = this()
    
    /**
      * 最终的布局信息
      */
    def bbox: BoxObject = js.native
    
    /**
      * height 变量
      */
    var height: Variable = js.native
    
    /**
      * bounds 的名字
      */
    var name: String = js.native
    
    /**
      * width 变量
      */
    var width: Variable = js.native
    
    /**
      * x 变量
      */
    var x: Variable = js.native
    
    /**
      * y 变量
      */
    var y: Variable = js.native
  }
}
