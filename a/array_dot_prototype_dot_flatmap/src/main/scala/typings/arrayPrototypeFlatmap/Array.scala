package typings.arrayPrototypeFlatmap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array[T] extends StObject {
  
  def flatMap[U, R /* <: js.UndefOr[js.Object] */](
    fn: js.ThisFunction3[/* this */ R, /* x */ T, /* index */ Double, /* array */ this.type, ReadonlyArray[U]]
  ): Array[U] = js.native
  def flatMap[U, R /* <: js.UndefOr[js.Object] */](
    fn: js.ThisFunction3[/* this */ R, /* x */ T, /* index */ Double, /* array */ this.type, ReadonlyArray[U]],
    thisArg: R
  ): Array[U] = js.native
}
