package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobInfoProgress extends StObject {
  
  /**
    * Progress message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#progress)
    */
  var message: String
  
  /**
    * Progress percentage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#progress)
    */
  var percent: Double
}
object JobInfoProgress {
  
  inline def apply(message: String, percent: Double): JobInfoProgress = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobInfoProgress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobInfoProgress] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
