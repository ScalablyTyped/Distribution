package typings.antvG2

import typings.antvG2.constraintConstraintMod.Constraint
import typings.antvG2.variableMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object solverMod {
  
  @JSImport("@antv/g2/lib/chart/layout/constraint/solver", "Solver")
  @js.native
  open class Solver () extends StObject {
    
    /**
      * 添加多条约束
      * @param constraint
      */
    def addConstraint(constraints: Constraint*): Unit = js.native
    
    /**
      * 计算返回布局
      */
    def calc(): js.Array[Variable] = js.native
    
    /**
      * 存在的约束
      */
    var constraints: js.Array[Constraint] = js.native
    
    /**
      * 获得高斯消元的矩阵
      */
    /* private */ var getGaussMatrix: Any = js.native
    
    /**
      * 获取约束中所有的变量
      */
    /* private */ var getVariables: Any = js.native
    
    /**
      * 条件数量
      */
    /* private */ var m: Any = js.native
    
    /**
      * 变量（元）数量
      */
    /* private */ var n: Any = js.native
    
    var variables: js.Array[Variable] = js.native
  }
}
