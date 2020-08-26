package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides read access to the data contained in a layer.
  * @since OOo 1.1.2
  */
@js.native
trait XLayer extends XInterface {
  /**
    * describes the contents of the layer to an {@link XLayerHandler} .
    * @param aHandler Handler object that will receive calls describing the contents of the layer
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XLayerHandler} .
    */
  def readData(aHandler: XLayerHandler): Unit = js.native
}

object XLayer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    readData: XLayerHandler => Unit,
    release: () => Unit
  ): XLayer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1(readData), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLayer]
  }
  @scala.inline
  implicit class XLayerOps[Self <: XLayer] (val x: Self) extends AnyVal {
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
    def setReadData(value: XLayerHandler => Unit): Self = this.set("readData", js.Any.fromFunction1(value))
  }
  
}

