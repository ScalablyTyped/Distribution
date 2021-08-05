package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implement this interface to represent images and icons.
  *
  * This interface is used for a representation of images like icons of buttons. The corresponding interface of the Java Accessibility API is
  * AccessibleIcon. This interface lets you retrieve an image's size and description.
  * @since OOo 1.1.2
  */
trait XAccessibleImage
  extends StObject
     with XInterface {
  
  /**
    * Returns the localized description of the image.
    *
    * It depends on the usage of an image whether the description should express the image's function (e.g. for icons) or the actual content of the image
    * (e.g. for image maps or non-iconic images embedded into a document.)
    * @returns Returns a localized string that describes the image's function or content.
    */
  val AccessibleImageDescription: String
  
  /**
    * Returns the height of the image.
    *
    * The height is returned in units specified by the parents coordinate system.
    * @returns Returns the image's height with respect to the parent's coordinate system.
    */
  val AccessibleImageHeight: Double
  
  /**
    * Returns the width of the image.
    *
    * The width is returned in units specified by the parents coordinate system.
    * @returns Returns the image's width with respect to the parent's coordinate system.
    */
  val AccessibleImageWidth: Double
  
  /**
    * Returns the localized description of the image.
    *
    * It depends on the usage of an image whether the description should express the image's function (e.g. for icons) or the actual content of the image
    * (e.g. for image maps or non-iconic images embedded into a document.)
    * @returns Returns a localized string that describes the image's function or content.
    */
  def getAccessibleImageDescription(): String
  
  /**
    * Returns the height of the image.
    *
    * The height is returned in units specified by the parents coordinate system.
    * @returns Returns the image's height with respect to the parent's coordinate system.
    */
  def getAccessibleImageHeight(): Double
  
  /**
    * Returns the width of the image.
    *
    * The width is returned in units specified by the parents coordinate system.
    * @returns Returns the image's width with respect to the parent's coordinate system.
    */
  def getAccessibleImageWidth(): Double
}
object XAccessibleImage {
  
  inline def apply(
    AccessibleImageDescription: String,
    AccessibleImageHeight: Double,
    AccessibleImageWidth: Double,
    acquire: () => Unit,
    getAccessibleImageDescription: () => String,
    getAccessibleImageHeight: () => Double,
    getAccessibleImageWidth: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleImage = {
    val __obj = js.Dynamic.literal(AccessibleImageDescription = AccessibleImageDescription.asInstanceOf[js.Any], AccessibleImageHeight = AccessibleImageHeight.asInstanceOf[js.Any], AccessibleImageWidth = AccessibleImageWidth.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAccessibleImageDescription = js.Any.fromFunction0(getAccessibleImageDescription), getAccessibleImageHeight = js.Any.fromFunction0(getAccessibleImageHeight), getAccessibleImageWidth = js.Any.fromFunction0(getAccessibleImageWidth), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleImage]
  }
  
  extension [Self <: XAccessibleImage](x: Self) {
    
    inline def setAccessibleImageDescription(value: String): Self = StObject.set(x, "AccessibleImageDescription", value.asInstanceOf[js.Any])
    
    inline def setAccessibleImageHeight(value: Double): Self = StObject.set(x, "AccessibleImageHeight", value.asInstanceOf[js.Any])
    
    inline def setAccessibleImageWidth(value: Double): Self = StObject.set(x, "AccessibleImageWidth", value.asInstanceOf[js.Any])
    
    inline def setGetAccessibleImageDescription(value: () => String): Self = StObject.set(x, "getAccessibleImageDescription", js.Any.fromFunction0(value))
    
    inline def setGetAccessibleImageHeight(value: () => Double): Self = StObject.set(x, "getAccessibleImageHeight", js.Any.fromFunction0(value))
    
    inline def setGetAccessibleImageWidth(value: () => Double): Self = StObject.set(x, "getAccessibleImageWidth", js.Any.fromFunction0(value))
  }
}
