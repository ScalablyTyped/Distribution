package typings.angularRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamMap extends js.Object {
  
  /**
    * Retrieves a single value for a parameter.
    * @param name The parameter name.
    * @return The parameter's single value,
    * or the first value if the parameter has multiple values,
    * or `null` when there is no such parameter.
    */
  def get(name: String): String | Null = js.native
  
  /**
    * Retrieves multiple values for a parameter.
    * @param name The parameter name.
    * @return An array containing one or more values,
    * or an empty array if there is no such parameter.
    *
    */
  def getAll(name: String): js.Array[String] = js.native
  
  /**
    * Reports whether the map contains a given parameter.
    * @param name The parameter name.
    * @returns True if the map contains the given parameter, false otherwise.
    */
  def has(name: String): Boolean = js.native
  
  /** Names of the parameters in the map. */
  val keys: js.Array[String] = js.native
}
object ParamMap {
  
  @scala.inline
  def apply(
    get: String => String | Null,
    getAll: String => js.Array[String],
    has: String => Boolean,
    keys: js.Array[String]
  ): ParamMap = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getAll = js.Any.fromFunction1(getAll), has = js.Any.fromFunction1(has), keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamMap]
  }
  
  @scala.inline
  implicit class ParamMapOps[Self <: ParamMap] (val x: Self) extends AnyVal {
    
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
    def setGet(value: String => String | Null): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAll(value: String => js.Array[String]): Self = this.set("getAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
  }
}
