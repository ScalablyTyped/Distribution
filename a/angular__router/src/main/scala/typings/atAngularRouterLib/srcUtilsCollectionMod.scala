package typings
package atAngularRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/utils/collection", JSImport.Namespace)
@js.native
object srcUtilsCollectionMod extends js.Object {
  def and(bools: js.Array[scala.Boolean]): scala.Boolean = js.native
  def flatten[T](arr: js.Array[js.Array[T]]): js.Array[T] = js.native
  def forEach[K, V](
    map: org.scalablytyped.runtime.StringDictionary[V],
    callback: js.Function2[/* v */ V, /* k */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def last[T](a: js.Array[T]): T | scala.Null = js.native
  def shallowEqual(
    a: org.scalablytyped.runtime.StringDictionary[js.Any],
    b: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Boolean = js.native
  def shallowEqualArrays(a: js.Array[_], b: js.Array[_]): scala.Boolean = js.native
  def waitForMap[A, B](
    obj: org.scalablytyped.runtime.StringDictionary[A],
    fn: js.Function2[/* k */ java.lang.String, /* a */ A, rxjsLib.rxjsMod.Observable[B]]
  ): rxjsLib.rxjsMod.Observable[org.scalablytyped.runtime.StringDictionary[B]] = js.native
  def wrapIntoObservable[T](value: T): rxjsLib.rxjsMod.Observable[T | atAngularCoreLib.atAngularCoreMod.NgModuleFactory[T]] = js.native
  def wrapIntoObservable[T](value: atAngularCoreLib.atAngularCoreMod.NgModuleFactory[T]): rxjsLib.rxjsMod.Observable[T | atAngularCoreLib.atAngularCoreMod.NgModuleFactory[T]] = js.native
  def wrapIntoObservable[T](value: js.Promise[T]): rxjsLib.rxjsMod.Observable[T | atAngularCoreLib.atAngularCoreMod.NgModuleFactory[T]] = js.native
  def wrapIntoObservable[T](value: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[T | atAngularCoreLib.atAngularCoreMod.NgModuleFactory[T]] = js.native
}

