package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableInlineVisualization extends StObject {
  
  /**
    * The configuration of the inline visualization of the data bars within a chart.
    */
  var DataBars: js.UndefOr[DataBarsOptions] = js.undefined
}
object TableInlineVisualization {
  
  inline def apply(): TableInlineVisualization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableInlineVisualization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableInlineVisualization] (val x: Self) extends AnyVal {
    
    inline def setDataBars(value: DataBarsOptions): Self = StObject.set(x, "DataBars", value.asInstanceOf[js.Any])
    
    inline def setDataBarsUndefined: Self = StObject.set(x, "DataBars", js.undefined)
  }
}
