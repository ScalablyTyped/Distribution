package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowseOptions[TObject] extends StObject {
  
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
  implicit class BrowseOptionsMutableBuilder[Self <: BrowseOptions[_], TObject] (val x: Self with BrowseOptions[TObject]) extends AnyVal {
    
    @scala.inline
    def setBatch(value: /* batch */ js.Array[TObject with ObjectWithObjectID] => _): Self = StObject.set(x, "batch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setShouldStop(value: /* response */ BrowseResponse[TObject] => Boolean): Self = StObject.set(x, "shouldStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldStopUndefined: Self = StObject.set(x, "shouldStop", js.undefined)
  }
}
