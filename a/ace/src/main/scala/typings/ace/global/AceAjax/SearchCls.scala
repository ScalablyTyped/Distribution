package typings.ace.global.AceAjax

import typings.ace.AceAjax.IEditSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AceAjax.Search")
@js.native
/**
  * Creates a new `Search` object. The following search options are avaliable:
  * - `needle`: The string or regular expression you're looking for
  * - `backwards`: Whether to search backwards from where cursor currently is. Defaults to `false`.
  * - `wrap`: Whether to wrap the search back to the beginning when it hits the end. Defaults to `false`.
  * - `caseSensitive`: Whether the search ought to be case-sensitive. Defaults to `false`.
  * - `wholeWord`: Whether the search matches only on whole words. Defaults to `false`.
  * - `range`: The [[Range]] to search within. Set this to `null` for the whole document
  * - `regExp`: Whether the search is a regular expression or not. Defaults to `false`.
  * - `start`: The starting [[Range]] or cursor position to begin the search
  * - `skipCurrent`: Whether or not to include the current line in the search. Default to `false`.
  **/
class SearchCls ()
  extends typings.ace.AceAjax.Search {
  /**
    * Searches for `options.needle`. If found, this method returns the [[Range `Range`]] where the text first occurs. If `options.backwards` is `true`, the search goes backwards in the session.
    * @param session The session to search with
    **/
  /* CompleteClass */
  override def find(session: IEditSession): typings.ace.AceAjax.Range = js.native
  /**
    * Searches for all occurances `options.needle`. If found, this method returns an array of [[Range `Range`s]] where the text first occurs. If `options.backwards` is `true`, the search goes backwards in the session.
    * @param session The session to search with
    **/
  /* CompleteClass */
  override def findAll(session: IEditSession): js.Array[typings.ace.AceAjax.Range] = js.native
  /**
    * [Returns an object containing all the search options.]{: #Search.getOptions}
    **/
  /* CompleteClass */
  override def getOptions(): js.Any = js.native
  /**
    * Searches for `options.needle` in `input`, and, if found, replaces it with `replacement`.
    * @param input The text to search in
    * @param replacement The replacing text
    * + (String): If `options.regExp` is `true`, this function returns `input` with the replacement already made. Otherwise, this function just returns `replacement`.<br/>
    * If `options.needle` was not found, this function returns `null`.
    **/
  /* CompleteClass */
  override def replace(input: String, replacement: String): String = js.native
  /**
    * Sets the search options via the `options` parameter.
    * @param options An object containing all the new search properties
    **/
  /* CompleteClass */
  override def set(options: js.Any): typings.ace.AceAjax.Search = js.native
  /**
    * Sets the search options via the `options` parameter.
    * @param An object containing all the search propertie
    **/
  /* CompleteClass */
  override def setOptions(An: js.Any): Unit = js.native
}

