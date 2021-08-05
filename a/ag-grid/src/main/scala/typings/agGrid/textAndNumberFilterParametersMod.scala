package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAndNumberFilterParametersMod {
  
  trait TextAndNumberFilterParameters extends StObject {
    
    /** What to do when new rows are loaded. The default is to reset the filter, to keep it in line with 'set' filters. If you want to keep the selection, then set this value to 'keep'. */
    var newRowsAction: js.UndefOr[String] = js.undefined
  }
  object TextAndNumberFilterParameters {
    
    inline def apply(): TextAndNumberFilterParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAndNumberFilterParameters]
    }
    
    extension [Self <: TextAndNumberFilterParameters](x: Self) {
      
      inline def setNewRowsAction(value: String): Self = StObject.set(x, "newRowsAction", value.asInstanceOf[js.Any])
      
      inline def setNewRowsActionUndefined: Self = StObject.set(x, "newRowsAction", js.undefined)
    }
  }
}
