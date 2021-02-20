package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to a read-write layer of configuration data for a given component and entity.
  * @since OOo 1.1.2
  */
@js.native
trait XUpdatableLayer extends XLayer {
  
  /**
    * Replaces the current layer with the layer given as input parameter.
    *
    * After the replacement has been performed, reading the layer will return the new content. Some implementations may not support this, so after an update
    * {@link XLayer.readData()} may fail.
    * @param aNewLayer replacement layer
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs during the replacement.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the layer contains invalid data.
    */
  def replaceWith(aNewLayer: XLayer): Unit = js.native
}
object XUpdatableLayer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    readData: XLayerHandler => Unit,
    release: () => Unit,
    replaceWith: XLayer => Unit
  ): XUpdatableLayer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1(readData), release = js.Any.fromFunction0(release), replaceWith = js.Any.fromFunction1(replaceWith))
    __obj.asInstanceOf[XUpdatableLayer]
  }
  
  @scala.inline
  implicit class XUpdatableLayerMutableBuilder[Self <: XUpdatableLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplaceWith(value: XLayer => Unit): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
  }
}
