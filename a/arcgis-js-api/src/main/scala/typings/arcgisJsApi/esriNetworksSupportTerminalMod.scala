package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Terminal
import typings.arcgisJsApi.esri.TerminalConstructor
import typings.arcgisJsApi.esri.TerminalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriNetworksSupportTerminalMod extends Shortcut {
  
  @JSImport("esri/networks/support/Terminal", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TerminalConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/networks/support/Terminal", JSImport.Namespace)
  @js.native
  /**
    * A device feature can be assigned a terminal configuration, which could have one or more terminals.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-Terminal.html)
    */
  open class Class ()
    extends StObject
       with Terminal {
    def this(properties: TerminalProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TerminalConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriNetworksSupportTerminalMod.foo` */
  override def _to: js.Object & TerminalConstructor = ^
}
