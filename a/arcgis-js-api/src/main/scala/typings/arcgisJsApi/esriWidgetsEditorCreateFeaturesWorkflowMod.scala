package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CreateFeaturesWorkflow
import typings.arcgisJsApi.esri.CreateFeaturesWorkflowConstructor
import typings.arcgisJsApi.esri.CreateFeaturesWorkflowProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsEditorCreateFeaturesWorkflowMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/CreateFeaturesWorkflow", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CreateFeaturesWorkflowConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/CreateFeaturesWorkflow", JSImport.Namespace)
  @js.native
  /**
    * A read-only class containing the logic used when creating features using the [Editor](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateFeaturesWorkflow.html)
    */
  open class Class ()
    extends StObject
       with CreateFeaturesWorkflow {
    def this(properties: CreateFeaturesWorkflowProperties) = this()
  }
  
  type _To = js.Object & CreateFeaturesWorkflowConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsEditorCreateFeaturesWorkflowMod.foo` */
  override def _to: js.Object & CreateFeaturesWorkflowConstructor = ^
}
