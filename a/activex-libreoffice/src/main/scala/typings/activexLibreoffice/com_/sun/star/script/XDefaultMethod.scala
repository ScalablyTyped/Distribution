package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait XDefaultMethod
  extends StObject
     with XInterface {
  
  /**
    * Returns the name of the default method
    * @returns The `string` name of default method
    */
  val DefaultMethodName: String
  
  /**
    * Returns the name of the default method
    * @returns The `string` name of default method
    */
  def getDefaultMethodName(): String
}
object XDefaultMethod {
  
  inline def apply(
    DefaultMethodName: String,
    acquire: () => Unit,
    getDefaultMethodName: () => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDefaultMethod = {
    val __obj = js.Dynamic.literal(DefaultMethodName = DefaultMethodName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultMethodName = js.Any.fromFunction0(getDefaultMethodName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDefaultMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDefaultMethod] (val x: Self) extends AnyVal {
    
    inline def setDefaultMethodName(value: String): Self = StObject.set(x, "DefaultMethodName", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultMethodName(value: () => String): Self = StObject.set(x, "getDefaultMethodName", js.Any.fromFunction0(value))
  }
}
