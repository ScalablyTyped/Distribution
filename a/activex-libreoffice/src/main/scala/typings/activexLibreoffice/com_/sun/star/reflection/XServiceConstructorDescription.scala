package typings.activexLibreoffice.com_.sun.star.reflection

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a service constructor.
  * @since OOo 2.0
  */
@js.native
trait XServiceConstructorDescription extends StObject {
  
  /**
    * Returns the exceptions that can be raised by the constructor.
    * @returns the reflections of all the exceptions that are listed in the constructor's `raises` specification, in no particular order; all elements of the re
    */
  val Exceptions: SafeArray[XCompoundTypeDescription] = js.native
  
  /**
    * Returns the constructor's name.
    * @returns the constructor's name; for a default constructor, an empty `string` is returned
    */
  val Name: String = js.native
  
  /**
    * Returns the constructor's parameters.
    * @returns the reflections of all the constructor's parameters, in their lexical order; for a default constructor, an empty sequence is returned
    */
  val Parameters: SafeArray[XParameter] = js.native
  
  /**
    * Returns the exceptions that can be raised by the constructor.
    * @returns the reflections of all the exceptions that are listed in the constructor's `raises` specification, in no particular order; all elements of the re
    */
  def getExceptions(): SafeArray[XCompoundTypeDescription] = js.native
  
  /**
    * Returns the constructor's name.
    * @returns the constructor's name; for a default constructor, an empty `string` is returned
    */
  def getName(): String = js.native
  
  /**
    * Returns the constructor's parameters.
    * @returns the reflections of all the constructor's parameters, in their lexical order; for a default constructor, an empty sequence is returned
    */
  def getParameters(): SafeArray[XParameter] = js.native
  
  /**
    * Returns whether the constructor is a default constructor.
    * @returns `TRUE` if the constructor is a default constructor
    */
  def isDefaultConstructor(): Boolean = js.native
}
object XServiceConstructorDescription {
  
  @scala.inline
  def apply(
    Exceptions: SafeArray[XCompoundTypeDescription],
    Name: String,
    Parameters: SafeArray[XParameter],
    getExceptions: () => SafeArray[XCompoundTypeDescription],
    getName: () => String,
    getParameters: () => SafeArray[XParameter],
    isDefaultConstructor: () => Boolean
  ): XServiceConstructorDescription = {
    val __obj = js.Dynamic.literal(Exceptions = Exceptions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], getExceptions = js.Any.fromFunction0(getExceptions), getName = js.Any.fromFunction0(getName), getParameters = js.Any.fromFunction0(getParameters), isDefaultConstructor = js.Any.fromFunction0(isDefaultConstructor))
    __obj.asInstanceOf[XServiceConstructorDescription]
  }
  
  @scala.inline
  implicit class XServiceConstructorDescriptionMutableBuilder[Self <: XServiceConstructorDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptions(value: SafeArray[XCompoundTypeDescription]): Self = StObject.set(x, "Exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetExceptions(value: () => SafeArray[XCompoundTypeDescription]): Self = StObject.set(x, "getExceptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameters(value: () => SafeArray[XParameter]): Self = StObject.set(x, "getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDefaultConstructor(value: () => Boolean): Self = StObject.set(x, "isDefaultConstructor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: SafeArray[XParameter]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
  }
}
