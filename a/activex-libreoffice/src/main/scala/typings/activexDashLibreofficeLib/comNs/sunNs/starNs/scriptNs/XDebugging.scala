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
  val StackTrace: activexDashInteropLib.SafeArray[java.lang.String]
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
  def getStackTrace(): activexDashInteropLib.SafeArray[java.lang.String]
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
    StackTrace: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    clearAllBreakPoints: js.Function1[java.lang.String, scala.Unit],
    doContinue: js.Function0[scala.Unit],
    dumpVariable: js.Function2[java.lang.String, scala.Double, java.lang.String],
    eval: js.Function2[java.lang.String, scala.Double, java.lang.String],
    getContextInformation: js.Function1[scala.Double, ContextInformation],
    getStackTrace: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    isVariable: js.Function2[java.lang.String, scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setBreakPoint: js.Function3[java.lang.String, scala.Double, scala.Boolean, scala.Double],
    setVariable: js.Function3[java.lang.String, java.lang.String, scala.Double, scala.Unit],
    stepIn: js.Function0[scala.Unit],
    stepOut: js.Function0[scala.Unit],
    stepOver: js.Function0[scala.Unit],
    stop: js.Function0[scala.Unit]
  ): XDebugging = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("StackTrace")(StackTrace)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("clearAllBreakPoints")(clearAllBreakPoints)
    __obj.updateDynamic("doContinue")(doContinue)
    __obj.updateDynamic("dumpVariable")(dumpVariable)
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("getContextInformation")(getContextInformation)
    __obj.updateDynamic("getStackTrace")(getStackTrace)
    __obj.updateDynamic("isVariable")(isVariable)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setBreakPoint")(setBreakPoint)
    __obj.updateDynamic("setVariable")(setVariable)
    __obj.updateDynamic("stepIn")(stepIn)
    __obj.updateDynamic("stepOut")(stepOut)
    __obj.updateDynamic("stepOver")(stepOver)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[XDebugging]
  }
}

