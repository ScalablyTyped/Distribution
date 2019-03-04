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
  var MediaDescriptor: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
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
    MediaDescriptor: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    RelationFragmentPath: java.lang.String,
    Shape: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape,
    StartToken: scala.Double,
    acquire: js.Function0[scala.Unit],
    characters: js.Function1[java.lang.String, scala.Unit],
    createFastChildContext: js.Function2[scala.Double, XFastAttributeList, XFastContextHandler],
    createUnknownChildContext: js.Function3[java.lang.String, java.lang.String, XFastAttributeList, XFastContextHandler],
    endFastElement: js.Function1[scala.Double, scala.Unit],
    endUnknownElement: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    startFastElement: js.Function2[scala.Double, XFastAttributeList, scala.Unit],
    startUnknownElement: js.Function3[java.lang.String, java.lang.String, XFastAttributeList, scala.Unit]
  ): XFastShapeContextHandler = {
    val __obj = js.Dynamic.literal(DocumentProperties = DocumentProperties, DrawPage = DrawPage, MediaDescriptor = MediaDescriptor, Model = Model, Position = Position, RelationFragmentPath = RelationFragmentPath, Shape = Shape, StartToken = StartToken, acquire = acquire, characters = characters, createFastChildContext = createFastChildContext, createUnknownChildContext = createUnknownChildContext, endFastElement = endFastElement, endUnknownElement = endUnknownElement, queryInterface = queryInterface, release = release, startFastElement = startFastElement, startUnknownElement = startUnknownElement)
  
    __obj.asInstanceOf[XFastShapeContextHandler]
  }
}

