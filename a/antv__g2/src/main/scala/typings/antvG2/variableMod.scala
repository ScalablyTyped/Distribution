package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variableMod {
  
  @JSImport("@antv/g2/lib/chart/layout/constraint/variable", "Variable")
  @js.native
  /**
    * 构造方法
    * @param name
    */
  open class Variable () extends StObject {
    def this(name: String) = this()
    
    /**
      * 变量的名称
      */
    var name: String = js.native
    
    /**
      * 实际的值
      */
    var value: Double = js.native
  }
  /* static members */
  object Variable {
    
    @JSImport("@antv/g2/lib/chart/layout/constraint/variable", "Variable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 判断是否为一个变量
      * @param v
      * @returns
      */
    inline def isVariable(v: Any): /* is @antv/g2.@antv/g2/lib/chart/layout/constraint/variable.Variable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariable")(v.asInstanceOf[js.Any]).asInstanceOf[/* is @antv/g2.@antv/g2/lib/chart/layout/constraint/variable.Variable */ Boolean]
  }
}
