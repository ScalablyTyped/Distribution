package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to set breakpoints in an interpreter.
  * @deprecated Deprecated
  */
@js.native
trait XDebugging extends XInterface {
  
  /** Returns the engine's stack trace of the current execute position. Line break is the delimiter. */
  val StackTrace: SafeArray[String] = js.native
  
  /** clears all breakpoints in the module set by "setBreakPoint". */
  def clearAllBreakPoints(aModuleName: String): Unit = js.native
  
  /** continues the program execution. */
  def doContinue(): Unit = js.native
  
  /** returns the value of the variable at the given stack position. */
  def dumpVariable(aVariableName: String, nCallStackPos: Double): String = js.native
  
  /**
    * Evaluates an expression.
    * @param aSourceCode the expression to be evaluated.
    * @param nCallStackPos Position in the call stack for which the expression should be evaluated. 0 is the top/actual position in the call in the call stack
    * @returns the value of the expression as string.
    */
  def eval(aSourceCode: String, nCallStackPos: Double): String = js.native
  
  /**
    * returns more detailed information about a specified stack frame.
    * @param nCallStackPos specifies the position in the call stack for the variables that should be delivered.
    */
  def getContextInformation(nCallStackPos: Double): ContextInformation = js.native
  
  /** Returns the engine's stack trace of the current execute position. Line break is the delimiter. */
  def getStackTrace(): SafeArray[String] = js.native
  
  /** returns whether the given variable exists within the specified stack frame. */
  def isVariable(aVariableName: String, nCallStackPos: Double): Boolean = js.native
  
  /**
    * returns the source code line where the breakpoint was set. <p>The value can differ from the parameter
    *
    *     <var>nSourceCodeLine</var> when this is not a valid line to
    *
    *     place it.  -1 indicates that the breakpoint cannot be set at
    *
    *     this position.
    */
  def setBreakPoint(aModuleName: String, nSourceCodeLine: Double, bOn: Boolean): Double = js.native
  
  /** sets the value of the specified variable within the specified stack frame. */
  def setVariable(aVariableName: String, aValue: String, nCallStackPos: Double): Unit = js.native
  
  /**
    * executes the next and only the next statement.
    *
    * If the next statement is a function call, only the function entered.
    */
  def stepIn(): Unit = js.native
  
  /** executes the program until the next return from this stack frame. */
  def stepOut(): Unit = js.native
  
  /**
    * executes the next and only the next statement.
    *
    * If the next statement is a function call, the function is executed completely.
    */
  def stepOver(): Unit = js.native
  
  /**
    * stops the execution of the interpreter.
    *
    * To continue with the execution, call {@link XDebugging.doContinue()} .
    */
  def stop(): Unit = js.native
}
object XDebugging {
  
  @scala.inline
  def apply(
    StackTrace: SafeArray[String],
    acquire: () => Unit,
    clearAllBreakPoints: String => Unit,
    doContinue: () => Unit,
    dumpVariable: (String, Double) => String,
    eval: (String, Double) => String,
    getContextInformation: Double => ContextInformation,
    getStackTrace: () => SafeArray[String],
    isVariable: (String, Double) => Boolean,
    queryInterface: `type` => js.Any,
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
  
  @scala.inline
  implicit class XDebuggingOps[Self <: XDebugging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStackTrace(value: SafeArray[String]): Self = this.set("StackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearAllBreakPoints(value: String => Unit): Self = this.set("clearAllBreakPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoContinue(value: () => Unit): Self = this.set("doContinue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDumpVariable(value: (String, Double) => String): Self = this.set("dumpVariable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEval(value: (String, Double) => String): Self = this.set("eval", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetContextInformation(value: Double => ContextInformation): Self = this.set("getContextInformation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStackTrace(value: () => SafeArray[String]): Self = this.set("getStackTrace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVariable(value: (String, Double) => Boolean): Self = this.set("isVariable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetBreakPoint(value: (String, Double, Boolean) => Double): Self = this.set("setBreakPoint", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetVariable(value: (String, String, Double) => Unit): Self = this.set("setVariable", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStepIn(value: () => Unit): Self = this.set("stepIn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStepOut(value: () => Unit): Self = this.set("stepOut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStepOver(value: () => Unit): Self = this.set("stepOver", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
