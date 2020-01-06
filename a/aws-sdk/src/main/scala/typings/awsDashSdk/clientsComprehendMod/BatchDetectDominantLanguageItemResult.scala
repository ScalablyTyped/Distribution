package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDetectDominantLanguageItemResult extends js.Object {
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.native
  /**
    * One or more DominantLanguage objects describing the dominant languages in the document.
    */
  var Languages: js.UndefOr[ListOfDominantLanguages] = js.native
}

object BatchDetectDominantLanguageItemResult {
  @scala.inline
  def apply(Index: Int | scala.Double = null, Languages: ListOfDominantLanguages = null): BatchDetectDominantLanguageItemResult = {
    val __obj = js.Dynamic.literal()
    if (Index != null) __obj.updateDynamic("Index")(Index.asInstanceOf[js.Any])
    if (Languages != null) __obj.updateDynamic("Languages")(Languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetectDominantLanguageItemResult]
  }
}

