package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives notification of sax document events from a {@link XFastParser} .
  * @see XFastDocumentHandler
  */
trait XFastShapeContextHandler extends XFastContextHandler {
  var DocumentProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentProperties
  var DrawPage: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage
  var MediaDescriptor: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  var Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  var RelationFragmentPath: java.lang.String
  var Shape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape
  var StartToken: scala.Double
}

object XFastShapeContextHandler {
  @scala.inline
  def apply(
    DocumentProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.XDocumentProperties,
    DrawPage: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPage,
    MediaDescriptor: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    RelationFragmentPath: java.lang.String,
    Shape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    StartToken: scala.Double,
    acquire: () => scala.Unit,
    characters: java.lang.String => scala.Unit,
    createFastChildContext: (scala.Double, XFastAttributeList) => XFastContextHandler,
    createUnknownChildContext: (java.lang.String, java.lang.String, XFastAttributeList) => XFastContextHandler,
    endFastElement: scala.Double => scala.Unit,
    endUnknownElement: (java.lang.String, java.lang.String) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    startFastElement: (scala.Double, XFastAttributeList) => scala.Unit,
    startUnknownElement: (java.lang.String, java.lang.String, XFastAttributeList) => scala.Unit
  ): XFastShapeContextHandler = {
    val __obj = js.Dynamic.literal(DocumentProperties = DocumentProperties, DrawPage = DrawPage, MediaDescriptor = MediaDescriptor, Model = Model, Position = Position, RelationFragmentPath = RelationFragmentPath, Shape = Shape, StartToken = StartToken, acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), createFastChildContext = js.Any.fromFunction2(createFastChildContext), createUnknownChildContext = js.Any.fromFunction3(createUnknownChildContext), endFastElement = js.Any.fromFunction1(endFastElement), endUnknownElement = js.Any.fromFunction2(endUnknownElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startFastElement = js.Any.fromFunction2(startFastElement), startUnknownElement = js.Any.fromFunction3(startUnknownElement))
  
    __obj.asInstanceOf[XFastShapeContextHandler]
  }
}

