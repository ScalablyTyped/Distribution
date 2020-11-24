package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object supporting this interface indicates to interested parties or clients the name of the default method for this object.
  *
  * For example where ExampleObject is an instance of an Object that supports this interface which returns the default method name "defaultMethod".A
  * scripting engine could use this information to support syntax like
  *
  * "ExampleObject( Param1 .... ParamN )"
  *
  * which would be equivalent to writing
  *
  * "ExampleObject.defaultMethod( Param1 ... ParamN )"
  */
@js.native
trait XDefaultMethod extends XInterface {
  
  /**
    * Returns the name of the default method
    * @returns The `string` name of default method
    */
  val DefaultMethodName: String = js.native
  
  /**
    * Returns the name of the default method
    * @returns The `string` name of default method
    */
  def getDefaultMethodName(): String = js.native
}
object XDefaultMethod {
  
  @scala.inline
  def apply(
    DefaultMethodName: String,
    acquire: () => Unit,
    getDefaultMethodName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDefaultMethod = {
    val __obj = js.Dynamic.literal(DefaultMethodName = DefaultMethodName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultMethodName = js.Any.fromFunction0(getDefaultMethodName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDefaultMethod]
  }
  
  @scala.inline
  implicit class XDefaultMethodOps[Self <: XDefaultMethod] (val x: Self) extends AnyVal {
    
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
    def setDefaultMethodName(value: String): Self = this.set("DefaultMethodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDefaultMethodName(value: () => String): Self = this.set("getDefaultMethodName", js.Any.fromFunction0(value))
  }
}
