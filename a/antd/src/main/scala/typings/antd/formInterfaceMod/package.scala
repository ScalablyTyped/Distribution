package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formInterfaceMod {
  type ConnectedComponentClass[C /* <: typings.react.mod.ComponentType[_] */, P] = (typings.react.mod.ComponentClass[
    typings.react.mod._Global_.JSX.LibraryManagedAttributes[C, P], 
    typings.react.mod.ComponentState
  ]) with (typings.antd.formInterfaceMod.NonReactStatics[C, js.Object]) with typings.antd.AnonWrappedComponent[C]
  type FormWrappedProps[TOwnProps /* <: typings.antd.formFormMod.WrappedFormInternalProps[_] */] = js.Function1[
    /* component */ js.Any, 
    typings.antd.formInterfaceMod.ConnectedComponentClass[js.Any, typings.antd.typeMod.Omit[TOwnProps, java.lang.String]]
  ]
  type GetProps[C] = js.Any
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.antd.antdStrings.Matching with js.Any
  type NonReactStatics[S /* <: typings.react.mod.ComponentType[_] */, C /* <: org.scalablytyped.runtime.StringDictionary[typings.antd.antdBooleans.`true`] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in std.Exclude<keyof S, S extends / * Inlined react.react.MemoExoticComponent<any> * /
  {  displayName? :string,  readonly $$typeof  :symbol, None (props : react.react.ComponentPropsWithRef<any>): react.react.ReactElement | null,  readonly type  :any}? '$$typeof' | 'compare' | 'defaultProps' | 'displayName' | 'propTypes' | 'type' | keyof C : S extends react.react.ForwardRefExoticComponent<any>? '$$typeof' | 'render' | 'defaultProps' | 'displayName' | 'propTypes' | keyof C : 'childContextTypes' | 'contextType' | 'contextTypes' | 'defaultProps' | 'displayName' | 'getDefaultProps' | 'getDerivedStateFromError' | 'getDerivedStateFromProps' | 'mixins' | 'propTypes' | 'type' | 'name' | 'length' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity' | keyof C> ]: S[key]}
    */ typings.antd.antdStrings.NonReactStatics with S
}
