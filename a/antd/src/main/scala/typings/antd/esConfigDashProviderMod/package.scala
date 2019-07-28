package typings.antd

import typings.react.reactMod.ClassicComponentClass
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esConfigDashProviderMod {
  type IReactComponent[P] = StatelessComponent[P] | (ComponentClass[P, ComponentState]) | ClassicComponentClass[P]
}
