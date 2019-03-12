package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to additional scripting code.
  *
  * This code is organized in modules and these modules contain the functions. It is possible to get just the code from a function, but you can also get
  * the whole code of a module with all functions in it.
  * @deprecated Deprecated
  */
trait XLibraryAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Return all module names which contain code. e.g., { "UtilLibrary.ModuleDate", "UtilLibrary.Output", ... } */
  val ModuleNames: stdLib.SafeArray[java.lang.String]
  /**
    * Get the compiled code of a function.
    * @param FunctionName the full qualified name of a function. (e.g., "UtilLibrary.ModuleDate.Function.CurrentDate")
    * @returns an empty sequence, if this function is not found.
    */
  def getFunctionCode(FunctionName: java.lang.String): stdLib.SafeArray[scala.Double]
  /** get the source code of a function. */
  def getFunctionSource(aFunctionName: java.lang.String): java.lang.String
  /**
    * Get the hole compiled code of a module.
    * @param aModuleName the full qualified name of a module. (e.g., "UtilLibrary.ModuleDate")
    * @returns an empty sequence, if this module is not found or the code is not compiled.
    */
  def getModuleCode(aModuleName: java.lang.String): stdLib.SafeArray[scala.Double]
  /** Return all module names which contain code. e.g., { "UtilLibrary.ModuleDate", "UtilLibrary.Output", ... } */
  def getModuleNames(): stdLib.SafeArray[java.lang.String]
  /** get the source code of a module. */
  def getModuleSource(aModulName: java.lang.String): java.lang.String
  /**
    * returns `TRUE` , if the function is accessible through this library; otherwise it returns `FALSE` .
    * @@param aFunctionName    the fully qualified name of a function.      (e.g., "UtilLibrary.ModuleDate.FunctionCurrentDate")
    */
  def isFunction(aFunctionName: java.lang.String): scala.Boolean
  /**
    * returns `TRUE` if a fully qualified function name begins with this name.
    * @@param aPathName    a part of a function name (e.g., "UtilLibrary").
    */
  def isValidPath(aPathName: java.lang.String): scala.Boolean
}

object XLibraryAccess {
  @scala.inline
  def apply(
    ModuleNames: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    getFunctionCode: java.lang.String => stdLib.SafeArray[scala.Double],
    getFunctionSource: java.lang.String => java.lang.String,
    getModuleCode: java.lang.String => stdLib.SafeArray[scala.Double],
    getModuleNames: () => stdLib.SafeArray[java.lang.String],
    getModuleSource: java.lang.String => java.lang.String,
    isFunction: java.lang.String => scala.Boolean,
    isValidPath: java.lang.String => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XLibraryAccess = {
    val __obj = js.Dynamic.literal(ModuleNames = ModuleNames, acquire = js.Any.fromFunction0(acquire), getFunctionCode = js.Any.fromFunction1(getFunctionCode), getFunctionSource = js.Any.fromFunction1(getFunctionSource), getModuleCode = js.Any.fromFunction1(getModuleCode), getModuleNames = js.Any.fromFunction0(getModuleNames), getModuleSource = js.Any.fromFunction1(getModuleSource), isFunction = js.Any.fromFunction1(isFunction), isValidPath = js.Any.fromFunction1(isValidPath), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLibraryAccess]
  }
}

