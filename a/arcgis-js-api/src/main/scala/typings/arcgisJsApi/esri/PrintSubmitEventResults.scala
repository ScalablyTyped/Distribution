package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintSubmitEventResults
  extends StObject
     with Object {
  
  var link: Collection[FileLink]
}
object PrintSubmitEventResults {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    link: Collection[FileLink],
    propertyIsEnumerable: PropertyKey => Boolean
  ): PrintSubmitEventResults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), link = link.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PrintSubmitEventResults]
  }
  
  @scala.inline
  implicit class PrintSubmitEventResultsMutableBuilder[Self <: PrintSubmitEventResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLink(value: Collection[FileLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
