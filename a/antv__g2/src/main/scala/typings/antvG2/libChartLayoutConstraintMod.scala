package typings.antvG2

import typings.antvG2.libChartLayoutConstraintTypesMod.Operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartLayoutConstraintMod {
  
  @JSImport("@antv/g2/lib/chart/layout/constraint", "Bounds")
  @js.native
  open class Bounds protected ()
    extends typings.antvG2.libChartLayoutConstraintBoundsMod.Bounds {
    def this(name: String) = this()
  }
  
  @JSImport("@antv/g2/lib/chart/layout/constraint", "Constraint")
  @js.native
  open class Constraint protected ()
    extends typings.antvG2.libChartLayoutConstraintConstraintMod.Constraint {
    def this(operator: Operator, elements: Any*) = this()
  }
  
  @JSImport("@antv/g2/lib/chart/layout/constraint", "Operator")
  @js.native
  object Operator extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.antvG2.libChartLayoutConstraintTypesMod.Operator & String] = js.native
    
    /* "eq" */ val EQ: typings.antvG2.libChartLayoutConstraintTypesMod.Operator.EQ & String = js.native
  }
  
  @JSImport("@antv/g2/lib/chart/layout/constraint", "Solver")
  @js.native
  open class Solver ()
    extends typings.antvG2.libChartLayoutConstraintSolverMod.Solver
  
  @JSImport("@antv/g2/lib/chart/layout/constraint", "Variable")
  @js.native
  /**
    * 构造方法
    * @param name
    */
  open class Variable ()
    extends typings.antvG2.libChartLayoutConstraintVariableMod.Variable {
    def this(name: String) = this()
  }
  /* static members */
  object Variable {
    
    @JSImport("@antv/g2/lib/chart/layout/constraint", "Variable")
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
