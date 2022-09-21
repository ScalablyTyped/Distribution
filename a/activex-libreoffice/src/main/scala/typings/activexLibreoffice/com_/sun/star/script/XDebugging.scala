package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to set breakpoints in an interpreter.
  * @deprecated Deprecated
  */
trait XDebugging
  extends StObject
     with XInterface {
  
  /** Returns the engine's stack trace of the current execute position. Line break is the delimiter. */
  val StackTrace: SafeArray[String]
  
  /** clears all breakpoints in the module set by "setBreakPoint". */
  def clearAllBreakPoints(aModuleName: String): Unit
  
  /** continues the program execution. */
  def doContinue(): Unit
  
  /** returns the value of the variable at the given stack position. */
  def dumpVariable(aVariableName: String, nCallStackPos: Double): String
  
  /**
    * Evaluates an expression.
    * @param aSourceCode the expression to be evaluated.
    * @param nCallStackPos Position in the call stack for which the expression should be evaluated. 0 is the top/actual position in the call in the call stack
    * @returns the value of the expression as string.
    */
  def eval(aSourceCode: String, nCallStackPos: Double): String
  
  /**
    * returns more detailed information about a specified stack frame.
    * @param nCallStackPos specifies the position in the call stack for the variables that should be delivered.
    */
  def getContextInformation(nCallStackPos: Double): ContextInformation
  
  /** Returns the engine's stack trace of the current execute position. Line break is the delimiter. */
  def getStackTrace(): SafeArray[String]
  
  /** returns whether the given variable exists within the specified stack frame. */
  def isVariable(aVariableName: String, nCallStackPos: Double): Boolean
  
  /**
    * returns the source code line where the breakpoint was set. <p>The value can differ from the parameter
    *
    *     <var>nSourceCodeLine</var> when this is not a valid line to
    *
    *     place it.  -1 indicates that the breakpoint cannot be set at
    *
    *     this position.
    */
  def setBreakPoint(aModuleName: String, nSourceCodeLine: Double, bOn: Boolean): Double
  
  /** sets the value of the specified variable within the specified stack frame. */
  def setVariable(aVariableName: String, aValue: String, nCallStackPos: Double): Unit
  
  /**
    * executes the next and only the next statement.
    *
    * If the next statement is a function call, only the function entered.
    */
  def stepIn(): Unit
  
  /** executes the program until the next return from this stack frame. */
  def stepOut(): Unit
  
  /**
    * executes the next and only the next statement.
    *
    * If the next statement is a function call, the function is executed completely.
    */
  def stepOver(): Unit
  
  /**
    * stops the execution of the interpreter.
    *
    * To continue with the execution, call {@link XDebugging.doContinue()} .
    */
  def stop(): Unit
}
object XDebugging {
  
  inline def apply(
    StackTrace: SafeArray[String],
    acquire: () => Unit,
    clearAllBreakPoints: String => Unit,
    doContinue: () => Unit,
    dumpVariable: (String, Double) => String,
    eval: (String, Double) => String,
    getContextInformation: Double => ContextInformation,
    getStackTrace: () => SafeArray[String],
    isVariable: (String, Double) => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    setBreakPoint: (String, Double, Boolean) => Double,
    setVariable: (String, String, Double) => Unit,
    stepIn: () => Unit,
    stepOut: () => Unit,
    stepOver: () => Unit,
    stop: () => Unit
  ): XDebugging = {
    val __obj = js.Dynamic.literal(StackTrace = StackTrace.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearAllBreakPoints = js.Any.fromFunction1(clearAllBreakPoints), doContinue = js.Any.fromFunction0(doContinue), dumpVariable = js.Any.fromFunction2(dumpVariable), eval = js.Any.fromFunction2(eval), getContextInformation = js.Any.fromFunction1(getContextInformation), getStackTrace = js.Any.fromFunction0(getStackTrace), isVariable = js.Any.fromFunction2(isVariable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setBreakPoint = js.Any.fromFunction3(setBreakPoint), setVariable = js.Any.fromFunction3(setVariable), stepIn = js.Any.fromFunction0(stepIn), stepOut = js.Any.fromFunction0(stepOut), stepOver = js.Any.fromFunction0(stepOver), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[XDebugging]
  }
  
  extension [Self <: XDebugging](x: Self) {
    
    inline def setClearAllBreakPoints(value: String => Unit): Self = StObject.set(x, "clearAllBreakPoints", js.Any.fromFunction1(value))
    
    inline def setDoContinue(value: () => Unit): Self = StObject.set(x, "doContinue", js.Any.fromFunction0(value))
    
    inline def setDumpVariable(value: (String, Double) => String): Self = StObject.set(x, "dumpVariable", js.Any.fromFunction2(value))
    
    inline def setEval(value: (String, Double) => String): Self = StObject.set(x, "eval", js.Any.fromFunction2(value))
    
    inline def setGetContextInformation(value: Double => ContextInformation): Self = StObject.set(x, "getContextInformation", js.Any.fromFunction1(value))
    
    inline def setGetStackTrace(value: () => SafeArray[String]): Self = StObject.set(x, "getStackTrace", js.Any.fromFunction0(value))
    
    inline def setIsVariable(value: (String, Double) => Boolean): Self = StObject.set(x, "isVariable", js.Any.fromFunction2(value))
    
    inline def setSetBreakPoint(value: (String, Double, Boolean) => Double): Self = StObject.set(x, "setBreakPoint", js.Any.fromFunction3(value))
    
    inline def setSetVariable(value: (String, String, Double) => Unit): Self = StObject.set(x, "setVariable", js.Any.fromFunction3(value))
    
    inline def setStackTrace(value: SafeArray[String]): Self = StObject.set(x, "StackTrace", value.asInstanceOf[js.Any])
    
    inline def setStepIn(value: () => Unit): Self = StObject.set(x, "stepIn", js.Any.fromFunction0(value))
    
    inline def setStepOut(value: () => Unit): Self = StObject.set(x, "stepOut", js.Any.fromFunction0(value))
    
    inline def setStepOver(value: () => Unit): Self = StObject.set(x, "stepOver", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
