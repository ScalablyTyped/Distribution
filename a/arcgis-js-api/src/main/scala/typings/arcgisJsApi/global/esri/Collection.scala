package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.Instantiable1
import typings.arcgisJsApi.anon.Items
import typings.arcgisJsApi.esri.Constructor
import typings.arcgisJsApi.esri.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.Collection")
@js.native
class Collection[T] ()
  extends typings.arcgisJsApi.esri.Collection[T] {
  def this(values: js.Array[_]) = this()
  def this(values: typings.arcgisJsApi.esri.Collection[_]) = this()
}

/* static members */
@JSGlobal("__esri.Collection")
@js.native
object Collection extends js.Object {
  def isCollection[T](value: js.Any): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = js.native
  def isCollection[T](value: typings.arcgisJsApi.esri.Collection[T]): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = js.native
  def ofType[T /* <: Base */, Base](`type`: Constructor[T]): Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | typings.arcgisJsApi.esri.Collection[T] | (Items[T, Base])], 
    typings.arcgisJsApi.esri.Collection[T]
  ] = js.native
  def ofType[T /* <: Base */, Base](`type`: Types[T, Base]): Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | typings.arcgisJsApi.esri.Collection[T] | (Items[T, Base])], 
    typings.arcgisJsApi.esri.Collection[T]
  ] = js.native
}

