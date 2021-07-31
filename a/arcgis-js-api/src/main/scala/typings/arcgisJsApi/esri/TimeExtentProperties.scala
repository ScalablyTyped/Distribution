package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeExtentProperties extends StObject {
  
  /**
    * The end time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end)
    */
  var end: js.UndefOr[DateProperties] = js.undefined
  
  /**
    * The start time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start)
    */
  var start: js.UndefOr[DateProperties] = js.undefined
}
object TimeExtentProperties {
  
  @scala.inline
  def apply(): TimeExtentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeExtentProperties]
  }
  
  @scala.inline
  implicit class TimeExtentPropertiesMutableBuilder[Self <: TimeExtentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: DateProperties): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: DateProperties): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
