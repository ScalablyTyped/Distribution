package typings.atlaskitDsLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseControlledMod {
  
  @JSImport("@atlaskit/ds-lib/dist/types/hooks/use-controlled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): js.Tuple2[T, js.Function1[/* newValue */ T, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[T, js.Function1[/* newValue */ T, Unit]]]
  inline def default[T](propValue: T): js.Tuple2[T, js.Function1[/* newValue */ T, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, js.Function1[/* newValue */ T, Unit]]]
  inline def default[T](propValue: T, getDefaultPropValue: js.Function0[T]): js.Tuple2[T, js.Function1[/* newValue */ T, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(propValue.asInstanceOf[js.Any], getDefaultPropValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, js.Function1[/* newValue */ T, Unit]]]
  inline def default[T](propValue: Unit, getDefaultPropValue: js.Function0[T]): js.Tuple2[T, js.Function1[/* newValue */ T, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(propValue.asInstanceOf[js.Any], getDefaultPropValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, js.Function1[/* newValue */ T, Unit]]]
}
