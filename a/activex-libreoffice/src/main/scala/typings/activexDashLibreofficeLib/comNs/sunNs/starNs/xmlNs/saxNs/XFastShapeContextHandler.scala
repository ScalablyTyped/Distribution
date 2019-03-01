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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DocumentProperties")(DocumentProperties)
    __obj.updateDynamic("DrawPage")(DrawPage)
    __obj.updateDynamic("MediaDescriptor")(MediaDescriptor)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("RelationFragmentPath")(RelationFragmentPath)
    __obj.updateDynamic("Shape")(Shape)
    __obj.updateDynamic("StartToken")(StartToken)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("characters")(characters)
    __obj.updateDynamic("createFastChildContext")(createFastChildContext)
    __obj.updateDynamic("createUnknownChildContext")(createUnknownChildContext)
    __obj.updateDynamic("endFastElement")(endFastElement)
    __obj.updateDynamic("endUnknownElement")(endUnknownElement)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("startFastElement")(startFastElement)
    __obj.updateDynamic("startUnknownElement")(startUnknownElement)
    __obj.asInstanceOf[XFastShapeContextHandler]
  }
}

