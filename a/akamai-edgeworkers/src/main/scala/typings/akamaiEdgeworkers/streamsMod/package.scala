package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, Double]

type ReadableByteStreamControllerCallback = js.Function1[/* controller */ ReadableByteStreamController, Unit | js.Thenable[Unit]]

type ReadableStreamDefaultControllerCallback[R] = js.Function1[/* controller */ ReadableStreamDefaultController[R], Unit | js.Thenable[Unit]]

type ReadableStreamErrorCallback = js.Function1[/* reason */ Any, Unit | js.Thenable[Unit]]

type TransformerFlushCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | js.Promise[Unit]]

type TransformerStartCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | js.Promise[Unit]]

type TransformerTransformCallback[I, O] = js.Function2[
/* chunk */ I, 
/* controller */ TransformStreamDefaultController[O], 
Unit | js.Promise[Unit]]

type WritableStreamDefaultControllerCloseCallback = js.Function0[Unit | js.Thenable[Unit]]

type WritableStreamDefaultControllerStartCallback = js.Function1[/* controller */ WritableStreamDefaultController, Unit | js.Thenable[Unit]]

type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
/* chunk */ W, 
/* controller */ WritableStreamDefaultController, 
Unit | js.Thenable[Unit]]

type WritableStreamErrorCallback = js.Function1[/* reason */ Any, Unit | js.Thenable[Unit]]
