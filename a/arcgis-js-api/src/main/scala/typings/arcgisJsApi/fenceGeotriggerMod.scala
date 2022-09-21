package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FenceGeotrigger
import typings.arcgisJsApi.esri.FenceGeotriggerConstructor
import typings.arcgisJsApi.esri.FenceGeotriggerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fenceGeotriggerMod extends Shortcut {
  
  @JSImport("esri/webdoc/geotriggersInfo/FenceGeotrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FenceGeotriggerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/geotriggersInfo/FenceGeotrigger", JSImport.Namespace)
  @js.native
  /**
    * A condition which monitors the dynamic elements of the geotrigger feed for enter/exit against the fences defined by the Fence Parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html)
    */
  open class Class ()
    extends StObject
       with FenceGeotrigger {
    def this(properties: FenceGeotriggerProperties) = this()
  }
  
  type _To = js.Object & FenceGeotriggerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fenceGeotriggerMod.foo` */
  override def _to: js.Object & FenceGeotriggerConstructor = ^
}
