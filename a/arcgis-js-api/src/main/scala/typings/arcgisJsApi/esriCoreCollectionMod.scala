package typings.arcgisJsApi

import org.scalablytyped.runtime.Instantiable1
import typings.arcgisJsApi.anon.Items
import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.CollectionPropertiesBase
import typings.arcgisJsApi.esri.Constructor
import typings.arcgisJsApi.esri.Types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriCoreCollectionMod {
  
  @JSImport("esri/core/Collection", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with Collection[T] {
    def this(values: js.Array[Any]) = this()
    def this(values: Collection[Any]) = this()
    def this(values: CollectionPropertiesBase[Any]) = this()
  }
  @JSImport("esri/core/Collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCollection[T](value: Any): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is arcgis-js-api.__esri.Collection<T> */ Boolean]
  inline def isCollection[T](value: Collection[T]): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(value.asInstanceOf[js.Any]).asInstanceOf[/* is arcgis-js-api.__esri.Collection<T> */ Boolean]
  
  inline def ofType[T /* <: Base */, Base](`type`: Constructor[T]): Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | Collection[T] | (Items[T, Base])], 
    Collection[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | Collection[T] | (Items[T, Base])], 
    Collection[T]
  ]]
  inline def ofType[T /* <: Base */, Base](`type`: Types[T, Base]): Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | Collection[T] | (Items[T, Base])], 
    Collection[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | Collection[T] | (Items[T, Base])], 
    Collection[T]
  ]]
}
