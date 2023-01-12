package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a utility method for deeply cloning objects with properties that are computed or have their own `clone()` method, such as [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-lang.html)
  */
trait lang extends StObject {
  
  /**
    * Use this method to deeply clone objects with properties that are computed or have their own `clone()` method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-lang.html#clone)
    */
  def clone(elem: Any): Any
}
object lang {
  
  inline def apply(clone_ : Any => Any): lang = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.asInstanceOf[lang]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: lang] (val x: Self) extends AnyVal {
    
    inline def setClone_(value: Any => Any): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
  }
}
