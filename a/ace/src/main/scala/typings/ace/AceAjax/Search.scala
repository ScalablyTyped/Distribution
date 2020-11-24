package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search extends js.Object {
  
  /**
    * Searches for `options.needle`. If found, this method returns the [[Range `Range`]] where the text first occurs. If `options.backwards` is `true`, the search goes backwards in the session.
    * @param session The session to search with
    **/
  def find(session: IEditSession): Range = js.native
  
  /**
    * Searches for all occurances `options.needle`. If found, this method returns an array of [[Range `Range`s]] where the text first occurs. If `options.backwards` is `true`, the search goes backwards in the session.
    * @param session The session to search with
    **/
  def findAll(session: IEditSession): js.Array[Range] = js.native
  
  /**
    * [Returns an object containing all the search options.]{: #Search.getOptions}
    **/
  def getOptions(): js.Any = js.native
  
  /**
    * Searches for `options.needle` in `input`, and, if found, replaces it with `replacement`.
    * @param input The text to search in
    * @param replacement The replacing text
    * + (String): If `options.regExp` is `true`, this function returns `input` with the replacement already made. Otherwise, this function just returns `replacement`.<br/>
    * If `options.needle` was not found, this function returns `null`.
    **/
  def replace(input: String, replacement: String): String = js.native
  
  /**
    * Sets the search options via the `options` parameter.
    * @param options An object containing all the new search properties
    **/
  def set(options: js.Any): Search = js.native
  
  /**
    * Sets the search options via the `options` parameter.
    * @param An object containing all the search propertie
    **/
  def setOptions(An: js.Any): Unit = js.native
}
object Search {
  
  @scala.inline
  def apply(
    find: IEditSession => Range,
    findAll: IEditSession => js.Array[Range],
    getOptions: () => js.Any,
    replace: (String, String) => String,
    set: js.Any => Search,
    setOptions: js.Any => Unit
  ): Search = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), findAll = js.Any.fromFunction1(findAll), getOptions = js.Any.fromFunction0(getOptions), replace = js.Any.fromFunction2(replace), set = js.Any.fromFunction1(set), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Search]
  }
  
  @scala.inline
  implicit class SearchOps[Self <: Search] (val x: Self) extends AnyVal {
    
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
    def setFind(value: IEditSession => Range): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindAll(value: IEditSession => js.Array[Range]): Self = this.set("findAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOptions(value: () => js.Any): Self = this.set("getOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplace(value: (String, String) => String): Self = this.set("replace", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSet(value: js.Any => Search): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: js.Any => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
  }
}
