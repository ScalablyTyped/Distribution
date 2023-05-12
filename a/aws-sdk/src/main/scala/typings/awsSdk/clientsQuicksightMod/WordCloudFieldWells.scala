package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordCloudFieldWells extends StObject {
  
  /**
    * The aggregated field wells of a word cloud.
    */
  var WordCloudAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.WordCloudAggregatedFieldWells] = js.undefined
}
object WordCloudFieldWells {
  
  inline def apply(): WordCloudFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordCloudFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WordCloudFieldWells] (val x: Self) extends AnyVal {
    
    inline def setWordCloudAggregatedFieldWells(value: WordCloudAggregatedFieldWells): Self = StObject.set(x, "WordCloudAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setWordCloudAggregatedFieldWellsUndefined: Self = StObject.set(x, "WordCloudAggregatedFieldWells", js.undefined)
  }
}
