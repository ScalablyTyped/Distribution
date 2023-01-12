package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamMap extends StObject {
  
  /**
    * Retrieves a single value for a parameter.
    * @param name The parameter name.
    * @return The parameter's single value,
    * or the first value if the parameter has multiple values,
    * or `null` when there is no such parameter.
    */
  def get(name: String): String | Null
  
  /**
    * Retrieves multiple values for a parameter.
    * @param name The parameter name.
    * @return An array containing one or more values,
    * or an empty array if there is no such parameter.
    *
    */
  def getAll(name: String): js.Array[String]
  
  /**
    * Reports whether the map contains a given parameter.
    * @param name The parameter name.
    * @returns True if the map contains the given parameter, false otherwise.
    */
  def has(name: String): Boolean
  
  /** Names of the parameters in the map. */
  val keys: js.Array[String]
}
object ParamMap {
  
  inline def apply(
    get: String => String | Null,
    getAll: String => js.Array[String],
    has: String => Boolean,
    keys: js.Array[String]
  ): ParamMap = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), has = js.Any.fromFunction1(has), keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParamMap] (val x: Self) extends AnyVal {
    
    inline def setGet(value: String => String | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAll(value: String => js.Array[String]): Self = StObject.set(x, "getAll", js.Any.fromFunction1(value))
    
    inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
