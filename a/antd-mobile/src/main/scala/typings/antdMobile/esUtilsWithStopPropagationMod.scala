package typings.antdMobile

import typings.antdMobile.antdMobileStrings.click
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsWithStopPropagationMod {
  
  @JSImport("antd-mobile/es/utils/with-stop-propagation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withStopPropagation(events: js.Array[PropagationEvent], element: ReactElement): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("withStopPropagation")(events.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  type PropagationEvent = click
}
