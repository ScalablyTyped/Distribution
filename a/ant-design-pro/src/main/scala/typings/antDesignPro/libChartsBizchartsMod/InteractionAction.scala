package typings.antDesignPro.libChartsBizchartsMod

import typings.antvG2.libInterfaceMod.IInteractionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Action 的基类
  */
/* note: abstract class */ @JSImport("ant-design-pro/lib/Charts/bizcharts", "InteractionAction")
@js.native
open class InteractionAction[T] protected ()
  extends typings.bizcharts.mod.InteractionAction[T] {
  def this(context: IInteractionContext) = this()
  def this(context: IInteractionContext, cfg: T) = this()
}
