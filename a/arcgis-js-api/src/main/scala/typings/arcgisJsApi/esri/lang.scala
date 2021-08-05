package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait lang extends StObject {
  
  /**
    * Use this method to deeply clone objects with properties that are computed or have their own `clone()` method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-lang.html#clone)
    */
  def clone(elem: js.Any): js.Any
}
object lang {
  
  inline def apply(clone_ : js.Any => js.Any): lang = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.asInstanceOf[lang]
  }
  
  extension [Self <: lang](x: Self) {
    
    inline def setClone_(value: js.Any => js.Any): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
  }
}
