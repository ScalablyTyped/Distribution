package typings.antd.mod

import typings.antd.anon.PartialCascaderState
import typings.antd.cascaderMod.CascaderProps
import typings.antd.cascaderMod.CascaderState
import typings.antd.cascaderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Cascader")
@js.native
class Cascader protected () extends default {
  def this(props: CascaderProps) = this()
}
object Cascader {
  
  @JSImport("antd", "Cascader")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  object defaultProps {
    
    @JSImport("antd", "Cascader.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd", "Cascader.defaultProps.allowClear")
    @js.native
    def allowClear: Boolean = js.native
    inline def allowClear_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowClear")(x.asInstanceOf[js.Any])
    
    @JSImport("antd", "Cascader.defaultProps.bordered")
    @js.native
    def bordered: Boolean = js.native
    inline def bordered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bordered")(x.asInstanceOf[js.Any])
    
    @JSImport("antd", "Cascader.defaultProps.disabled")
    @js.native
    def disabled: Boolean = js.native
    inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    
    @JSImport("antd", "Cascader.defaultProps.options")
    @js.native
    def options: js.Array[scala.Nothing] = js.native
    inline def options_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
    
    @JSImport("antd", "Cascader.defaultProps.transitionName")
    @js.native
    def transitionName: String = js.native
    inline def transitionName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitionName")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  inline def getDerivedStateFromProps(nextProps: CascaderProps, hasPrevProps: CascaderState): PartialCascaderState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], hasPrevProps.asInstanceOf[js.Any])).asInstanceOf[PartialCascaderState]
}
