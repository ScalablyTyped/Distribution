package typings
package arcgisDashJsDashApiLib.esriCoreCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/core/Collection", JSImport.Namespace)
@js.native
class namespaced[T] ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T] {
  def this(values: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[_]) = this()
  def this(values: js.Array[_]) = this()
}

/* static members */
@JSImport("esri/core/Collection", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def isCollection[T](value: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T]): /* is arcgis-js-api.__esri.Collection<T> */ scala.Boolean = js.native
  def isCollection[T](value: js.Any): /* is arcgis-js-api.__esri.Collection<T> */ scala.Boolean = js.native
  def ofType[T /* <: Base */, Base](`type`: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Constructor[T]): org.scalablytyped.runtime.Instantiable1[
    /* items */ js.UndefOr[
      /* items */ js.Array[T] | arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T] | arcgisDashJsDashApiLib.Anon_Items[T]
    ], 
    arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T]
  ] = js.native
  def ofType[T /* <: Base */, Base](`type`: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Types[T, Base]): org.scalablytyped.runtime.Instantiable1[
    /* items */ js.UndefOr[
      /* items */ js.Array[T] | arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T] | arcgisDashJsDashApiLib.Anon_Items[T]
    ], 
    arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Collection[T]
  ] = js.native
}

