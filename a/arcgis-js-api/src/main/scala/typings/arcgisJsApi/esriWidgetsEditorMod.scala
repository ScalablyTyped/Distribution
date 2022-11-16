package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Editor
import typings.arcgisJsApi.esri.EditorProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsEditorMod {
  
  @JSImport("esri/widgets/Editor", JSImport.Namespace)
  @js.native
  /**
    * This widget provides an out-of-the-box editing experience to help streamline the editing experience within a web application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html)
    */
  open class ^ ()
    extends StObject
       with Editor {
    def this(properties: EditorProperties) = this()
  }
}
