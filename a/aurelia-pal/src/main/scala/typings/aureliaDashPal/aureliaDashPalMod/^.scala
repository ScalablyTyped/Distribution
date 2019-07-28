package typings.aureliaDashPal.aureliaDashPalMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-pal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DOM: Dom = js.native
  val FEATURE: Feature = js.native
  val PLATFORM: Platform = js.native
  var isInitialized: js.Any = js.native
  def AggregateError(message: String): Error = js.native
  def AggregateError(message: String, innerError: Error): Error = js.native
  def AggregateError(message: String, innerError: Error, skipIfAlreadyAggregate: Boolean): Error = js.native
  def initializePAL(callback: js.Function3[/* platform */ Platform, /* feature */ Feature, /* dom */ Dom, Unit]): Unit = js.native
  def reset(): js.Any = js.native
}

