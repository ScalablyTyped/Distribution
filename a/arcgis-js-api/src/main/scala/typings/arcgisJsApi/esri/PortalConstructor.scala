package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalConstructor
  extends /**
  * The Portal class is part of the [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/) that provides a way to build applications that work with content from [ArcGIS Online](https://www.arcgis.com/home/) or an [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/). [ArcGIS Enterprise](https://enterprise.arcgis.com/en/portal/) is software from Esri that customers can deploy either on-premises or in the cloud. [ArcGIS Online](https://www.arcgis.com/home/) is Esri's Software as a Service offering that represents GIS as a Service and is implemented using the same technology as ArcGIS Enterprise.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html)
  */
Instantiable0[Portal]
     with Instantiable1[/* properties */ PortalProperties, Portal] {
  /**
    * A new `Portal` instance is created the first time this method is called. The URL from [config.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) is automatically used for this instance. This instance is then cached and used for any subsequent calls to this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#getDefault)
    *
    *
    */
  def getDefault(): Portal = js.native
}

