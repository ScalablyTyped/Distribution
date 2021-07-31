package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ViewState
import typings.arcgisJsApi.esri.ViewStateConstructor
import typings.arcgisJsApi.esri.ViewStateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewStateMod extends Shortcut {
  
  @JSImport("esri/views/2d/ViewState", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ViewStateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/2d/ViewState", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with ViewState {
    def this(properties: ViewStateProperties) = this()
    
    /**
      * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): js.Any = js.native
  }
  
  type _To = js.Object & ViewStateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `viewStateMod.foo` */
  override def _to: js.Object & ViewStateConstructor = ^
}
