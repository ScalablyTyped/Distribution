package typings.ahooks

import typings.ahooks.libUtilsDomTargetMod.BasicTarget
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseClickAwayMod {
  
  @JSImport("ahooks/lib/useClickAway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Event */](onClickAway: js.Function1[/* event */ T, Unit], target: js.Array[BasicTarget[Element]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T /* <: Event */](
    onClickAway: js.Function1[/* event */ T, Unit],
    target: js.Array[BasicTarget[Element]],
    eventName: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T /* <: Event */](
    onClickAway: js.Function1[/* event */ T, Unit],
    target: js.Array[BasicTarget[Element]],
    eventName: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T /* <: Event */](onClickAway: js.Function1[/* event */ T, Unit], target: BasicTarget[Element]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T /* <: Event */](onClickAway: js.Function1[/* event */ T, Unit], target: BasicTarget[Element], eventName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T /* <: Event */](
    onClickAway: js.Function1[/* event */ T, Unit],
    target: BasicTarget[Element],
    eventName: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(onClickAway.asInstanceOf[js.Any], target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
