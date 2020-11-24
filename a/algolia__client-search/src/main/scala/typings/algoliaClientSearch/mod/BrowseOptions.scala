package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowseOptions[TObject] extends js.Object {
  
  /**
    * The callback called for each batch of objects.
    */
  val batch: js.UndefOr[js.Function1[/* batch */ js.Array[TObject with ObjectWithObjectID], _]] = js.native
  
  /**
    * The callback called to determine if the browse should stop. By
    * default this checks whether there's any more content to get.
    */
  val shouldStop: js.UndefOr[js.Function1[/* response */ BrowseResponse[TObject], Boolean]] = js.native
}
object BrowseOptions {
  
  @scala.inline
  def apply[TObject](): BrowseOptions[TObject] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowseOptions[TObject]]
  }
  
  @scala.inline
  implicit class BrowseOptionsOps[Self <: BrowseOptions[_], TObject] (val x: Self with BrowseOptions[TObject]) extends AnyVal {
    
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
    def setBatch(value: /* batch */ js.Array[TObject with ObjectWithObjectID] => _): Self = this.set("batch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    
    @scala.inline
    def setShouldStop(value: /* response */ BrowseResponse[TObject] => Boolean): Self = this.set("shouldStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteShouldStop: Self = this.set("shouldStop", js.undefined)
  }
}
