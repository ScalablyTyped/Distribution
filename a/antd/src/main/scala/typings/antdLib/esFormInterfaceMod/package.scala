package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esFormInterfaceMod {
  type ConnectedComponentClass[C /* <: reactLib.reactMod.ComponentType[_] */, P] = (reactLib.reactMod.ComponentClass[
    reactLib.reactMod.Global.JSXNs.LibraryManagedAttributes[C, P], 
    reactLib.reactMod.ComponentState
  ]) with (hoistDashNonDashReactDashStaticsLib.hoistDashNonDashReactDashStaticsMod.NonReactStatics[C, js.Object]) with antdLib.Anon_WrappedComponent[C]
  type FormWrappedProps[TOwnProps /* <: antdLib.esFormFormMod.WrappedFormInternalProps[_] */] = js.Function1[
    /* component */ js.Any, 
    ConnectedComponentClass[js.Any, antdLib.esUnderscoreUtilTypeMod.Omit[TOwnProps, java.lang.String]]
  ]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: DecorationTargetProps[P] | InjectedProps[P]}
    */ antdLib.antdLibStrings.Matching with js.Any
}
