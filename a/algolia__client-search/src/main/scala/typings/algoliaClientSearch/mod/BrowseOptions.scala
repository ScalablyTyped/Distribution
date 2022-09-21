package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowseOptions[TObject] extends StObject {
  
  /**
    * The callback called for each batch of objects.
    */
  val batch: js.UndefOr[js.Function1[/* batch */ js.Array[TObject & ObjectWithObjectID], Any]] = js.undefined
  
  /**
    * The callback called to determine if the browse should stop. By
    * default this checks whether there's any more content to get.
    */
  val shouldStop: js.UndefOr[js.Function1[/* response */ BrowseResponse[TObject], Boolean]] = js.undefined
}
object BrowseOptions {
  
  inline def apply[TObject](): BrowseOptions[TObject] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowseOptions[TObject]]
  }
  
  extension [Self <: BrowseOptions[?], TObject](x: Self & BrowseOptions[TObject]) {
    
    inline def setBatch(value: /* batch */ js.Array[TObject & ObjectWithObjectID] => Any): Self = StObject.set(x, "batch", js.Any.fromFunction1(value))
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setShouldStop(value: /* response */ BrowseResponse[TObject] => Boolean): Self = StObject.set(x, "shouldStop", js.Any.fromFunction1(value))
    
    inline def setShouldStopUndefined: Self = StObject.set(x, "shouldStop", js.undefined)
  }
}
