package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * imports data into a configuration layer.
  *
  * The configuration changes are read from a {@link XLayer} and stored into a {@link Backend} .
  * @since OOo 1.1.2
  */
trait Importer
  extends XLayerImporter
     with XInitialization

object Importer {
  @scala.inline
  def apply(
    TargetBackend: XBackend,
    acquire: () => Unit,
    getTargetBackend: () => XBackend,
    importLayer: XLayer => Unit,
    importLayerForEntity: (XLayer, String) => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTargetBackend: XBackend => Unit
  ): Importer = {
    val __obj = js.Dynamic.literal(TargetBackend = TargetBackend.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTargetBackend = js.Any.fromFunction0(getTargetBackend), importLayer = js.Any.fromFunction1(importLayer), importLayerForEntity = js.Any.fromFunction2(importLayerForEntity), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTargetBackend = js.Any.fromFunction1(setTargetBackend))
    __obj.asInstanceOf[Importer]
  }
}

