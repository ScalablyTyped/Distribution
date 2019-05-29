package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esFormInterfaceMod {
  type ConnectedComponentClass[C /* <: reactLib.reactMod.ComponentType[_] */, P] = (reactLib.reactMod.ComponentClass[
    reactLib.reactMod.Global.JSXNs.LibraryManagedAttributes[C, P], 
    reactLib.reactMod.ComponentState
  ]) with (NonReactStatics[C, js.Object]) with antdLib.Anon_WrappedComponent[C]
  type FormWrappedProps[TOwnProps /* <: antdLib.esFormFormMod.WrappedFormInternalProps[_] */] = js.Function1[
    /* component */ js.Any, 
    ConnectedComponentClass[js.Any, antdLib.esUnderscoreUtilTypeMod.Omit[TOwnProps, java.lang.String]]
  ]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ antdLib.antdLibStrings.Matching with js.Any
  type NonReactStatics[S /* <: reactLib.reactMod.ComponentType[_] */, C /* <: org.scalablytyped.runtime.StringDictionary[antdLib.antdLibNumbers.`true`] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in std.Exclude<keyof S, S extends {  displayName? :string,  readonly $$typeof  :symbol, None (props : react.react.ComponentPropsWithRef<any>): react.react.ReactElement<any> | null,  readonly type  :any}? '$$typeof' | 'compare' | 'defaultProps' | 'displayName' | 'propTypes' | 'type' | keyof C : S extends react.react.ForwardRefExoticComponent<any>? '$$typeof' | 'render' | 'defaultProps' | 'displayName' | 'propTypes' | keyof C : 'childContextTypes' | 'contextType' | 'contextTypes' | 'defaultProps' | 'displayName' | 'getDefaultProps' | 'getDerivedStateFromError' | 'getDerivedStateFromProps' | 'mixins' | 'propTypes' | 'type' | 'name' | 'length' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity' | keyof C> ]: S[key]}
    */ antdLib.antdLibStrings.NonReactStatics with S
}
