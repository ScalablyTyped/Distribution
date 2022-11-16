package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileLink extends StObject {
  
  /**
    * The location of the FileLink element in the array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#FileLink)
    */
  var count: Double
  
  /**
    * The [error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) from the Print widget, if any.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#FileLink)
    */
  var error: String
  
  /**
    * The [file](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#format) type of the print-out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#FileLink)
    */
  var `extension`: String
  
  /**
    * The [fileName](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#fileName) or [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#title) of the print-out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#FileLink)
    */
  var name: String
  
  /**
    * The state of the print-out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#FileLink)
    */
  var state: String
  
  /**
    * The [printServiceUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#printServiceUrl) of the print-out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print.html#FileLink)
    */
  var url: String
}
object FileLink {
  
  inline def apply(count: Double, error: String, `extension`: String, name: String, state: String, url: String): FileLink = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLink]
  }
  
  extension [Self <: FileLink](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
