package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows importing a layer into a {@link Backend}
  * @since OOo 1.1.2
  */
@js.native
trait XLayerImporter extends XInterface {
  
  /**
    * gets the target backend for importing.
    * @returns the {@link Backend} into which layers are imported by {@link XLayerImporter.importLayer()} .
    */
  var TargetBackend: XBackend = js.native
  
  /**
    * gets the target backend for importing.
    * @returns the {@link Backend} into which layers are imported by {@link XLayerImporter.importLayer()} .
    */
  def getTargetBackend(): XBackend = js.native
  
  /**
    * Imports the layer given into the backend.
    *
    * This method imports data for the current entity of the backend.
    * @param aLayer a layer whose data will be imported into the backend
    * @see com.sun.star.configuration.backend.XBackend.getOwnUpdateHandler()
    * @throws com::sun::star::lang::NullPointerException if the layer passed is `NULL` or no backend is available.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the layer passed is invalid
    * @throws com::sun::star::lang::IllegalArgumentException if the layer passed is for a component that doesn't exist in the backend
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the backend or source layer.
    */
  def importLayer(aLayer: XLayer): Unit = js.native
  
  /**
    * Imports the layer given into the backend for a given entity.
    *
    * This method imports data for the current entity of the backend.
    * @param aLayer a layer whose data will be imported into the backend
    * @param aEntity a entity into whose data the layer will be imported
    * @see com.sun.star.configuration.backend.XBackend.getUpdateHandler()
    * @throws com::sun::star::lang::NullPointerException if the layer passed is `NULL` or no backend is available.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the layer passed is invalid
    * @throws com::sun::star::lang::IllegalArgumentException if the layer passed is for a component that doesn't exist in the backend or if the entity doesn't
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the backend or source layer.
    */
  def importLayerForEntity(aLayer: XLayer, aEntity: String): Unit = js.native
  
  /**
    * sets the target backend for importing.
    * @param aBackend a {@link Backend} into which layers should be imported by {@link XLayerImporter.importLayer()} .
    * @throws com::sun::star::lang::NullPointerException if the backend passed is `NULL` .
    */
  def setTargetBackend(aBackend: XBackend): Unit = js.native
}
object XLayerImporter {
  
  @scala.inline
  def apply(
    TargetBackend: XBackend,
    acquire: () => Unit,
    getTargetBackend: () => XBackend,
    importLayer: XLayer => Unit,
    importLayerForEntity: (XLayer, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTargetBackend: XBackend => Unit
  ): XLayerImporter = {
    val __obj = js.Dynamic.literal(TargetBackend = TargetBackend.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTargetBackend = js.Any.fromFunction0(getTargetBackend), importLayer = js.Any.fromFunction1(importLayer), importLayerForEntity = js.Any.fromFunction2(importLayerForEntity), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTargetBackend = js.Any.fromFunction1(setTargetBackend))
    __obj.asInstanceOf[XLayerImporter]
  }
  
  @scala.inline
  implicit class XLayerImporterOps[Self <: XLayerImporter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTargetBackend(value: XBackend): Self = this.set("TargetBackend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTargetBackend(value: () => XBackend): Self = this.set("getTargetBackend", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImportLayer(value: XLayer => Unit): Self = this.set("importLayer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImportLayerForEntity(value: (XLayer, String) => Unit): Self = this.set("importLayerForEntity", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetTargetBackend(value: XBackend => Unit): Self = this.set("setTargetBackend", js.Any.fromFunction1(value))
  }
}
