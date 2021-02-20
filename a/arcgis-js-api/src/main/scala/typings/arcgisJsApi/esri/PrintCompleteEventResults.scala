package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintCompleteEventResults extends Object {
  
  var link: Collection[FileLink] = js.native
}
object PrintCompleteEventResults {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    link: Collection[FileLink],
    propertyIsEnumerable: PropertyKey => Boolean
  ): PrintCompleteEventResults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), link = link.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PrintCompleteEventResults]
  }
  
  @scala.inline
  implicit class PrintCompleteEventResultsMutableBuilder[Self <: PrintCompleteEventResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLink(value: Collection[FileLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
  }
}
