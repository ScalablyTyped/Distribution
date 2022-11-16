package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintCompleteEventResults extends StObject {
  
  var link: Collection[FileLink]
}
object PrintCompleteEventResults {
  
  inline def apply(link: Collection[FileLink]): PrintCompleteEventResults = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCompleteEventResults]
  }
  
  extension [Self <: PrintCompleteEventResults](x: Self) {
    
    inline def setLink(value: Collection[FileLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
