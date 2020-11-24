package typings.asymmetrikLeafletD3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "internal")
@js.native
object internal extends js.Object {
  
  type DoubleObjectContextCallback = js.Function3[/* d */ js.Any, /* t */ js.Any, /* th */ js.Any, Unit]
  
  type ObjectCallback = ObjectFn[Unit]
  
  type ObjectContextCallback = js.Function2[/* d */ js.Any, /* t */ js.Any, Unit]
  
  type ObjectFn[T] = js.Function1[/* d */ js.Any, T]
  
  type ObjectIndexFn[T] = js.Function2[/* d */ js.Any, /* i */ Double, T]
  
  type SimpleCallback = SimpleFn[Unit]
  
  type SimpleFn[T] = js.Function0[T]
  
  type UnionCallback = SimpleCallback | ObjectCallback | ObjectContextCallback | DoubleObjectContextCallback
  
  type UnionFn[T] = SimpleFn[T] | ObjectFn[T] | ObjectIndexFn[T]
}
