package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StringDictionary
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// This is what we return from the API. Hence the type is string[]
type Headers = StringDictionary[js.Array[String]]

type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, Double]

type ReadableByteStreamControllerCallback = js.Function1[/* controller */ ReadableByteStreamController, Unit | PromiseLike[Unit]]

type ReadableStreamDefaultControllerCallbackEW[R] = js.Function1[/* controller */ ReadableStreamDefaultControllerEW[R], Unit | PromiseLike[Unit]]

type ReadableStreamErrorCallback = js.Function1[/* reason */ Any, Unit | PromiseLike[Unit]]

type WritableStreamDefaultControllerCloseCallback = js.Function0[Unit | PromiseLike[Unit]]

type WritableStreamDefaultControllerStartCallback = js.Function1[/* controller */ WritableStreamDefaultController, Unit | PromiseLike[Unit]]

type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
/* chunk */ W, 
/* controller */ WritableStreamDefaultController, 
Unit | PromiseLike[Unit]]

type WritableStreamErrorCallback = js.Function1[/* reason */ Any, Unit | PromiseLike[Unit]]
