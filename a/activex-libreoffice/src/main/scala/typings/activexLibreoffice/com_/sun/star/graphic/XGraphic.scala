package typings.activexLibreoffice.com_.sun.star.graphic

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface acts as a container for the loaded graphic.
  *
  * The interface itself can be retrieved by using the appropriate methods of {@link XGraphicProvider} interface. {@link XGraphicProvider} also offers a
  * method to store the graphic content at a specific location
  *
  * To render the graphic content onto a specific device, you have to create a {@link XGraphicRenderer} interface and pass this interface appropriately
  * @see XGraphicProvider
  * @see XGraphicRenderer
  */
@js.native
trait XGraphic extends XInterface {
  
  /**
    * Get the type of the contained graphic
    * @returns The type of the contained graphic
    * @see GraphicType
    */
  val Type: Double = js.native
  
  /**
    * Get the type of the contained graphic
    * @returns The type of the contained graphic
    * @see GraphicType
    */
  def getType(): Double = js.native
}
object XGraphic {
  
  @scala.inline
  def apply(
    Type: Double,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGraphic = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGraphic]
  }
  
  @scala.inline
  implicit class XGraphicMutableBuilder[Self <: XGraphic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetType(value: () => Double): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
