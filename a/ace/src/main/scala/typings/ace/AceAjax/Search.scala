package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Search extends StObject {
  
  /**
    * Searches for `options.needle`. If found, this method returns the [[Range `Range`]] where the text first occurs. If `options.backwards` is `true`, the search goes backwards in the session.
    * @param session The session to search with
    **/
  def find(session: IEditSession): Range
  
  /**
    * Searches for all occurances `options.needle`. If found, this method returns an array of [[Range `Range`s]] where the text first occurs. If `options.backwards` is `true`, the search goes backwards in the session.
    * @param session The session to search with
    **/
  def findAll(session: IEditSession): js.Array[Range]
  
  /**
    * [Returns an object containing all the search options.]{: #Search.getOptions}
    **/
  def getOptions(): Any
  
  /**
    * Searches for `options.needle` in `input`, and, if found, replaces it with `replacement`.
    * @param input The text to search in
    * @param replacement The replacing text
    * + (String): If `options.regExp` is `true`, this function returns `input` with the replacement already made. Otherwise, this function just returns `replacement`.<br/>
    * If `options.needle` was not found, this function returns `null`.
    **/
  def replace(input: String, replacement: String): String
  
  /**
    * Sets the search options via the `options` parameter.
    * @param options An object containing all the new search properties
    **/
  def set(options: Any): Search
  
  /**
    * Sets the search options via the `options` parameter.
    * @param An object containing all the search propertie
    **/
  def setOptions(An: Any): Unit
}
object Search {
  
  inline def apply(
    find: IEditSession => Range,
    findAll: IEditSession => js.Array[Range],
    getOptions: () => Any,
    replace: (String, String) => String,
    set: Any => Search,
    setOptions: Any => Unit
  ): Search = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), getOptions = js.Any.fromFunction0(getOptions), replace = js.Any.fromFunction2(replace), set = js.Any.fromFunction1(set), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Search]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Search] (val x: Self) extends AnyVal {
    
    inline def setFind(value: IEditSession => Range): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindAll(value: IEditSession => js.Array[Range]): Self = StObject.set(x, "findAll", js.Any.fromFunction1(value))
    
    inline def setGetOptions(value: () => Any): Self = StObject.set(x, "getOptions", js.Any.fromFunction0(value))
    
    inline def setReplace(value: (String, String) => String): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    
    inline def setSet(value: Any => Search): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSetOptions(value: Any => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
  }
}
