package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.antDesignReactNative.libPickerPickerMixinMod.ItemProps
import typings.antDesignReactNative.libPickerPickerTypesMod.PickerProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextType
  extends StObject
     with Instantiable1[(/* props */ PickerProps) | (/* props */ ReadonlyPickerProps), ComponentDidMount]
     with Instantiable2[/* props */ PickerProps, /* context */ Any, ComponentDidMount] {
  
  def Item(_props: ItemProps): Null = js.native
  
  var contextType: js.UndefOr[Context[Any]] = js.native
}
