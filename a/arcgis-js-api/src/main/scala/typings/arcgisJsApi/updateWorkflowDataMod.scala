package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.UpdateWorkflowData
import typings.arcgisJsApi.esri.UpdateWorkflowDataConstructor
import typings.arcgisJsApi.esri.UpdateWorkflowDataProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateWorkflowDataMod extends Shortcut {
  
  @JSImport("esri/widgets/Editor/UpdateWorkflowData", JSImport.Namespace)
  @js.native
  val ^ : js.Object & UpdateWorkflowDataConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Editor/UpdateWorkflowData", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with UpdateWorkflowData {
    def this(properties: UpdateWorkflowDataProperties) = this()
  }
  
  type _To = js.Object & UpdateWorkflowDataConstructor
  
  /* This means you don't have to write `^`, but can instead just say `updateWorkflowDataMod.foo` */
  override def _to: js.Object & UpdateWorkflowDataConstructor = ^
}
