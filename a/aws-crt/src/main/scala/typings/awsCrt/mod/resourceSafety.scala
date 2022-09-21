package typings.awsCrt.mod

import typings.awsCrt.resourceSafetyMod.ResourceSafe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceSafety {
  
  @JSImport("aws-crt", "resource_safety")
  @js.native
  val ^ : js.Any = js.native
  
  inline def `using`[T /* <: ResourceSafe */](resource: T, func: js.Function1[/* resource */ T, Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(resource.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
