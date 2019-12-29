package typings.antDashDesignDashPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAuthorizedMod {
  import typings.antDashDesignDashPro.libAuthorizedAuthorizedRouteMod.authority
  import typings.react.reactMod.ClassicComponentClass
  import typings.react.reactMod.ComponentClass
  import typings.react.reactMod.ComponentState
  import typings.react.reactMod.ReactNode
  import typings.react.reactMod.StatelessComponent

  type IReactComponent[P] = StatelessComponent[P] | (ComponentClass[P, ComponentState]) | ClassicComponentClass[P]
  type Secured = js.Function2[
    /* authority */ authority, 
    /* error */ js.UndefOr[ReactNode], 
    js.Function1[/* target */ IReactComponent[js.Any], IReactComponent[js.Any]]
  ]
  type check = js.Function3[
    /* authority */ authority, 
    /* target */ IReactComponent[js.Any], 
    /* Exception */ IReactComponent[js.Any], 
    IReactComponent[js.Any]
  ]
}
