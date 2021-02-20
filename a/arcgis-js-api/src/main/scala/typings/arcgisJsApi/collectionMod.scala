package typings.arcgisJsApi

import org.scalablytyped.runtime.Instantiable1
import typings.arcgisJsApi.anon.Items
import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.Constructor
import typings.arcgisJsApi.esri.Types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object collectionMod {
  
  @JSImport("esri/core/Collection", JSImport.Namespace)
  @js.native
  class ^[T] () extends Collection[T] {
    def this(values: js.Array[_]) = this()
    def this(values: Collection[_]) = this()
  }
  
  @JSImport("esri/core/Collection", "isCollection")
  @js.native
  def isCollection[T](value: js.Any): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = js.native
  @JSImport("esri/core/Collection", "isCollection")
  @js.native
  def isCollection[T](value: Collection[T]): /* is arcgis-js-api.__esri.Collection<T> */ Boolean = js.native
  
  @JSImport("esri/core/Collection", "ofType")
  @js.native
  def ofType[T /* <: Base */, Base](`type`: Constructor[T]): Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | Collection[T] | (Items[T, Base])], 
    Collection[T]
  ] = js.native
  @JSImport("esri/core/Collection", "ofType")
  @js.native
  def ofType[T /* <: Base */, Base](`type`: Types[T, Base]): Instantiable1[
    /* items */ js.UndefOr[js.Array[T] | Collection[T] | (Items[T, Base])], 
    Collection[T]
  ] = js.native
}
