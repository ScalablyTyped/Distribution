package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkOptions extends StObject {
  
  /**
    * The number of objects per batch.
    */
  val batchSize: js.UndefOr[Double] = js.undefined
}
object ChunkOptions {
  
  inline def apply(): ChunkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkOptions]
  }
  
  extension [Self <: ChunkOptions](x: Self) {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
  }
}
