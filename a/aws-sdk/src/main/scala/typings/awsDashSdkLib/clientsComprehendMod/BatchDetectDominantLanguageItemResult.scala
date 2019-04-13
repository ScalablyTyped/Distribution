package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDetectDominantLanguageItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
  /**
    * One or more DominantLanguage objects describing the dominant languages in the document.
    */
  var Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined
}

object BatchDetectDominantLanguageItemResult {
  @scala.inline
  def apply(Index: js.UndefOr[Integer] = js.undefined, Languages: ListOfDominantLanguages = null): BatchDetectDominantLanguageItemResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Index)) __obj.updateDynamic("Index")(Index)
    if (Languages != null) __obj.updateDynamic("Languages")(Languages)
    __obj.asInstanceOf[BatchDetectDominantLanguageItemResult]
  }
}

