package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueValueGroupProperties extends StObject {
  
  /**
    * Specifies the classes (or unique categories) to group under a [heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueGroup.html#heading).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueGroup.html#classes)
    */
  var classes: js.UndefOr[js.Array[UniqueValueClassProperties]] = js.undefined
  
  /**
    * The heading to be displayed for the group of unique classes in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueGroup.html#heading)
    */
  var heading: js.UndefOr[String] = js.undefined
}
object UniqueValueGroupProperties {
  
  inline def apply(): UniqueValueGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueValueGroupProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniqueValueGroupProperties] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: js.Array[UniqueValueClassProperties]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: UniqueValueClassProperties*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
  }
}
