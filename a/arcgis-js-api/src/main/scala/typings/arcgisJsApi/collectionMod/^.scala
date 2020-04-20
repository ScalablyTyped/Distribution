package typings.arcgisJsApi.collectionMod

import org.scalablytyped.runtime.Instantiable1
import typings.arcgisJsApi.AnonItems
import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.Constructor
import typings.arcgisJsApi.esri.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/core/Collection", JSImport.Namespace)
@js.native
class ^[T] () extends Collection[T] {
  def this(values: js.Array[_]) = this()
  def this(values: Collection[_]) = this()
}

@JSImport("esri/core/Collection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isCollection[T](value: js.Any): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = js.native
  def isCollection[T](value: Collection[T]): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = js.native
  def ofType[T /* <: Base */, Base](`type`: Constructor[T]): Instantiable1[js.UndefOr[js.Array[T] | Collection[T] | (AnonItems[T, Base])], Collection[T]] = js.native
  def ofType[T /* <: Base */, Base](`type`: Types[T, Base]): Instantiable1[js.UndefOr[js.Array[T] | Collection[T] | (AnonItems[T, Base])], Collection[T]] = js.native
}

