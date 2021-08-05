package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentAnnotationsMod {
  
  @JSImport("ag-grid/dist/lib/widgets/componentAnnotations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Listener(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Listener")().asInstanceOf[js.Function]
  inline def Listener(eventName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Listener")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def Method(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Method")().asInstanceOf[js.Function]
  inline def Method(eventName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("Method")(eventName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def QuerySelector(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("QuerySelector")().asInstanceOf[js.Function]
  inline def QuerySelector(selector: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("QuerySelector")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def RefSelector(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("RefSelector")().asInstanceOf[js.Function]
  inline def RefSelector(ref: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("RefSelector")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
