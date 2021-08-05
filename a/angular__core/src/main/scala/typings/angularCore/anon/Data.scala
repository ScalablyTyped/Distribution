package typings.angularCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ViewEncapsulation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: StringDictionary[js.Array[js.Any]]
  
  var encapsulation: ViewEncapsulation
  
  var styles: js.Array[String | js.Array[js.Any]]
}
object Data {
  
  inline def apply(
    data: StringDictionary[js.Array[js.Any]],
    encapsulation: ViewEncapsulation,
    styles: js.Array[String | js.Array[js.Any]]
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: StringDictionary[js.Array[js.Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[String | js.Array[js.Any]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: (String | js.Array[js.Any])*): Self = StObject.set(x, "styles", js.Array(value :_*))
  }
}
