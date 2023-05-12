package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilledMapFieldWells extends StObject {
  
  /**
    * The aggregated field well of the filled map.
    */
  var FilledMapAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FilledMapAggregatedFieldWells] = js.undefined
}
object FilledMapFieldWells {
  
  inline def apply(): FilledMapFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilledMapFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilledMapFieldWells] (val x: Self) extends AnyVal {
    
    inline def setFilledMapAggregatedFieldWells(value: FilledMapAggregatedFieldWells): Self = StObject.set(x, "FilledMapAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setFilledMapAggregatedFieldWellsUndefined: Self = StObject.set(x, "FilledMapAggregatedFieldWells", js.undefined)
  }
}
