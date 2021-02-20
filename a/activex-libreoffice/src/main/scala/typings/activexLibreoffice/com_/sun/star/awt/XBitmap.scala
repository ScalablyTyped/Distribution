package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a bitmap in the Microsoft DIB format. */
@js.native
trait XBitmap extends XInterface {
  
  /** returns the device independent bitmap. */
  val DIB: SafeArray[Double] = js.native
  
  /** returns the transparency mask of the device independent bitmap. */
  val MaskDIB: SafeArray[Double] = js.native
  
  /** returns the size of the bitmap in pixel. */
  val Size: typings.activexLibreoffice.com_.sun.star.awt.Size = js.native
  
  /** returns the device independent bitmap. */
  def getDIB(): SafeArray[Double] = js.native
  
  /** returns the transparency mask of the device independent bitmap. */
  def getMaskDIB(): SafeArray[Double] = js.native
  
  /** returns the size of the bitmap in pixel. */
  def getSize(): typings.activexLibreoffice.com_.sun.star.awt.Size = js.native
}
object XBitmap {
  
  @scala.inline
  def apply(
    DIB: SafeArray[Double],
    MaskDIB: SafeArray[Double],
    Size: Size,
    acquire: () => Unit,
    getDIB: () => SafeArray[Double],
    getMaskDIB: () => SafeArray[Double],
    getSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBitmap = {
    val __obj = js.Dynamic.literal(DIB = DIB.asInstanceOf[js.Any], MaskDIB = MaskDIB.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDIB = js.Any.fromFunction0(getDIB), getMaskDIB = js.Any.fromFunction0(getMaskDIB), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBitmap]
  }
  
  @scala.inline
  implicit class XBitmapMutableBuilder[Self <: XBitmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDIB(value: SafeArray[Double]): Self = StObject.set(x, "DIB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDIB(value: () => SafeArray[Double]): Self = StObject.set(x, "getDIB", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaskDIB(value: () => SafeArray[Double]): Self = StObject.set(x, "getMaskDIB", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSize(value: () => Size): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMaskDIB(value: SafeArray[Double]): Self = StObject.set(x, "MaskDIB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
