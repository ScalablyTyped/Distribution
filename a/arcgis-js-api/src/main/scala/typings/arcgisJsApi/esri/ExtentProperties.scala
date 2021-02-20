package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtentProperties extends GeometryProperties {
  
  /**
    * The maximum possible `m` value in an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmax)
    */
  var mmax: js.UndefOr[Double] = js.native
  
  /**
    * The minimum possible `m` value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmin)
    */
  var mmin: js.UndefOr[Double] = js.native
  
  /**
    * The maximum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmax)
    */
  var xmax: js.UndefOr[Double] = js.native
  
  /**
    * The minimum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmin)
    */
  var xmin: js.UndefOr[Double] = js.native
  
  /**
    * The maximum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymax)
    */
  var ymax: js.UndefOr[Double] = js.native
  
  /**
    * The minimum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymin)
    */
  var ymin: js.UndefOr[Double] = js.native
  
  /**
    * The maximum possible `z`, or elevation, value in an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmax)
    */
  var zmax: js.UndefOr[Double] = js.native
  
  /**
    * The minimum possible `z`, or elevation, value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmin)
    */
  var zmin: js.UndefOr[Double] = js.native
}
object ExtentProperties {
  
  @scala.inline
  def apply(): ExtentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtentProperties]
  }
  
  @scala.inline
  implicit class ExtentPropertiesMutableBuilder[Self <: ExtentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMmax(value: Double): Self = StObject.set(x, "mmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMmaxUndefined: Self = StObject.set(x, "mmax", js.undefined)
    
    @scala.inline
    def setMmin(value: Double): Self = StObject.set(x, "mmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMminUndefined: Self = StObject.set(x, "mmin", js.undefined)
    
    @scala.inline
    def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmaxUndefined: Self = StObject.set(x, "xmax", js.undefined)
    
    @scala.inline
    def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXminUndefined: Self = StObject.set(x, "xmin", js.undefined)
    
    @scala.inline
    def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYmaxUndefined: Self = StObject.set(x, "ymax", js.undefined)
    
    @scala.inline
    def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYminUndefined: Self = StObject.set(x, "ymin", js.undefined)
    
    @scala.inline
    def setZmax(value: Double): Self = StObject.set(x, "zmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZmaxUndefined: Self = StObject.set(x, "zmax", js.undefined)
    
    @scala.inline
    def setZmin(value: Double): Self = StObject.set(x, "zmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZminUndefined: Self = StObject.set(x, "zmin", js.undefined)
  }
}
