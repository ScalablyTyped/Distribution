package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object supporting this interface indicates to interested parties or clients the name of the default propery for this object.
  *
  * For example where ExampleObject is an instance of an Object that supports this interface which returns the default property name "Value".A scripting
  * engine could use this information to support syntax like
  *
  * ExampleObject = "foo"
  *
  * which would be equivalent to writing
  *
  * ExampleObject.Value = "foo"
  *
  * or
  *
  * bar = ExampleObject
  *
  * which would be equivalent to writing
  *
  * bar = ExampleObject.Value
  */
trait XDefaultProperty
  extends StObject
     with XInterface {
  
  /**
    * Returns the name of the default property
    * @returns The `string` name of default property
    */
  val DefaultPropertyName: String
  
  /**
    * Returns the name of the default property
    * @returns The `string` name of default property
    */
  def getDefaultPropertyName(): String
}
object XDefaultProperty {
  
  inline def apply(
    DefaultPropertyName: String,
    acquire: () => Unit,
    getDefaultPropertyName: () => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDefaultProperty = {
    val __obj = js.Dynamic.literal(DefaultPropertyName = DefaultPropertyName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDefaultPropertyName = js.Any.fromFunction0(getDefaultPropertyName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDefaultProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDefaultProperty] (val x: Self) extends AnyVal {
    
    inline def setDefaultPropertyName(value: String): Self = StObject.set(x, "DefaultPropertyName", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultPropertyName(value: () => String): Self = StObject.set(x, "getDefaultPropertyName", js.Any.fromFunction0(value))
  }
}
