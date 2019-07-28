package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XDocumentProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XDrawPage
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.XShape
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives notification of sax document events from a {@link XFastParser} .
  * @see XFastDocumentHandler
  */
trait XFastShapeContextHandler extends XFastContextHandler {
  var DocumentProperties: XDocumentProperties
  var DrawPage: XDrawPage
  var MediaDescriptor: SafeArray[PropertyValue]
  var Model: XModel
  var Position: Point
  var RelationFragmentPath: String
  var Shape: XShape
  var StartToken: Double
}

object XFastShapeContextHandler {
  @scala.inline
  def apply(
    DocumentProperties: XDocumentProperties,
    DrawPage: XDrawPage,
    MediaDescriptor: SafeArray[PropertyValue],
    Model: XModel,
    Position: Point,
    RelationFragmentPath: String,
    Shape: XShape,
    StartToken: Double,
    acquire: () => Unit,
    characters: String => Unit,
    createFastChildContext: (Double, XFastAttributeList) => XFastContextHandler,
    createUnknownChildContext: (String, String, XFastAttributeList) => XFastContextHandler,
    endFastElement: Double => Unit,
    endUnknownElement: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startFastElement: (Double, XFastAttributeList) => Unit,
    startUnknownElement: (String, String, XFastAttributeList) => Unit
  ): XFastShapeContextHandler = {
    val __obj = js.Dynamic.literal(DocumentProperties = DocumentProperties, DrawPage = DrawPage, MediaDescriptor = MediaDescriptor, Model = Model, Position = Position, RelationFragmentPath = RelationFragmentPath, Shape = Shape, StartToken = StartToken, acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), createFastChildContext = js.Any.fromFunction2(createFastChildContext), createUnknownChildContext = js.Any.fromFunction3(createUnknownChildContext), endFastElement = js.Any.fromFunction1(endFastElement), endUnknownElement = js.Any.fromFunction2(endUnknownElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startFastElement = js.Any.fromFunction2(startFastElement), startUnknownElement = js.Any.fromFunction3(startUnknownElement))
  
    __obj.asInstanceOf[XFastShapeContextHandler]
  }
}

