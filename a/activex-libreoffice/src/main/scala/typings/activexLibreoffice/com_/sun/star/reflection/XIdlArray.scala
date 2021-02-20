package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects an IDL sequence and provides dynamic access to instances of that sequence. This interface supports widening conversion when getting or
  * setting elements.
  */
@js.native
trait XIdlArray extends XInterface {
  
  /**
    * Returns element at given index.
    * @param aArray sequence instance
    * @param nIndex index
    * @returns value
    * @throws IllegalArgumentException if the specified object is not a sequence or if the specified object is null
    * @throws ArrayIndexOutOfBoundsException if the specified index argument is negative, or if it is greater than or equal to the length of the specified sequence.
    */
  def get(aArray: js.Any, nIndex: Double): js.Any = js.native
  
  /**
    * Returns the length of the given sequence.
    * @param array sequence instance
    * @returns length of sequence
    */
  def getLen(array: js.Any): Double = js.native
  
  /**
    * Rellocates the length of the sequence instance.
    * @param array sequence instance
    * @param length new length of sequence
    */
  def realloc(array: js.Array[_], length: Double): Unit = js.native
  
  /**
    * Sets a new value at given index.
    * @param aArray sequence instance
    * @param nIndex index
    * @param aNewValue new value to be set
    * @throws IllegalArgumentException if the specified object is not a sequence or if the specified object is null
    * @throws ArrayIndexOutOfBoundsException if the specified index argument is negative, or if it is greater than or equal to the length of the specified sequence.
    */
  def set(aArray: js.Array[_], nIndex: Double, aNewValue: js.Any): Unit = js.native
}
object XIdlArray {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    get: (js.Any, Double) => js.Any,
    getLen: js.Any => Double,
    queryInterface: `type` => js.Any,
    realloc: (js.Array[_], Double) => Unit,
    release: () => Unit,
    set: (js.Array[_], Double, js.Any) => Unit
  ): XIdlArray = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), get = js.Any.fromFunction2(get), getLen = js.Any.fromFunction1(getLen), queryInterface = js.Any.fromFunction1(queryInterface), realloc = js.Any.fromFunction2(realloc), release = js.Any.fromFunction0(release), set = js.Any.fromFunction3(set))
    __obj.asInstanceOf[XIdlArray]
  }
  
  @scala.inline
  implicit class XIdlArrayMutableBuilder[Self <: XIdlArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: (js.Any, Double) => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetLen(value: js.Any => Double): Self = StObject.set(x, "getLen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRealloc(value: (js.Array[_], Double) => Unit): Self = StObject.set(x, "realloc", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: (js.Array[_], Double, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
  }
}
