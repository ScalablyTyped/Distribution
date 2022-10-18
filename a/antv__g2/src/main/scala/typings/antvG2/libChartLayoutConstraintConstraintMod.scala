package typings.antvG2

import typings.antvG2.libChartLayoutConstraintTypesMod.Element
import typings.antvG2.libChartLayoutConstraintTypesMod.Operator
import typings.antvG2.libChartLayoutConstraintVariableMod.Variable
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartLayoutConstraintConstraintMod {
  
  @JSImport("@antv/g2/lib/chart/layout/constraint/constraint", "Constraint")
  @js.native
  open class Constraint protected () extends StObject {
    def this(operator: Operator, elements: Any*) = this()
    
    /**
      * 方程组四则运算 + 连接的内容
      */
    var elements: js.Array[Element] = js.native
    
    /**
      * 获得方程组的高斯矩阵数组
      * 按照指定的 variable 顺序
      * @param variableMap 变量对应的 idx
      */
    def getGaussArr(variableMap: Map[Variable, Double]): js.Array[Any] = js.native
    
    /**
      * 获得表达式中所有的变量
      */
    def getVariables(): js.Array[Variable] = js.native
    
    /**
      * 操作符
      */
    var operator: Operator = js.native
    
    /**
      * 解析 element，产生 [a, variable]
      * @param element
      */
    /* private */ var parseElement: Any = js.native
  }
}
