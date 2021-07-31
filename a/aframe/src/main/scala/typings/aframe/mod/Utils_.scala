package typings.aframe.mod

import typings.aframe.anon.CheckHasPositionalTracking
import typings.aframe.anon.GetComponentProperty
import typings.aframe.anon.IsCoordinate
import typings.aframe.anon.Parse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils_ extends StObject {
  
  var coordinates: IsCoordinate = js.native
  
  def deepEqual(a: js.Any, b: js.Any): Boolean = js.native
  
  var device: CheckHasPositionalTracking = js.native
  
  def diff(a: js.Object, b: js.Object): js.Object = js.native
  
  var entity: GetComponentProperty = js.native
  
  def extend(target: js.Object, source: js.Object*): js.Object = js.native
  
  def extendDeep(target: js.Object, source: js.Object*): js.Object = js.native
  
  var styleParser: Parse = js.native
  
  def throttle(tickFunction: js.Function0[Unit], minimumInterval: Double): js.Function2[/* t */ Double, /* dt */ Double, Unit] = js.native
  def throttle(tickFunction: js.Function0[Unit], minimumInterval: Double, optionalContext: js.Object): js.Function2[/* t */ Double, /* dt */ Double, Unit] = js.native
  
  def throttleTick(tickFunction: js.Function2[/* t */ Double, /* dt */ Double, Unit], minimumInterval: Double): js.Function2[/* t */ Double, /* dt */ Double, Unit] = js.native
  def throttleTick(
    tickFunction: js.Function2[/* t */ Double, /* dt */ Double, Unit],
    minimumInterval: Double,
    optionalContext: js.Object
  ): js.Function2[/* t */ Double, /* dt */ Double, Unit] = js.native
}
