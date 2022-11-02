package typings.antd

import typings.antd.libStepsMod.StepProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsUseLegacyItemsMod {
  
  @JSImport("antd/lib/steps/useLegacyItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Array[StepProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[StepProps]]
  inline def default(items: js.Array[StepProps]): js.Array[StepProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[StepProps]]
  inline def default(items: js.Array[StepProps], children: ReactNode): js.Array[StepProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Array[StepProps]]
  inline def default(items: Unit, children: ReactNode): js.Array[StepProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Array[StepProps]]
}
