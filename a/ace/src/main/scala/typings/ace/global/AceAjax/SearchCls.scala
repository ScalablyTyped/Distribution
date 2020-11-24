package typings.ace.global.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends typings.ace.AceAjax.Search
