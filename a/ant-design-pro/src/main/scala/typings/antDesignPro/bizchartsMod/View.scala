package typings.antDesignPro.bizchartsMod

import typings.antDesignPro.anon.ReadonlyIViewProps
import typings.bizcharts.anon.PreInteractions
import typings.bizcharts.interfaceMod.IViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ant-design-pro/lib/Charts/bizcharts", "View")
@js.native
open class View protected ()
  extends typings.bizcharts.mod.View {
  def this(props: ReadonlyIViewProps) = this()
  def this(props: IViewProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: IViewProps, context: Any) = this()
}
/* static members */
object View {
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "View")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "View.defaultProps")
  @js.native
  def defaultProps: PreInteractions = js.native
  inline def defaultProps_=(x: PreInteractions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
