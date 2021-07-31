package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocatorProperties
  extends StObject
     with TaskProperties {
  
  /**
    * The spatial reference of the output geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
}
object LocatorProperties {
  
  @scala.inline
  def apply(): LocatorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocatorProperties]
  }
  
  @scala.inline
  implicit class LocatorPropertiesMutableBuilder[Self <: LocatorProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
  }
}
