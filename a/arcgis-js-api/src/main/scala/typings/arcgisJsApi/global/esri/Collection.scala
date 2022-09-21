package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.Instantiable1
import typings.arcgisJsApi.anon.Items
import typings.arcgisJsApi.esri.CollectionPropertiesBase
import typings.arcgisJsApi.esri.Constructor
import typings.arcgisJsApi.esri.Types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Collection")
@js.native
open class Collection[T] ()
  extends StObject
     with typings.arcgisJsApi.esri.Collection[T] {
  def this(values: js.Array[Any]) = this()
  def this(values: typings.arcgisJsApi.esri.Collection[Any]) = this()
  def this(values: CollectionPropertiesBase[Any]) = this()
}
/* static members */
object Collection {
  
  @JSGlobal("__esri.Collection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCollection[T](value: Any): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is arcgis-js-api.__esri.Collection<T> */ Boolean]
  inline def isCollection[T](value: typings.arcgisJsApi.esri.Collection[T]): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is arcgis-js-api.__esri.Collection<T> */ Boolean]
  
  inline def ofType[T /* <: Base */, Base](`type`: Constructor[T]): Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | typings.arcgisJsApi.esri.Collection[T] | (Items[T, Base])], 
    typings.arcgisJsApi.esri.Collection[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | typings.arcgisJsApi.esri.Collection[T] | (Items[T, Base])], 
    typings.arcgisJsApi.esri.Collection[T]
  ]]
  inline def ofType[T /* <: Base */, Base](`type`: Types[T, Base]): Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | typings.arcgisJsApi.esri.Collection[T] | (Items[T, Base])], 
    typings.arcgisJsApi.esri.Collection[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | typings.arcgisJsApi.esri.Collection[T] | (Items[T, Base])], 
    typings.arcgisJsApi.esri.Collection[T]
  ]]
}
