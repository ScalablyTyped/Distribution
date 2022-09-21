package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.UtilityNetworkTrace
import typings.arcgisJsApi.esri.UtilityNetworkTraceConstructor
import typings.arcgisJsApi.esri.UtilityNetworkTraceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityNetworkTraceMod extends Shortcut {
  
  @JSImport("esri/widgets/UtilityNetworkTrace", JSImport.Namespace)
  @js.native
  val ^ : js.Object & UtilityNetworkTraceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/UtilityNetworkTrace", JSImport.Namespace)
  @js.native
  /**
    * The UtilityNetworkTrace widget provides a way to run traces in a Utility Network based on connectivity or traversability from set input flags.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace.html)
    */
  open class Class ()
    extends StObject
       with UtilityNetworkTrace {
    def this(properties: UtilityNetworkTraceProperties) = this()
  }
  
  type _To = js.Object & UtilityNetworkTraceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `utilityNetworkTraceMod.foo` */
  override def _to: js.Object & UtilityNetworkTraceConstructor = ^
}
