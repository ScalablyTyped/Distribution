package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XEmbeddedObject
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents something that provides an embedded object. */
trait XEmbeddedObjectSupplier2
  extends StObject
     with XEmbeddedObjectSupplier {
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(Aspect = Aspect.asInstanceOf[js.Any], EmbeddedObject = EmbeddedObject.asInstanceOf[js.Any], ExtendedControlOverEmbeddedObject = ExtendedControlOverEmbeddedObject.asInstanceOf[js.Any], ReplacementGraphic = ReplacementGraphic.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), getExtendedControlOverEmbeddedObject = js.Any.fromFunction0(getExtendedControlOverEmbeddedObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEmbeddedObjectSupplier2]
  }
  
  extension [Self <: XEmbeddedObjectSupplier2](x: Self) {
    
    inline def setAspect(value: Double): Self = StObject.set(x, "Aspect", value.asInstanceOf[js.Any])
    
    inline def setExtendedControlOverEmbeddedObject(value: XEmbeddedObject): Self = StObject.set(x, "ExtendedControlOverEmbeddedObject", value.asInstanceOf[js.Any])
    
    inline def setGetExtendedControlOverEmbeddedObject(value: () => XEmbeddedObject): Self = StObject.set(x, "getExtendedControlOverEmbeddedObject", js.Any.fromFunction0(value))
    
    inline def setReplacementGraphic(value: XGraphic): Self = StObject.set(x, "ReplacementGraphic", value.asInstanceOf[js.Any])
  }
}
