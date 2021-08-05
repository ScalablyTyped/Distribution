package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `XGraphicObject` objects represent in-memory image and graphic objects.
  *
  * Such objects are accessible using {@link GraphicObject} scheme URLs like vnd.sun.star.GraphicObject:10000000000001940000012FB99807BD The numeric
  * portion of the url is formed from {@link UniqueID} . As long as at least one instance of `XGraphicObject` with a particular UniqueID exists, the
  * associated image/graphic is available.
  * @see XGraphicObject
  * @see GraphicProvider
  * @see MediaProperties
  */
trait XGraphicObject
  extends StObject
     with XInterface {
  
  /** is the associated image/graphic for this object. */
  var Graphic: XGraphic
  
  /** is the id that can be used to form the `vnd.sun.star.GraphicObject` url to address this object. */
  var UniqueID: String
}
object XGraphicObject {
  
  inline def apply(
    Graphic: XGraphic,
    UniqueID: String,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGraphicObject = {
    val __obj = js.Dynamic.literal(Graphic = Graphic.asInstanceOf[js.Any], UniqueID = UniqueID.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGraphicObject]
  }
  
  extension [Self <: XGraphicObject](x: Self) {
    
    inline def setGraphic(value: XGraphic): Self = StObject.set(x, "Graphic", value.asInstanceOf[js.Any])
    
    inline def setUniqueID(value: String): Self = StObject.set(x, "UniqueID", value.asInstanceOf[js.Any])
  }
}
