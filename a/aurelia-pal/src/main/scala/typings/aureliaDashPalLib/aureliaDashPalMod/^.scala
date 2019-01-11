package typings
package aureliaDashPalLib.aureliaDashPalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-pal", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DOM: aureliaDashPalLib.aureliaDashPalMod.Dom = js.native
  val FEATURE: aureliaDashPalLib.aureliaDashPalMod.Feature = js.native
  val PLATFORM: aureliaDashPalLib.aureliaDashPalMod.Platform = js.native
  var isInitialized: js.Any = js.native
  def AggregateError(message: java.lang.String): stdLib.Error = js.native
  def AggregateError(message: java.lang.String, innerError: stdLib.Error): stdLib.Error = js.native
  def AggregateError(message: java.lang.String, innerError: stdLib.Error, skipIfAlreadyAggregate: scala.Boolean): stdLib.Error = js.native
  def initializePAL(
    callback: js.Function3[
      /* platform */ aureliaDashPalLib.aureliaDashPalMod.Platform, 
      /* feature */ aureliaDashPalLib.aureliaDashPalMod.Feature, 
      /* dom */ aureliaDashPalLib.aureliaDashPalMod.Dom, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def reset(): js.Any = js.native
}

