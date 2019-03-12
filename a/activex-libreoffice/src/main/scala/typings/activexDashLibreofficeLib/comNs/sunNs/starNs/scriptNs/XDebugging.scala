package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to set breakpoints in an interpreter.
  * @deprecated Deprecated
  */
trait XDebugging
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Returns the engine's stack trace of the current execute position. Line break is the delimiter. */
  val StackTrace: stdLib.SafeArray[java.lang.String]
  /** clears all breakpoints in the module set by "setBreakPoint". */
  def clearAllBreakPoints(aModuleName: java.lang.String): scala.Unit
  /** continues the program execution. */
  def doContinue(): scala.Unit
  /** returns the value of the variable at the given stack position. */
  def dumpVariable(aVariableName: java.lang.String, nCallStackPos: scala.Double): java.lang.String
  /**
    * Evaluates an expression.
    * @param aSourceCode the expression to be evaluated.
    * @param nCallStackPos Position in the call stack for which the expression should be evaluated. 0 is the top/actual position in the call in the call stack
    * @returns the value of the expression as string.
    */
  def eval(aSourceCode: java.lang.String, nCallStackPos: scala.Double): java.lang.String
  /**
    * returns more detailed information about a specified stack frame.
    * @param nCallStackPos specifies the position in the call stack for the variables that should be delivered.
    */
  def getContextInformation(nCallStackPos: scala.Double): ContextInformation
  /** Returns the engine's stack trace of the current execute position. Line break is the delimiter. */
  def getStackTrace(): stdLib.SafeArray[java.lang.String]
  /** returns whether the given variable exists within the specified stack frame. */
  def isVariable(aVariableName: java.lang.String, nCallStackPos: scala.Double): scala.Boolean
  /**
    * returns the source code line where the breakpoint was set. <p>The value can differ from the parameter
    *
    *     <var>nSourceCodeLine</var> when this is not a valid line to
    *
    *     place it.  -1 indicates that the breakpoint cannot be set at
    *
    *     this position.
    */
  def setBreakPoint(aModuleName: java.lang.String, nSourceCodeLine: scala.Double, bOn: scala.Boolean): scala.Double
  /** sets the value of the specified variable within the specified stack frame. */
  def setVariable(aVariableName: java.lang.String, aValue: java.lang.String, nCallStackPos: scala.Double): scala.Unit
  /**
    * executes the next and only the next statement.
    *
    * If the next statement is a function call, only the function entered.
    */
  def stepIn(): scala.Unit
  /** executes the program until the next return from this stack frame. */
  def stepOut(): scala.Unit
  /**
    * executes the next and only the next statement.
    *
    * If the next statement is a function call, the function is executed completely.
    */
  def stepOver(): scala.Unit
  /**
    * stops the execution of the interpreter.
    *
    * To continue with the execution, call {@link XDebugging.doContinue()} .
    */
  def stop(): scala.Unit
}

object XDebugging {
  @scala.inline
  def apply(
    StackTrace: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    clearAllBreakPoints: java.lang.String => scala.Unit,
    doContinue: () => scala.Unit,
    dumpVariable: (java.lang.String, scala.Double) => java.lang.String,
    eval: (java.lang.String, scala.Double) => java.lang.String,
    getContextInformation: scala.Double => ContextInformation,
    getStackTrace: () => stdLib.SafeArray[java.lang.String],
    isVariable: (java.lang.String, scala.Double) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setBreakPoint: (java.lang.String, scala.Double, scala.Boolean) => scala.Double,
    setVariable: (java.lang.String, java.lang.String, scala.Double) => scala.Unit,
    stepIn: () => scala.Unit,
    stepOut: () => scala.Unit,
    stepOver: () => scala.Unit,
    stop: () => scala.Unit
  ): XDebugging = {
    val __obj = js.Dynamic.literal(StackTrace = StackTrace, acquire = js.Any.fromFunction0(acquire), clearAllBreakPoints = js.Any.fromFunction1(clearAllBreakPoints), doContinue = js.Any.fromFunction0(doContinue), dumpVariable = js.Any.fromFunction2(dumpVariable), eval = js.Any.fromFunction2(eval), getContextInformation = js.Any.fromFunction1(getContextInformation), getStackTrace = js.Any.fromFunction0(getStackTrace), isVariable = js.Any.fromFunction2(isVariable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setBreakPoint = js.Any.fromFunction3(setBreakPoint), setVariable = js.Any.fromFunction3(setVariable), stepIn = js.Any.fromFunction0(stepIn), stepOut = js.Any.fromFunction0(stepOut), stepOver = js.Any.fromFunction0(stepOver), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[XDebugging]
  }
}

