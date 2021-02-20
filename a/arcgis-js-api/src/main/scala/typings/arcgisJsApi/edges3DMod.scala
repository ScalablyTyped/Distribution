package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Edges3D
import typings.arcgisJsApi.esri.Edges3DConstructor
import typings.arcgisJsApi.esri.Edges3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object edges3DMod extends Shortcut {
  
  @JSImport("esri/symbols/edges/Edges3D", JSImport.Namespace)
  @js.native
  val ^ : Edges3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/edges/Edges3D", JSImport.Namespace)
  @js.native
  /**
    * Edges3D is the base class for symbol classes that add edge rendering visualization to existing symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-Edges3D.html)
    */
  class Class () extends Edges3D {
    def this(properties: Edges3DProperties) = this()
  }
  
  type _To = Edges3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `edges3DMod.foo` */
  override def _to: Edges3DConstructor = ^
}
