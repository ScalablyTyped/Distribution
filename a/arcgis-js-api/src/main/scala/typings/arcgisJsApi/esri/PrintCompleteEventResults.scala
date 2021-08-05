package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintCompleteEventResults
  extends StObject
     with Object {
  
  var link: Collection[FileLink]
}
object PrintCompleteEventResults {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    link: Collection[FileLink],
    propertyIsEnumerable: PropertyKey => Boolean
  ): PrintCompleteEventResults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), link = link.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PrintCompleteEventResults]
  }
  
  extension [Self <: PrintCompleteEventResults](x: Self) {
    
    inline def setLink(value: Collection[FileLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
