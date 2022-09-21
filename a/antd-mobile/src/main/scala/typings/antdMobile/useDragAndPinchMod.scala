package typings.antdMobile

import typings.std.Partial
import typings.useGestureReact.typesMod.ReactDOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDragAndPinchMod {
  
  @JSImport("antd-mobile/es/utils/use-drag-and-pinch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDragAndPinch[Config /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react.UserGestureConfig */ Any */](
    _handlers: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react.NativeHandlers<imported_react.EventTypes> */ Any
    ]
  ): (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragAndPinch")(_handlers.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit]
  inline def useDragAndPinch[Config /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react.UserGestureConfig */ Any */](
    _handlers: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_react.NativeHandlers<imported_react.EventTypes> */ Any
    ],
    _config: Config
  ): (js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDragAndPinch")(_handlers.asInstanceOf[js.Any], _config.asInstanceOf[js.Any])).asInstanceOf[(js.Function1[/* repeated */ Any, ReactDOMAttributes]) | Unit]
}
