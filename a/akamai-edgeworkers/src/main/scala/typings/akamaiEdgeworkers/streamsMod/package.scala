package typings.akamaiEdgeworkers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object streamsMod {
  
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, scala.Double]
  
  type ReadableByteStreamControllerCallback = js.Function1[
    /* controller */ typings.akamaiEdgeworkers.streamsMod.ReadableByteStreamController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type ReadableStreamDefaultControllerCallback[R] = js.Function1[
    /* controller */ typings.akamaiEdgeworkers.streamsMod.ReadableStreamDefaultController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type ReadableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  
  type WritableStreamDefaultControllerCloseCallback = js.Function0[scala.Unit | js.Thenable[scala.Unit]]
  
  type WritableStreamDefaultControllerStartCallback = js.Function1[
    /* controller */ typings.akamaiEdgeworkers.streamsMod.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ typings.akamaiEdgeworkers.streamsMod.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  
  type WritableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
}
