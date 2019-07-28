package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs.XEmbeddedObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs.XGraphic
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents something that provides an embedded object. */
trait XEmbeddedObjectSupplier2 extends XEmbeddedObjectSupplier {
  /** allows to control the aspect of the object. */
  var Aspect: Double
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  val ExtendedControlOverEmbeddedObject: XEmbeddedObject
  /** allows to get the replacement image of the object. */
  var ReplacementGraphic: XGraphic
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  def getExtendedControlOverEmbeddedObject(): XEmbeddedObject
}

object XEmbeddedObjectSupplier2 {
  @scala.inline
  def apply(
    Aspect: Double,
    EmbeddedObject: XComponent,
    ExtendedControlOverEmbeddedObject: XEmbeddedObject,
    ReplacementGraphic: XGraphic,
    acquire: () => Unit,
    getEmbeddedObject: () => XComponent,
    getExtendedControlOverEmbeddedObject: () => XEmbeddedObject,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEmbeddedObjectSupplier2 = {
    val __obj = js.Dynamic.literal(Aspect = Aspect, EmbeddedObject = EmbeddedObject, ExtendedControlOverEmbeddedObject = ExtendedControlOverEmbeddedObject, ReplacementGraphic = ReplacementGraphic, acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), getExtendedControlOverEmbeddedObject = js.Any.fromFunction0(getExtendedControlOverEmbeddedObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEmbeddedObjectSupplier2]
  }
}

