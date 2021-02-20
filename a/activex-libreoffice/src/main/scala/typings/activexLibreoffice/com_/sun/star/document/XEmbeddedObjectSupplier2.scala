package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XEmbeddedObject
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents something that provides an embedded object. */
@js.native
trait XEmbeddedObjectSupplier2 extends XEmbeddedObjectSupplier {
  
  /** allows to control the aspect of the object. */
  var Aspect: Double = js.native
  
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  val ExtendedControlOverEmbeddedObject: XEmbeddedObject = js.native
  
  /** allows to get the replacement image of the object. */
  var ReplacementGraphic: XGraphic = js.native
  
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  def getExtendedControlOverEmbeddedObject(): XEmbeddedObject = js.native
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
    val __obj = js.Dynamic.literal(Aspect = Aspect.asInstanceOf[js.Any], EmbeddedObject = EmbeddedObject.asInstanceOf[js.Any], ExtendedControlOverEmbeddedObject = ExtendedControlOverEmbeddedObject.asInstanceOf[js.Any], ReplacementGraphic = ReplacementGraphic.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), getExtendedControlOverEmbeddedObject = js.Any.fromFunction0(getExtendedControlOverEmbeddedObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEmbeddedObjectSupplier2]
  }
  
  @scala.inline
  implicit class XEmbeddedObjectSupplier2MutableBuilder[Self <: XEmbeddedObjectSupplier2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspect(value: Double): Self = StObject.set(x, "Aspect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedControlOverEmbeddedObject(value: XEmbeddedObject): Self = StObject.set(x, "ExtendedControlOverEmbeddedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetExtendedControlOverEmbeddedObject(value: () => XEmbeddedObject): Self = StObject.set(x, "getExtendedControlOverEmbeddedObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplacementGraphic(value: XGraphic): Self = StObject.set(x, "ReplacementGraphic", value.asInstanceOf[js.Any])
  }
}
