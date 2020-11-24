package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalConstructor
  extends /**
  * The Portal class is part of the [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/) that provides a way to build applications that work with content from [ArcGIS Online](https://www.arcgis.com/home/) or an [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html)
  */
Instantiable0[Portal]
     with Instantiable1[/* properties */ PortalProperties, Portal] {
  
  /**
    * A new `Portal` instance is created the first time this method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#getDefault)
    */
  def getDefault(): Portal = js.native
}
