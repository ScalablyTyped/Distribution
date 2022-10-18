package typings.antDesignReactNative.mod

import typings.antDesignReactNative.libSwitchSwitchMod.SwitchProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Switch {
  
  inline def apply(
    hasPrefixClsCheckedDefaultCheckedDisabledColorLoadingCheckedChildrenUnCheckedChildrenOnPressOnChangeTrackColorThumbColorThumbTintColorRestProps: SwitchProps
  ): Element = ^.asInstanceOf[js.Dynamic].apply(hasPrefixClsCheckedDefaultCheckedDisabledColorLoadingCheckedChildrenUnCheckedChildrenOnPressOnChangeTrackColorThumbColorThumbTintColorRestProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@ant-design/react-native", "Switch")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/react-native", "Switch.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
