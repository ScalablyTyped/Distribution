package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ServerInfo
import typings.arcgisJsApi.esri.ServerInfoConstructor
import typings.arcgisJsApi.esri.ServerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverInfoMod extends Shortcut {
  
  @JSImport("esri/identity/ServerInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ServerInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/identity/ServerInfo", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with ServerInfo {
    def this(properties: ServerInfoProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & ServerInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `serverInfoMod.foo` */
  override def _to: js.Object & ServerInfoConstructor = ^
}
