package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to additional scripting code.
  *
  * This code is organized in modules and these modules contain the functions. It is possible to get just the code from a function, but you can also get
  * the whole code of a module with all functions in it.
  * @deprecated Deprecated
  */
@js.native
trait XLibraryAccess extends XInterface {
  
  /** Return all module names which contain code. e.g., { "UtilLibrary.ModuleDate", "UtilLibrary.Output", ... } */
  val ModuleNames: SafeArray[String] = js.native
  
  /**
    * Get the compiled code of a function.
    * @param FunctionName the full qualified name of a function. (e.g., "UtilLibrary.ModuleDate.Function.CurrentDate")
    * @returns an empty sequence, if this function is not found.
    */
  def getFunctionCode(FunctionName: String): SafeArray[Double] = js.native
  
  /** get the source code of a function. */
  def getFunctionSource(aFunctionName: String): String = js.native
  
  /**
    * Get the hole compiled code of a module.
    * @param aModuleName the full qualified name of a module. (e.g., "UtilLibrary.ModuleDate")
    * @returns an empty sequence, if this module is not found or the code is not compiled.
    */
  def getModuleCode(aModuleName: String): SafeArray[Double] = js.native
  
  /** Return all module names which contain code. e.g., { "UtilLibrary.ModuleDate", "UtilLibrary.Output", ... } */
  def getModuleNames(): SafeArray[String] = js.native
  
  /** get the source code of a module. */
  def getModuleSource(aModulName: String): String = js.native
  
  /**
    * returns `TRUE` , if the function is accessible through this library; otherwise it returns `FALSE` .
    * @@param aFunctionName    the fully qualified name of a function.      (e.g., "UtilLibrary.ModuleDate.FunctionCurrentDate")
    */
  def isFunction(aFunctionName: String): Boolean = js.native
  
  /**
    * returns `TRUE` if a fully qualified function name begins with this name.
    * @@param aPathName    a part of a function name (e.g., "UtilLibrary").
    */
  def isValidPath(aPathName: String): Boolean = js.native
}
object XLibraryAccess {
  
  @scala.inline
  def apply(
    ModuleNames: SafeArray[String],
    acquire: () => Unit,
    getFunctionCode: String => SafeArray[Double],
    getFunctionSource: String => String,
    getModuleCode: String => SafeArray[Double],
    getModuleNames: () => SafeArray[String],
    getModuleSource: String => String,
    isFunction: String => Boolean,
    isValidPath: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLibraryAccess = {
    val __obj = js.Dynamic.literal(ModuleNames = ModuleNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFunctionCode = js.Any.fromFunction1(getFunctionCode), getFunctionSource = js.Any.fromFunction1(getFunctionSource), getModuleCode = js.Any.fromFunction1(getModuleCode), getModuleNames = js.Any.fromFunction0(getModuleNames), getModuleSource = js.Any.fromFunction1(getModuleSource), isFunction = js.Any.fromFunction1(isFunction), isValidPath = js.Any.fromFunction1(isValidPath), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLibraryAccess]
  }
  
  @scala.inline
  implicit class XLibraryAccessOps[Self <: XLibraryAccess] (val x: Self) extends AnyVal {
    
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
    def setModuleNames(value: SafeArray[String]): Self = this.set("ModuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFunctionCode(value: String => SafeArray[Double]): Self = this.set("getFunctionCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFunctionSource(value: String => String): Self = this.set("getFunctionSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetModuleCode(value: String => SafeArray[Double]): Self = this.set("getModuleCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetModuleNames(value: () => SafeArray[String]): Self = this.set("getModuleNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModuleSource(value: String => String): Self = this.set("getModuleSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFunction(value: String => Boolean): Self = this.set("isFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidPath(value: String => Boolean): Self = this.set("isValidPath", js.Any.fromFunction1(value))
  }
}
