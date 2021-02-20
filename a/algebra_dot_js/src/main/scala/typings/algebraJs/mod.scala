package typings.algebraJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("algebra.js", "Equation")
  @js.native
  class Equation protected ()
    extends typings.algebraJs.mod.algebra.js_.Equation {
    def this(lhs: typings.algebraJs.mod.algebra.js_.Expression, rhs: Double) = this()
    def this(
      lhs: typings.algebraJs.mod.algebra.js_.Expression,
      rhs: typings.algebraJs.mod.algebra.js_.Expression
    ) = this()
    def this(lhs: typings.algebraJs.mod.algebra.js_.Expression, rhs: typings.algebraJs.mod.algebra.js_.Fraction) = this()
  }
  
  @JSImport("algebra.js", "Expression")
  @js.native
  class Expression ()
    extends typings.algebraJs.mod.algebra.js_.Expression {
    def this(variable: Union) = this()
  }
  
  @JSImport("algebra.js", "Fraction")
  @js.native
  class Fraction protected ()
    extends typings.algebraJs.mod.algebra.js_.Fraction {
    def this(num: Double, denom: Double) = this()
  }
  
  @JSImport("algebra.js", "parse")
  @js.native
  def parse(input: String): typings.algebraJs.mod.algebra.js_.Equation | typings.algebraJs.mod.algebra.js_.Expression = js.native
  
  @JSImport("algebra.js", "toTex")
  @js.native
  def toTex(input: js.Array[typings.algebraJs.mod.algebra.js_.Fraction | js.Object]): String = js.native
  @JSImport("algebra.js", "toTex")
  @js.native
  def toTex(input: js.Object): String = js.native
  @JSImport("algebra.js", "toTex")
  @js.native
  def toTex(input: typings.algebraJs.mod.algebra.js_.Equation): String = js.native
  @JSImport("algebra.js", "toTex")
  @js.native
  def toTex(input: typings.algebraJs.mod.algebra.js_.Expression): String = js.native
  @JSImport("algebra.js", "toTex")
  @js.native
  def toTex(input: typings.algebraJs.mod.algebra.js_.Fraction): String = js.native
  
  @js.native
  trait Term extends _Union {
    
    def coefficient(): typings.algebraJs.mod.algebra.js_.Fraction = js.native
    
    var coefficients: js.Array[typings.algebraJs.mod.algebra.js_.Fraction] = js.native
    
    var variables: js.Array[Variable] = js.native
  }
  object Term {
    
    @scala.inline
    def apply(
      coefficient: () => typings.algebraJs.mod.algebra.js_.Fraction,
      coefficients: js.Array[typings.algebraJs.mod.algebra.js_.Fraction],
      variables: js.Array[Variable]
    ): Term = {
      val __obj = js.Dynamic.literal(coefficient = js.Any.fromFunction0(coefficient), coefficients = coefficients.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Term]
    }
    
    @scala.inline
    implicit class TermMutableBuilder[Self <: Term] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoefficient(value: () => typings.algebraJs.mod.algebra.js_.Fraction): Self = StObject.set(x, "coefficient", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCoefficients(value: js.Array[typings.algebraJs.mod.algebra.js_.Fraction]): Self = StObject.set(x, "coefficients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoefficientsVarargs(value: typings.algebraJs.mod.algebra.js_.Fraction*): Self = StObject.set(x, "coefficients", js.Array(value :_*))
      
      @scala.inline
      def setVariables(value: js.Array[Variable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - typings.algebraJs.mod.algebra.js_.Fraction
    - typings.algebraJs.mod.Term
  */
  type Union = _Union | String | Double
  
  @js.native
  trait Variable extends StObject {
    
    var variable: String = js.native
  }
  object Variable {
    
    @scala.inline
    def apply(variable: String): Variable = {
      val __obj = js.Dynamic.literal(variable = variable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variable]
    }
    
    @scala.inline
    implicit class VariableMutableBuilder[Self <: Variable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Union extends StObject
  
  object algebra {
    
    object js_ {
      
      @js.native
      trait Equation extends StObject {
        
        var lhs: typings.algebraJs.mod.algebra.js_.Expression = js.native
        
        var rhs: typings.algebraJs.mod.algebra.js_.Expression = js.native
        
        def solveFor(variable: String): typings.algebraJs.mod.algebra.js_.Fraction | (js.Array[Double | typings.algebraJs.mod.algebra.js_.Fraction]) = js.native
      }
      object Equation {
        
        @scala.inline
        def apply(
          lhs: typings.algebraJs.mod.algebra.js_.Expression,
          rhs: typings.algebraJs.mod.algebra.js_.Expression,
          solveFor: String => typings.algebraJs.mod.algebra.js_.Fraction | (js.Array[Double | typings.algebraJs.mod.algebra.js_.Fraction])
        ): typings.algebraJs.mod.algebra.js_.Equation = {
          val __obj = js.Dynamic.literal(lhs = lhs.asInstanceOf[js.Any], rhs = rhs.asInstanceOf[js.Any], solveFor = js.Any.fromFunction1(solveFor))
          __obj.asInstanceOf[typings.algebraJs.mod.algebra.js_.Equation]
        }
        
        @scala.inline
        implicit class EquationMutableBuilder[Self <: typings.algebraJs.mod.algebra.js_.Equation] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLhs(value: typings.algebraJs.mod.algebra.js_.Expression): Self = StObject.set(x, "lhs", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRhs(value: typings.algebraJs.mod.algebra.js_.Expression): Self = StObject.set(x, "rhs", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSolveFor(
            value: String => typings.algebraJs.mod.algebra.js_.Fraction | (js.Array[Double | typings.algebraJs.mod.algebra.js_.Fraction])
          ): Self = StObject.set(x, "solveFor", js.Any.fromFunction1(value))
        }
      }
      
      @js.native
      trait Expression extends StObject {
        
        def add(other: Union): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def add(other: Union, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def add(other: typings.algebraJs.mod.algebra.js_.Expression): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def add(other: typings.algebraJs.mod.algebra.js_.Expression, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Expression = js.native
        
        def constant(): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        
        var constants: js.Array[typings.algebraJs.mod.algebra.js_.Fraction] = js.native
        
        def divide(other: Double): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def divide(other: Double, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def divide(other: typings.algebraJs.mod.algebra.js_.Fraction): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def divide(other: typings.algebraJs.mod.algebra.js_.Fraction, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Expression = js.native
        
        def eval(p: js.Object): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def eval(p: js.Object, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Expression = js.native
        
        def multiply(other: Union): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def multiply(other: Union, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def multiply(other: typings.algebraJs.mod.algebra.js_.Expression): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def multiply(other: typings.algebraJs.mod.algebra.js_.Expression, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Expression = js.native
        
        def pow(p: Double): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def pow(p: Double, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Expression = js.native
        
        def simplify(): typings.algebraJs.mod.algebra.js_.Expression = js.native
        
        def subtract(other: Union): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def subtract(other: Union, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def subtract(other: typings.algebraJs.mod.algebra.js_.Expression): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def subtract(other: typings.algebraJs.mod.algebra.js_.Expression, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Expression = js.native
        
        def summation(variable: String, lower: Double, upper: Double): typings.algebraJs.mod.algebra.js_.Expression = js.native
        def summation(variable: String, lower: Double, upper: Double, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Expression = js.native
        
        var terms: js.Array[Term] = js.native
      }
      
      @js.native
      trait Fraction extends _Union {
        
        def abs(): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        
        def add(other: Double): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def add(other: Double, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def add(other: typings.algebraJs.mod.algebra.js_.Fraction): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def add(other: typings.algebraJs.mod.algebra.js_.Fraction, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        
        var denom: Double = js.native
        
        def divide(other: Double): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def divide(other: Double, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def divide(other: typings.algebraJs.mod.algebra.js_.Fraction): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def divide(other: typings.algebraJs.mod.algebra.js_.Fraction, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        
        def multiply(other: Double): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def multiply(other: Double, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def multiply(other: typings.algebraJs.mod.algebra.js_.Fraction): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def multiply(other: typings.algebraJs.mod.algebra.js_.Fraction, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        
        var numer: Double = js.native
        
        def subtract(other: Double): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def subtract(other: Double, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def subtract(other: typings.algebraJs.mod.algebra.js_.Fraction): typings.algebraJs.mod.algebra.js_.Fraction = js.native
        def subtract(other: typings.algebraJs.mod.algebra.js_.Fraction, simplify: Boolean): typings.algebraJs.mod.algebra.js_.Fraction = js.native
      }
    }
  }
}
