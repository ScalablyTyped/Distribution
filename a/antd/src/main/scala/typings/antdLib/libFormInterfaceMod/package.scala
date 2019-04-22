package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormInterfaceMod {
  type ConnectedComponentClass[C /* <: reactLib.reactMod.ComponentType[_] */, P] = (reactLib.reactMod.ComponentClass[
    reactLib.reactMod.Global.JSXNs.LibraryManagedAttributes[C, P], 
    reactLib.reactMod.ComponentState
  ]) with (hoistDashNonDashReactDashStaticsLib.hoistDashNonDashReactDashStaticsMod.NonReactStatics[C, js.Object]) with antdLib.Anon_WrappedComponent[C]
  type FormWrappedProps[TOwnProps /* <: antdLib.libFormFormMod.FormComponentProps[_] */] = js.Function1[
    /* component */ reactLib.reactMod.ComponentType[js.Object], 
    ConnectedComponentClass[
      reactLib.reactMod.ComponentType[js.Object], 
      antdLib.libUnderscoreUtilTypeMod.Omit[TOwnProps, java.lang.String]
    ]
  ]
}
