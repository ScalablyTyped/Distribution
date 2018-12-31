package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Search extends js.Object {
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
  def getOptions(): js.Any
  /**
    * Searches for `options.needle` in `input`, and, if found, replaces it with `replacement`.
    * @param input The text to search in
    * @param replacement The replacing text
    * + (String): If `options.regExp` is `true`, this function returns `input` with the replacement already made. Otherwise, this function just returns `replacement`.<br/>
    * If `options.needle` was not found, this function returns `null`.
    **/
  def replace(input: java.lang.String, replacement: java.lang.String): java.lang.String
  /**
    * Sets the search options via the `options` parameter.
    * @param options An object containing all the new search properties
    **/
  def set(options: js.Any): Search
  /**
    * Sets the search options via the `options` parameter.
    * @param An object containing all the search propertie
    **/
  def setOptions(An: js.Any): scala.Unit
}

