package typings.antd

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRenderPropValueMod {
  
  @JSImport("antd/lib/_util/getRenderPropValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRenderPropValue(): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPropValue")().asInstanceOf[ReactNode]
  inline def getRenderPropValue(propValue: RenderFunction): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPropValue")(propValue.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  inline def getRenderPropValue(propValue: ReactNode): ReactNode = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPropValue")(propValue.asInstanceOf[js.Any]).asInstanceOf[ReactNode]
  
  type RenderFunction = js.Function0[ReactNode]
}
