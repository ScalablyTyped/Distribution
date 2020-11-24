package typings.aureliaDependencyInjection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "autoinject")
@js.native
object autoinject extends js.Object {
  
  def apply[TPotential](): (js.Function1[/* target */ Injectable, Unit]) | Unit = js.native
  def apply[TPotential](potentialTarget: TPotential): (js.Function1[/* target */ Injectable, Unit]) | Unit = js.native
}
