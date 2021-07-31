package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.document.XDocumentProperties
import typings.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typings.activexLibreoffice.com_.sun.star.drawing.XShape
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notification of sax document events from a {@link XFastParser} .
  * @see XFastDocumentHandler
  */
trait XFastShapeContextHandler
  extends StObject
     with XFastContextHandler {
  
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
    val __obj = js.Dynamic.literal(DocumentProperties = DocumentProperties.asInstanceOf[js.Any], DrawPage = DrawPage.asInstanceOf[js.Any], MediaDescriptor = MediaDescriptor.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], RelationFragmentPath = RelationFragmentPath.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any], StartToken = StartToken.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), createFastChildContext = js.Any.fromFunction2(createFastChildContext), createUnknownChildContext = js.Any.fromFunction3(createUnknownChildContext), endFastElement = js.Any.fromFunction1(endFastElement), endUnknownElement = js.Any.fromFunction2(endUnknownElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startFastElement = js.Any.fromFunction2(startFastElement), startUnknownElement = js.Any.fromFunction3(startUnknownElement))
    __obj.asInstanceOf[XFastShapeContextHandler]
  }
  
  @scala.inline
  implicit class XFastShapeContextHandlerMutableBuilder[Self <: XFastShapeContextHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentProperties(value: XDocumentProperties): Self = StObject.set(x, "DocumentProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawPage(value: XDrawPage): Self = StObject.set(x, "DrawPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaDescriptor(value: SafeArray[PropertyValue]): Self = StObject.set(x, "MediaDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: XModel): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationFragmentPath(value: String): Self = StObject.set(x, "RelationFragmentPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: XShape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartToken(value: Double): Self = StObject.set(x, "StartToken", value.asInstanceOf[js.Any])
  }
}
